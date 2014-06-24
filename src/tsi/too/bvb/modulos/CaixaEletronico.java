/*Caixa Eletrônico: é composto de funções que permitam ao cliente exercer o autoatendimento, 
 * realizando funções como, por exemplo: retirar extrato, fazer uma transferência de sua conta 
 * corrente para uma aplicação, depositar um dinheiro em sua caderneta de poupança e sacar dinheiro. 
 * Somente clientes do banco estão autorizados a usar os serviços deste módulo, exceção feita a função
 * de depósito, pois qualquer pessoa que esteja portando os códigos de identificação de uma conta 
 * (número da agência, número e tipo da conta bancária) poderão efetuar um depósito em dinheiro ou 
 * cheque na conta de um cliente do BVB. */
package tsi.too.bvb.modulos;

public class CaixaEletronico {

	ContasBancarias contas[];
	private int qntdContas;
	private final int CAPACIDADE = 20;

	public CaixaEletronico() {
		contas = new ContasBancarias[CAPACIDADE];
		qntdContas = 0;
	} //CaixaEletronico()

	public int getQntdContas() {
		return qntdContas;
	} //getQntdContas()

	public void setQntdContas(int qntdContas) {
		this.qntdContas = qntdContas;
	} //setQntdContas()
	
	/* A função recebe um valor que será consultado no vetor. Caso ache a conta, uma senha é requerida
	 * e se a senha estiver certa a função retornará a referencia da conta, caso contrário retorna NULL*/
	public ContasBancarias obterConta(int numeroConta, String senha) {
		
		/* ======ALTERAR=====================ALTERAR=============================ALTERAR========
		 * Quando o software já estiver aceitando operações com arquivos, o teste a seguir deve ser
		 * chamado antes de chamar a função obterConta com as devidas modificações*/
		if(numeroConta < 0 || numeroConta > qntdContas)
		{
			System.out.println("Conta não encontrada no Sistema!");
			return null;
		}
		//======================================================================================
		
		//=============================VERIFICAÇÃO DE SENHA=====================================
		if(senha != contas[numeroConta].getSenha())
		{
			System.out.println("SENHA INCORRETA!!!");
			return null;
		}
		
		return contas[numeroConta];
		
	} //obterConta()
	
	/*Teste na memória --> Se ainda houver espaço no vetor, será alocado um espaço para a conta e a
	 * função retornará true, caso contrário retorna false.*/
	public boolean abrirContaCorrente(ContasBancarias conta) {
		if(qntdContas >= CAPACIDADE)
			return false; //MOSTRA JANELA DE FALHA AO CADASTRAR CLIENTE
		contas[qntdContas++] = conta;
		return true; //MOSTRA JANELA DE SUCESSO AO CADASTRAR CLIENTE
	} //abrirContaCorrente()
	
	public boolean depositarSalario(ContasBancarias conta, double salario) {
		if(conta == null) //Então não foi possível localizar a conta
		{
			System.out.println("CONTA NÃO ENCONTRADA!!!");
			return false;
		}
		conta.setValor(salario);
		return true; //EXIBE MENSAGEM QUE O SALDO FOI DEPOSITADO
	} //depositarSalario()
	
	public double consultarSaldo(ContasBancarias conta) {
		if(conta == null)
		{
			System.out.println("CONTA NÃO ENCONTRADA!!!");
			return Double.parseDouble(null); // FUNCIONA????
		}
		return conta.getValor();
	} //consultarSaldo()
	
	public boolean sacar(ContasBancarias conta, double valor) {
		if(conta == null)
		{
			System.out.println("CONTA NÃO ENCONTRADA!!!");
			return false;
		}
		double valorTotal = conta.getValor();
		if(valor > valorTotal || valor <= 0)
		{
			System.out.println("OPERAÇÃO NEGADA!!!");
			return false;
		}
		conta.setValor(valorTotal - valor);
		// EXIBE MENSAGEM DE SUCESSO AO SACAR
		return true;
	} //sacar()
	
	public boolean depositar(ContasBancarias conta, double valor) {
		if(conta == null)
		{
			System.out.println("CONTA NÃO ENCONTRADA!!!");
			return false;
		}
		if(valor <= 0)
		{
			System.out.println("OPERAÇÃO NEGADA!!!");
			return false;
		}
		double valorTotal = conta.getValor();
		conta.setValor(valorTotal + valor);
		// EXIBE MENSAGEM DE SUCESSO AO DEPOSITAR
		return true;
	} //depositar()
	
} //class CaixaEletronico
