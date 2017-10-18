package algorithms;

import java.util.Arrays;

/**
 * This class will place any list of numbers in numerical order
 * @author Richard
 *
 */
public class SortNumbers {

	/**
	 * This method will take a random set of numbers and
	 * place them in numerical order
	 * @param args
	 */
	public static void main(String[] args) {
		//create array
		int[] numbers = new int[]{9,8,7,6,5,4,3,2,1,10,11,15,14};
		
		//find length of array to control loop
		int length = numbers.length-1; 
		
		//do not exceed length of array in loop
		for (int outer = 0; outer<length; outer++){
			
			//reset second counter
			int inner = 0;
			
			//keep looping while two consecutive numbers are not in order
			while (numbers[outer+inner]>numbers[outer+inner+1]) {
				
				//swap numbers that are not in order
				int temp = numbers[outer+inner];
				numbers[outer+inner] = numbers[outer+inner+1];
				numbers[outer+inner+1] = temp;
				
				//decrement and see if numbers need swapped again
				inner--;
				
				//break on negative index to prevent overflow error
				if (outer+inner<0) {
					break;
				}
			}	
		}
		//convert finished array to string and print
		System.out.println(Arrays.toString(numbers));

	}

}
