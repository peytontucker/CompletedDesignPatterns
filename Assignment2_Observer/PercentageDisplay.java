package Assignment2_Observer;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * A percentage-style implementation of the Observer interface.
 * @author Peyton Tucker
 */
public class PercentageDisplay implements Observer{

    private Subject poll;
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();
    private int numVotes;

    /**
     * Initializes a new PercentageDisplay object and registers this display as an observer of the subject.
     * @param poll the poll for this observer to observe.
     */
    public PercentageDisplay(Subject poll) {
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
     * DecimalFormat used to round float to one decimal point.
     * 
     * Learned to discretize hashmap into entries using entrySet() using from: https://stackoverflow.com/questions/5911174/finding-key-associated-with-max-value-in-a-java-map
     * Learned to use DecimalFormat from: from https://www.java67.com/2020/04/4-examples-to-round-floating-point-numbers-in-java.html#ixzz7INIswXfG
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
        }
    
        numVotes = 0;
        for (String name : orderedKeys) {
            numVotes += votes.get(name);
        }
        DecimalFormat df = new DecimalFormat("#.0");

        System.out.println("\nCurrent Percent of Votes:");
        for (String name : orderedKeys) {
            float percent = (float)votes.get(name)/numVotes*100;
            System.out.println(name + ": " + Float.valueOf(df.format(percent)) + "%");
        }
    }
}
