package matrixOR2DArrayss;

public class WaveTraversal {
   public static void main(String[] args) {
	   
	int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
	int i=0;
	for(int j=0;j<arr[0].length;j++) {
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k][j]);
			if(k==arr.length-1) {
				i=0;
			}else {
				i++;
			}
		}
		
	}
}
}
