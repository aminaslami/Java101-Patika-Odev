import java.util.Scanner;
public class Java101_4Pratik_Taksimetre_KM_Hesaplama
{
   public static void main(String[] args)
   {
      Scanner giris = new Scanner(System.in);

      double perKM = 10.20;
      double total;
      double baslingcFiyat = 10;

      System.out.print("Mesafiye KM cinsinden giriniz: ");
      int km = giris.nextInt();

      total = (km * perKM);
      total = total + baslingcFiyat;
      System.out.println("Toplam Tutar = " + total);
   }
}
