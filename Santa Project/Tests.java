import java.util.*;
public class Tests
{
	//Initializes arraylists. Arraylists are filled with information from the driver class, as well is info
	//from sort methods. Variables made by Ethan Hower
	private ArrayList<String> names = new ArrayList<>();
	private ArrayList<String> sortNames = new ArrayList<>();
	private ArrayList<String> tempNames = new ArrayList<>();

	private ArrayList<Integer> ages = new ArrayList<>();
	private ArrayList<Integer> sortAges = new ArrayList<>();
	private ArrayList<Integer> tempAges = new ArrayList<>();


	private ArrayList<String> gift = new ArrayList<>();
	private ArrayList<String> tempGift = new ArrayList<>();
	private ArrayList<String> sortGift = new ArrayList<>();

	private ArrayList<Double> price = new ArrayList<>();
	private ArrayList<Double> tempPrice = new ArrayList<>();
	private ArrayList<Double> sortPrice = new ArrayList<>();

	private ArrayList<Integer> minAge = new ArrayList<>();
	private ArrayList<Integer> tempMinAge = new ArrayList<>();
	private ArrayList<Integer> sortMinAge = new ArrayList<>();


	private ArrayList<Integer> maxAge = new ArrayList<>();
	private ArrayList<Integer> tempMaxAge = new ArrayList<>();
	private ArrayList<Integer> sortMaxAge = new ArrayList<>();


	private ArrayList<Integer> daysToMake = new ArrayList<>();
	private ArrayList<Integer> tempDaysToMake = new ArrayList<>();
	private ArrayList<Integer> sortDaysToMake = new ArrayList<>();



	//constructor made by Ethan Hower
	public Tests(ArrayList<String> n, ArrayList<Integer> a, ArrayList<String> g, ArrayList<Double> p, ArrayList<Integer> min, ArrayList<Integer> max, ArrayList<Integer> d )
	{
		names = n;
		ages = a;

		gift = g;
		price = p;
		minAge = min;
		maxAge = max;
		daysToMake = d;

	}

	//handles Santa's input, prints a list of kids and the gifts that correspond to them. Started by Ethan Hower
	public void Test()
	{
		double total = 0;
		Scanner s = new Scanner(System.in);
		int budget = 0;
		int timeLimit;

		System.out.println("What is your budget?");
		budget = s.nextInt();

		System.out.println("How many days do you have to prepare.");
		timeLimit = s.nextInt();

//main method that allows santa to type in the budget and the number of days itll take to make
//made by Noah (the stuff inside the second for loop, that is) with help and ideas from Ethan Hower (Honestly, you were a really big part of making this method work, so THANK YOU TONS)
		while(total < budget)
		{
			for(int i = 0; i < sortNames.size(); i++)
			{
				for(int x = 0; x < sortGift.size(); x++)
				{
					if(sortDaysToMake.get(x) >= timeLimit )
					{
						System.out.print(sortNames.get(i) + " gets: ");	//for every kid, they will get a gift depending on their age.

						System.out.println(" " + sortGift.get(x));

						//removes gifts and stores them in their parallel temp arraylists
						tempMinAge.add(sortMinAge.get(x));
						sortMinAge.remove(x);

						tempMaxAge.add(sortMaxAge.get(x));
						sortMaxAge.remove(x);

						tempPrice.add(sortPrice.get(x));
						sortPrice.remove(x);

						tempGift.add(sortGift.get(x));
						sortGift.remove(x);

						tempDaysToMake.add(sortDaysToMake.get(x));
						sortDaysToMake.remove(x);
					}

				}
			}
		}


	}//end method

	//Sorts the Names and Ages arraylist based on child age. Puts the new information into sorted arraylists.
	//Made by Ethan Hower, some ideas from Noah Brown
	public void sortChildren()
	{
		int minAge = 19;
		int indexOf = 0;
		while(!(ages.isEmpty()))
		{
			minAge = 19;
		for(int i = 0; i < ages.size();i++)
		{
			if(ages.get(i) < minAge)
			{
				minAge = ages.get(i);
				indexOf = i;
			}
		}

		sortAges.add(ages.get(indexOf));
		ages.remove(indexOf);
		sortNames.add(names.get(indexOf));
		names.remove(indexOf);
		}

	}//end method

	//sorts the gift, price, minAge, maxAge, daysToMake arraylists based on price. Made by Ethan Hower, with
	//some ideas from Noah Brown
	public void sortGifts()
	{
		double minPrice = 2600;
		int indexOf = 0;
		while(!(price.isEmpty()))
		{
			minPrice = 2600;
			for(int i = 0; i < price.size();i++)
			{
				if(price.get(i) < minPrice)
				{
					minPrice = price.get(i);
					indexOf = i;
				}
			}

			sortPrice.add(price.get(indexOf));
			price.remove(indexOf);

			sortGift.add(gift.get(indexOf));
			gift.remove(indexOf);

			sortMinAge.add(minAge.get(indexOf));
			minAge.remove(indexOf);

			sortMaxAge.add(maxAge.get(indexOf));
			maxAge.remove(indexOf);

			sortDaysToMake.add(daysToMake.get(indexOf));
			daysToMake.remove(indexOf);


		}

	}//end method


}