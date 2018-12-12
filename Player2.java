/*
Dylan Tull
5/31/18 Period 2
This is my own work DMT
This project creates objects for the driver class (created by Ethan Hower).
*/

public class Player2
{
	//declare private variables
		private String faction;
		private String shipColor;
		private int numPlanets;
		private int numCommodities;
		private int numTradeGoods;
		private boolean ownsMecatol;
		private boolean isEliminated;


		//constructor
		public void Player(String f, String s, int p, int c, int g, boolean m, boolean e, boolean t)
		{
			faction = f;
			shipColor = s;
			numPlanets = p;
			numCommodities = c;
			numTradeGoods = g;
			ownsMecatol = m;
			isEliminated = e;

		}
		//get methods
		public String getFaction()
		{
			return faction;
		}
		public String getShipColor()
		{
			return shipColor;
		}
		public boolean getOwnsMecatol()
		{
			return ownsMecatol;
		}
		public boolean getIsEliminated()
		{
			return isEliminated;
		}


		public int getPlanets()
		{
			return numPlanets;
		}
		//set methods
		public void setFaction (String f)
		{
			faction = f;
		}

		public void setOwnsMecatol (boolean m)
		{
			ownsMecatol = m;
		}
		public void setIsEliminated (boolean e)
		{
			isEliminated = e;
		}

		public void setNumPlanets (int p)
		{
			numPlanets += p;
		}
		public void setNumCommodities (int c)
		{
			numCommodities += c;
		}
		public void setNumTradeGoods (int g)
		{
			numTradeGoods += g;
		}




		//to string allowing variables to be printed on the screen
		public String toString()
		{
			String str;

			str =  "\nFaction: " + faction;
			str += "\nShip Color: " + shipColor;
			str += "\nOwns Mecatol? "  + ownsMecatol;
			str += "\nIs Eliminated? " + isEliminated;

			return str;
		}

	}

