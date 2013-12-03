package br.com.gabrielmolter.aula2;

public class Pessoa {
	public String nome, sobrenome, endereco, nascimento;

	public Pessoa(String nome,String sobrenome,String endereco, String nascimento){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.nascimento = nascimento;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	
}
