// output.java

/*
 *  Clase output del programa Rangos que escribe datos en un archivo final
 *
 *  Version 8 de abril de 2016
 *	@author Salvador Orozco Villalever A07104218
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class output {

	public void writeData(String outFile, String outText) {
	
	BufferedWriter output = null;
	
	try {
			File file = new File(outFile);
			output = new BufferedWriter(new FileWriter(file));
			output.write(outText);
			output.close();

	} catch(IOException e) {
			e.printStackTrace();
	}

	}
}