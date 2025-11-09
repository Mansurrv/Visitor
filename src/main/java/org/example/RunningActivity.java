package org.example;

public class RunningActivity implements ActivityElement {
    private float distanceKm;
    private int durationMinutes;

    public RunningActivity(float distanceKm, int durationMinutes) {
        this.distanceKm = distanceKm;
        this.durationMinutes = durationMinutes;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public float accept(WorkoutVisitor visitor) {
        return visitor.visit(this);
    }
}
