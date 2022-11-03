package question2;

public class PiggyBank {


		private int amount = 50;

		public PiggyBank()

		{

		}

		public PiggyBank(int a)

		{

		amount = a+amount;

		}

		public void displayAmount()

		{

		System.out.println(amount);

		}

		}

		class Amt

		{

		public static void main(String[] args)

		{

			PiggyBank a = new PiggyBank();

			PiggyBank b = new PiggyBank(20);

		a.displayAmount();

		b.displayAmount();

		}


	}

