package org.example;

class CalorieCalculationVisitor implements WorkoutVisitor {
    @Override
    public float visit(RunningActivity activity) {
        double distanceCalories = activity.getDistanceKm() * 60;
        double timeCalories = activity.getDurationMinutes() * 2;
        double totalCalories = distanceCalories + timeCalories;

        System.out.printf("-> Running: %.1f km, %d min. Burned: %.2f Cal\n",
                activity.getDistanceKm(), activity.getDurationMinutes(), totalCalories);

        return (float) totalCalories;
    }

    @Override
    public float visit(WeightLiftingActivity activity) {
        double totalVolume = activity.getSets() * activity.getReps() * activity.getWeightKg();
        double totalCalories = totalVolume * 0.05;

        System.out.printf("-> Lifting: %d sets of %d reps @ %.1f kg. Burned: %.2f Cal (Total Volume: %.0f kg-reps)\n",
                activity.getSets(), activity.getReps(), activity.getWeightKg(), totalCalories, totalVolume);

        return (float) totalCalories;
    }
}
