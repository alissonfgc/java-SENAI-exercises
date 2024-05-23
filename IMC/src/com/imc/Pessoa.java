package com.imc;

public class Pessoa {
	
	
	
	//atributos
	
		public String nome;
		public double altura;
		public double peso;
		public double imc;
		
    //metodo
		public String receberDiagnostico(double imc) {
			
			if (imc < 17) return this.nome + "está muito abaixo do peso.";
			else if (imc < 18.5) return this.nome + "está abaixo do peso.";
			else if (imc < 25) return this.nome + "está no peso ideal.";
			else if (imc < 30) return this.nome + "está acima do peso.";
			else if (imc < 35) return this.nome + "está com obesidade nivel I.";
			else if (imc < 40) return this.nome + "está com obesidade nivel II.";
			else return this.nome + "esta com obesidade morbida ";
		
					
		}
        
    }

