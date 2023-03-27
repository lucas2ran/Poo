package AtivPoo;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;

	public PessoaJuridica(String nome, String endereço, String rg, int idade, String estadoCivil, String cnpj) {
		super(nome, endereço, rg, idade, estadoCivil);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void validarCnpj() {
		if(getCnpj().length() != 14) {
			System.out.println("\n--CNPJ Inválido!!!");
		}else {
			System.out.println("\n--CNPJ válido!!!");
		}
		
		}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("\nCNPJ do cliente: "+cnpj);
	}
	
	
	
}


