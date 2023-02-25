package my;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// creating two matrices
		int[][] x = {{8, 9, 11} ,{7, 4, 5 } , {9, 11, 2}};
		int[][] y = {{7, 5, 6} ,{2, 2, 3} , {6, 2, 1}};
		// creating another matrix to store the multiplication of two matrices
		int[][] multi = new int[3][3];//3 rows and 3 columns
		
		// multiplying and printing multiplication of two matrices 
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				multi[i][j] = 0;
				for(int k=0;k<3;k++) {
					multi[i][j] += x[i][k] * y[k][j];
				}// end of k loop
				 System.out.println(multi[i][j] + " ");// printing matrix element
				
				 
			}// ended of j loop
			 System.out.println(" ");// new line
		}
		
	}

}
