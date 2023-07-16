import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Marks {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("Marks.txt");
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<>();
        String data1;
        String[] parts;
        String[] temp;
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> subject1 = new ArrayList<Integer>(); 
        ArrayList<Integer> subject2 = new ArrayList<Integer>(); 
        ArrayList<Integer> subject3= new ArrayList<Integer>();
        ArrayList<Integer> subject4= new ArrayList<Integer>();
        ArrayList<Integer> subject5= new ArrayList<Integer>();

        
        while (scan.hasNextLine()) {
            data1 = scan.nextLine();
            list.add(data1);
            parts = data1.split(",");
            names.add(parts[0]);
            temp = parts[3].split(":");
            subject1.add(Integer.parseInt(temp[1].trim())); 
            temp=parts[4].split(":");
            subject2.add(Integer.parseInt(temp[1].trim()));
            temp=parts[5].split(":");
            subject3.add(Integer.parseInt(temp[1].trim()));
            temp=parts[6].split(":");
            subject4.add(Integer.parseInt(temp[1].trim()));
            temp=parts[7].split(":");

            subject5.add(Integer.parseInt(temp[1].trim()));

        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        for (int i = 0; i < subject1.size(); i++) {
            System.out.println(subject1.get(i));
        }

        int max = Collections.max(subject1);
        int max2=Collections.max(subject2);
        int max3=Collections.max(subject3);
        int max4=Collections.max(subject4);
        int max5=Collections.max(subject5);

        System.out.println("The highest marks in english is: " + max);
        System.out.println("The highest marks in math is: " + max2);
        System.out.println("The highest marks in physics is: " + max3);
        System.out.println("The highest marks in chemistry is: " + max4);
        System.out.println("The highest marks in boilogy is: " + max5);

        scan.close();
    }
}
