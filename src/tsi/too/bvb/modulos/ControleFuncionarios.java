package tsi.too.bvb.modulos;

public class ControleFuncionarios {

	private final int MAX_CLIENTES = 10; 
	private Cliente clientes[];
	private int numeroClientes;
	
	public ControleFuncionarios() {
		clientes = new Cliente[MAX_CLIENTES];
		numeroClientes = 0;
	}
	
	public boolean cadastrarCliente(Cliente pessoa) {
		if(numeroClientes >= MAX_CLIENTES)
			return false;
		clientes[numeroClientes] = pessoa;
		return true;
	}
	
} //class ControleFuncionarios
