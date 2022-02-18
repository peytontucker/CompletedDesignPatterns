/**
 * @author Peyton Tucker
 * A class designed to represent a PT and their preferred exercises
 */

import java.util.ArrayList;

public class PT {
    
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises;
    private int numExercises;

    /**
     * Constructs a new PT object with their information.
     * @param firstName the PT's first name
     * @param lastName the PT's last name
     * @param bio the PT's biography information
     */
    public PT(String firstName, String lastName, String bio) {
        this.firstName = firstName; this.lastName = lastName; this.bio = bio; exercises = new Exercise[numExercises = 2];
    }

    /**
     * Instantiates an exercise object and adds it to the first empty index of the exercises array.
     * @param title the title of the exercise to be added
     * @param muscleGroups the muscle groups of the exercise to be added
     * @param directions the directions of the exercise to be added
     */
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions) {

        //grows the array if it is full
        if (numExercises >= exercises.length) this.exercises = growArray(exercises);

        //finds the first null element of the exercises array and assigns the new exercise to that index
        for (int i = 0; i < exercises.length; i++) {
            if (exercises[i] == null) {
                exercises[i] = new Exercise(title, muscleGroups, directions);
                break;
            }
        }

        numExercises++;
    }

    /**
     * Returns the first name of this PT.
     * @return this PT's first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Returns the last name of this PT.
     * @return this PT's last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Returns this PT's biography.
     * @return this PT's biography
     */
    public String getBio() {
        return this.bio;
    }

    /**
     * Doubles the size of the current exercise array and populates it with the values of the original exercises array.
     * @param exercises the exercises array to be grown
     * @return the grown array of exercises
     */
    private Exercise[] growArray(Exercise[] exercises) {
        Exercise[] newArray = new Exercise[2*numExercises];
        for (int i = 0; i < exercises.length; i++) {
            newArray[i] = exercises[i];
        }
        return newArray;
    }

    /**
     * Instantiates a new ExerciseIterator object and passes it this PT's exercise array.
     * @return the ExerciseIterator object
     */
    public ExerciseIterator createIterator() {
        ExerciseIterator ei = new ExerciseIterator(this.exercises);
        return ei;
    }

    /**
     * Returns information about this PT in a readable format.
     */
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + "\n" + this.bio + "\n";
    }
}
