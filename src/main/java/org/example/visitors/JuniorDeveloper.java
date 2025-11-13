package org.example.visitors;

import org.example.elements.Database;
import org.example.elements.ProjectClass;
import org.example.elements.Test;
import org.example.interfaces.Developer;

public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor class....");
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop database.....");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating not reliable test...");
    }
}
