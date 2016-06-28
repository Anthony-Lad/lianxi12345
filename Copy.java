package ladzuoye;
import java.io.*;
public class Copy {

	public static void main(String[] args) throws IOException{
		
		Io.dump(new FileInputStream(args[0]),
				
				new FileOutputStream(args[1])
				);
	} 
		// TODO Auto-generated method stub

}	

