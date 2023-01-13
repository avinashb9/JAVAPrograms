package arrays;

public class SortingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {23,12,34,56,34};
		for(int b:numbers) {
			System.out.print(b+",");
		}
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i] > numbers[j]) {
					//swap elements
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
					
				}
			}
		}
		System.out.println();
		System.out.println("after sorting");
		for(int a:numbers) {
			System.out.print(a+",");
		}
		System.out.println();
		System.out.println("Second largest:"+numbers[numbers.length-2]);
		
	}

}
