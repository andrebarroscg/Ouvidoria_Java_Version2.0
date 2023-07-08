package entities;

public class Pessoa {

	private String nome;
	private String matricula;
	private String cpf;
	
	public Pessoa(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", matricula=" + matricula + "]";
	}
	
	
}
