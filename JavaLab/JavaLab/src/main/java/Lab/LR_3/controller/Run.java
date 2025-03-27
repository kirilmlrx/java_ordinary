package Lab.LR_3.controller;

import Lab.LR_3.model.*;

public class Run {
    public static void main(String[] args) {
        System.out.println("=== Creating University ===");

        // Creating a specific instance of Human (Student)
        Human universityHead = new Student("John", "Doe", "Michael", Sex.MALE);
        University university = new University("Global Tech University", universityHead);
        System.out.println("Created University: " + university);

        System.out.println("\n=== Creating Faculty ===");
        Human facultyHead = new Student("Emily", "Smith", "Olivia", Sex.FEMALE);
        Faculty faculty = new Faculty("Faculty of Engineering", facultyHead);
        university.addFaculty(faculty);
        System.out.println("Added Faculty: " + faculty);

        System.out.println("\n=== Creating Department ===");
        Human departmentHead = new Student("James", "Brown", "David", Sex.MALE);
        Department department = new Department("Computer Science", departmentHead);
        faculty.addDepartment(department);
        System.out.println("Added Department: " + department);

        System.out.println("\n=== Creating Group ===");
        Human groupHead = new Student("Linda", "Johnson", "Eleanor", Sex.FEMALE);
        Group group = new Group("CS-101", groupHead);
        department.addGroup(group);
        System.out.println("Added Group: " + group);

        System.out.println("\n=== Creating Student ===");
        Student student = new Student("Chris", "Williams", "Arthur", Sex.MALE);
        group.addStudent(student);
        System.out.println("Added Student: " + student);

        System.out.println("\n=== Final University Structure ===");
        System.out.println(university);
    }
}
