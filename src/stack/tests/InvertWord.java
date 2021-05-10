package stack.tests;

import stack.core.Stack;

public class InvertWord {
	public static Stack stk;
	public static String[] words;
	
	public static void splitWords ( String str ) {
		words = str.replace(".", "").split(" ");
	}
	
	public static String[] splitedWords ( String str ) {
		return str.replace(".", "").split(" ");
	}
	
	public static void invertWords(String[] str) throws Exception {
		int count = 0;
		for( String i : str ) {
			stk = new Stack(i.length());
			for ( String j : i.split("")) {
				stk.push(j);
			}
			words[count] = "";
			while( stk.length() > 0) {
				words[count] += stk.pop();
				
			}
		count++;
		}
		
	}
	
	public static void showInvertedWords() {
		System.out.println();
		int count = 1;
		for( String i : words) {
			if(count == words.length) {
				System.out.print(i + ".");
			}else {
				System.out.print(i + " ");
			}
			count++;
		}
	}
	
	public static void main(String[] args) throws Exception {
		splitWords("ESTE EXERCÍCIO É MUITO FÁCIL.");
		showInvertedWords();
		invertWords(splitedWords("ESTE EXERCÍCIO É MUITO FÁCIL."));
		showInvertedWords();
	}
}
