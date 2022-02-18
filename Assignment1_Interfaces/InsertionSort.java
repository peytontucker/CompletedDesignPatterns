package Assignment1_Interfaces;
/**
 * Insertion Sort class
 * @author Peyton Tucker
 */

import java.util.ArrayList;

public class InsertionSort implements SortBehavior{

/**
 * Iterates through each element of the list to the left of the key element and determines its proper place in the arraylist.
 * @param data the arraylist of strings to be sorted.
 */

	@Override
	public ArrayList<String> sort(ArrayList<String> data) {
		for (int i = 0; i < data.size()-1; i++) {
			if (data.get(i).charAt(0) > data.get(i+1).charAt(0)) {
				int k = i;
				while (k >= 0 && data.get(k).charAt(0) > data.get(k+1).charAt(0)) {
					String temp = data.get(k);
					data.set(k, data.get(k+1));
					data.set(k+1, temp);
					k--;
				}
			}
		}
		return data;
	}

}
