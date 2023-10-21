package principal;

public class Sistema {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		iphone.setArmazenamento(64);
		iphone.setCor("Preto");
		iphone.setModelo("iPhone 5 Plus");
		
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
	
	}
}
