package Assignment1_Interfaces;
import java.util.ArrayList;

public class BubbleSort implements SortBehavior{


	/**
	 * Bubble sort algorithm which sorts strings that may have contain matching characters
	 * @param data the arraylist of items to be sorted
	 */

	@Override
	public ArrayList<String> sort(ArrayList<String> data) {
		boolean hasSwapped = true;
		while (hasSwapped) {
			hasSwapped=false;
			for (int i = 0; i < data.size()-1; i++) {
				if (data.get(i).charAt(0) > data.get(i+1).charAt(0)) {
					String temp = data.get(i);
					data.set(i, data.get(i+1));
					data.set(i+1, temp);
					hasSwapped=true;
				}
				
				/**
				 * The following if statement catches the scenario where two consecutive items in the list start with the same character.
				 * The embedded while loop assigns k to the index of the first different letter between two items.
				 * The embedded if statement is then used to determine if a swap is needed.
				 */

				if (data.get(i).charAt(0) == data.get(i+1).charAt(0)) {
					int k = 1;
					while (data.get(i).charAt(k) == data.get(i+1).charAt(k)) { 
						k++;
					}

					if (data.get(i).charAt(k) > data.get(i+1).charAt(k)) { 
						String temp = data.get(i);
						data.set(i, data.get(i+1));
						data.set(i+1, temp);
						hasSwapped=true;
					}
				}
			}
		}
		return data;
	}
}
