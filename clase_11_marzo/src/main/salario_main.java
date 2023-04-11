package main;

import java.util.Scanner;

public class salario_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String person1,person2,person3,person4,person5;
		float salarioN,salarioB,hE,inss;
		for(int i= 1; i<=5; i++) {
		System.out.println("Ingrese el nombre del trabajador "+i+":");
		person1 = scan.next();
		System.out.println("Ingrese el salario base");
		salarioB = scan.nextFloat();
		System.out.println("Ingrese las horas extras laboradas");
		hE= scan.nextFloat();
		inss= (float) (0.0625*salarioB);
		hE= hE*10;
		salarioN= (salarioB+hE)-inss;
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Nombre","SalarioBase ","HorasExtras ","Inss ","SalarioNeto");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n",person1,salarioB,hE,inss,salarioN);
	}
	}
}
