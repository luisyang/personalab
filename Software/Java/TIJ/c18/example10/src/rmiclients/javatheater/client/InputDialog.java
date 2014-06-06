// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public abstract class InputDialog extends JDialog {
  protected JButton
    btnOK = new JButton("OK"),
    btnCancel = new JButton("Cancel");

  protected int closeOperation;

  public InputDialog(Frame owner, String title) throws HeadlessException {
    super(owner, title);
    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
  }

  public int showModal() {
    setModal(true);
    setVisible(true);
    return closeOperation;
  }

  protected void populateDialog() {
    getContentPane().add(btnOK);
    getContentPane().add(btnCancel);

    btnOK.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          doOK();
        }
      }
    );

    btnCancel.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          doCancel();
        }
      }
    );

    transferDataToDialog();
  }

  protected void doOK() {
    transferDataFromDialog();
    closeOperation = JOptionPane.OK_OPTION;
    dispose();
  }

  protected void doCancel() {
    closeOperation = JOptionPane.CANCEL_OPTION;
    dispose();
  }

  protected abstract void transferDataFromDialog();

  protected abstract void transferDataToDialog();
}
