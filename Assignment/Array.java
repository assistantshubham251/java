package my;

public class Array {

	public static void main(String[] args) {
		
		//print duplicate element from an array
		
		int [] marks = {1, 2, 5, 4, 5, 2,3};
		
		for(int i=0; i<marks.length; i++) {        // using for loop
			for(int j=i+1; j<marks.length; j++) {
				if(marks[i] == marks[j]) {
					System.out.println(marks[j]);
					
					
				}
				
			}
		}
		

	}

}
