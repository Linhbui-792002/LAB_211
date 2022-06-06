/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_56;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Linh BX
 */
public class Manager {

    public static void addWorker(ArrayList<Worker> listWorker) {
        try {
            System.out.println("Nhap ID:");
            String code = Common.in.readLine();
            System.out.println("Nhap ten:");
            String name = Common.in.readLine();
            int age = Common.inputIntLimit("Nhap tuoi:", 18, 50);
            double salary = Common.inputDouble("Nhap luong:");
            System.out.println("Nhap vi tri lam viec:");
            String WorkLocat = Common.in.readLine();
            if (!checkID(listWorker, code)) {
                System.out.println("Khong duoc de trung ID!!!");
            } else {
                listWorker.add(new Worker(code, name, age, salary, WorkLocat));
                System.out.println("them thanh cong");
            }
        } catch (Exception e) {
            System.out.println("Loi input" + e.getMessage());
        }

    }

    public static boolean checkID(ArrayList<Worker> listWorker, String code) {
        for (Worker worker : listWorker) {
            if (worker.getCode().compareTo(code) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void changeSalary(ArrayList<Worker> workers, ArrayList<History> historys, int status) {

        if (workers.isEmpty()) {
            System.out.println("list is empty!!!");
            return;
        }

        try {
            System.out.println("Nhap code:");
            String code = Common.in.readLine();
            Worker worker = getWorkerByCode(workers, code);

            if (worker == null) {
                System.out.println("Khong co Worker co ID " + code);

            } else {

                double salaryUp;

                //check update
                if (status == 1) {
                    salaryUp = Common.inputDouble("Nhap luong moi:");
                    while (salaryUp <= worker.getSalary()) {
                        System.out.println("luong moi ko duoc nho hon cu");
                        System.out.println("Nhap lai:");
                        salaryUp = Common.inputDouble("Nhap luong moi:");
                    }
                    historys.add(new History(worker.getCode(), worker.getName(),
                                    worker.getAge(), salaryUp, worker.getWorklocation(), "UP", getDate()));
                } else {
                    salaryUp = Common.inputDouble("Nhap luong moi:");
                    while (salaryUp >= worker.getSalary()) {
                        System.out.println("luong moi ko duoc lon hon cu");
                        System.out.println("Nhap lai:");
                        salaryUp = Common.inputDouble("Nhap luong moi:");
                    }
                    historys.add(new History(worker.getCode(), worker.getName(),
                                    worker.getAge(), salaryUp, worker.getWorklocation(), "down", getDate()));
                }
                worker.setSalary(salaryUp);
                System.out.println("Done!!!");
            }
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void printListHistory(ArrayList<History> historys) {
        if (historys.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.printf("%-5s%-15s%-5s%-10s%-10s%-20s\n", "Code", "Name", "Age",
                        "Salary", "Status", "Date");   
        sortHistory(historys);
        for (History history : historys) {
            printHistory(history);
        }
    }

    
    private static Worker getWorkerByCode(ArrayList<Worker> workers, String code) {
        for (Worker worker : workers) {
            if (code.equalsIgnoreCase(worker.getCode())) {
                return worker;
            }
        }
        return null;
    }

    public static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        return dateFormat.format(calendar.getTime());
    }

    public static void printHistory(History history) {
        System.out.printf("%-5s%-15s%-5d%-10.2f%-10s%-20s\n", history.getCode(),
                        history.getName(), history.getAge(), history.getSalary(),
                        history.getStatus(), history.getDate());
    }

    public static void printListWorker(ArrayList<Worker> worker) {
        if (worker.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.printf("%-15s%-15s%-15.2s%-15s%-5s\n", "Code", "Name", "Age",
                        "Salary", "Workl");
        for (Worker worker1 : worker) {
            printWorker(worker1);
        }
    }
    

    public static void printWorker(Worker worker) {
        System.out.printf("%-15s%-15s%-15d%-15.2f%-5s\n", worker.getCode(),
                        worker.getName(), worker.getAge(), worker.getSalary(), worker.getWorklocation()
        );
    }

    public static void sortHistory(ArrayList<History> history){
       
        Collections.sort( history, new Comparator<History>() {
            @Override
            public int compare(History o1, History o2) {
                return o1.getCode().compareTo(o2.getCode());
            }
        });
    }
    
}
