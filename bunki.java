class bunki{
public static void main(String args[])
{
  int suuzi1;
  int suuzi2;
  int kaitou;
  int kigou;
  
 System.out.print("�����P=");
 suuzi1 = new java.util.Scanner(System.in).nextInt();
 System.out.print("�����Q=");
 suuzi2 = new java.util.Scanner(System.in).nextInt();
 System.out.print("�ԍ��ŋL������͂��Ă�������1.+ 2.- 3./ 4.* 5.%=");
 kigou= new java.util.Scanner(System.in).nextInt();
 switch(kigou)
 {
 case 1:
 kaitou = (suuzi1 +suuzi2);
 System.out.println(kaitou);
 break;
 case 2:
 kaitou = (suuzi1 - suuzi2);
  System.out.println(kaitou);
 break;
 case 3:
  if(suuzi2 == 0){
   System.out.println("0�ł͂ł��܂���");
   }
   else{
 kaitou = (suuzi1 / suuzi2);
  System.out.println(kaitou);
 }
 break;
 case 4:
 kaitou = (suuzi1 * suuzi2);
  System.out.println(kaitou);
 break;
 case 5: 
  if(suuzi2 == 0){
   System.out.println("0�ł͂ł��܂���");
   }
   else{
 kaitou = (suuzi1% suuzi2);
  System.out.println(kaitou);
}
 break;
 default:
  System.out.println("�����Ƃɂイ��傭���Ă�������");
 }
 }
 }