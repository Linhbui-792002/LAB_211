/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_50;

import java.util.ArrayList;

/**
 *
 * @author Linh BX
 */
public class Manager {
    
    
    public static  boolean  checkOddNum(double n){
        if(n%2 != 0){
            return true;
        }else
            return false;
        
    }
    
    public static boolean checkAquare(double n){
        if ((int) Math.sqrt(n)*(int)Math.sqrt(n) == n) {
            return true;
        }else 
            return false;
    }
    
    public static void superlativeEquation(ArrayList<Double> calculateEquation){
        double a = Common.inputDouble("Nhap a:");
        double b = Common.inputDouble("Nhap b:");     
        double x = -b/a;
        calculateEquation.add(a);
        calculateEquation.add(b);
        calculateEquation.add(x);
        System.out.println("Gia tri x =" + x);
        checkNumberCE(calculateEquation);
        
    }
    
    public static void solvingQuadratic(ArrayList<Double> QuadraticEquation){
        double a = Common.inputDouble("nhap a:");
        double b = Common.inputDouble("nhap b:");
        double c = Common.inputDouble("nhap c:");
        double deta = (b*b)-4*a*c;
        double x1 = ((-b) + Math.sqrt(deta)) / (2*a);
        double x2 = ((-b) - Math.sqrt(deta)) / (2*a);
        QuadraticEquation.add(a);
        QuadraticEquation.add(b);
        QuadraticEquation.add(c);
        QuadraticEquation.add(x1);
        QuadraticEquation.add(x2);
        System.out.println("x1: " + x1 +"and" +"  x2 :"+ x2);
        checNuberQE(QuadraticEquation);
        
        
    }
    static void checNuberQE(ArrayList<Double> QuadraticEquation){
        System.out.println("so le");
        for (Double number : QuadraticEquation) {
            if (checkOddNum(number)) {
                System.out.print(number+" ");
            }
        }
        System.out.println();
        System.out.println("so chan");
        for (Double number : QuadraticEquation) {
            if (!checkOddNum(number)) {
                System.out.print(number+" ");
            }
        }
        System.out.println();
        System.out.println("so hoan hao");
        for (Double number : QuadraticEquation) {
            if (checkAquare(number)) {
                System.out.print(number+" ");
            }
        }
    }
    static void checkNumberCE(ArrayList<Double> calculateEquation){
        System.out.println("So le:");
        for (Double number : calculateEquation) {
            if (checkOddNum(number)) {
                System.out.print(number+" ");
            }else
                System.out.println("Null");
        }
        System.out.println();
        System.out.println("so chan:");
        for (Double number : calculateEquation) {
            if (!checkOddNum(number)) {
                System.out.print(number+" ");
            }else 
                System.out.println("Null");
        }
        System.out.println();
        System.out.println("So hoan hao:");
        for (Double number : calculateEquation) {
            if (checkAquare(number)) {
                System.out.print(number+" ");
            } else
                System.out.println("Null");
        }
    }
    
}
