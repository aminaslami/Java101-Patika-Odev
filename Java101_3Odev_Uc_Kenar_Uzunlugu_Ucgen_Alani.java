import java.util.Scanner;

public class Java101_3Odev_Uc_Kenar_Uzunlugu_Ucgen_Alani
{
   public static void main(String[] args)
   {
      // Degisken Olusturma:
      int u;
      double alan;

      // Kullancidan veri alma.
      Scanner giris = new Scanner(System.in);

      System.out.print("1. Kenari Giriniz: ");
      int kenar1 = giris.nextInt();

      System.out.print("2. Kenari Giriniz: ");
      int kenar2 = giris.nextInt();

      System.out.print("3. Kenari Giriniz: ");
      int kenar3 = giris.nextInt();

      u = (kenar1 + kenar2 + kenar3) / 2;
      alan = (int) Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
      System.out.println("Üçgenin alaný = " + alan);
   }
}
/*
Dik Üçgende Hipotenüs Bulan Program
Java ile kullanýcýdan dik kenarlarýnýn uzunluðunu alan ve hipotenüsü hesaplayan programý yazýn.

Ödev
Üç kenar uzunluðunu kullanýcýdan aldýðýnýz üçgenin alanýný hesaplayan programý yazýnýz.

Formül
Üç????? ç?????? = 2?

? = (a+b+c) / 2

Alan * Alan = ? * (? ? ?)* (? ? ?) * (? ? ?)
*/
// Kaynak: https://app.patika.dev/courses/java101/pratik-hipotenus-bulma