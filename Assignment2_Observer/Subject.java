package Assignment2_Observer;

/**
 * An interface which provides core methods for a Subject class in a subject-observer relationship.
 * @author Peyton Tucker
 */
public interface Subject {
    
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
