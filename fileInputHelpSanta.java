/*Driver class for HelpSanta by Kyle and Ethan*/
import java.util.*;
import java.io.*;
import java.lang.*;
public class fileInputHelpSanta{
	public static void main(String[] args)throws FileNotFoundException{
		/*Start Kyle and Ethan*/
		//Scanners
		Scanner scanK = new Scanner(new File("kids2.txt"));
		Scanner scanG = new Scanner(new File("gifts.txt"));

		//array lists
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> ages = new ArrayList<>();

		ArrayList<String> gifts = new ArrayList<>();
		ArrayList<Double> prices = new ArrayList<>();
		ArrayList<Integer> daysToMake = new ArrayList<>();
		ArrayList<Integer> minAge = new ArrayList<>();
		ArrayList<Integer> maxAge = new ArrayList<>();

		//variables
		String name = "";
		boolean b = true;
		String nOrN = "";
		Integer age = 0;
		String line;
		Integer lineAge;
		String lineNum;
		String[] lineParts = new String[3];
		String[] lineParts2 = new String[5];

		//while next
		/*Start Ethan with ideas and help with Kyle*/
		while(scanK.hasNext())
		{
		line = scanK.nextLine();
		lineParts = line.split(", ");


		for(int i = 0; i < lineParts.length;i++)
		{
			if(i == 0)
			name = lineParts[i];

			if(i == 1)
			nOrN = lineParts[i];

			if(i == 2)
			{
			lineAge = Integer.parseInt(lineParts[i]);
			age = lineAge;
			}
		}
			if(nOrN.equals("nice"))
			{
					names.add(name);
					ages.add(age);
			}


		}

		System.out.println(ages);

		System.out.println(names);
		scanK.close();
		/*End Ethan start Kyle for the funsies*/

		//just for funsies
		System.out.println("\n\n\n\n\n\n");

		//variables
		String lines = "";

		/*Start Ethan with help from Kyle*/
		while(scanG.hasNext()){

		for(int i = 0; i <=4; i++)
		{
			if(i == 0)
			{
			gifts.add(scanG.nextLine());
			}
			if(i == 1){
			minAge.add(scanG.nextInt());
			}
			if(i == 2){
			maxAge.add(scanG.nextInt());
			}
			if(i == 3){
			prices.add(scanG.nextDouble());
			}
			if(i == 4){
			daysToMake.add(scanG.nextInt());
			scanG.nextLine();
			}
		}
		}
		/*End Ethan, start Kyle*/
		scanG.close();
		System.out.println(gifts);
		System.out.println("");
		System.out.println(minAge);
		System.out.println("");
		System.out.println(maxAge);
		System.out.println("");
		System.out.println(prices);
		System.out.println("");
		System.out.println(daysToMake);
	}
}
