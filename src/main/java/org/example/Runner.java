package org.example;

import org.example.interfaces.Developer;
import org.example.visitors.JuniorDeveloper;
import org.example.visitors.Project;
import org.example.visitors.SeniorDeveloper;

public class Runner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior connection:");
        project.beWritten(junior);

        System.out.println("===================");

        System.out.println("Senior connection:");
        project.beWritten(senior);
    }
}
