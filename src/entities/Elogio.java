package entities;

public class Elogio extends Manifestacao{

	public Elogio(Pessoa pessoa, String ocorrencia, String tipo) {
		super(pessoa, ocorrencia, tipo);
		this.setTipo("Elogio");

	}

	@Override
	public String toString() {
		return "Elogio / Aluno = " + super.pessoa.getNome() + "- Ocorrencia =" + super.getOcorrencia() + "";
	}

}
