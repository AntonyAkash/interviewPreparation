package FrequentlyaskedProblems;

public class faboniocseries {
	public static void main(String[] args) {
		int first=0;
		int second=1;
		int next=0;
		int fabfor=5;
		System.out.println(0);
		System.out.println(1);
		for(int i=2;i<fabfor;i++) {
			next=first+second;
			System.out.println(next);
			first=second;
			second=next;
		}
		
	}

}
