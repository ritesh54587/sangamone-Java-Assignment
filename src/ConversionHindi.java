import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ConversionHindi {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan2= new Scanner(System.in);
		System.out.println("Enter the Number");
		int input1 = scan2.nextInt();
     System.out.println(convert(input1));
		
		
	}
	 public static String convert2(int input1) {
		 
		
		return null;
		 
	 }
	public static String convert(int input1) throws FileNotFoundException {
		ArrayList<Integer> list1= new ArrayList<Integer>();
		ArrayList<String> list2= new ArrayList<String>();

  	  File file = new File("amount_hi.txt");
      Scanner scan = new Scanner(file);
      while (scan.hasNextLine()) {
     String info=scan.nextLine().replaceAll(",", "");
      String[] words=info.split(":");

      list1.add(Integer.parseInt(words[0]));
      list2.add(words[1]);
      }
      HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < list1.size(); i++) {
		map.put(list1.get(i), list2.get(i));
		}
		
		if(input1<=100) {
		int position1=list1.indexOf(input1); 
		
        //System.out.println(list2.get(position1));
		return list2.get(position1);
		}else {
			 int part1=(input1/100)*100;
				int position1=list1.indexOf(part1); 

			    int part2= input1%100;
				int position2=list1.indexOf(part2); 

			return list2.get(position1) + " "+list2.get(position2);
		}
			
		

	}

}
