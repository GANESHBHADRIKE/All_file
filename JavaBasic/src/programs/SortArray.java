package programs;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {2,5,8,6,4,7,9,3,1,};
		Arrays.sort(numbers);
		for(int num : numbers) 
		{
			System.out.print(num+" ");
		}
	}

}
