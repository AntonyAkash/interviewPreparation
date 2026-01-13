package matrixOR2DArrayss;

import java.util.Scanner;

public class create2dArraywithInputs {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r, c;
		r=sc.nextInt();
		c=sc.nextInt();
		int [][] arr=new int[r][c];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			   System.out.print( arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
