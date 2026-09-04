package Calculators;
import java.util.*;
public class CalculatorUsingStaticFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter trignometery for Trignometric calculation . Or for simple calculation enter calculator");
        String check = in.next();

        if (check.equalsIgnoreCase("Trignometery"))
        {
            System.out.println("Enter which trignometerical value you need(sin, cos, tan, cot, sec, cosec):");
            String t = in.next();

            System.out.println("");

            System.out.println("Enter angle or θ for Trignometerical value");
            int a = in.nextInt();

            
        }
    }

    public static void  trignometery(String t , int a)
    {
        
        if (t.equalsIgnoreCase("sin")) {
                    if (a == 0) {
                        System.out.println("The value of sin 0 = 0");
                    } else if (a == 30) {
                        System.out.println("The value of sin 30 = 1/2");
                    } else if (a == 45) {
                        System.out.println("The value of sin 45 = 1/√2");
                    } else if (a == 60) {
                        System.out.println("The value of sin 60 = √3/2");
                    } else if (a == 90) {
                        System.out.println("The value of sin 90 = 1");
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
                        System.out.println("The value of cot 30 = √3");
                    } else if (a == 45) {
                        System.out.println("The value of cot 30 = 1");
                    } else if (a == 60) {
                        System.out.println("The value of tan 30 = 1/√3");
                    } else if (a == 90) {
                        System.out.println("The value of tan 30 = 0");
                    } else {
                        System.out.println("Angle not suported");
                    }
                }
                 else if (t.equalsIgnoreCase("sec")) {
                    if (a == 0) {
                        System.out.println("The value of sec 0 = "+(1/0));
                    } else if (a == 30) {
                        System.out.println("The value of sec 30 = √3");
                    } else if (a == 45) {
                        System.out.println("The value of sec 45 = 1");
                    } else if (a == 60) {
                        System.out.println("The value of sec 60 = 1/√3");
                    } else if (a == 90) {
                        System.out.println("The value of sec 90 = 0");
                    } else {
                        System.out.println("Angle not suported");
                    }
                } else if (t.equalsIgnoreCase("cosec")) {
                    if (a == 0) {
                        System.out.println("The value of cosec 0 = "+(1/0));
                    } else if (a == 30) {
                        System.out.println("The value of cosec 30 = √3");
                    } else if (a == 45) 
                        System.out.println("The value of cosec 45 = 1");
                    } else if (a == 60) {
                        System.out.println("The value of cosec 60 = 1/√3");
                    } else if (a == 90) {
                        System.out.println("The value of cosec 90 = 0");
                    } else {
                        System.out.println("Angle not suported");
                    }
                }
        
    }
    public static void displayTrignometery()
    {
        System.out.println("Angles|\t 0 \t  30 \t  45 \t  60 \t   90");
        System.out.println("sin   |\t 0 \t 1/2 \t 1/√2 \t √3/2 \t    1");
        System.out.println("cos   |\t 1 \t √3/2 \t 1/√2 \t 1/2 \t    0");
        System.out.println("tan   |\t 0 \t 1/√3 \t 1 \t √3 \tInfinity");
        System.out.println("tan   |\t \t √3 \t 1 \t 1/√3 \t  0");
    }
}
