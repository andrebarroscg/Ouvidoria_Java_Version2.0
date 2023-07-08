package entities;

public class Sugestao extends Manifestacao {


	public Sugestao(Pessoa pessoa, String ocorrencia, String tipo) {
		super(pessoa, ocorrencia, tipo);
		this.setTipo("Sugestão");
		
	}

	@Override
	public String toString() {
		return "Sugestão / Aluno = " + super.pessoa.getNome() + "- Ocorrencia =" + super.getOcorrencia() + "";
	}
}
