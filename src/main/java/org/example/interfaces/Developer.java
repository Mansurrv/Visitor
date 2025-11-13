package org.example.interfaces;

import org.example.elements.Database;
import org.example.elements.ProjectClass;
import org.example.elements.Test;

public interface Developer {
    public void create(ProjectClass projectClass);
    public void create(Database database);
    public void create(Test test);
}
