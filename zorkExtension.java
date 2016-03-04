import java.util.Scanner;
import java.util.Random;
public class zorkExtension {
static Scanner darkly = new Scanner(System.in);
static int [] entryFlag =new int [8];
static double [] money = {800,500,300,200,600,805,466,1000};
static double [] accumulated =new double [8];
static String [] thingSee =new String[8];
int total  ;
int[]amt;
static String []roomNum;
	
	private static void roomDescribe(String where, String[] stuff, String directions)
	{
		
		System.out.println("You are in " + where);
		for (String thing : stuff) {
			System.out.println("You see " + thing);
		}
		System.out.println("You can go " + directions);
		
		
			
	}
	
	public static void room1()
	{   
		
		countMoney();
		String place = "the Foyer";
		String[] things = new String[1];
		things[0] = "a dead scorpion";
		thingSee[0]=things[0];
		String direct = " to the north (n) or the south (s)";
		entryFlag[0]=1;
		if (accumulated[0]==0)
		{
			accumulated[0]=money[0];
			money[0]=0;
		}
		
		do
		{
		roomDescribe(place, things, direct);
		
		String choice = darkly.next();
		
		if (choice.equals("n")) 
		{
			room2();
		}
		else if(choice.equals("s"))
		{
			System.out.println("You have chosen to exit");
			ghost();
			countRooms();
			countMoney();
			ThingsSeen();
			System.exit(0);
		}
		} while (1==1);
	}
	
	public static void room2()
	{
		
		String place = "the Front Room";
		String[] things = new String[1];
		things[0] = "a phone";
		thingSee[1]=things[0];
		countMoney();
		entryFlag[1]=1;
		if (accumulated[1]==0)
		{
			accumulated[1]=money[1];
			money[1]=0;
		}
		String direct = " to the east (e), the south (s) or the west (w)";
		
		do
		{
			roomDescribe(place, things, direct);
			
			String choice = darkly.next();
			
			if (choice.equals("s")) 
			{
				room1();
			} else if (choice.equals("e")) 
			{
				room4();
			} else if (choice.equals("w")) 
			{
				room3();
			}
		} while (1==1);
	}
	public static void room3()
	{
		
		String place = "library";
		String[] things = new String[1];
		things[0] = "spiders";
		thingSee[2]=things[0];
		countMoney();
		entryFlag[2]=1;
		if (accumulated[2]==0)
		{
			accumulated[2]=money[2];
			money[2]=0;
		}
		String direct = " to the east (e) or the south (n)";
		
		do
		{
			roomDescribe(place, things, direct);
			
			String choice = darkly.next();
			
			if (choice.equals("n")) 
			{
				room5();
			} else if (choice.equals("e")) 
			{
				room2();
			}
		} while (1==1);
	}
	public static void room4()
	{
		
		String place = "the kitchen";
		String[] things = new String[1];
		things[0] = "bats";
		thingSee[3]=things[0];
		entryFlag[3]=1;
		countMoney();
		if (accumulated[3]==0)
		{
			accumulated[3]=money[3];
			money[0]=0;
		}
		String direct = "  the north (n) or the west (w)";
		
		do
		{
			roomDescribe(place, things, direct);
			
			String choice = darkly.next();
			
			if (choice.equals("n")) 
			{
				room7();
			} 
			else if (choice.equals("w")) 
			{
				room2();
			}
		} while (1==1);
	}
	public static void room5()
	{
		
		String place = "the dining Room";
		String[] things = new String[2];
		things[0] = "dust";
		things[1] = "boxes";
		thingSee[0]=things[0] +"and" +things[1];
		countMoney();
		entryFlag[4]=1;
		if (accumulated[4]==0)
		{
			accumulated[4]=money[4];
			money[4]=0;
		}
		String direct = " to the south (s) ";
		
		do
		{
			roomDescribe(place, things, direct);
			
			String choice = darkly.next();
			
			if (choice.equals("s")) 
			{
				room1();
			}
		} while (1==1);
	}
	public static void room6()
	{
		
		
		Random rnd =new Random();
		Scanner sc = new Scanner(System.in);
		int random =3;
		int guess;
		String place = "vault";
		String[] things = new String[1];
		countMoney();
		entryFlag[5]=1;
		if (accumulated[5]==0)
		{
			accumulated[5]=money[5];
			money[5]=0;
		}
		System.out.println("Guess a number from 1 to 4 to find treasure!!!");
		//random = rnd.nextInt(4);
		
		guess = sc.nextInt();
		if(guess == random)
		{
			room8();
		}
		things[0] = "3 walking skeletons";
		thingSee[5]=things[0];
		String direct = " to the east (e)";
		
		do
		{
			roomDescribe(place, things, direct);
			
			String choice = darkly.next();
			
			if (choice.equals("e")) 
			{
				room7();
			} 
		} while (1==1);
	}
	public static void room7()
	{
		
		String place = "parlor";
		String[] things = new String[1];
		things[0] = "treasure chest";
		thingSee[6]=things[0];
		countMoney();
		if (accumulated[6]==0)
		{
			accumulated[6]=money[6];
			money[6]=0;
		}
		String direct = " the south (s) or the west (w)";
		entryFlag[6]=1;
		
		do
		{
			roomDescribe(place, things, direct);
			
			String choice = darkly.next();
			
			if (choice.equals("s")) 
			{
				room4();
			}  else if (choice.equals("w")) 
			{
				room6();
			}
		} while (1==1);
	}
	public static void room8()
	{
		
		String place = "the secret";
		String[] things = new String[1];
		things[0] = "piles of gold";
		thingSee[7]=things[0];
		countMoney();
		String direct = " to the east (e)";
		if (accumulated[7]==0)
		{
			accumulated[7]=money[7];
			money[7]=0;
		}
		entryFlag[7]=1;
		
		do
		{
			roomDescribe(place, things, direct);
			
			String choice = darkly.next();
			
			if (choice.equals("e")) 
			{
				room7();
			} 
		} while (1==1);
	}
	public static void ghost()
	{
		Random rnd = new Random();
		int rand = rnd.nextInt(4);
		if(rand == 5)
			System.out.println("You are being followed: "+rand);
		else
			System.out.println("You are Safe!!");
		
		
	}
	public static void main(String[] args) {
		for(int i =0;i<=7;i++)
		{
			entryFlag[i] =0;
		}
		room1();
		
	}
	public static void countRooms()
	{
		int roomCount=0;
	
		for(int i=0;i<=7;i++)
		{
			roomCount+=entryFlag[i];
		}
		System.out.println("Total Rooms Visited: " + roomCount);
	}
	public static void countMoney()
	{
		int totalMoney=0;
		for(int i=0;i<=7;i++)
		{
			totalMoney+=accumulated[i];
		}
		System.out.println("Total Money accumulated: " + totalMoney);
				
		
	}
	public static void ThingsSeen()
	{
		for(int i=0;i<=7;i++)
		{
			System.out.println("Things seen along the way: "+ i+1 + "." + thingSee[i]);
		}
	}
	
}
