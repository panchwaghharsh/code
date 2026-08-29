package Calculators;
import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the password to access:");
        String pass = in.next();

        if (pass.equalsIgnoreCase("Calculator")) {
            System.out.println("Enter Trignometry or Calculation");
            String check = in.next();

            if (check.equalsIgnoreCase("Trignometry")) {
                System.out.println("Enter the Trignometeric values (sin, cos, tan, cot, sec, cosec):");
                String t = in.next();

                System.out.println("Enter the Trignometeric values (sin, cos, tan, cot, sec, cosec):");
                int a = in.nextInt();

                if (t.equalsIgnoreCase("sin")) {
                    if (a == 0) {
                        System.out.println("The value of sin 0 = 0");
                    } else if (a == 30) {
                        System.out.println("The value of sin 30 = 1/2");
                    } else if (a == 45) {
                        System.out.println("The value of sin 30 = 1/√2");
                    } else if (a == 60) {
                        System.out.println("The value of sin 30 = √3/2");
                    } else if (a == 90) {
                        System.out.println("The value of sin 30 = 1");
                    } else {
                        System.out.println("Angle not suported");
                    }

                } else if (t.equalsIgnoreCase("cos")) {
                    if (a == 0) {
                        System.out.println("The value of cos 0 = 1");
                    } else if (a == 30) {
                        System.out.println("The value of sin 30 = √3/2");
                    } else if (a == 45) {
                        System.out.println("The value of sin 30 = 1/√2");
                    } else if (a == 60) {
                        System.out.println("The value of sin 30 = 1/2");
                    } else if (a == 90) {
                        System.out.println("The value of sin 30 = 0");
                    } else {
                        System.out.println("Angle not suported");
                    }
                } else if (t.equalsIgnoreCase("tan")) {
                    if (a == 0) {
                        System.out.println("The value of tan 0 = 0");
                    } else if (a == 30) {
                        System.out.println("The value of tan 30 = 1/√3");
                    } else if (a == 45) {
                        System.out.println("The value of tan 30 = 1");
                    } else if (a == 60) {
                        System.out.println("The value of tan 30 = √3");
                    } else if (a == 90) {
                        System.out.println("The value of tan 30 = " + (1 / 0));
                    } else {
                        System.out.println("Angle not suported");
                    }

                } else if (t.equalsIgnoreCase("tan")) {
                    if (a == 0) {
                        System.out.println("The value of tan 0 = 0");
                    } else if (a == 30) {
                        System.out.println("The value of tan 30 = 1/√3");
                    } else if (a == 45) {
                        System.out.println("The value of tan 30 = 1");
                    } else if (a == 60) {
                        System.out.println("The value of tan 30 = √3");
                    } else if (a == 90) {
                        System.out.println("The value of tan 30 = " + (1 / 0));
                    } else {
                        System.out.println("Angle not suported");
                    }
                }
                 else if (t.equalsIgnoreCase("cot")) {
                    if (a == 0) {
                        System.out.println("The value of cot 0 = "+(1/0));
                    } else if (a == 30) {
                        System.out.println("The value of tan 30 = √3");
                    } else if (a == 45) {
                        System.out.println("The value of tan 30 = 1");
                    } else if (a == 60) {
                        System.out.println("The value of tan 30 = 1/√3");
                    } else if (a == 90) {
                        System.out.println("The value of tan 30 = 0");
                    } else {
                        System.out.println("Angle not suported");
                    }
                }
            } else if (check.equalsIgnoreCase("Calculation")) {

            } else {
                System.out.println("INVALID OUTPUT:You can enter only Trignometery or calculation");
            }
        } else {
            System.out.println("Password is INCORRECT");
        }

    }
}