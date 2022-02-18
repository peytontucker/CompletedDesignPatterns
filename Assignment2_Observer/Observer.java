package Assignment2_Observer;

import java.util.HashMap;

/**
 * An interface which provides a core method for an Observer class in a subject-observer relationship.
 * @author Peyton Tucker
 */
public interface Observer {
    
    public void update(HashMap<String, Integer> votes);
}
