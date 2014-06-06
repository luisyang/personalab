// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.client;

import javax.naming.*;
import javax.rmi.PortableRemoteObject;
import javax.ejb.FinderException;
import javax.ejb.CreateException;

import javatheater.ejb.*;

import java.rmi.RemoteException;

public class Main {
  static ShowManagerHome managerHome = null;

  static void initHomes() throws NamingException {
    Context initial = new InitialContext();

    managerHome =
      (ShowManagerHome) PortableRemoteObject.narrow(
        initial.lookup("javatheater/ShowManager"),
        ShowManagerHome.class
      );
  }

  public static void main(String[] args) {
    System.out.println("JavaTheater RMI Client Application");

    try {
      initHomes();

      ShowManager manager = managerHome.create();
      Integer newMoviePK = manager.createMovie("Fatal Exception");
      manager.deleteMovie(newMoviePK);
    }
    catch (Exception e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
}
