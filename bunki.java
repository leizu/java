class bunki{
public static void main(String args[])
{
  int suuzi1;
  int suuzi2;
  int kaitou;
  int kigou;
  
 System.out.print("”š‚P=");
 suuzi1 = new java.util.Scanner(System.in).nextInt();
 System.out.print("”š‚Q=");
 suuzi2 = new java.util.Scanner(System.in).nextInt();
 System.out.print("”Ô†‚Å‹L†‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢1.+ 2.- 3./ 4.* 5.%=");
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
   System.out.println("0‚Å‚Í‚Å‚«‚Ü‚¹‚ñ");
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
   System.out.println("0‚Å‚Í‚Å‚«‚Ü‚¹‚ñ");
   }
   else{
 kaitou = (suuzi1% suuzi2);
  System.out.println(kaitou);
}
 break;
 default:
  System.out.println("‚¿‚á‚ñ‚Æ‚É‚ã‚¤‚è‚å‚­‚µ‚Ä‚­‚¾‚³‚¢");
 }
 }
 }