package AtivPoo;

public class TesteCliente {

	public static void main(String[] args) {
		
		System.out.println("\n\t\tClientes da lista");
		
		Cliente cliente1 = new Cliente("Lucas Vinicius","Av bambuzal, 10",22.333444,35,"Casado");
		cliente1.visualizar();
		
		System.out.println("_______________________________________________________________________________");
		
		Cliente  cliente2 = new Cliente("Henrique Gabriel","Rua louro, 3",93.456789,18,"Solteiro");
		cliente2.visualizar();
		
		
		
		
	}

}
