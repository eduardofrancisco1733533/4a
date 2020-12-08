// Data.java

/*
 *  Clase Data del programa de Rangos que divide los Strings por coma
 *
 *  Version 8 de abril de 2016
 *	@author Salvador Orozco Villalever A07104218
 */

public class Data {

	public String[] saveData(String data) {
	
		// TODO - implement Data.saveData
		// throw new UnsupportedOperationException();
		String[] arrData = data.split(",");
	
		return arrData;
	}
}