package org.example;

public class WeightLiftingActivity implements ActivityElement {
    private int sets;
    private int reps;
    private float weightKg;

    public WeightLiftingActivity(int sets, int reps, float weightKg) {
        this.sets = sets;
        this.reps = reps;
        this.weightKg = weightKg;
    }

    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
    }

    public double getWeightKg() {
        return weightKg;
    }

    @Override
    public float accept(WorkoutVisitor visitor) {
        return visitor.visit(this);
    }
}
