
/*
name: Yaser saad
Roll Number: 202510460
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Registration Number: ");
        String regNum = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Mark 1: ");
        double mark1 = scanner.nextDouble();

        System.out.print("Enter Mark 2: ");
        double mark2 = scanner.nextDouble();

        System.out.print("Enter Mark 3: ");
        double mark3 = scanner.nextDouble();

        Student student = new Student(regNum, name, age, mark1, mark2, mark3);

        System.out.println("\n--- Student Academic Report ---");
        student.displayInformation();

        scanner.close();
    }
}
