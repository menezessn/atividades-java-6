package atividade4;

import java.util.Arrays;
import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		Scanner grava = new Scanner(System.in);
		int a=0, b=0, c=0, temp ;
		
		
			System.out.println("Digite o número A:");
			a = grava.nextInt();
			System.out.println("Digite o número B:");
			b = grava.nextInt();
			System.out.println("Digite o número C:");
			c = grava.nextInt();
			
			for(int i =1 ; i<=10; i++) {
			if(a>b) {
				temp = a;
				a = b;
				b = temp;
				} else if(b>c) {
					temp = c;
					b=c;
					c = temp;
				}
			}
			
			System.out.println(a+ " "+ b+ " "+c);
		
		
	}
}