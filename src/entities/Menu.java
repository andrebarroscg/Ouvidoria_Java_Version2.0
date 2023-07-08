package entities;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);
	

	public void menuIdentificacao() {
		
		System.out.println("|==================================================|");
		System.out.println("|          SISTEMA DE OUVIDORIA UNIFACISA          |");
		System.out.println("|==================================================|");
		System.out.println("|                                                  |");
		System.out.println("|           INFORME SEU NOME E MATRICULA           |");
		System.out.println("|                                                  |");
		System.out.println("|==================================================|");
		System.out.println("");
		System.out.print("Informe o seu ");
		
	}
	
	
	public void menuPrincipal() {

		System.out.println("|==================================================|");
		System.out.println("|          BEM VINDO A OUVIDORIA UNIFACISA         |");
		System.out.println("|==================================================|");
		System.out.println("|                   MENU PRINCIPAL                 |");
		System.out.println("|                                                  |");
		System.out.println("|1 - ADICIONAR MANIFESTAÇÃO                        |");
		System.out.println("|                                                  |");
		System.out.println("|2 - LISTAR DE MANIFESTAÇÕES                       |");
		System.out.println("|                                                  |");
		System.out.println("|3 - SAIR DO SISTEMA                               |");
		System.out.println("|                                                  |");
		System.out.println("|==================================================|");
		System.out.println("");
		System.out.print("Escolha umas das Opção acima: ");
		System.out.println();

	}

	public void menuOcorrencia() {

		System.out.println("|==================================================|");
		System.out.println("|               OUVIDORIA UNIFACISA                |");
		System.out.println("|==================================================|");
		System.out.println("|              TIPOS DE MANIFESTAÇÕES              |");
		System.out.println("|                                                  |");
		System.out.println("|1 - ADICIONE UM ELOGIO                            |");
		System.out.println("|                                                  |");
		System.out.println("|2 - ADICIONE UMA SUGESTÃO                         |");
		System.out.println("|                                                  |");
		System.out.println("|3 - ADICIONE UMA RECLAMAÇÃO                       |");
		System.out.println("|                                                  |");
		System.out.println("|==================================================|");
		System.out.println("");
		System.out.print("Escolha umas das opções se encaixe com sua Manifestação: ");
		System.out.println();

	}
	public void logout() {

		System.out.println("|==================================================|");
		System.out.println("|              VOCÊ SAIU DO SISTEMA                |");
		System.out.println("|                   Version 2.0                    |");
		System.out.println("|                 by André Barros                  |");
		System.out.println("|==================================================|");

	}
}