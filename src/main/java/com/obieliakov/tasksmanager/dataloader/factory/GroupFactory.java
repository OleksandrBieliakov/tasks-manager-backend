package com.obieliakov.tasksmanager.dataloader.factory;

import com.obieliakov.tasksmanager.model.Group;
import org.springframework.stereotype.Component;

@Component
public class GroupFactory implements Factory<Group> {

    public static final String GROUP_NAME = "group_name";

    private int next_serial_number = 1;

    @Override
    public Group generate() {
        int serial_number = next_serial_number;
        Group group = new Group();
        group.setName(format(GROUP_NAME, serial_number));
        next_serial_number++;
        return group;
    }
}
