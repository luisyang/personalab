// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.client;

import javatheater.ejb.*;
import javatheater.dataobject.*;

import javax.ejb.*;
import javax.naming.*;
import java.rmi.RemoteException;
import javax.rmi.PortableRemoteObject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SwingMain extends JFrame {
  ShowManager manager = null;
  ShowListing listing = null;

  java.util.List
    movieList = new ArrayList(),
    showList = new ArrayList();

  JMenuBar mainMenuBar = new JMenuBar();

  JTextArea
    movieTextArea = new JTextArea(),
    showTextArea = new JTextArea();

  /**
   * Initializes the EJB references
   */
  SwingMain() {
    try {
      // Connect to EJBs first
      Context initial = new InitialContext();

      ShowManagerHome managerHome =
        (ShowManagerHome) PortableRemoteObject.narrow(
          initial.lookup("javatheater/ShowManager"),
          ShowManagerHome.class
        );

      ShowListingHome listingHome =
        (ShowListingHome) PortableRemoteObject.narrow(
          initial.lookup("javatheater/ShowListing"),
          ShowListingHome.class
        );

      manager = managerHome.create();
      listing = listingHome.create();
    }
    catch (Exception e) {
      System.out.println(e);
      System.exit(1);
    }
  }

  /**
   * Creates the main window, initializes contents and
   * mekes it visible.
   *
   * @param title Main window title
   */
  void showWindow(String title) {
    setTitle(title);

    // Populate the main menu and create item listeners
    createMenu();

    // Populate main window
    JSplitPane splitPane1 = new JSplitPane();
    splitPane1.setOrientation(JSplitPane.VERTICAL_SPLIT);

    getContentPane().add(splitPane1, BorderLayout.CENTER);

    splitPane1.add(
      new JScrollPane(showTextArea),
      JSplitPane.TOP
    );

    splitPane1.add(
      new JScrollPane(movieTextArea),
      JSplitPane.BOTTOM
    );

    // Handle window closing event
    this.addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          doMenuFileExit();
        }
      }
    );

    // Set window attributes and make visible
    showTextArea.setEditable(false);
    movieTextArea.setEditable(false);

    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    setSize(new Dimension(600, 450));
    setVisible(true);
    splitPane1.setDividerLocation(0.5);
    refreshMovieList();
  }

  /**
   * Created the main menu and submenus and associates
   * menu items with their listeners
   */
  void createMenu() {
    JMenu
      fileMenu = new JMenu("File"),
      movieMenu = new JMenu("Movie"),
      showMenu = new JMenu("Show");

    mainMenuBar.add(fileMenu);
    mainMenuBar.add(movieMenu);
    mainMenuBar.add(showMenu);

    JMenuItem
      menuFileExit = new JMenuItem("Exit"),
      menuMovieAdd = new JMenuItem("Add"),
      menuMovieRemove = new JMenuItem("Remove"),
      menuShowAdd = new JMenuItem("Add"),
      menuShowRemove = new JMenuItem("Remove");

    fileMenu.add(menuFileExit);
    movieMenu.add(menuMovieAdd);
    movieMenu.add(menuMovieRemove);
    showMenu.add(menuShowAdd);
    showMenu.add(menuShowRemove);

    setJMenuBar(mainMenuBar);

    menuFileExit.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          doMenuFileExit();
        }
      }
    );

    menuMovieAdd.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          addMovie();
        }
      }
    );

    menuMovieRemove.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          removeMovie();
        }
      }
    );

    menuShowAdd.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          addShow();
        }
      }
    );

    menuShowRemove.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          removeShow();
        }
      }
    );
  }

  void doMenuFileExit() {
    try {
      manager.remove();
      listing.remove();
      System.exit(0);
    }
    catch (RemoteException e1) {}
    catch (RemoveException e1) {}
  }

  void addMovie() {
    try {
      AddMovieDialog movieDialog = new AddMovieDialog(this);
      String title = movieDialog.getMovieTitle();
      if (title != null) {
        manager.createMovie(title);
        refreshMovieList();
      }
    }
    catch (CreateException e) {
      movieTextArea.append(e.toString() + "\n");
    }
    catch (RemoteException e) {
      movieTextArea.append(e.toString() + "\n");
    }
  }

  void removeMovie() {
    try {
      RemoveMovieDialog dialog = new RemoveMovieDialog(this, movieList.toArray());
      Integer pk = dialog.getSelectedMoviePK();
      if (pk != null) {
        manager.deleteMovie(pk);
        refreshMovieList();
      }
    }
    catch (FinderException e) {
      movieTextArea.append(e.toString() + "\n");
    }
    catch (RemoveException e) {
      movieTextArea.append(e.toString() + "\n");
    }
    catch (RemoteException e) {
      movieTextArea.append(e.toString() + "\n");
    }
  }

  void addShow() {
    new NewShowDialog(this, movieList.toArray());
  }

  void removeShow() {
    showTextArea.append("Remove Show\n");
  }

  void refreshMovieList() {
    movieList.clear();
    movieTextArea.setText("");

    try {
      // Retrieve existing movies and shows
      MovieItem [] movies = listing.getMovies();

      for (int i = 0; i < movies.length; i++) {
        MovieItem movie = movies[i];
        movieList.add(movie);
        movieTextArea.append(movie + "\n");
      }
    }
    catch (RemoteException e) {
      movieTextArea.setText(e.toString());
    }
  }

  public static void main(String [] args) throws Exception {
    new SwingMain().showWindow("JavaTheater Management Client");
  }
}

