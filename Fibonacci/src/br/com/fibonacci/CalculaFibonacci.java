package br.com.fibonacci;

public class CalculaFibonacci {	
	public int n1;
	
	public int calculaFibonacci(int n1) {
		return n1 <= 1 ? n1 : calculaFibonacci(n1 - 1) + calculaFibonacci(n1 - 2);

	}

}
