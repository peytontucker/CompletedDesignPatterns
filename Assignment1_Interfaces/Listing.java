package Assignment1_Interfaces;
import java.util.ArrayList;

public class Listing {
	private String title;
	private ArrayList<String> items = new ArrayList<String>(); 
	private SortBehavior sortBehavior = new BubbleSort(); //default sort behavior is bubble sort unless another behavior is defined
	
	public Listing(String title) {
		this.title = title;
	}
	
	public void add(String item) {
		items.add(item);
	}
	/**
	 * Iterates over each element of the array list and removes items with indicated name
	 * @param item the name of the item to be removed from the arraylist
	 */

	public void remove(String item) {
		for (int i = 0; i < items.size(); i++) {  
			if (items.get(i).equals(item)) {
				items.remove(i);
			}
		}
	}
	public String getTitle() {
		return this.title;
	}
	public void setSortBehavior(SortBehavior sortBehavior) {
		this.sortBehavior = sortBehavior;
	}
	public ArrayList<String> getSortedList() {
		sortBehavior.sort(items);
		return items;
	}
	public ArrayList<String> getUnSortedList() {
		return items;
	}
}
