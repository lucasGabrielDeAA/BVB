package tsi.too.bvb.modulos;

public class ControleFuncionarios {

	private final int MAX_CLIENTES = 10; 
	private Clientes clientes[];
	private int numeroClientes;
	
	public ControleFuncionarios() {
		clientes = new Clientes[MAX_CLIENTES];
		numeroClientes = 0;
	}
	
	public boolean cadastrarCliente(Clientes pessoa) {
		if(numeroClientes >= MAX_CLIENTES)
			return false;
		clientes[numeroClientes] = pessoa;
		return true;
	}
	
} //class ControleFuncionarios
