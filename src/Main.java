import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Calculando dias dos meses:
		//Considerando que todos os meses tenham 30 dias, calcular o total de dias de "n" meses onde
		//"n" é um valor informado pelo usuário.
		
		int mes = 30;
		int resul =0;
		
		Scanner ler = new Scanner(System.in);

		
		System.out.println("Informe o nº de meses para descobrir o total de dias: ");
		resul = ler.nextInt();
		
		resul = resul * mes;
		
		System.out.println("O nº de meses informado corresponde a "+ resul + " dias.");
		
	}

}
