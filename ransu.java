import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

class ransu
{
public static void main(String argv[])
{
int[] tensu=new int[100];
Random rgen=new Random();
rgen.setSeed(123);
for(int i=0; i<=99; i++)
tensu[i]=rgen.nextInt(10);
try{
File file = new File("ransu.txt");
PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
for(int i=0; i<=99; i++)
pw.print(tensu[i]+",");
pw.close();
}catch(IOException e){
System.out.println(e);
}
}
}