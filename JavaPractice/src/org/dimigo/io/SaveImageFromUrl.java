package org.dimigo.io;

import java.io.IOException;
import java.io.*;
import java.net.*;

public class SaveImageFromUrl {

	public static void main(String[] args){
		String imageUrl = "https://static.dimigo.in/img/logobeta.png";
		try{
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("Files/logo.png"))
			{
				byte[] buf = new byte[512];
				int result;
				while((result = is.read(buf)) != -1){
					os.write(buf, 0, result);
				}
				
				System.out.println("Completed.");
			}
			catch(IOException e){
				e.printStackTrace();
			}
			
		}
		catch(MalformedURLException e){
			e.printStackTrace();
		}
	}
	
}
