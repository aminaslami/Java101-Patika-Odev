// Not Ortalaması Hesaplayan Program
// Soruce: https://academy.patika.dev/courses/java101/pratik-not-ortalamasi

// Author: Patika Dev

import java.util.*;
import java.util.Scanner;

public class Not_Ortalama_Hesaplama {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Degiskenleri olustur
		int mat, fizik, kimya, turkce, tarih, davranis;

		// Kullanicdan degerleri al
		System.out.print("Mat notunuz: ");
		mat = scan.nextInt();

		System.out.print("Mat notunuz: ");
		fizik = scan.nextInt();

		System.out.print("Mat notunuz: ");
		kimya = scan.nextInt();

		System.out.print("Mat notunuz: ");
		turkce = scan.nextInt();

		System.out.print("Mat notunuz: ");
		tarih = scan.nextInt();

		System.out.print("Mat notunuz: ");
		davranis = scan.nextInt();

		double toplamNot = mat + fizik + kimya + turkce + tarih + davranis;
		double ortalama = toplamNot / 6;

		System.out.println("Ortalamaniz : " + ortalama);
	}
}