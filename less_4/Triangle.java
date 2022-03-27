package selenium_java;

import java.util.Scanner;

public class Triange {

        public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите катет треугольника: ");
        double base = scanner.nextDouble();

        System.out.println("Введите высоту треугольника: ");
        double height = scanner.nextDouble();

        //Площадь треугольника вычисляется по формуле = (width*height)/2
        double area = (base* height)/2;
        System.out.println("Площадь треугольника равна: " + area);
    }
}
