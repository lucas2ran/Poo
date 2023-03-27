package AtivPoo;

public class PessoaFisica extends Cliente {
	
	private String cpf;

	public PessoaFisica(String nome, String endereço, String rg, int idade, String estadoCivil, String cpf) {
		super(nome, endereço, rg, idade, estadoCivil);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void validarCpf() {
		if(getCpf().length() != 11) {
			System.out.println("\n--CPF Inválido!!!");
		}else {
			System.out.println("\n--CPF válido!!!");
		}
		
		}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("\nCPF do cliente: "+cpf);
	}
	
	
	
}