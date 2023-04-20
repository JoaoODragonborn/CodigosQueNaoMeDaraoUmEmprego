package meChameDoQueVcQuiser;

public class Caneta {

		
	String cor;
	String marca;
	boolean recarregavel;
	boolean carregada = false;
	//int usos = 0;
	
	Caneta(String var_cor, String var_marca, boolean var_recarregavel){
		cor = var_cor;
		marca = var_marca;
		recarregavel = var_recarregavel;
	}
		
	void recarregar() {
		if (carregada) {
			System.out.println("Sua caneta já está carregada.");
		} else {
			if (recarregavel) {
				carregada = true;
				//usos = 5;
				//System.out.println("Sua caneta está carregada e com cinco usos.");
				System.out.println("Sua caneta está carregada.");
			} else {
				System.out.println("Sua caneta não é recarregavel.");
			} // else_recarregavel
				
		} // else_carregada
			
	} // Função_recarregar
		
	void escrever(String texto){
			
		if(carregada) {
			System.out.printf("<%s> %s <%s>", cor, texto, cor);
			carregada = false;
				
		} else {
			System.out.println("Desculpe, mas sua caneta não tem tinta!");
		} // else
			
	} // Função_escrever
		
	void status(){
		if(recarregavel) {
			System.out.printf("Cor: %s;\n", cor);
			System.out.printf("Marca: %s;\n", marca);
			System.out.printf("Recarregavel: %b;\n", recarregavel);
			System.out.printf("Carregada? %b;\n", carregada);
		} else {
			System.out.printf("Cor: %s;\n", cor);
			System.out.printf("Marca: %s;\n", marca);
			System.out.printf("Recarregavel: %b;\n", recarregavel);
		}
	}
		
}
