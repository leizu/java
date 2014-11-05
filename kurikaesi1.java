class kurikaesi1{
public static void main (String argv[])
{
long [] a = new long[3];
 System.out.println("フィボナッチ数列の第n項を求めます");
        System.out.print("n=");
        a[0] = new java.util.Scanner(System.in).nextLong();
a[1] =0;
a[2] =1;
System.out.println(a[1]);

while (0<a[0]){
    System.out.println(a[1]);
	a[1] = a[1]+a[2];
	a[2] = a[1]-a[2];
	a[0] = (a[0]-1);
}  
}
}