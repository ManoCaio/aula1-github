package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Digite alguma coisa ");
		String sentence= ler.nextLine();
		
	
		System.out.println(sentence);
		System.out.println("Digite x y e z");
		String  x, y,z;
		x=ler.next();// ler também as coisas na mesma linha 
		y=ler.next();
		z=ler.next();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		
		
		ler.close();

	}

}
