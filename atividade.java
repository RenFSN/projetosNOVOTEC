package camelCase;
import java.util.Scanner;
public class atividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		
		int largura = 0;
		int comprimento = 0;
		System.out.println("Qual é a largura: ");
		largura = sc.nextInt();
		System.out.println("Qual é o comprimento: ");
		comprimento= sc.nextInt();
		
		int area= largura*comprimento;
		System.out.println("A area igual a: "+ area);
		System.out.println("O total de lampadas é:" + (area*18)/18);
		System.out.println("O total de energia é: " + area*18);

	}

}
