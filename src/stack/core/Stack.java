package stack.core;

public class Stack {
	private Object items[];
	
	

	private int top;

	public Stack(int maxSize) {
		if (this.isEmpty())
			this.items = new Object[maxSize];

		this.top = 0;
	}

	/*
	 * VERIFICA SE A PILHA ESTÁ VAZIA
	 */
	public boolean isEmpty() {
		return this.top == 0;
	}

	/*
	 * ADCIONA UM ITEM NO TOPO DA PILHA
	 */
	public Object push(Object x) throws Exception  {
		if (this.top == this.items.length)
			throw new Exception("Error : The stack is full");

		this.items[this.top++] = x;

		return this.items[this.top - 1];
	}

	/*
	 * REMOVE O ULTIMO ITEM DA PILHA 
	 * E O DEVOLVE
	 */
	public Object pop() throws Exception {
		if (this.top == 0)
			throw new Exception("Error : The stack is empty");

		return this.items[--this.top];
	}
	
	/*
	 * DEVOLVE O TAMANHO DA PILHA
	 */
	public int length() {
		return this.top;
	}

	/*
	 * EXIBE OS ITEMS DO TOPO ATÉ A BASE 
	 * MOSTRANDO SEU INDICE NA PILHA
	 */
	public void showOrderByDescWithIndex() {
		int count = 0;
		System.out.println("[");
		for (Object i : this.items) {
			System.out.println("\t" + count + " => \'" + i);
			count++;
		}
		System.out.println("\n]");
	}
	
	/*
	 * EXIBE OS ITEMS DO TOPO ATÉ A BASE
	 */
	public void showOrderByDesc() {
		System.out.println();
		for (Object i : this.items) {
			System.out.print(i);
		}
		System.out.println();
	}
	
	
	/*
	 * EXIBE OS ITEMS DA BASE ATÉ O TOPO
	 */
	public void showOrderByAsc() {
		for (int i = this.top-1; i >= 0; i--) {
			System.out.print(this.items[i]);
		}
	}

//	public static void main(String[] args) throws Exception {
//		Stack stk = new Stack(6);
//		System.out.println(stk.length());
//		System.out.println(stk.push('R'));
//		System.out.println(stk.push('O'));
//		System.out.println(stk.push('B'));
//		System.out.println(stk.push('S'));
//		System.out.println(stk.push('O'));
//		System.out.println(stk.push('N'));
//		System.out.println(stk.length());
//		stk.showOrderByDescWithIndex();
//		stk.showOrderByDesc();
//		stk.showOrderByAsc();
//
//	}
	public Object[] getItems() {
		return items;
	}
}
