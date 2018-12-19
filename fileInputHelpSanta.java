/*parallel arrays, arrayLists
kids by age, gifts by price, price/age^^^
*method named naughtyOrNice()*/
import java.util.*;
import java.io.*;
import java.lang.*;
public class fileInputHelpSanta{
	public static void main(String[] args)throws FileNotFoundException{
		//Scanners
		Scanner scanK = new Scanner(new File("kids2.txt"));
		Scanner scanG = new Scanner(new File("gifts.txt"));

		//array lists
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> ages = new ArrayList<>();

		ArrayList<String> gifts = new ArrayList<>();
		ArrayList<String> prices = new ArrayList<>();
		ArrayList<String> daysToMake = new ArrayList<>();
		ArrayList<String> minAge = new ArrayList<>();
		ArrayList<String> maxAge = new ArrayList<>();

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



		//for each loops



		//while next
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

		//just for funsies
		System.out.println("\n\n\n\n\n\n");

		//variables
		String lines = "";

		int counter = 0;
		while(scanG.hasNext()){
			lineNum = scanG.nextLine();

			if(counter == 0){
			lineNum(gifts).add(scanG.nextLine());
			}
			if(counter == 1){
			lineNum(minAge).add(scanG.nextLine());
			}
			if(counter == 2){
			lineNum(maxAge).add(scanG.nextLine());
			}
			if(counter == 3){
			lineNum(prices).add(scanG.nextDouble());
			}
			if(counter == 4){
			lineNum(daysToMake).add(scanG.nextLine());
			}
			if(counter == 4){
			counter = 0;
			}
			else{
			counter++;
			}
		}
		scanG.close();
		System.out.println(prices);
	}
}