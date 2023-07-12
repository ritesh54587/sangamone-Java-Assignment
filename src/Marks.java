import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Marks {

	public static void main(String [] arg) throws FileNotFoundException {
		
		
		File file= new File("Marks.txt");
		
		Scanner scan = new Scanner(file);
		
		String data= scan.nextLine();
		
		ArrayList <String> list = new ArrayList();
        		list.add(data);
                String[] parts = data.split(",");

        		String name=parts[0];
        		
		System.out.println(name);
	}
}
