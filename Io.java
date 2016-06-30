package ladzuoye;

import java.io.*;

public class Io {

	public static void dump(InputStream src,OutputStream dest) 
		// TODO Auto-generated method stub
   throws IOException{
    	
    	
    	try(InputStream input=src;OutputStream output=dest){
    		
    		byte[] date=new byte[1024];
    		int length;
    		while((length=input.read(date))!=-1){
    			output.write(date, 0, length);
    		}
    	}
    }
	}
