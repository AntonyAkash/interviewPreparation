package matrixOR2DArrayss;

public class MatrixMultiplication {
	public static void main(String[] args) {
		
		/*
		 * arr1 of size m × n
		 * arr2 of size n × p  result= m row and p column
		 */ 
		
		
		int[][] arr1= {{1,2},{1,2}}; //  1 2  1 2
		int[][] arr2= {{1,2},{1,2}}; //  1 2  1 2
		
		int[][] finalArr=new int[arr1.length][arr2[0].length];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				for(int k=0;k<arr1[0].length;k++) {
					finalArr[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		
		for(int i=0;i<finalArr.length;i++) {
			for(int j=0;j<finalArr[i].length;j++) {
				System.out.print(finalArr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
