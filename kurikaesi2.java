import java.math.*;


class kurikaesi2{
public static void main (String argv[])
{
BigInteger [] a = new BigInteger[3];

long b;
 System.out.println("リュカ数列の第n項を求めます");
        System.out.print("n=");
        b = new java.util.Scanner(System.in).nextLong();
a[0] = BigInteger.valueOf(1);
a[1] = BigInteger.valueOf(2);
a[2] = BigInteger.valueOf(1);
System.out.println(a[0]);
while (1<b){
    
	a[0] = a[0].add(a[1]);
	a[1] = a[0].subtract(a[1]);
	System.out.println(a[0]);
	a[2]=a[2].add(a[0]);
	b = (b-1);
}  
System.out.println("合計"+a[2]);
}
}