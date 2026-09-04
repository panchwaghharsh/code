import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the password to access:");
        String pass = in.next();

        System.out.println("");

        if (pass.equalsIgnoreCase("Calculator")) {
            System.out.println("Enter Tri for Trignometry or Cal for Calculation");
            String check = in.next();

            System.out.println("");

            if (check.equalsIgnoreCase("Tri")) {
                System.out.println("Enter the Trignometeric values (sin, cos, tan, cot, sec, cosec):");
                String t = in.next();

                System.out.println("");

                System.out.println("Enter a angle (0 , 30 , 45 , 60 , 90)");
                int a = in.nextInt();

                System.out.println("");

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
                        System.out.println("The value of cos 30 = √3/2");
                    } else if (a == 45) {
                        System.out.println("The value of cos 45 = 1/√2");
                    } else if (a == 60) {
                        System.out.println("The value of cos 60 = 1/2");
                    } else if (a == 90) {
                        System.out.println("The value of cos 90 = 0");
                    } else {
                        System.out.println("Angle not suported");
                    }
                } else if (t.equalsIgnoreCase("sec")) {
                    if (a == 0) {
                        System.out.println("The value of sec 0 = 1");
                    } else if (a == 30) {
                        System.out.println("The value of sec 30 = 2/√3");
                    } else if (a == 45) {
                        System.out.println("The value of sec 45 = √2");
                    } else if (a == 60) {
                        System.out.println("The value of sec 60 = 2");
                    } else if (a == 90) {
                        System.out.println("The value of sec 90 = INFINITY");
                    } else {
                        System.out.println("Angle not suported");
                    }

                } else if (t.equalsIgnoreCase("tan")) {
                    if (a == 0) {
                        System.out.println("The value of tan 0 = 0");
                    } else if (a == 30) {
                        System.out.println("The value of tan 30 = 1/√3");
                    } else if (a == 45) {
                        System.out.println("The value of tan 45 = 1");
                    } else if (a == 60) {
                        System.out.println("The value of tan 60 = √3");
                    } else if (a == 90) {
                        System.out.println("The value of tan 90 = INFINTY");
                    } else {
                        System.out.println("Angle not suported");
                    }
                } else if (t.equalsIgnoreCase("cot")) {
                    if (a == 0) {
                        System.out.println("The value of cot 0 = INFINITY");
                    } else if (a == 30) {
                        System.out.println("The value of cot 30 = √3");
                    } else if (a == 45) {
                        System.out.println("The value of cot 45 = 1");
                    } else if (a == 60) {
                        System.out.println("The value of cot 60 = 1/√3");
                    } else if (a == 90) {
                        System.out.println("The value of cot 90 = 0");
                    } else {
                        System.out.println("Angle not suported");
                    }
                } else if (t.equalsIgnoreCase("cosec")) {
                    if (a == 0) {
                        System.out.println("The value of cosec 0 = INFINTY");
                    } else if (a == 30) {
                        System.out.println("The value of cosec 30 = 2");
                    } else if (a == 45) {
                        System.out.println("The value of cosec 45 = √2");
                    } else if (a == 60) {
                        System.out.println("The value of cosec 60 = 2/√3");
                    } else if (a == 90) {
                        System.out.println("The value of cosec 90 = 1");
                    } else {
                        System.out.println("Angle not suported");
                    }
                }
            } else if (check.equalsIgnoreCase("Cal")) {
                System.out.println("Enter a number with decimal or without it;");
                double a = in.nextDouble();

                System.out.println("");

                System.out.println(
                        "Enter a operator (+ , - , * , / , % , ^ , S for Squareroot , C for Cuberoot , R for Round off)");
                char op = in.next().charAt(0);

                System.out.println("");

                System.out.println("Enter a number with decimal or without it;");
                double b = in.nextDouble();

                System.out.println("");

                if (op == '+') {
                    System.out.println("Sum of " + a + " and " + b + "= " + (a + b));
                } else if (op == '-') {
                    System.out.println("Differece of " + a + " and " + b + " = " + (a - b));
                } else if (op == '*') {
                    System.out.println("Product of " + a + " and " + b + " = " + (a * b));
                } else if (op == '/') {
                    System.out.println("Quotiont of " + a + " and " + b + "= " + (a / b));
                    System.out.println("Remainder of " + a + " and " + b + " = " + (a % b));
                } else if (op == '%') {
                    System.out.println("Remainder of " + a + " and " + b + " = " + (a % b));
                } else if (op == '^') {
                    System.out.println(a + " Raised to " + b + " = " + (Math.pow(a, b)));
                } else if (op == 'S' || op == 's') {
                    System.out.println("Squareroot of " + a + " = √" + (Math.sqrt(a)));
                    System.out.println("Squareroot of " + b + " = √" + (Math.sqrt(b)));
                } else if (op == 'C' || op == 'c') {
                    System.out.println("Cuberoot of " + a + " = ∛" + (Math.cbrt(a)));
                    System.out.println("Cuberoot of " + b + " = ∛" + (Math.cbrt(b)));
                } else if (op == 'R' || op == 'r') {
                    System.out.println("Rounded off " + a + " = " + (Math.round(a)));
                    System.out.println("Cuberoot of " + b + " = " + (Math.round(b)));
                }

            } else {
                System.out.println("INVALID OUTPUT:You can enter only Trignometery or calculation");
            }
        } else {
            System.out.println("Password is INCORRECT");
        }

    }
}