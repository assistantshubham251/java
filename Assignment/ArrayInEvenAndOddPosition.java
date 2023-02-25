package my;

public class ArrayInEvenAndOddPosition {

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 11, 4, 6,};
		
		System.out.println("Element in even position");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				
				System.out.println(arr[i]);
			
			}
		}
		System.out.println("Element in odd position");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
				
			}
		}

      
	}

}
