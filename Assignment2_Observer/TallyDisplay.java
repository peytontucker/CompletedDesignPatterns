package Assignment2_Observer;

import java.util.HashMap;
import java.util.Map;

/**
 * A tally-style implementation of the Observer interface.
 * @author Peyton Tucker
 */
public class TallyDisplay implements Observer{

    private Subject poll;
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();

    /**
     * Initializes a new TallyDisplay object and registers this display as an observer of the subject.
     * @param poll the poll for this observer to observe.
     */
    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    /**
     * Updates (replaces) the old votes hashmap with the new votes.
     * @param votes the updated hashmap of votes.
     */
    @Override
    public void update(HashMap<String, Integer> votes) {
        this.votes = votes;
        display();
    }

    /**
     * Creates an array with the same size as the entry set of the votes hashmap. First for-loop populates the array with the keys of the hashmap.
     * Second for-loop uses bubble sort to sort the keys in the array in descending order (the order in which they will be displayed in output).
     * 
     * Learned to discretize hashmap into entries using entrySet() using from: https://stackoverflow.com/questions/5911174/finding-key-associated-with-max-value-in-a-java-map
     */
    private void display() {
        String[] orderedKeys = new String[votes.size()];

        int i = 0;
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            orderedKeys[i] = entry.getKey();
            i++;
        }
        
        for (int k = 0; k < orderedKeys.length-1; k++) {
            if (votes.get(orderedKeys[k]) < votes.get(orderedKeys[k+1])) {
                String temp = orderedKeys[k];
                orderedKeys[k] = orderedKeys[k+1];
                orderedKeys[k+1] = temp;
            }
        } //keys are now in order in the orderedKeys array.
        
        System.out.println("\nCurrent Tallies:");
        for (String name : orderedKeys) {
            System.out.println(name + ": " + votes.get(name));
        }
    }
    
}
