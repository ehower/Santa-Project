//uses custom Player class (made by Dylan Tull)
/*
Ethan Hower
P-2
5/30/18
This is my own work, ERH
This project manages resources for players during Twilight Imperium 4 (it's a board game).
*/
import java.util.*;
public class TIDriver
{
public static void main (String[] args)

	{
		//declare variables
		Scanner myReader = new Scanner(System.in);
		String playerName;
		int playerChoice;
		int playerItems;
		int playerInt;
		int mecatol;
		int quit = 0;



	//Creates six player objects based on our regular group
		Player Ethan = new Player ("Universities of Jol-Nar", "Green", 4, 2, 3, false, false);
		Player Dylan = new Player ("Winnu", "Blue", 4, 3, 4, true, false);
		Player Carl = new Player ("Naalu Collective", "Purple", 3, 2, 2, false, false);
		Player Carter = new Player ("Yssaril Tribes", "Yellow", 2, 2, 2, false, false);
		Player Kyle = new Player ("Nekro Virus", "Red", 2, 3, 4, false, false);
		Player Dom = new Player ("L1z1x Mindnet", "Black", 1, 3, 5, false, false);

	//continues the program for as long as the game lasts
	while(quit !=2)
	{
		System.out.println("Would you like to \n1. Check player stats\n2. Change player stats");
		playerChoice = myReader.nextInt();

		myReader.nextLine();
	//allows players to view current stats
		if (playerChoice == 1)
		{
			System.out.println("Which player stats would you like to view? (Ethan, Dylan, Carl, Carter, Kyle, Dom)");
			playerName = myReader.nextLine();

		if (playerName.equals("Ethan"))
				System.out.println(Ethan.toString());

		if (playerName.equals("Dylan"))
			System.out.println(Dylan.toString());

		if (playerName.equals("Carl"))
			System.out.println(Carl.toString());

		if (playerName.equals("Carter"))
			System.out.println(Carter.toString());

		if (playerName.equals("Kyle"))
			System.out.println(Kyle.toString());

		if (playerName.equals("Dom"))
			System.out.println(Dom.toString());

			System.out.println("\nWould you like to \n1. Continue\n2. Quit");
	quit = myReader.nextInt();
		}//end if


		//allows user to change player stats based on current board position
		if(playerChoice == 2)
		{
				System.out.println("Which player's stats would you like to change? (Ethan, Dylan, Carl, Carter, Kyle, Dom)");
			playerName = myReader.nextLine();


	int i= 0;

				if (playerName.equals("Ethan"))
					i = 1;
				if (playerName.equals("Dylan"))
					i = 2;

				if (playerName.equals("Carl"))
					i = 3;

				if (playerName.equals("Carter"))
					i = 4;
				if (playerName.equals("Kyle"))
					i = 5;
				if (playerName.equals("Dom"))
					i = 6;



		switch (i)
		{
			case 1:
			{
			System.out.println ("Which specific stats would you like to change?\n1. Planet amount\n2. Commodity Amount\n3. Trade Goods\n4. Mecatol Ownership\n5. Elimination");
			playerItems = myReader.nextInt();

			switch(playerItems)
			{
				case 1:
				{
					System.out.println("How many planets would you like to change?");
					playerItems = myReader.nextInt();
					Ethan.setNumPlanets(playerItems);
					break;
				}

				case 2:
				{
					System.out.println("How many commodities would you like to change?");
					playerItems = myReader.nextInt();
					Ethan.setNumCommodities(playerItems);
					break;
				}

				case 3:
				{
					System.out.println("How many trade goods would you like to change?");
					playerItems = myReader.nextInt();
					Ethan.setNumTradeGoods(playerItems);
					break;
				}

				case 4:
				{
					System.out.println("Did the player:\n1.Lose Mecatol\n2. Gain Mecatol");
					mecatol = myReader.nextInt();

					if (mecatol == 1)
					{
						Ethan.setOwnsMecatol(true);
					}

					else
						Ethan.setOwnsMecatol(false);
					break;

				}

				case 5:
				{
					Ethan.setIsEliminated(true);
					break;
				}


			}//end Ethan switch
			break;
			}//end main case 1

			case 2:
			{
				System.out.println ("Which specific stats would you like to change?\n1. Planet amount\n2. Commodity Amount\n3. Trade Goods\n4. Mecatol Ownership\n5. Elimination");
			playerItems = myReader.nextInt();

			switch(playerItems)
			{
				case 1:
				{
					System.out.println("How many planets would you like to change?");
					playerItems = myReader.nextInt();
					Dylan.setNumPlanets(playerItems);
					break;
				}

				case 2:
				{
					System.out.println("How many commodities would you like to change?");
					playerItems = myReader.nextInt();
					Dylan.setNumCommodities(playerItems);
					break;
				}

				case 3:
				{
					System.out.println("How many trade goods would you like to change?");
					playerItems = myReader.nextInt();
					Dylan.setNumTradeGoods(playerItems);
					break;
				}

				case 4:
				{
					System.out.println("Did the player:\n1.Lose Mecatol\n2. Gain Mecatol");
					mecatol = myReader.nextInt();

					if (mecatol == 1)
					{
						Dylan.setOwnsMecatol(true);
					}

					else
						Dylan.setOwnsMecatol(false);
					break;

				}

				case 5:
				{
					Dylan.setIsEliminated(true);
					break;
				}
			}//end Dylan Switch
			break;
			}//end main case 2
			case 3:
			{

			System.out.println ("Which specific stats would you like to change?\n1. Planet amount\n2. Commodity Amount\n3. Trade Goods\n4. Mecatol Ownership\n5. Elimination");
					playerItems = myReader.nextInt();

				switch(playerItems)
						{
						case 1:
							{
								System.out.println("How many planets would you like to change?");
								playerItems = myReader.nextInt();
								Carl.setNumPlanets(playerItems);
								break;
								}

								case 2:
								{
									System.out.println("How many commodities would you like to change?");
									playerItems = myReader.nextInt();
									Carl.setNumCommodities(playerItems);
									break;
								}

								case 3:
								{
									System.out.println("How many trade goods would you like to change?");
									playerItems = myReader.nextInt();
									Carl.setNumTradeGoods(playerItems);
									break;
								}

								case 4:
								{
									System.out.println("Did the player:\n1.Lose Mecatol\n2. Gain Mecatol");
									mecatol = myReader.nextInt();

									if (mecatol == 1)
									{
										Carl.setOwnsMecatol(true);
									}

									else
										Carl.setOwnsMecatol(false);
									break;

								}

								case 5:
								{
									Carl.setIsEliminated(true);
									break;
								}


			}//end Carl switch
			break;
			}//end main case 3

		case 4:
		{
			System.out.println ("Which specific stats would you like to change?\n1. Planet amount\n2. Commodity Amount\n3. Trade Goods\n4. Mecatol Ownership\n5. Elimination");
						playerItems = myReader.nextInt();

						switch(playerItems)
						{
							case 1:
							{
								System.out.println("How many planets would you like to change?");
								playerItems = myReader.nextInt();
								Carter.setNumPlanets(playerItems);
								break;
							}

							case 2:
							{
								System.out.println("How many commodities would you like to change?");
								playerItems = myReader.nextInt();
								Carter.setNumCommodities(playerItems);
								break;
							}

							case 3:
							{
								System.out.println("How many trade goods would you like to change?");
								playerItems = myReader.nextInt();
								Carter.setNumTradeGoods(playerItems);
								break;
							}

							case 4:
							{
								System.out.println("Did the player:\n1.Lose Mecatol\n2. Gain Mecatol");
								mecatol = myReader.nextInt();

								if (mecatol == 1)
								{
									Carter.setOwnsMecatol(true);
								}

								else
									Carter.setOwnsMecatol(false);
								break;

							}

							case 5:
							{
								Carter.setIsEliminated(true);
								break;
							}


					}//end Carter switch
					break;
		}//end main case 4

		case 5:
		{
			System.out.println ("Which specific stats would you like to change?\n1. Planet amount\n2. Commodity Amount\n3. Trade Goods\n4. Mecatol Ownership\n5. Elimination");
						playerItems = myReader.nextInt();

						switch(playerItems)
						{
							case 1:
							{
								System.out.println("How many planets would you like to change?");
								playerItems = myReader.nextInt();
								Kyle.setNumPlanets(playerItems);
								break;
							}

							case 2:
							{
								System.out.println("How many commodities would you like to change?");
								playerItems = myReader.nextInt();
								Kyle.setNumCommodities(playerItems);
								break;
							}

							case 3:
							{
								System.out.println("How many trade goods would you like to change?");
								playerItems = myReader.nextInt();
								Kyle.setNumTradeGoods(playerItems);
								break;
							}

							case 4:
							{
								System.out.println("Did the player:\n1.Lose Mecatol\n2. Gain Mecatol");
								mecatol = myReader.nextInt();

								if (mecatol == 1)
								{
									Kyle.setOwnsMecatol(true);
								}

								else
									Kyle.setOwnsMecatol(false);
								break;

							}

							case 5:
							{
								Kyle.setIsEliminated(true);
								break;
							}


					}//end Kyle switch
					break;
				}

		case 6:
		{
			System.out.println ("Which specific stats would you like to change?\n1. Planet amount\n2. Commodity Amount\n3. Trade Goods\n4. Mecatol Ownership\n5. Elimination");
						playerItems = myReader.nextInt();

						switch(playerItems)
						{
							case 1:
							{
								System.out.println("How many planets would you like to change?");
								playerItems = myReader.nextInt();
								Dom.setNumPlanets(playerItems);
								break;
							}

							case 2:
							{
								System.out.println("How many commodities would you like to change?");
								playerItems = myReader.nextInt();
								Dom.setNumCommodities(playerItems);
								break;
							}

							case 3:
							{
								System.out.println("How many trade goods would you like to change?");
								playerItems = myReader.nextInt();
								Dom.setNumTradeGoods(playerItems);
								break;
							}

							case 4:
							{
								System.out.println("Did the player:\n1.Lose Mecatol\n2. Gain Mecatol");
								mecatol = myReader.nextInt();

								if (mecatol == 1)
								{
									Dom.setOwnsMecatol(true);
								}

								else
									Dom.setOwnsMecatol(false);
								break;

							}

							case 5:
							{
								Dom.setIsEliminated(true);
								break;
							}


					}//end Dom switch
					break;
		}//end main case 6

	}//end main switch

	System.out.println("\nWould you like to \n1. Continue\n2. Quit");
	quit = myReader.nextInt();

}//end while
}
}
}

