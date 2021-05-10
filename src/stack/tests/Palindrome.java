package stack.tests;

import stack.core.Stack;

public class Palindrome {
	
	private  String str;
	public Stack stk;
	
	public Palindrome( String str )  {
		stk = new Stack( str.length() );
		this.str = new String(str);
		insertIntoAStack(str);
		System.out.println(this.str);
		
	}
	
	public void insertIntoAStack( String str ) {
		for( String i : str.split("") ) {
			try {
				stk.push(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void isPalindrome() {
		int length = stk.length();
		String str;
		for(Object c : stk.getItems()) {
			str = (String) c;
			if(!str.equalsIgnoreCase((String) stk.get(--length))) {
				System.out.println("Is not Palindrome!!!");
				return;
			}
			
		}
		System.out.println("Is a Palindrome!");
	}
	
	
	public static void main(String[] args) throws Exception {
		Palindrome pl = new Palindrome("Mirim");
		pl.isPalindrome();
	}
}
