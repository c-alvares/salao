package view;

import java.util.Scanner;

import control.UsuarioProcessa;

public class VerificaoView {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		UsuarioProcessa.carregar();
		System.out.print("Informe o e-mail: ");
		int indice = UsuarioProcessa.checarEmail(scan.next());
		if (indice != -1) {
			System.out.print("Digite a senha: ");
			if (UsuarioProcessa.checarSenha(indice, scan.next())) {
				System.out.println("Acesso Liberado");
			} else {
				System.out.println("Acesso Negado");
			}
		} else {
			System.out.println("Usuário não localizado");
		}
	}

}
