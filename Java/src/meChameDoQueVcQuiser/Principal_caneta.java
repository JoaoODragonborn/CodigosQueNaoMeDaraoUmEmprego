package meChameDoQueVcQuiser;

public class Principal_caneta {
	public static void main(String[] args) {
		
		Caneta caneta_vermelha = new Caneta("Vermelha", "Faber-Castell", false);
		Caneta caneta_azul = new Caneta("Azul", "Pencil", true);
		
		//System.out.println(caneta_vermelha.cor);
		caneta_vermelha.recarregar();
		caneta_vermelha.status();
		
		System.out.println();
		
		caneta_azul.status();
		
		System.out.println();
		
		caneta_azul.recarregar();
		
		System.out.println();
		
		caneta_azul.status();
		
		
	}
}
