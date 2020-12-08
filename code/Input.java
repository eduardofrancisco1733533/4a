// Input.java

/*
 *  Clase Input del programa Rangos
 *
 *  Version 8 de abril de 2016
 *	@author Salvador Orozco Villalever A07104218
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Input {
	
	String data;
	BufferedReader br = null;
	
	public String readData(String inFile) {

		try {
				br = new BufferedReader(new FileReader(inFile));
				StringBuilder sb = new StringBuilder();
				String line;
				
				while ( (line = br.readLine()) != null ) 

					{
						sb.append(line);
						sb.append(",");
					}
				
				data = sb.toString();
			
		} catch (IOException e) {

				e.printStackTrace();
		}
	
		return data;
	}
}