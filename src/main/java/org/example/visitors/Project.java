package org.example.visitors;

import org.example.elements.Database;
import org.example.elements.ProjectClass;
import org.example.elements.Test;
import org.example.interfaces.Developer;
import org.example.interfaces.ProjectElement;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement projectElement : projectElements) {
            projectElement.beWritten(developer);
        }
    }
}
