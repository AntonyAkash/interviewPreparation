package matrixOR2DArrayss;

public class Spiraltraversal {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3,5},{4,5,6,6},{7,8,9,10}};
		
		int minr=0;
	    int minc=0;
	    int maxr=arr.length-1;
	    int maxc=arr[0].length-1;
	    
	    int tne=arr.length*arr[0].length;
	    int count=0;
	    
	    while(count<tne) {
	    	
	    	
	    	//left wall
	    	for(int i=minr,j=minc;i<=maxr && count<tne;i++) {
	    		System.out.println(arr[i][j]);
	    		count++;
	    	}
	    	minc++;
	    	//bottom wall
	    	for(int i=maxr,j=minc;j<=maxc && count<tne;j++) {
	    		System.out.println(arr[i][j]);
	    		count++;
	    		
	    	}
	    	//right wall
	    	maxr--;
	    	for(int i=maxr,j=maxc;i>=minr && count<tne;i--) {
	    		System.out.println(arr[i][j]);
	    		count++;
	    		
	    	}
	    	//top wall
	    	maxc--;
	    	for(int i=minr,j=maxc;j>=minc && count<tne;j--) {
	    		System.out.println(arr[i][j]);
	    		count++;
	    	}
	    	minr++;
	    	System.out.println("-----------------------------");
	    }

	}

}
