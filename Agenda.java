package br.edu.ifrn.ListaDeContatos;

public class Agenda {
	
	private int quantContatos = 0;
	private int TAMANHO = 10;
	private Pessoa[] contatos;
	
	public Agenda(int quantContatos){
		
		this.quantContatos = quantContatos; 
		
		this.contatos = new Pessoa[TAMANHO];
		for(int i = 0; i < TAMANHO; i++) {
			this.contatos[i] = null;
		}
	}
	
	public boolean inserir(String nome, String telefone) {
		if(quantContatos < TAMANHO) {
			for (int i = 0; i < TAMANHO; i++){
				if (contatos[i] == null) {
					contatos[i] = new Pessoa(nome, telefone);
					quantContatos = quantContatos + 1;
					return true;
				}
			}
		}
		
		return false;
		
	}
	
	private int buscarPriv(String nome) {
		for (int i = 0; i < TAMANHO; i++){
			if (contatos[i] != null) {
				if (contatos[i].getNome().equals(nome)) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public Pessoa buscar(String nome) {
		int bpriv = buscarPriv(nome);
		if (bpriv != -1) {
			return contatos[bpriv];
		}
		else {
			return null;
		}
	}
	
	public boolean remover(String nome) {
		int buscar;
		buscar = buscarPriv(nome);
		if (buscar != -1) {
			contatos[buscar] = null;
			quantContatos -= 1;
			return true;
		}
		return false;
	}
	
	public void exibir() {
		for(int i = 0; i < TAMANHO; i++) {
			if(contatos[i] != null) {
				System.out.println("contato: "  + contatos[i].getNome() + " " + contatos[i].getTelefone());
			}
		}
	}
	
	public int getTAMANHO() {
		return TAMANHO;
	}
	public int getQuantContatos() {
		return quantContatos;
	}
}
