package learning;

import java.util.Arrays;

public class SortNumber {

	public static void main(String[] args) {
		// TODO Auto-gene,ated method stub
		int[] number = {4,8,6,3,4,8};
		
		for(int i = 0; i<number.length -1; i++) {	
			for(int j = 0;j <number.length-1-i;j++) {
				if(number[j]>number[j+1]) {
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				}
			}
		}
		for(int num:number) {
			System.out.println(num);
		}
		}

}
