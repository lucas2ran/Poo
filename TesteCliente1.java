package AtivPoo;

public class TesteCliente1 {

	public static void main(String[] args) {
		
		System.out.println("\n\t\tClientes da lista");
		
		PessoaFisica pf = new PessoaFisica("Lucas Vinicius","Av bambuzal, 10","223334447",35,"Casado","12345678900");
		pf.visualizar();
		
		System.out.println("_______________________________________________________________________________");
		
		PessoaJuridica  pj = new PessoaJuridica("Henrique Gabriel","Rua louro, 3","93456789",18,"Solteiro","44777889000163");
		pj.visualizar();

	}

}
