package aulapoo;

import java.util.Scanner;

public class notaaluno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		fidubiu dados= new fidubiu();
		 System.out.println("Digite a 1 nota");
		 dados.n1= entrada.nextDouble();
		 
		 System.out.println("Digite a 2 nota");
		 dados.n2= entrada.nextDouble();

		 dados.Calc();
	}

}
