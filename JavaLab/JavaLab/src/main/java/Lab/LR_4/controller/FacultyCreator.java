package Lab.LR_4.controller;

import Lab.LR_4.model.Faculty;
import Lab.LR_4.model.Human;

public class FacultyCreator {
    public static Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }
}
