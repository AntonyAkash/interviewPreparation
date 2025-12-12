package String;

public class AddStringsWithSign {
public static void main(String[] args) {
	String a="-123";
	String b="-111";
	int sum=Integer.valueOf(a)+Integer.valueOf(b);  //Integer.valueOf(b) -> returns integer
	System.out.println(sum);                        ////Integer.valueOf(b) -> returns primitive int
} 
}
