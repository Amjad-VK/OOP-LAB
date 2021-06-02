class Cpu{                                                            // CLASS Cpu                                       
    double price;
    Processor p=new Processor();                                       // CRAETE AN OBJECT OF INNER CLASS
    Cpu(double pr,int c, String m, int r, String m2){
     price=pr;
     p.corecount=c;
     p.manufacture=m;
     Cpu.Ram.mem=r;
     Cpu.Ram.manufacture=m2;
     p.Show();
     Ram.Show();
   } 
 
    class Processor{                                                   // INNER CLASS 
       int corecount;
       String manufacture;
       void Show()
        {
          System.out.println(">Manufacturer   :"+p.manufacture);
          System.out.println(">Price     :"+price);
          System.out.println(">Cores     :"+p.corecount);
        }
     }
   
     static class Ram{                                                
         static int mem; 
         static String manufacture;
         static void Show(){                                            //METHOD TO PRINT DATA
             System.out.println(">Memory       :"+Cpu.Ram.mem);
             System.out.println(">Memory Manufactor:"+Cpu.Ram.manufacture);
                 }
              }
 }
 
 class CPUclass{
     public static void main(String[] args)
     {
          System.out.println("\n----------CPU info------------\n");
          Cpu c=new Cpu(59999,6,"Samsung",8,"Kingston");                  // CRATEING OBJECT OF Cpu 
          //c.Processor.Show();                                        // CALLING METHOD TO SHOW DATA
 
      System.out.println("-----------------------------------\n");
     }
 }