// DISPLAY THE AREA OF DIFFERENT SHAPES USING OVERLOADING


public class Areas{

    

    public int area(int x,int y)  //triangle
    {
        return (x*y/2);
    }

    public int area(int x)   //square
    {
        return(x*x);
    }

    public double area(double x,double y)  //rectangle
    {
        return(x*y);

    }

    public double area(double x)    //circle
    {
        return(x*x*3.14);
    }
 
    
    
    public static void main(String args[]) {
    Areas a=new Areas();
    System.out.println("---Area of Triangle---\n base=5\n height=8\n Area= " + a.area(5,8));   
    System.out.println("---Area of Square--- \n side=6\n Area=" + a.area(6));
    System.out.println("---Area of Rectangle--- \n length=8 \n width=6 \n Area=" +  a.area(8,6));
    System.out.println("---Area of Circle--- \n radius=8  \n Area=" + a.area(8));
    
    }



}

/*-------------------OUTPUT----------------------------------------

---Area of Triangle---
 base=5
 height=8
 Area= 20
---Area of Square---
 side=6
 Area=36
---Area of Rectangle---
 length=8
 width=6
 Area=24
---Area of Circle---
 radius=8
 Area=64


 --------------------------------------------------------------*/