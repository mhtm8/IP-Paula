package projetoIP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String decisao = "";
		boolean encerrar = false;
		String resp = "";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("O programa deverá ser executado por array ou lista?");
		System.out.println("Digite 1 para Array");
		System.out.println("Digite 2 para Lista");
		System.out.println(" ");
		System.out.println("Instruções:");
		System.out.println(" ");
		System.out.println("Digite 3 para cadastrar cliente;");
		System.out.println("Digite 4 para cadastrar funcionário;");
		System.out.println("Digite 5 para comprar de fornecedores;");
		System.out.println("Digite 6 para um cliente realizar uma compra;");
		System.out.println("Digite 7 para pagar uma dívida;");
		System.out.println("Digite 8 para quitar uma dívida;");
		System.out.println("Digite 9 para demitir um funcionario;");
		System.out.println("Digite 10 para excluir um cliente;");
		System.out.println("Digite 11 para registrar uma reclamação;");
		System.out.println("Digite 0 para encerrar.");
		
		decisao = in.nextLine();
		
		if(decisao.equals("1")) {
			while(!encerrar) {
				System.out.println("Digite sua proxima operação:");
				
				if(resp.equals("3")) {
					
				}
				else if(resp.equals("4")) {
					
				}
				else if(resp.equals("5")) {
					
				}
				else if(resp.equals("6")) {
					
				}
				else if(resp.equals("7")) {
					
				}
				else if(resp.equals("8")) {
	
				}
				else if(resp.equals("9")) {
				
				}
				else if(resp.equals("10")) {
				
				}
				else if(resp.equals("11")) {
				
				}
				else if(resp.equals("0")) {
				
				}
				else {
					
				}
			}
		}
		else if(decisao.equals("2")) {
			
		}
		else {
			System.out.println("Resposta Inválida.");
		}
		
	}

}
