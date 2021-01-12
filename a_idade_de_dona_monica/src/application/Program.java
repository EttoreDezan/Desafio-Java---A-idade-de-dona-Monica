package application;
 
import java.util.Scanner;

public class Program {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		int m, a, b;
	 
		do {
			
			System.out.println("Informe a idade de dona Mônica: ");
			m = sc.nextInt(); 
		    if(m < 40 || m > 100) {
			System.out.println("Idade errada, deve ser maior/igual que 40 e menor/igual a 100!");
		}
	 
		}while(m < 40 || m > 100);
		
		do {
			
			System.out.println("Informe a idade de um dos filhos: ");
			a = sc.nextInt(); 
		if(a < 1) {
			System.out.println("A idade deve ser maior que 1!");
		} else if(a >= m) {
			System.out.println("A idade deve ser menor que a de Dona Mônica!");
		}
	 
		}while(a < 1 || a >= m);
		
	    do {
			
		System.out.println("Informe a idade de outro filho: ");
		b = sc.nextInt();
		
		if(b < 1) {
			System.out.println("A idade deve ser maior que 1!");
		} else if(b >= m) {
			System.out.println("A idade deve ser menor que a de Dona Mônica!");
		}else if(b == a) {
			System.out.println("A idade deve ser diferente do primeiro filho!");
		}
		
		}while(b < 1 || b >= m || b == a);
		
		
		
		int idadeTerceiroFilho;
		
		idadeTerceiroFilho = m - a - b;
		
		if(a > b && a > idadeTerceiroFilho) {
			System.out.println("Idade do maior filho é: "+ a);
		}else if(b > a && b > idadeTerceiroFilho) {
			System.out.println("Idade do maior filho é: "+ b);
		}else {
			System.out.println("Idade do maior filho é: "+ idadeTerceiroFilho);
		}
		
		
		sc.close();
	}

} 
