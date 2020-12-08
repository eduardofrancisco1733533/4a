// Logic.java

/*
 *  Clase Logic del programa Ranges
 *
 *  Version 8 de abril de 2016
 *	@author Salvador Orozco Villalever A07104218
 */

public class Logic {

	private String dataX; //List of values for x
	private String dataY; //List of values for y
	private String[] arrDataX;
	private String[] arrDataY;

	public void logic1a() {

		Input myInputX = new Input();
		Input myInputY = new Input();
		Data myDataX = new Data();
		Data myDataY = new Data();

		dataX = myInputX.readData("test2_xData.txt");
		arrDataX = myDataX.saveData(dataX);

		dataY = myInputY.readData("test2_yData.txt");
		arrDataY = myDataY.saveData(dataY);

		Rangos myRangos = new Rangos(arrDataX, arrDataY);

		output myOut = new output();

		myOut.writeData("out_test1.txt", "VS = " + myRangos.getDblVS()
			+ "\nS = " + myRangos.getDblS() + "\nM = " + myRangos.getDblM()
			+ "\nL = " + myRangos.getDblL() + "\nVL = " + myRangos.getDblVL());
	}
}
