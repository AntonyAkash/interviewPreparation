package FrequentlyaskedProblems;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a=10;
		int b=20;
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    System.out.println(a+" "+b);
	    
	    a=10;
	    b=20;
	    a=a*b;//200
	    b=a/b;//200/10=20
	    a=a/b;//200/20=10
	    System.out.println(a+" "+b);
	    
	    //using Xor
	    a=10;
	    b=20;
	    a=a^b;//10^20=30
	    b=a^b;
	    a=a^b;
	    System.out.println(a+" "+b);
	    
	}

}
