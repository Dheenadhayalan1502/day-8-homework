import java.util.Scanner;
class Books
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Academic books");
		System.out.println("2. Story books");
		System.out.println("3. Magazines");
		System.out.println("4. Competitive exams");
	    System.out.println("5. Comics");
		System.out.print("pls select the categorie of the books :");
		int option = sc.nextInt();
		if(option==1)
		{
			System.out.println("pls select the subject");
			System.out.println("1. maths");
			System.out.println("2. science");
			int select=sc.nextInt();
			if(select==1)
			{
				System.out.println("maths book- Rs 200");
			}
			else if(select==2)
			{
				System.out.println("science book- Rs 250");
			}
			else
			{
				System.out.println("pls select the correct option");
			}
			
		   
			
		}
		else if(option==2)
		{
			System.out.println("pls select story ");
			System.out.println("1. adventure");
			System.out.println("2. moral");
			int select=sc.nextInt();
			if(select==1)
			{
				System.out.println("adventure book- Rs 150");
			}
			else if(select==2)
			{
				System.out.println("moral story- Rs 120");
			}
			else
			{
				System.out.println("pls select the correct option");
			}
		}
		else if(option==3)
		{
			System.out.println("pls select the magazine");
			System.out.println("1.weekly magazines");
			System.out.println("2.monthly magazine");
			int select=sc.nextInt();
			if(select==1)
			{
				System.out.println("weekly magazine-Rs 50");
			}
			else if(select==2)
			{
				System.out.println("monthly magazine-Rs 120");
			}
			else
			{
				System.out.println("pls select the correct option");
			}
			
		}
		else if(option==4)
		{
			System.out.println("select the exam book");
			System.out.println("1. banking exam book");
			System.out.println("2. ssc exam book");
			int select=sc.nextInt();
			if(select==1)
			{
				System.out.println("banking book-Rs 400");
			}
			else if(select==2)
			{
				System.out.println("ssc book-RS 350");
			}
			else
			{
				System.out.println("pls select the correct option");
			}
		}
		else if(option==5)
		{
			System.out.println("pls select the comics");
			System.out.println("1. kids");
			System.out.println("2. superhero");
			int select=sc.nextInt();
			if(select==1)
			{
				System.out.println("kids comic- Rs 80");
			}
			else if(option==2)
			{
				System.out.println("superhero comics- RS 120");
			}
			else
			{
				System.out.println("pls select the correct option");
			}
		}
		else
		{
			System.out.println("pls select the correct option");
		}
	
		
				
		
		
		
			
			
	}
}
