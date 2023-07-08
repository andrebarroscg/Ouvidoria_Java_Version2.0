package application;

import java.util.Scanner;

import entities.Elogio;
import entities.Manifestacao;
import entities.Menu;
import entities.Pessoa;
import entities.Reclamacao;
import entities.Sugestao;

public class Program {
	
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			Scanner enter = new Scanner(System.in);

			int countManifest = 0; // Essa variavel é para Contar as Manifestações

			// Instanciar Classe Manifestação
			Manifestacao manifestacao = new Manifestacao();

			// Instanciar Classe Menu
			Menu menu = new Menu();

			menu.menuIdentificacao();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Matricula: ");
			String matricula = sc.nextLine();
			Pessoa pessoa = new Pessoa(nome, matricula);

			String opcao = "1";
			while (opcao != "0") {
				menu.menuPrincipal();
				opcao = sc.nextLine();
				switch (opcao) {

				case "1":

					menu.menuOcorrencia();

					String tipoOcorrencia = sc.nextLine();

					

					if (countManifest < 5) {

						
						if (tipoOcorrencia.equals("1")) {
							System.out.println("|========================|");
							System.out.println("|    OPÇÃO ELOGIO        |");
							System.out.println("|========================|");
							System.out.print("Digite seu Elogio: ");
							
							
							
							
							String elogioInput = sc.nextLine();
							Elogio elogio = new Elogio(pessoa, elogioInput, tipoOcorrencia);
							manifestacao.inserir(elogio);
							manifestacao.incrementaContador();
							countManifest++;
							
							System.out.println("");
							System.out.println("|============================================|");
							System.out.println("|       Elogio cadastrado com sucesso!       |");      
							System.out.println("|============================================|");
							System.out.println("");
							
							System.out.println("pressione 'ENTER' para voltar ao MENU PRINCIPAL!");
							enter.nextLine();
							break;
						}

						if (tipoOcorrencia.equals("2")) {
							System.out.println("|========================|");
							System.out.println("|    OPÇÃO SUGESTÃO      |");
							System.out.println("|========================|");
							System.out.print("Digite sua sugetão: ");
							String sugestaoInput = sc.nextLine();
							Sugestao sugestao = new Sugestao(pessoa, sugestaoInput, tipoOcorrencia);
							manifestacao.inserir(sugestao);
							manifestacao.incrementaContador();
							countManifest++;
							
							System.out.println("");
							System.out.println("|============================================|");
							System.out.println("|       Sugestão cadastrada com sucesso!     |");      
							System.out.println("|============================================|");
							System.out.println("");
							
							System.out.println("pressione 'ENTER' para voltar ao MENU PRINCIPAL!");
							enter.nextLine();
							break;
						}

						if (tipoOcorrencia.equals("3")) {
							
							System.out.println("|========================|");
							System.out.println("|    OPÇÃO RECLAMAÇÃO    |");
							System.out.println("|========================|");
							System.out.print("Digite sua reclamação: ");
							
							String reclamacaoInput = sc.nextLine();
							Reclamacao reclamacao = new Reclamacao(pessoa, reclamacaoInput, tipoOcorrencia);
							manifestacao.inserir(reclamacao);
							manifestacao.incrementaContador();
							countManifest++;
							
							System.out.println("");
							System.out.println("|============================================|");
							System.out.println("|      Reclamação cadastrada com sucesso!    |");      
							System.out.println("|============================================|");
							System.out.println("");
							
							System.out.println("pressione 'ENTER' para voltar ao MENU PRINCIPAL!");
							enter.nextLine();
							
							break;

						} else {
							System.out.println("Por favor Digite um Valor Válido!");
							System.out.println("Tecla Enter para Continuar!");
							sc.nextLine();
							break;
						}
					} else {
						System.out.println("Banco de dados cheio. Por favor adquira um pacote maior!");
						System.out.println("Tecla Enter para Continuar!");
						sc.nextLine();
						break;
					}
				case "2":

					System.out.println("- LISTA DE MANIFESTAÇÕES CADASTRADAS");
					System.out.println();

					// For para contagem das Manifestações se não hover manifestações imprime Sem
					// Manifestação se houver Manisteação o Sistema vai buscar o Objeto na Classe
					// Manifestação
					manifestacao.listar();
					
					System.out.println();
					System.out.println("Tecla Enter para Continuar!");
					sc.nextLine();
					break;

				// Saida do Sistema

				case "3":
					opcao = "0";
					menu.logout();
					break;

				default:
					System.out.println("Por favor Digite um Valor Válido!");
					System.out.println("Tecla Enter para Continuar!");
					sc.nextLine();
					break;

				} // Fechamento do Switch

			} // Fechamento do While
			sc.close(); // Fechamento do Scanner
		}
	}
