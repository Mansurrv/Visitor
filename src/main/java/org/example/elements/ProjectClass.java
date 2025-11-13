package org.example.elements;

import org.example.interfaces.Developer;
import org.example.interfaces.ProjectElement;

public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
