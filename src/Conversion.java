import java.util.*;

public class Conversion {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner scan = new Scanner(System.in);
		int input1 = scan.nextInt();
		Conversion con = new Conversion();
		if(input1<=99) {
		System.out.println(convert2(input1));
		}
		else if(input1<=999) {
			System.out.println(convert3(input1));

		}
		else {
			System.out.println(convert4(input1));
		}
		
		
	}
	public static String convert4(int input1) {
		int part1 = (input1 / 1000);
		int part2 = input1 % 1000; 
		String result1 = convert2(part1);
		String result2 = convert3(part2);
		return result1 + " thousand and " + result2;
	}
	public static String convert2(int input1) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		list1.add(16);
		list1.add(17);
		list1.add(18);
		list1.add(19);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		list1.add(70);
		list1.add(80);
		list1.add(90);
		list1.add(100);
		list1.add(1000);
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("");
		list2.add("one");
		list2.add("two");
		list2.add("three");
		list2.add("four");
		list2.add("five");
		list2.add("six");
		list2.add("seven");
		list2.add("eight");
		list2.add("nine");
		list2.add("ten");
		list2.add("eleven");
		list2.add("twelve");
		list2.add("thirteen");
		list2.add("fourteen");
		list2.add("fifteen");
		list2.add("sixteen");
		list2.add("seventeen");
		list2.add("eighteen");
		list2.add("nineteen");
		list2.add("twenty");
		list2.add("thirty");
		list2.add("forty");
		list2.add("fifty");
		list2.add("sixty");
		list2.add("seventy");
		list2.add("eighty");
		list2.add("ninety");
		list2.add("hundred");
		list2.add("thousand");

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < list1.size(); i++) {
			map.put(list1.get(i), list2.get(i));
		}
		int part1 = 0;
		int part2 = 0;
		int part3 = 0;
		if (input1 <= 99) {
			part1 = (input1 / 10) * 10; // 40
			part2 = input1 % 10; // 7
			int position1 = list1.indexOf(part1);
			int position2 = list1.indexOf(part2);
		return	list2.get(position1) + " " + list2.get(position2);
		} else {
			part1 = input1 / 100; // 4
		    part2=(input1/input1)*100;//100
			part3 = ((input1 % 100) / 10) * 10; // 30
			int part4 = input1 % 10; // 2

			int position1 = list1.indexOf(part1);
			int position2 = list1.indexOf(part2);

			int position3 = list1.indexOf(part3);
			int position4 = list1.indexOf(part4);

			return list2.get(position1) +" " + list2.get(position2) +" and "+ list2.get(position3) + "" + list2.get(position4);
		}
	}
	public static String convert3(int input1) {
		int part1 = (input1 / 100);
		int part2 = input1 % 100; 
		String result1 = convert2(part1);
		String result2 = convert2(part2);
		return result1 + " hundred and " + result2;
	}
	
}
