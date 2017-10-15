/**
 * 
 */
package algorithms;

import java.util.Arrays;

/**
 * @author Richard
 *
 */
public class SortNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create array
		int[] numbers = new int[]{9,8,7,6,5,4,3,2,1};
		//find length of array to control loop
		int length = numbers.length-1; 
		int i=0;
		//do not exceed length of array in loop
		while (i<length){
			//reset second counter
			int j = 0;
			//keep looping while two consecutive numbers are not in order
			while (numbers[i+j]>numbers[i+j+1]) {
				//swap numbers that are not in order
				int temp = numbers[i+j];
				numbers[i+j] = numbers[i+j+1];
				numbers[i+j+1] = temp;
				//decrement and see if numbers need swapped again
				j--;
				//break on negative index to prevent overflow error
				if (i+j<0) {
					break;
				}
			}
		i++;	
		}
		
		System.out.println(Arrays.toString(numbers));

	}

}
