package my;

public class ArrayIsSortedOrNot {

	public static void main(String[] args) {
		
		int[] arr = {3, 8, 5,44 ,99};
		boolean isSorted = true;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				isSorted=false;
				break;
						
			}
		}
		if(isSorted) {
			System.out.println("The arry is sorted");
		}
		else {
			System.out.println("The arry is not sorted");
		}

	

		

	
	}

}
