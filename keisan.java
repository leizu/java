class keisan
{
 public static void main(String argv[])
 {
 int suuzi1;
 int suuzi2;
 int tasi;
 int hiki;
 int kake;
 int wari;
 int amari;
 System.out.print("�����P=");
 suuzi1 = new java.util.Scanner(System.in).nextDouble();
 System.out.print("�����Q=");
 suuzi2 = new java.util.Scanner(System.in).nextDouble();
 tasi = (suuzi1+suuzi2);
 hiki = (suuzi1-suuzi2);
 kake = (suuzi1*suuzi2);
 wari = (suuzi1/suuzi2);
 amari = (suuzi1%suuzi2);
 System.out.println(tasi);
 System.out.println(hiki);
 System.out.println(kake);
 System.out.println(wari);
 System.out.println(amari);
 }
 }