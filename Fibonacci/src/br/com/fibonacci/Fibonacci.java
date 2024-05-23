package br.com.fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculaFibonacci cf = new CalculaFibonacci();
		
		for (int i = 0; i <= 80; i++) {
			long start = System.currentTimeMillis();
			int resultado = cf.calculaFibonacci(i);
			long elapsed = System.currentTimeMillis() - start;
			System.out.println(i + "° Posição | " + "Tempo em Segundos: " + elapsed / 1000 + " | " + resultado);
		}

	}

}
