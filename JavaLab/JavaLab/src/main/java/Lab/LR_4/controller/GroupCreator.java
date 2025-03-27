package Lab.LR_4.controller;

import Lab.LR_4.model.Group;
import Lab.LR_4.model.Human;

public class GroupCreator {
    public static Group createGroup(String name, Human head) {
        return new Group(name, head);
    }
}
