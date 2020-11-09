package es.studium.Ejemplo3Tablas;

import java.util.Scanner;

public class Ejemplo3Tablas
{
	public static void main(String[] args)
	{
		final int TAM = 5;
		Scanner teclado = new Scanner(System.in);
		int tablaOriginal[] = new int[TAM];
		float tablaResultado[] = new float[TAM];
		int i;
		for(i=0; i<TAM; i++)
		{
			System.out.println("Dame el valor de tabla["+i+"]");
			tablaOriginal[i] = teclado.nextInt();
		}
		teclado.close();
		for (i=0; i<TAM; i++)
		{
			tablaResultado[i] = (float)tablaOriginal[i]/2;
		}
		for(i=0; i<TAM; i++)
		{
			System.out.println(tablaResultado[i]);
		}
	}
}
/*
ENT-->[7][3][5][8][2]
DEC-->[3.5][1.5][2.5][4][1]
*/