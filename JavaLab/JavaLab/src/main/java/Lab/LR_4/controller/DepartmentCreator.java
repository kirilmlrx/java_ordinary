package Lab.LR_4.controller;

import Lab.LR_4.model.Department;
import Lab.LR_4.model.Human;

public class DepartmentCreator {
    public static Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }
}
