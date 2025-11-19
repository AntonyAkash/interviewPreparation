package String;

import java.util.Stack;

public class CheckwheterGivenStringiswellFormedOrNot {
	public static void main(String[] args) {
		//balance-> {},[],() has proper openning and closing
		//unbalance_->{() dont have proper closing
		
		String a="{[(Antony)]}}";
		Stack<Character> s=new Stack<>();
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			if(s.isEmpty()) {
				s.add(c);
			}else if(c=='{'||c=='['||c=='('){
				s.push(c);
			}
			else if(c=='}' && s.peek()=='{') {
				s.pop();
				
			}else if(c==')' && s.peek()=='(') {
				s.pop();
			}else if(c==']' && s.peek()=='[') {
				s.pop();
			}
		}
		
		System.out.println(s.isEmpty()?"String is well formed":"String is not well formed");
	}

}
