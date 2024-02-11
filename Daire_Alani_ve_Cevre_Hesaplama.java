// Dairenin Alanını ve Çevresini Hesaplayan Program
// Source: https://academy.patika.dev/courses/java101/pratik-daire-alan-cevre

// Author: Amin Aslami

import java.util.*;
import java.util.Scanner;

public class Daire_Alani_ve_Cevre_Hesaplama 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		double pi = 3.14;

		System.out.print("Yari capini giriniz: ");
		double yariCap = scan.nextDouble();

		double alan = pi * yariCap * yariCap;
		double cevre = 2 * pi * yariCap;

		// cevre = (pi * (yariCap * yariCap) * alan) / 360;

		System.out.println("Alan = " + alan);
		System.out.println("Cevre " + cevre);
	}
}
