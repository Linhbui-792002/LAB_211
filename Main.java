/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_56;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Linh BX
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Worker> listWorker = new ArrayList<Worker>();
        ArrayList<History> lisHistory = new ArrayList<History>();

        while (true) {
            System.out.println("1.them nhan vien.");
            System.out.println("6.show");
            System.out.println("2.up.");
            System.out.println("3.down.");
            System.out.println("4.print.");
            System.out.println("5.exit.");

            int option = Common.inputInt("nhap option");
            Worker W1 = new Worker("p12", "linh", 12, 45673, "lam");
            Worker W2 = new Worker("r45", "linh", 12, 45673, "lam");
            Worker W3 = new Worker("a123", "linh", 12, 45673, "lam");
            listWorker.add(W1);
            listWorker.add(W2);
            listWorker.add(W3);
            switch (option) {
                case 1: {
                    Manager.addWorker(listWorker);
                    break;
                }
                case 2: {
                    Manager.changeSalary(listWorker, lisHistory, 1);

                    break;
                }
                case 3: {
                    Manager.changeSalary(listWorker, lisHistory, 2);
                    break;
                }
                case 4: {
                    Manager.printListHistory(lisHistory);
                    break;
                }
                case 6: {
                    Manager.printListWorker(listWorker);
                    break;
                }
                case 5: {
                    System.exit(0);
                }
            }
        }

    }

}
