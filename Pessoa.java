package br.edu.ifrn.ListaDeContatos;

public class Pessoa {
	
	 private String nome, cpf, sexo, telefone;

	 private  int idade;

	 public Pessoa(String nome, String telefone){

	     this.nome = nome;
	     
	     this.telefone = telefone;
	     
	 }
	 
	 
	 private boolean validarIdade(int idade){

			return (idade > 0 && idade < 120);

		}
	//encapsulamento das vari�veis da classe
	 	public void setNome(String nome) {
			this.nome = nome;
		}
	 	
	 	public String getNome() {
			return nome;
		}

	 	public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		
		public boolean setIdade(int idade) {

			if(validarIdade(idade)) {

				this.idade = idade;

				return true;

			}

			return false;

		}	
		
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		public String getTelefone() {
			return telefone;
		}
		
	//metodo printDados, printando todos os dados que o usu�rio inserir
	 public void PrintDados() {
	 	System.out.println("nome: " + this.nome);
	 	System.out.println("CPF: " + this.cpf);  
	 	System.out.println("sexo: " + this.sexo);
	 	System.out.println("idade: " + this.idade);
	 }
}
