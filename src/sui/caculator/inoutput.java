package sui.caculator;

import java.util.Scanner;

public class inoutput {
	int a,b;
	
	void input(){
		System.out.println("please enter a and b");
		Scanner scanner = new  Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
	}

	void printHeader(){
		System.out.println("please enter option\n1.sum\n2.diff\n3.mul\n4.div\n5.exit\n");
	}

	int getOption(){
		Scanner scanner = new  Scanner(System.in);
		int option = scanner.nextInt();
		scanner.close();
		return option;
	}

	public void printErrorMessage() {
		System.out.println("please enter correct value");
	}
}
