//3)Create interfaces Student and Sports. Create a class Result implements Student and Sports. Display the academic and sports score of a student.

interface Student
{
   int Score=50;
   void displayscore();
}

interface Sports
{
   int Score=35;
   void displaysportscore();
}

class Result implements Student,Sports
{
  public void displayscore()
  {
    System.out.println("Student academic score is : "+Student.Score);
  }
  public void displaysportscore()
  {
    System.out.println("Student sports score is : "+Sports.Score);
  }
}

public class Studentresults
{
  public static void main(String[]args)
  {
    Result r=new Result();
    r.displayscore();
    r.displaysportscore();
  }
}

/*-----OUTPUT----------------------------
E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 5>javac Studentresults.java

E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 5>java Studentresults

Student academic score is : 50
Student sports score is : 35

*/