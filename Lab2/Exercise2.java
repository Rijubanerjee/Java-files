package Lab2;

public class Exercise2 {
	public static void main(String[] args)

	{

		int n;

		String temp;

		Scanner s = new Scanner(System.in);

		System.out.print("Enter number of strings you want to enter:");

		n = s.nextInt();

		String names[] = new String[n];

		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter all the names:");

		for (int i = 0; i < n; i++)

		{

			names[i] = s1.nextLine();

		}

		System.out.print("Names in Sorted Order:");

		for (int i = 0; i < n - 1; i++)

		{

			System.out.print(names[i] + ",");

		}

		System.out.print(names[n - 1]);

	}
	public String[] sortStrings(int [] arr , int n ) {

		int temp = 0;
		
		for (int i = 0; i < n; i++)

		{

			for (int j = i + 1; j < n; j++)

			{

				if (arr[i].compareTo(arr[j]) > 0)

				{

					temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;

				}

			}

		}

	}
}
