package br.edu.ifrn.ListaDeContatos;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Agenda agd = new Agenda(0);
		Scanner tec = new Scanner (System.in);
		
		int menu = 0;
		String nome;
		String telefone;
		
		while(menu != 5) {
			
			System.out.println("Escolha: ");
			System.out.println("1 eh inserir contato");
			System.out.println("2 eh buscar contato");
			System.out.println("3 eh remover contato");
			System.out.println("4 eh exibir o contato");
			System.out.println("5 eh sair");
			menu = tec.nextInt();
			
			tec.nextLine();
			
			if (menu > 0 && menu < 5) {
				switch(menu) {
				case 1:
					 if (agd.getQuantContatos() < agd.getTAMANHO()) {
						System.out.println("Digite o nome: ");
						nome = tec.nextLine();
				
						System.out.println("Digite o numero: ");
						telefone = tec.nextLine();
			
						if(agd.inserir(nome, telefone)) {
							System.out.println("Contato adicionado");
						}
					}
					 
					else {
						System.out.println("Nao eh possivel cadastrar, a agenda esta cheia");
					}
					 
					break;
			
				case 2:
					Pessoa busca;
					System.out.println("Digite o nome: ");
					nome = tec.nextLine();
					busca = agd.buscar(nome);
					if(busca == null) {
						System.out.println("Contato nao cadastrado");
					}
					else {
						System.out.println("O nome do contato eh: " + busca.getNome());
						System.out.println("O telefone do contato eh: " + busca.getTelefone());
					}
					
					break;
			
				case 3:
					boolean remove;
					
					System.out.println("Digite o nome: ");
					nome = tec.nextLine();
					
					remove = agd.remover(nome);
					
					if (remove == true) {
						System.out.println("Contato removido");
					}
					else if (remove == false) {
						System.out.println("Nao foi possivel remover");
					}
					break;
				case 4:
					if (agd.getQuantContatos() == 0) {
						System.out.println("Nao eh possivel exibir pq nao tem nenhum contato adicionado");
					}
					else {
						agd.exibir();
					}
					break;
					
				}
			}
		}
		
		System.out.println("Programa encerrado");
		tec.close();
		
	}
}
