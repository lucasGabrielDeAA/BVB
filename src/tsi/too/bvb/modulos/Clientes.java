package br.com.bvb.modulos;

public class Cliente {
	
	private String cpf, nome, logradouro, bairro, cidade, uf, telFixo, telMovel;
	private char complemento;
	private int numero;
	
	public Cliente() {}
	
	public Cliente(String cpf, String nome, String logradouro, String bairro,
			String cidade, String uf, String telFixo, String telMovel,
			char complemento, int numero) {
		this.cpf = cpf;
		this.nome = nome;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.telFixo = telFixo;
		this.telMovel = telMovel;
		this.complemento = complemento;
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getTelFixo() {
		return telFixo;
	}

	public void setTelFixo(String telFixo) {
		this.telFixo = telFixo;
	}

	public String getTelMovel() {
		return telMovel;
	}

	public void setTelMovel(String telMovel) {
		this.telMovel = telMovel;
	}

	public char getComplemento() {
		return complemento;
	}

	public void setComplemento(char complemento) {
		this.complemento = complemento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String toString() {
		return cpf + ", " + nome + ", " + logradouro + ", " + bairro + ", " + cidade + ", " + 
				uf + ", " + telFixo + ", " + telMovel + ", " + complemento + ", " + numero;
	}
	
} //class Cliente
