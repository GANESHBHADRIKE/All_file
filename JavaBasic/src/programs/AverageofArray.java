package programs;

public class AverageofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = {5,4,6,3,2,8,7,1,};
		float sum = 0 ;
		int len = ages.length;
		
		for(int age : ages) 
		{
			sum += age;
			
		}
		System.out.println(sum);
		float average = sum/len;
		System.out.println(average);

	}

}
