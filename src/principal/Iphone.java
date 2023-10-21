package principal;

import app.AparelhoTelefonico;
import app.NavegadorInternet;
import app.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	private String cor;
	private String modelo;
	private int armazenamento;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}

	@Override
	public void tocar() {
		System.out.println("Tocar Musica");

	}

	@Override
	public void pausar() {
		System.out.println("Pausar Musica");

	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionar Música");

	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibir pagina");

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionar Nova Aba");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizar Pagina");

	}

	@Override
	public void ligar() {
		System.out.println("Ligar para o número");

	}

	@Override
	public void atender() {
		System.out.println("Atender chamada");

	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");

	}

}
