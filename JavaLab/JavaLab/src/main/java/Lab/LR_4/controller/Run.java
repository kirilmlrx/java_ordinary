package Lab.LR_4.controller;

import Lab.LR_4.model.*;
import Lab.LR_4.utils.JsonManager;

import java.io.IOException;
import java.nio.file.Paths;

public class Run {
    private static final String FILE_PATH = Paths.get("D:", "SAVE", "IdeaProjects", "Java_basic", "src", "test", "resources", "university.json").toString();

    public static void main(String[] args) throws IOException {
        System.out.println("=== Creating University ===");

        Human universityHead = new Student("John", "Doe", "Ivanovych", Sex.MALE, "STU-001");
        University university = new University("Tech University", universityHead);
        System.out.println("Created University: " + university);

        Faculty faculty1 = new Faculty("Faculty of Information Technology", new Student("Jane", "Smith", "Petrovna", Sex.FEMALE, "STU-002"));
        Faculty faculty2 = new Faculty("Faculty of Engineering", new Student("Jack", "Johnson", "Sergeevich", Sex.MALE, "STU-003"));
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        Department department1 = new Department("Software Engineering", new Student("Emma", "Brown", "Igorevna", Sex.FEMALE, "STU-004"));
        Department department2 = new Department("Cybersecurity", new Student("Oliver", "Davis", "Petrovich", Sex.MALE, "STU-005"));
        faculty1.addDepartment(department1);
        faculty1.addDepartment(department2);

        Department department3 = new Department("Electrical Engineering", new Student("Sophia", "Wilson", "Borisivna", Sex.FEMALE, "STU-006"));
        Department department4 = new Department("Mechanical Engineering", new Student("Liam", "Moore", "Vladimirovich", Sex.MALE, "STU-007"));
        faculty2.addDepartment(department3);
        faculty2.addDepartment(department4);

        Group group1 = new Group("122-21-2", new Student("Lucas", "Taylor", "Romanovych", Sex.MALE, "STU-008"));
        Group group2 = new Group("122-22-1", new Student("Mia", "Thomas", "Alekseyevna", Sex.FEMALE, "STU-009"));
        department1.addGroup(group1);
        department1.addGroup(group2);

        Group group3 = new Group("121-21-1", new Student("Ava", "Jackson", "Sergeevna", Sex.FEMALE, "STU-010"));
        Group group4 = new Group("121-22-1", new Student("Ethan", "White", "Igorovych", Sex.MALE, "STU-011"));
        department2.addGroup(group3);
        department2.addGroup(group4);

        for (Group group : new Group[]{group1, group2, group3, group4}) {
            group.addStudent(new Student("Noah", "Martin", "Petrovich", Sex.MALE, "STU-012"));
            group.addStudent(new Student("Charlotte", "Garcia", "Olexandrivna", Sex.FEMALE, "STU-013"));
        }

        System.out.println("\n=== Saving University to JSON ===");
        JsonManager.writeToJsonFile(university, FILE_PATH);

        System.out.println("\n=== Reading University from JSON ===");
        University newUniversity = JsonManager.readFromJsonFile(FILE_PATH);

        System.out.println("Loaded University: " + newUniversity);

        if (university.equals(newUniversity)) {
            System.out.println("The universities are equal.");
        } else {
            System.out.println("The universities are not equal.");
        }
    }
}
