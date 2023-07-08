package entities;

import java.util.Scanner;

public class Manifestacao {
	
	Pessoa pessoa;
	private String ocorrencia;
	private String tipo;
	private static Manifestacao[] manifestacoes = new Manifestacao[5];
	int x = 0;
	int contador;

	public Manifestacao() {

	}

	public Manifestacao(Pessoa pessoa, String ocorrencia, String tipo) {

		this.pessoa = pessoa;
		this.ocorrencia = ocorrencia;
		this.tipo = tipo;
	}

	public void inserir(Manifestacao insere) {
		manifestacoes[x] = insere;
		x++;
	}

	public int getSize() {
		return manifestacoes.length;
	}

	public void listar() {
		for (int i = 0; i < manifestacoes.length; i++) {
			if (contador == 0) {
				System.out.println("- SEM MOVIMENTAÇÃO           ");
				break;

			} else if (manifestacoes[i] != null) {

				System.out.println(i + 1 + "ª Manifestação : " + manifestacoes[i]);
			}

		}
	}

	public void incrementaContador() {
		contador++;
	}

	Scanner sc = new Scanner(System.in);

	int countManifest = 0; // Essa variavel é para Contar as Manifestações

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCountManifest() {
		return countManifest;
	}

	public void setCountManifest(int countManifest) {
		this.countManifest = countManifest;
	}

}