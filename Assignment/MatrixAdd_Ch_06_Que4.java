package my;

public class MatrixAdd_Ch_06_Que4 {

	public static void main(String[] args) {
		
		int num1[][] = {{1,2},{3,4}};
		int num2[][] = {{1,1},{2,5}};
		
		//result matrix to store sum
		int res[][] = new int[2][2];
		
		//add and print of res
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				res[i][j] = num1[i][j] + num2[i][j];
				System.out.println(res[i][j]+" " );
			}
			System.out.println();
		}
	
		
		
	}

}
