
//  Q) Find Number of days in a month of a year,check leap year also
 


import java .util.Scanner ;
class Days {
	public static void main(String[] args)
	{
		int year, month;
		Scanner sc = new Scanner(System.in);
		System.out.print("Year : ");
		year = sc.nextInt();                             
		System.out.print("Month : ");
		month = sc.nextInt();                           

                int l=0;
		if(((year%400==0) || (year%4==0 && year%100!=0)))
			l=1;
		if(l==0)
			System.out.println(">> not Leap year");
		else
			System.out.println(">> Leap year");
                1

		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			System.out.print(">> Days : 31");

                

		else if((month == 2) && ((year%400==0) || (year%4==0 && year%100!=0)))
			   System.out.print(">> Days : 29");
		else if(month == 2)                              
			   System.out.print(">> Days : 28");
		else                                            
			   System.out.println(">> Days : 30");
	}
}


/*-----------------------------------------------

                   OUTPUT
                   ------
Year : 2010
Month : 9
>> not Leap year
>> Days : 30
---------------------------------------------------*/
