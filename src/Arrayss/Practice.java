package Arrayss;

public class Practice {
	public static void main(String[] args) {
		int [] arr= {1,2,5,6,7};
		int min,max,i;
		//finding the array is even or Odd even i=2 odd i=1
		
		if(arr.length%2==0) {
		  if(arr[0]<arr[1]) {
			  min=arr[0];
			  max=arr[1];
		  }else {
			  min=arr[1];
			  max=arr[0];
		  }
	      i=2;
			
		}else {
			min=max=arr[0];
			i=1;
		}
		
		//comparing pairs
		while(i<arr.length-1) {
			 
			if(arr[i]<arr[i+1]) {
				if(arr[i]<min) min=arr[i];
				if(arr[i+1]>max) max=arr[i+1];
				
			}else {
				if(arr[i+1]<min) min=arr[i+1];
				if(arr[i]>max) max=arr[i];
			}
			
			i+=2;
		}
		
		System.out.println(min +" "+max);
	}

}
