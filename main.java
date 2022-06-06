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
public class main {

    public static void main(String[] args) {

        ArrayList<Double> calculateEquation = new ArrayList<Double>();
        ArrayList<Double> QuadraticEquation = new ArrayList<Double>();

        while (true) {
            System.out.println();
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            int option = Common.inputInt("chon option:");
            switch (option) {
                case 1:
                    Manager.superlativeEquation(calculateEquation);
                    break;
                case 2:
                    Manager.solvingQuadratic(QuadraticEquation);
                    break;
                case 3:
                    System.exit(0);
            }
        }

    }
}
