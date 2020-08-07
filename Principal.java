package projetoCaneta;

public class Principal {

	public static void main(String[] args) {
		
		Caneta bic = new Caneta();
		bic.marca = "Bic"; 
		bic.cor = "Preta";
	
		bic.escrever();
		bic.trocarCarga();
	}

}
