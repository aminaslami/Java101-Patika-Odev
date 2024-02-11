// Vucut Kitle Indeksi Hesaplama
// Source: https://academy.patika.dev/courses/java101/odev-vucut-kitle-hesaplama

// Author: Amin Aslami

import java.util.*;
import java.util.Scanner;

public class Vcuut_Kitle_Indeksi_Hesaplama 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Boyunuzu giriniz (Metre cinsinde): ");
		double boy = scan.nextDouble();

		System.out.print("Kilonuzu: ");
		double kilo = scan.nextDouble();

		double vucutKitleIndeki = kilo / (boy * boy);
		System.out.println("Vucut Kitle Indeksiniz: " + vucutKitleIndeki);
	}
}
