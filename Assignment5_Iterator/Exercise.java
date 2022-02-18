/**
 * @author Peyton Tucker
 * A class to represent an exercise and its associated information.
 */

import java.util.ArrayList;

public class Exercise {
    private String title;
    private ArrayList<String> targetMuscles;
    private ArrayList<String> directions;

    /**
     * Instantiates a new Exercise object with only its title.
     * @param title the title of the exercise
     */
    public Exercise(String title) {
        this.title = title;
    }

    /**
     * Instantiates a new Exercise object with its title, target muscles, and directions.
     * @param title the title of the exercise
     * @param targetMuscles the target muscles of this exercise
     * @param directions the directions for this exercise
     */
    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions) {
        this.title = title; this.targetMuscles = targetMuscles; this.directions = directions;
    }

    /**
     * Adds a target muscle of this exercise.
     * @param muscle the target muscle to be added
     */
    public void addTargetMuscle(String muscle) {
        targetMuscles.remove(muscle);
    }

    /**
     * Removes a target muscle of this exercise
     * @param muscle the target muscle to be removed
     */
    public void getremoveTargetMuscle(String muscle) {
        targetMuscles.remove(muscle);
    }

    /**
     * Returns information about this exercise in a human-readable format.
     */
    @Override
    public String toString() {
        //set the header of the string
        String header = "\n... " + title + " ...\n";

        //list the muscles worked separated by a comma delimiter
        String muscles = "";
        for (int i = 0; i < targetMuscles.size(); i++) {
            String delim = ", ";
            if (i == targetMuscles.size()-1) delim = "\n";
            muscles+= targetMuscles.get(i) + delim;
        }

        //list the directions
        String dir = "Exercises: \n";
        for (int i = 0; i < directions.size(); i++) {
            dir += "- " + directions.get(i) + "\n";
        }

        return header + muscles + dir;
    }
}
