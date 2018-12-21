
/*parallel arrays, arrayLists
kids by age, gifts by price, price/age^^^
*method named naughtyOrNice()*/
import java.util.*;
import java.io.*;
import java.lang.*;
public class SantaProject 
{
	public static void main (String[] args) throws FileNotFoundException
	{
		//Beginning of Driver made by Steph Garcia and Kyle Kreider
		//Scanners
				Scanner scanK = new Scanner(new File("kids.txt"));
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

				//test object
				Tests t = new Tests(names, ages, gifts, prices, minAge, maxAge, daysToMake);
				
				//for each loops


				//end of test method made by Kyle Kreider and Ethan Hower
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

				scanK.close();

		

				//variables
				String lines = "";

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
	
				scanG.close();
			
				t.sortGifts();
				t.sortChildren();
				t.Test();
	}
}
