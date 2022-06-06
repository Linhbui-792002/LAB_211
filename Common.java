/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_50;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Linh BX
 */
public class Common {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static int inputIntLimit(String message, int min, int max) {
        int m;
        while (true) {
            try {
                System.out.println(message);
                m = Integer.parseInt(in.readLine());
                if (m < min || m > max) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Nhap input trong khoang :" + min + "-" + max);

            }
        }
        return m;
    }

    public static int inputInt(String message) {
        int a;
        while (true) {
            try {

                System.out.println(message);
                a = Integer.parseInt(in.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Loi xar ra khi nhap m" + e.getMessage());
            }

        }
        return a;
    }

    public static double inputDouble(String message) {
        double n;
        while (true) {
            try {

                System.out.println(message);
                n = Double.parseDouble(in.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Loi xay ra khi nhap " + e.getMessage());
            }

        }
        return n;
    }

   

   
}
