// Ebob Hesaplama
// Source: https://academy.patika.dev/courses/java101/pratik-ebob-ekok

// Author: Patika Dev

import java.util.*;
import java.util.Scanner;

public class EbobHesaplama 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("n1 sayisini giriniz: ");
		int n1 = scan.nextInt();

		System.out.print("n2 sayisni girinizL: ");
		int n2 = scan.nextInt();

		int ebob = 1;

		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				ebob = i;
			}
		}
		System.out.println(ebob);
	}
}
