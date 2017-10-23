package pkg;
import java.util.Scanner;

public class IteratorPatternDemo {

	public static void main(String[] args) {
	      CostRepository namesRepository = new CostRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("cost : " );
	      } 	
	   }
}
