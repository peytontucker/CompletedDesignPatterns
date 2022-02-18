/**
 * @author Peyton Tucker
 * A class designed to iterate over an array of exercises, which implements java.util's Iterator
 */

import java.util.Iterator;

public class ExerciseIterator implements Iterator<Exercise> {

    private Exercise[] exercises;
    private int position = 0;

    /**
     * Constructs a new ExerciseIterator object.
     * @param exercises the array of exercises to be iterated over.
     */
    public ExerciseIterator(Exercise[] exercises) {
        this.exercises = exercises;
    }

    /**
     * Returns true if there are more exercises to iterate over, and false if otherwise.
     */
    @Override
    public boolean hasNext() {
        return exercises[position] != null;
    }

    /**
     * Returns the next exercise in the array being iterated over.
     */
    @Override
    public Exercise next() {
        Exercise currentExercise = this.hasNext() ? exercises[position] : null;
        position++;
        return currentExercise;
    }
    
}
