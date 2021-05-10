package stack.tests;

import stack.core.Stack;

public class TestDecToBin {
	
	public static int count = 0;
	public static Stack stk;
	
	/*
	 * CONVERTE PARA BINARIO UTILIZANDO A PILHA
	 */
	public static void decToBin ( int num ) throws Exception {
		stk = new Stack(countBinDigits(num));
		if ( num > 0 ) {
			stk.push(num % 2);
			decToBin( num / 2);
			System.out.print(num % 2 );
		}
	}
	
	/*
	 * CONTA QUANTO DIGITOS O O NUMERO TERÁ EM BINÁRIO
	 */
	public static int countBinDigits (int num) {
		if ( num > 0 ) {
			countBinDigits( num / 2);
			count++;
		}
		return count;
	}
	
	/*
	 * TESTA O PROGRAMA
	 */
	public static void main(String[] args) throws Exception {
		decToBin(8);
		stk.showOrderByAsc();
		
	}
}
