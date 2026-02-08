import java.util.Scanner;
class Spotify
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("1. AR rahman");
		System.out.println("2. Anirudh");
		System.out.println("3. Yuvan shankar raja");
		System.out.print("select the music director :");
		int choise=sc.nextInt();
		if(choise==1)
		{
			System.out.println("1. melody");
			System.out.println("2. folk");
			System.out.print("selct categories :");
			int option=sc.nextInt();
			switch(option)
			{
				case 1:
				{
					System.out.println("now playing :enna solla pogirai");
					break;
				}
				case 2:
				{
					System.out.println("now playing :uppu karuvadu");
					break;
				}
				default:
				{
					System.out.println("select the correct option ");
				}
			}
		}
		else if(choise==2)
		{
			System.out.println("1. melody");
			System.out.println("2. folk");
			System.out.print("selct categories :");
			int option=sc.nextInt();
			switch(option)
			{
				case 1:
				{
				System.out.println("now playing :maate vinadhuga");
				break;
				}
				case 2:
				{
					System.out.println("now playing :ehthir neechal");
					break;
				}
				default:
				{
					System.out.println("select the option");
				}
			}
			
		}
		else if(choise==3)
		{
			System.out.println("1. melody");
			System.out.println("2. folk");
			System.out.print("selct categories :");
			int option=sc.nextInt();
			switch(option)
			{
				case 1:
				{
					System.out.println("now playing : high on love");
					break;
					
				}
				case 2:
				{
					System.out.println("now playing : ");
					
				}
				default:
				{
					System.out.println("select the correct option");
				}
			}
		}
		else
		{
			System.out.println("pls selct the given choise");
		}
	}
}

		
			