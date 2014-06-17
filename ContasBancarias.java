/*Contas Bancárias: este é o módulo fundamental do sistema BVB, composto de serviços elementares 
 * oferecidos a qualquer cliente, como, por exemplo, abrir uma conta corrente, depositar o salário, 
 * verificar o saldo da conta, sacar dinheiro e efetuar depósito. As funções deste módulo são para 
 * uso exclusivo dos funcionários do banco, sendo que os serviços de administração da conta (p. ex. 
 * saque, depósito e extrato) são realizados pelo próprio cliente através do Caixa Eletrônico.*/
package br.com.bvb.modulos;

public abstract class ContasBancarias {
	
	private int numeroConta;
	private String senha;
	private double valor;
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
} //class ContasBancarias
