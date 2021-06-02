//  4 : Add two complex numbers
 

class Complex{                                                            // CLASS COMPLEX
    double real,imag;
   Complex(double r,double i) {
        real = r;
        imag = i;
         }
  Complex() {

  }

                                                                          
     Complex Add(Complex ans,Complex a,Complex b){                        
        ans.real = a.real + b.real;                                       // ADDING REAL PART
        ans.imag = a.imag + b.imag;                                       // ADDING IMAGINARY PART
        return ans;                                                       
                }  
 
    }

class ComplexAddn{
    public static void main(String[] args) {
        Complex c1 = new Complex(5.5,2.7);                                // CREATING OBJECT
        Complex c2 = new Complex(6.2,4.2);                                // CREATING OBJECT
        
        Complex ans=new Complex();
        ans=c1.Add(ans,c1,c2);
        System.out.println("\n-------------------------------");
        System.out.println("Add "+c1.real+"+"+c1.imag+"i"+" with "+c2.real+"+"+c2.imag+"i");
        System.out.println("\n");
        System.out.println("Sum = "+ans.real+"+"+ans.imag+"i");
        
       }

   }


/*-------------------OUTPUT---------------------------------
                   

-------------------------------
Add 5.5+2.7i with 6.2+4.2i


Sum = 11.7+6.9i

------------------------------------------------------------*/
