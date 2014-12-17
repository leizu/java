import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileInput{
  public static void main(String args[]){
    try{
      File file = new File("ransu.txt");
      FileReader filereader = new FileReader(file);

      int ch,suuzi,mozi;
	  suuzi=0;
      while((ch = filereader.read()) != -1){
      mozi = ((char)ch-48);
	  switch(mozi)
	  {
	  case 1: case 2: case 3 : case 4: case 5: case 6: case 7: case 8: case 9:
	  suuzi = (suuzi + mozi);
	  break;
      
	  default:

	  break;
	  }
	  
      }
      filereader.close();
	  System.out.println(suuzi);
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }
  }
}
