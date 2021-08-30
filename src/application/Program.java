package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas linhas?");
		int m = sc.nextInt();
		System.out.println("Quantas colunas");
		int n = sc.nextInt();
		
		int mat[][] = new int[m][n];
		
		
		//LEITURA DA MATRIZ
		for (int i=0;i<mat.length;i++){
			for (int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println(" Entre com os dados da matriz");
		
		// PARTE QUE IMPRIME MATRIZ LIDA
		
		System.out.println("Matriz");
		
		for (int i=0;i<mat.length;i++){
			for (int j=0;j<mat[i].length;j++) {
				
				System.out.print(mat[i][j]+"  ");
			}
			
			System.out.println("");	
		}
		
		System.out.println(" Agora escolha um dos números");
		int num = sc.nextInt();
		
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++) {
				if (mat[i][j] == num) {
					System.out.println("Position  " + i + "," + j+ ":");
					if (j > 0) {
						System.out.println("Left: "+mat[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Up: " +mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: "+mat[i][j+1]);
					}
					if (i < mat.length) {
						System.out.println("Down:  "+mat[i+1][j]);
					}
				}// FECHA O IF DA MATRIZ
			}
		}
		
		
		sc.close();
		

	}

}
