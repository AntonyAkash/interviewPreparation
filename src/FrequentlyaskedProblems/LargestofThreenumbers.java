package FrequentlyaskedProblems;

public class LargestofThreenumbers {
	public static void main(String[] args) {
		int a,b,c;
		a=40;b=20;c=30;
		
		int largest=(a>b&&a>c)?a:(b>a && b> c)?a:c;
		System.out.println(largest);
	}

}
