package org.example.elements;

import org.example.interfaces.Developer;
import org.example.interfaces.ProjectElement;

public class Test implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
