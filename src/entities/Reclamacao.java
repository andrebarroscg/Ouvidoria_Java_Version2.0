package entities;

public class Reclamacao extends Manifestacao {



	public Reclamacao(Pessoa pessoa, String ocorrencia, String tipo) {
		super(pessoa, ocorrencia, tipo);
		this.setTipo("Reclamação");
	}

	@Override
	public String toString() {
		return "Reclamação / Aluno = " + super.pessoa.getNome() + "- Ocorrencia =" + super.getOcorrencia() + "";
	}
}
