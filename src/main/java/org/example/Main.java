package org.example;

import Model.student;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("First Name: ");
                    String prenom = scanner.nextLine();

                    System.out.print("Last Name: ");
                    String nom = scanner.nextLine();

                    System.out.print("Speciality: ");
                    String specialite = scanner.nextLine();

                    student newStudent = new student(prenom, nom, specialite);
                    students.add(newStudent);

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students in the list.");
                    } else {
                        System.out.println("\n--- Student List ---");
                        for (int i = 0; i < students.size(); i++) {
                            student s = students.get(i);
                            System.out.println((i + 1) + ". "
                                    + s.prenom + " "
                                    + s.nom + " - "
                                    + s.specialite);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    System.out.println("\n--- End Of Program ---\n");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}