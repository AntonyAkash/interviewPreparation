package practice;
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] arr) {
        if(arr==null ||arr.length==0) return "";
        
        String prefix=arr[0];//flower
        
        for(int i=1;i<arr.length;i++) {//start with first index
        	//need to find the prefix that is common between the iterated elemets // so prefix size should need to reduced
        	
        	while(arr[i].indexOf(prefix)!=0) {//if prefix present in start of arr[i] arr[i].indexOf(prefix)=0;
        		                              //if prefix present somewhere in arr[i] arr[i].indexOf(prefix)= >0;
        		                              //if prefix present not in arr[i] arr[i].indexOf(prefix)=-1;
        		
        	}
        }
        
        
    }

    public static void main(String[] args) {
        String[] arr1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(arr1)); // fl

        String[] arr2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(arr2)); // ""
    }
}