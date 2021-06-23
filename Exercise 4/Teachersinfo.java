

import java.util.Scanner ;

class Person{                                                                    // CLASS Person
int age;
String address,name,gender;

Person(int ag,String add,String n,String g)                                      // CONSTRUCTOR OF Person
	{
	age=ag;
	gender=g;
	address=add;
        name=n;
        System.out.print("\n------------------------------------------\n Objects Created for: "+name+"\n------------------------------------------");
	}

void DisplayPersn(){                                                                 // DISPLAY Method FOR DISPLAY Person DATA
        System.out.println("\n>Name             : "+name) ; 
        System.out.println("\n>Age              : "+age) ;
        System.out.println("\n>Gender           : "+gender) ;
        System.out.println("\n>Address          : "+address) ;
}
}

class Employee extends Person{                                                  // CLASS Employee WITH EXTENDING CHARACTERSTICS OF Person
int empid;
double salary;
String quali,c_name;
Employee(int em,double sa,String qu,String cn,int ag,String add,String n,String g)   // CONSTRUCTOR OF Employee
	{
        super(ag,add,n,g);                                                     // CALLING CONSTRUCTOR OF Person
	empid=em;
	salary=sa; 
	quali=qu;
        c_name=cn;
	}
void DisplayEmpl(){                                                              // DISPLAY Method FOR DISPLAY DATA
        System.out.println("\n>Emp_ID       : "+empid) ; 
        System.out.println("\n>Salary       : "+salary) ;
        System.out.println("\n>Qualification    : "+quali) ;
        System.out.println("\n>CompanyName     : "+c_name) ;
}
}

class Teacher extends Employee{                                              // CLASS Teacher WITH EXTENDING CHARACTERSTICS OF Employee
int tid;
String subject,department;

Teacher(int id,String sub,String dp,int em,double sa,String qu,String cn,int ag,String add,String n,String g)    // CONSTRUCTOR OF Teacher
	{
        super(em,sa,qu,cn,ag,add,n,g);
	tid=id;
	subject=sub;
	department=dp;
	}

void DisplayTeach(){                                                             // DISPLAY Method FOR DISPLAY DATA
        System.out.println("\n>Teacher_ID       : "+tid) ; 
        System.out.println("\n>Department       : "+department) ;
        System.out.println("\n>Subject          : "+subject) ;
}

void Displayallinfo(Teacher t[],int no){                                        // DISPLAY Method FOR DISPLAY ALL DATA
    for(int i=0;i<no;i++)
       {
        System.out.println("\n-------------> Teacher : " +(i+1)+" <-------------- ");
        t[i].DisplayPersn();
        t[i].DisplayEmpl();
        t[i].DisplayTeach();
       }
}

}


class Teachersinfo{
	public static void main(String[] args)
	{
	Scanner in = new Scanner (System.in ) ;
	System.out.print("\n> Enter number of Teachers You want to enter : ") ; 
        int c = in.nextInt() ;                      
        int id,em,ag;
        double sa;
        Teacher emp[]=new Teacher[c];
        String sub,dp,qu, cn, add, n, g;
        for(int i=0;i<c;i++)                                             // READING DETAILS OF EACH TEACHER
	{
		System.out.println("\n---------------Fill Details of Teacher "+(i+1)+"-------- ") ;
		in.nextLine() ;
		System.out.print("\n>Enter Name         : ") ;
		n = in.nextLine() ;
		System.out.print(">Enter EmpId          : ") ;
		em= in.nextInt() ;
		System.out.print(">Enter Teacher id     : ") ;
		id= in.nextInt() ;
		System.out.print(">Enter age            : ") ;
		ag= in.nextInt() ;
        in.nextLine() ;
		System.out.print(">Enter gender         : ") ;
		g = in.nextLine() ;
		System.out.print(">Enter Department     : ") ;
		dp = in.nextLine() ;
		System.out.print(">Enter Subject        : ") ;
		sub = in.nextLine() ;
		System.out.print(">Enter Address        : ") ;
		add = in.nextLine() ;
		System.out.print(">Enter Qualification  : ") ;
		qu = in.nextLine() ;
		System.out.print(">Enter company name   : ") ;
		cn = in.nextLine() ;
		System.out.print(">Enter Salary         : ") ;
		sa = in.nextDouble() ;
                emp[i]= new Teacher(id,sub,dp,em,sa,qu,cn,ag,add,n,g); 
	}

        
        char ch='y';
        while(ch!='n')
        {
 	       System.out.print("\n> Enter number of Teachers data to be display : ") ; 
  	      int c2 = in.nextInt() ;
  	      if(c2>c)
  	           	System.out.println("\n---------------\n>>> ERROR !\n Only "+c+" Teachers are in list \n--------------") ;
  	      else
			emp[0].Displayallinfo(emp,c2);                                                  // CALLING METHOD TO DISPLAY ALL DATA
        System.out.print("\> Countinue(y/n) ? ") ;
        ch=in.next().charAt(0);
        }
	}
}


/*---------------------------------------------------------------------------------
> Enter number of Teachers You want to enter : 2

---------------Fill Details of Teacher 1--------

>Enter Name         : Radha
>Enter EmpId          : 100
>Enter Teacher id     : 01
>Enter age            : 32
>Enter gender         : Male
>Enter Department     : IT
>Enter Subject        : C Programming
>Enter Address        : Kozhikode
>Enter Qualification  : MCA
>Enter company name   : Intel
>Enter Salary         : 29999

------------------------------------------
 Objects Created for: Radha
------------------------------------------
---------------Fill Details of Teacher 2--------

>Enter Name         : Jessy
>Enter EmpId          : 101
>Enter Teacher id     : 02
>Enter age            : 31
>Enter gender         : Female
>Enter Department     : Literature
>Enter Subject        : English
>Enter Address        : Malappuram
>Enter Qualification  : Ma
>Enter company name   : Jot
>Enter Salary         : 15899

------------------------------------------
 Objects Created for: Jessy
------------------------------------------
> Enter number of Teachers data to be display : 2

-------------> Teacher : 1 <--------------

>Name             : Radha

>Age              : 32

>Gender           : Male

>Address          : Kozhikode

>Emp_ID       : 100

>Salary       : 29999.0

>Qualification    : MCA

>CompanyName     : Intel

>Teacher_ID       : 1

>Department       : IT

>Subject          : C Programming

-------------> Teacher : 2 <--------------

>Name             : Jessy

>Age              : 31

>Gender           : Female

>Address          : Malappuram

>Emp_ID       : 101

>Salary       : 15899.0

>Qualification    : Ma

>CompanyName     : Jot

>Teacher_ID       : 2

>Department       : Literature

>Subject          : English

-------------------------------------

-------------------------------------------------------------------------------*/