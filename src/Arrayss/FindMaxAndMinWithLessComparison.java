package Arrayss;


public class FindMaxAndMinWithLessComparison {
	     //n=2
        //total comparison for this method 2n-2->2*6-2=10
	    //where else for normal method 1.5n->1.5*6=9
	    public static void main(String[] args) {
	        int[] arr = {5, 2, 8, 1, 9, 3};

	        int min, max;
	        int i;

	        // If even number of elements
	        if (arr.length % 2 == 0) {
	            if (arr[0] < arr[1]) {
	                min = arr[0];
	                max = arr[1];
	            } else {
	                min = arr[1];
	                max = arr[0];
	            }
	            i = 2;
	        } else {
	            // If odd number of elements
	            min = max = arr[0];
	            i = 1;
	        }

	        // Process pairs
	        while (i < arr.length - 1) {
	            if (arr[i] < arr[i + 1]) {
	                if (arr[i] < min) min = arr[i];
	                if (arr[i + 1] > max) max = arr[i + 1];
	            } else {
	                if (arr[i + 1] < min) min = arr[i + 1];
	                if (arr[i] > max) max = arr[i];
	            }
	            i += 2;
	        }

	        System.out.println("Min = " + min);
	        System.out.println("Max = " + max);
	    }
	}



