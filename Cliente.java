package AtivPoo;

import java.text.NumberFormat;

public class Cliente {
	
	private String nome;
	private String endereço;
	private double rg;
	private int idade;
	private String estadoCivil;
	
	public Cliente(String nome, String endereço, double rg, int idade, String estadoCivil) {
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.rg = rg;
		this.idade = idade;
		this.estadoCivil = estadoCivil;
	}
	public Cliente(String nome1, int idade1) {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public double getRg() {
		return rg;
	}
	public void setRg(double rg) {
		this.rg = rg;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public void visualizar() {
		System.out.println("\nNome do Cliente: "+nome);
		System.out.println("\nEndereço do cliente: "+endereço);
		System.out.println("\nDocumento do cliente "+rg);
		System.out.println("\nIdade do Cliente "+idade);
		System.out.println("\nEstado civil do Cliente: "+estadoCivil);
				
	}
	

}
