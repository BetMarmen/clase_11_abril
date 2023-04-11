package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String person1,person2,person3,person4,person5;
		float salarioN,salarioB,hE,inss;
		float salarioN1,salarioB1,hE1,inss1;
		float salarioN2,salarioB2,hE2,inss2;
		float salarioN3,salarioB3,hE3,inss3;
		float salarioN4,salarioB4,hE4,inss4;
		
		System.out.println("Ingrese el nombre del trabajador 1:");
		person1 = scan.next();
		System.out.println("Ingrese el salario base");
		salarioB = scan.nextFloat();
		System.out.println("Ingrese las horas extras laboradas");
		hE= scan.nextFloat();
		inss= (float) (0.0625*salarioB);
		hE= hE*10;
		salarioN= (salarioB+hE)-inss;
		System.out.println("Ingrese el nombre del trabajador 2:");
		person2 = scan.next();
		System.out.println("Ingrese el salario base");
		salarioB1 = scan.nextFloat();
		System.out.println("Ingrese las horas extras laboradas");
		hE1= scan.nextFloat();
		inss1= (float) (0.0625*salarioB1);
		hE1= hE1*10;
		salarioN1= (salarioB1+hE1)-inss1;
		System.out.println("Ingrese el nombre del trabajador 3:");
		person3 = scan.next();
		System.out.println("Ingrese el salario base");
		salarioB2 = scan.nextFloat();
		System.out.println("Ingrese las horas extras laboradas");
		hE2= scan.nextFloat();
		inss2= (float) (0.0625*salarioB2);
		hE2= hE2*10;
		salarioN2= (salarioB2+hE2)-inss2;
		System.out.println("Ingrese el nombre del trabajador 4:");
		person4 = scan.next();
		System.out.println("Ingrese el salario base");
		salarioB3 = scan.nextFloat();
		System.out.println("Ingrese las horas extras laboradas");
		hE3= scan.nextFloat();
		inss3= (float) (0.0625*salarioB3);
		hE3= hE3*10;
		salarioN3= (salarioB3+hE3)-inss3;
		System.out.println("Ingrese el nombre del trabajador 5:");
		person5 = scan.next();
		System.out.println("Ingrese el salario base");
		salarioB4 = scan.nextFloat();
		System.out.println("Ingrese las horas extras laboradas");
		hE4= scan.nextFloat();
		inss4= (float) (0.0625*salarioB4);
		hE4= hE4*10;
		salarioN4= (salarioB4+hE4)-inss4;
		
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Nombre","SalarioBase ","HorasExtras ","Inss ","SalarioNeto");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n",person1,salarioB,hE,inss,salarioN);
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n",person2,salarioB1,hE1,inss1,salarioN1);
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n",person3,salarioB2,hE2,inss2,salarioN2);
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n",person4,salarioB3,hE3,inss3,salarioN3);
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n",person5,salarioB4,hE4,inss4,salarioN4);
	}
	}


