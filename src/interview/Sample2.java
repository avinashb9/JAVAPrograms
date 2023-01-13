package interview;

import java.util.Arrays;
import java.util.List;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		4. input:  arr[1,2,1,3,4,5,6,7,0,-1]  => Sum: 6
		  sample output: (1,5),(2,4),(6,0)
		 */
		
		int[] numbers = {1,2,1,3,4,5,6,7,0};
		
		int length = numbers.length;
		
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				int sum = numbers[i]+numbers[j];
				if(sum == 6){
					System.out.println(sum);
					System.out.println(numbers[i]+","+numbers[j]);
				}
			}
		}
	}

}
