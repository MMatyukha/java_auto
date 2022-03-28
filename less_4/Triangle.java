package selenium_java;

import java.util.Scanner;

public class Triange {

      public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Сторона a=");
                int a = sc.nextInt();

                System.out.println("Сторона b=");
                int b = sc.nextInt();

                System.out.println("Сторона c=");
                int c = sc.nextInt();

                int p = (a + b + c) / 2;
                double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                System.out.println("Площадь треугольника = " + s);

                sc.close();
                if (a + b < c || a + c < b || b + c < a) {
                        System.out.println("Эти стороны не образуют треугольника");
                        System.exit(0);
                }
                if (a == (b = c)) {
                        System.out.println("Эти стороны  образуют треугольника равнобедренный  треугольник");
                        System.exit(0);
                }
        }
