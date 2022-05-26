package camelCase;
import java.util.Scanner;
public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner (System.in);
		
		double notaA= 0;
		double notaB= 0;
		double notaC= 0;
		
		System.out.println("Digite a nota da Prova A: ");
		notaA = sc.nextDouble();
		System.out.println("Digite a nota da Prova B: ");
		notaB = sc.nextDouble();
		System.out.println("Digite a nota da Prova C: ");
        notaC = sc.nextDouble();
        
        System.out.println("O resultado final das notas é: " + ((notaA*2)+(notaB*3)+(notaC*5))/10);
	}

}
