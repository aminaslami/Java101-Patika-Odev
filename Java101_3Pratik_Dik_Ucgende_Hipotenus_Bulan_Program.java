import java.util.Scanner;
public class Java101_3Pratik_Dik_Ucgende_Hipotenus_Bulan_Program
{
   public static void main(String[] args)
   {
      // Degisken Olusturma:
      double hipotenus;

      // Kullancidan veri alma.
      Scanner giris = new Scanner(System.in);

      System.out.print("1. Kenari Giriniz: ");
      int a = giris.nextInt();

      System.out.print("2. Kenari Giriniz: ");
      int b = giris.nextInt();

      hipotenus = Math.sqrt((a*a) + (b*b));
      System.out.println("Hipotenus: " + hipotenus);
   }
}