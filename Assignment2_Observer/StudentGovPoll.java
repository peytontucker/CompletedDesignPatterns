package Assignment2_Observer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A class to represent the poll for Student Government.
 * @author Peyton Tucker
 * Implements the Subject interface. Keeps an arraylist of observers and a hashmap of votes. The observers are informed of updates to the votes.
 */
public class StudentGovPoll implements Subject{

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();
    private String school;
    private int numUpdates;

    /**
     * Initializes a new object, populating the school field.
     * @param school the name of the school running the poll.
     */
    public StudentGovPoll(String school) {
        this.school = school;
    }

    /**
     * Adds an observer to the ArrayList of observers.
     * @param observer the observer to be registered/added.
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the ArrayList of observers.
     * @param observer the observer object to be removed.
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    /**
     * Uses the numUpdates field to check if required minimum amount of updates to vote totals have been made. If so, hashmap is passed to the observers.
     */
    @Override
    public void notifyObservers() {
        if (numUpdates >=4) {
            for (Observer observer : observers) {
                observer.update(votes);
            }
        }
    }
    /**
     * Method adds candidates to the votes hashmap.
     * Candidates all start with 0 votes.
     * @param president - candidate's name
     */
    public void addCandidate(String president) {
        votes.put(president, 0);
    }

    /**
     * Adds new votes to the hashmap. Increments numUpdates to keep track of how many new vote add events have occurred. 
     * Runs notifyObservers() which only successfully notifies after 4 vote add events.
     * @param president - candidate's name
     * @param num - amount of votes for the candidate
     */
    public void enterVotes(String president, int num) {
        votes.put(president, num+votes.get(president));
        numUpdates++;
        notifyObservers();
    }

    /**
     * Getter method that returns the name of the school running the poll.
     * @return this object's value of the school field
     */
    public String getSchool() {
        return this.school;
    }
}
