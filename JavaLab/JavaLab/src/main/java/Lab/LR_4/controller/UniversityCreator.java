package Lab.LR_4.controller;

import Lab.LR_4.model.*;
import Lab.LR_4.utils.JsonManager;

import java.io.IOException;
import java.util.Random;

public class UniversityCreator {

    private static final Random random = new Random();

    public static University createUniversity() {
        Human universityHead = new Student("Alexander", "King", "Petrovich", Sex.MALE, "STU-100");

        University university = new University("Tech University", universityHead);

        for (int i = 0; i < 2; i++) {
            Faculty faculty = new Faculty("Faculty of " + (i == 0 ? "IT" : "Engineering"), new Student("Head " + i, "Last", "Name", Sex.MALE, "STU-101"));
            university.addFaculty(faculty);

            for (int j = 0; j < 2; j++) {
                Department department = new Department("Department " + (j + 1), new Student("Head " + j, "Last", "Name", Sex.FEMALE, "STU-102"));
                faculty.addDepartment(department);

                for (int k = 0; k < 2; k++) {
                    Group group = new Group("Group " + (k + 1), new Student("Head " + k, "Last", "Name", Sex.FEMALE, "STU-103"));
                    department.addGroup(group);

                    for (int m = 0; m < 2; m++) {
                        group.addStudent(new Student("FirstName" + m, "LastName" + m, "Patronymic" + m, Sex.MALE, "STU-104"));
                    }
                }
            }
        }
        return university;
    }

    public static void saveUniversityToJson(University university, String fileName) throws IOException {
        JsonManager.writeToJsonFile(university, fileName);
    }

    public static University loadUniversityFromJson(String fileName) throws IOException {
        return JsonManager.readFromJsonFile(fileName);
    }
}