/**
 * Modal dialog box to enter new movie information.
 */
class AddMovieDialog extends InputDialog {
  String movieTitle = null;
  JTextField movieTitleField = new JTextField(24);

  AddMovieDialog(Frame owner)
    throws HeadlessException
  {
    super(owner, "Add Movie");
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
    contentPane.add(movieTitleField);

    setSize(300,100);
    setVisible(true);
  }

  protected void populateDialog() {
    super.populateDialog();
  }

  protected void transferDataFromDialog() {
    movieTitle = movieTitleField.getText();
  }

  protected void transferDataToDialog() {}
}

/**
 * Modal dialog box to delete a movie.
 */
class RemoveMovieDialog extends JDialog {
  Integer selectedMoviePK = null;
  JComboBox movieCombo = null;

  RemoveMovieDialog(Frame owner, Object [] movies)
    throws HeadlessException
  {
    super(owner, "Remove Movie", true);
    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

    movieCombo = new JComboBox(movies);

    JButton
      okBtn = new JButton("OK"),
      cancelBtn = new JButton("Cancel");

    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
    contentPane.add(movieCombo);
    contentPane.add(okBtn);
    contentPane.add(cancelBtn);

    okBtn.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          doOK();
        }
      }
    );

    cancelBtn.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          doCancel();
        }
      }
    );

    setSize(300,100);
    setVisible(true);
  }

  void doOK() {
    MovieItem movie = (MovieItem) movieCombo.getSelectedItem();
    selectedMoviePK = movie.pk;
    dispose();
  }

  void doCancel() {
    dispose();
  }

  public Integer getSelectedMoviePK() {
    return selectedMoviePK;
  }
}

/**
 * Modal dialog box to enter new show information.
 */
class NewShowDialog extends JDialog {
  String showTime;
  Integer moviePK;
  int availableSeats;

  JTextField
    showTimeField = new JTextField(24),
    availableSeatsField = new JTextField(4);

  JComboBox moviesCombo = null;

  NewShowDialog(Frame owner, Object [] movies)
    throws HeadlessException
  {
    super(owner, "Create New Show", true);
    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

    moviesCombo = new JComboBox(movies);

    JButton
      okBtn = new JButton("OK"),
      cancelBtn = new JButton("Cancel");

    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
    contentPane.add(showTimeField);
    contentPane.add(moviesCombo);
    contentPane.add(availableSeatsField);
    contentPane.add(okBtn);
    contentPane.add(cancelBtn);

    okBtn.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          doOK();
        }
      }
    );

    cancelBtn.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          doCancel();
        }
      }
    );

    setSize(300,200);
    setVisible(true);
  }

  void doOK() {
    try {
      showTime = showTimeField.getText();
      availableSeats = Integer.parseInt(availableSeatsField.getText());
    }
    catch (NumberFormatException e) {
      showTime = null;
      moviePK = null;
      availableSeats = 0;
    }
    finally {
      dispose();
    }
  }

  void doCancel() {
    dispose();
  }

  String getShowTime() {
    return showTime;
  }

  public Integer getMoviePK() {
    return moviePK;
  }

  public int getAvailableSeats() {
    return availableSeats;
  }
}
