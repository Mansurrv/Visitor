package org.example;

interface WorkoutVisitor {
    float visit(RunningActivity runningActivity);
    float visit(WeightLiftingActivity weightLiftingActivity);
}
