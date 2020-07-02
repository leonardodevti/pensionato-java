package aplicacao;

/*A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos n�meros 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o n�mero de estudantes que v�o
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relat�rio de todas ocupa��es do pensionato, por ordem de quarto,
conforme exemplo.
 * */

import java.util.Scanner;

import entidade.Pensionato;

public class Programa {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Informe a quantidade de estudandes que ir�o se hospedar: ");
		int n = ent.nextInt();

		Pensionato[] pensionato = new Pensionato[10]; // S�o 10 quartos no total.

		for (int i = 1; i <= n; i++) { // n � a quantidade de estudantes hospedados.
			System.out.println();
			System.out.println("Estudante #" + i + ": ");
			System.out.print("Nome: ");
			ent.nextLine();
			String nome = ent.nextLine();
			System.out.print("E-mail: ");
			String email = ent.nextLine();
			System.out.print("Quarto: ");
			int quarto = ent.nextInt(); // Informar em qual quarto ir� se hospedar.
			pensionato[quarto] = new Pensionato(nome, email); // quarto ser� o �ndice do array.
		}

		System.out.println("\nQuartos Ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (pensionato[i] != null) { // Os quartos ocupados ser�o aqueles que n�o s�o nulos.
				System.out.println(i + ": " + pensionato[i]); // Os elementos com �ndices preenchidos.
			}
		}

		ent.close();
	}

}
