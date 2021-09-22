import java.io.*;

class FileWrRd {
	public static void main(String[] args){
		
		//write
		
		String fileContent = "What\n Is\n Your\n Name?\n" + "How Are You";
		
		byte buf[] = fileContent.getBytes();
		
		FileOutputStream file = null;
		
		try{
			file = new FileOutputStream("file.txt");
			
			// write to file
			file.write(buf);
		
		} catch(IOException e){
			System.out.println("I/O Error Occured!");
		
		} finally {
			try {
				if(file != null)
					file.close();
			} catch(IOException e){
				System.out.println("Error closing file.txt");
		
			}
		}


        //read

        FileInputStream fr = null;
		int size;
		try {
			fr = new FileInputStream("file.txt");
			size = fr.available();
			for(int i=0; i< size; i++){
				System.out.print((char) fr.read());
			}
			System.out.println();
			
		} catch(IOException e) {
			System.out.println("I/O Error!");
			return;
		}
		
		
	}
}

/*
----OUTPUT-----
What
 Is
 Your
 Name?
How Are You
*/