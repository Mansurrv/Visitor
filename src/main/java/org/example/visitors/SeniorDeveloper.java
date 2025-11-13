package org.example.visitors;

import org.example.elements.Database;
import org.example.elements.ProjectClass;
import org.example.elements.Test;
import org.example.interfaces.Developer;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class ofter junior....");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing database.....");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test...");
    }
}
