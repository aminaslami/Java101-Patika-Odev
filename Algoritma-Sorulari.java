/*
Author: Amin Aslami
Source: https://academy.patika.dev/courses/java101/pratik-kdv-hesaplama
**/

import java.util.*;
import java.util.Scanner;

public class Kdv_Orani_Hesaplama {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Luften urun fiyatini giriniz: ");
		double urunFiyati = scan.nextInt();

		// Urun fiyati 0 - 1000 arasi, %18 kdv kesilecektir.

		if (urunFiyati > 0 && urunFiyati < 1000) {
			double kdv1 = urunFiyati * 0.18;
			double kdv_urunFiyati = kdv1 + urunFiyati;

			System.out.println("Urun fiyat kdv ile beraber: " + kdv_urunFiyati);
		}

		// Urun fiyat 1000 fazla olanlar, %8 kdv kesilecektir.
		else {
			double kdv2 = urunFiyati * 0.08;
			double kdv_urunFiyati = kdv2 + urunFiyati;

			System.out.println("Urun fiyati kdv ile beraber: " + kdv_urunFiyati);
		}
	}
}