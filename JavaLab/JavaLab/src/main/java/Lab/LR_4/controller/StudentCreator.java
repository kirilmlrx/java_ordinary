package Lab.LR_4.controller;

import Lab.LR_4.model.*;

public class StudentCreator {
    public static Student createStudent(String firstName, String lastName, String patronymic, Sex sex, String studentId) {
        return new Student(firstName, lastName, patronymic, sex, studentId);
    }
}

