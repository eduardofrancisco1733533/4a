// Rangos.java

/*
 *  Clase Rangos del programa de Rangos que calcula las variables necesarias
 *
 *  Version 8 de abril de 2016
 *	@author Salvador Orozco Villalever A07104218
 */

import java.util.*;

public class Rangos{

	private ArrayList<Double> dblXi;
	private ArrayList<Double> dblLnXi;
	private int intN; //Amount of elements in the list
	private double dblTotalXi;
	private double dblTotalLnXi;
	private double dblAvgXi;
	private double dblAvgLnXi;
	private double dblVar;
	private double dblStdDev;
	private double dblVS;
	private double dblS;
	private double dblM;
	private double dblL;
	private double dblVL;

	public Rangos(String[] dataX, String[] dataY){

		intN = dataX.length; //or dataY.length, it is the same
		dblXi = new ArrayList<Double>();
		dblLnXi = new ArrayList<Double>();

		computeXi(dataX, dataY);
		computeAvgXi();
		computeLnXi();
		computeAvgLnXi();
		computeVar();
		computeStdDev();
		computeVS();
		computeS();
		computeM();
		computeL();
		computeVL();
	}

	public void computeXi(String[] dataX, String[] dataY){

		dblTotalXi = 0.0;

		for(int i = 0; i < intN; i++){
			dblXi.add((Double.parseDouble(dataX[i]))/(Double.parseDouble(dataY[i])));
			dblTotalXi += dblXi.get(i);
		}	
	}

	public void computeAvgXi(){

		dblAvgXi = dblTotalXi/intN;
	}

	public void computeLnXi(){

		dblTotalLnXi = 0.0;

		for(int i = 0; i < intN; i++){
			dblLnXi.add(Math.log(dblXi.get(i)));
			dblTotalLnXi += dblLnXi.get(i);
		}
	}

	public void computeAvgLnXi(){

		dblAvgLnXi = dblTotalLnXi/intN;
	}

	public void computeVar(){

		dblVar = 0.0;

		for(int i = 0; i < intN; i++)
			dblVar += Math.pow((dblLnXi.get(i) - dblAvgLnXi), 2);

		dblVar /= (intN - 1);
	}

	public void computeStdDev(){

		dblStdDev = Math.sqrt(dblVar);
	}

	public void computeVS(){

		dblVS = Math.exp(dblAvgLnXi - 2*dblStdDev);
	}

	public void computeS(){
		
		dblS = Math.exp(dblAvgLnXi - dblStdDev);
	}

	public void computeM(){
		
		dblM = Math.exp(dblAvgLnXi);
	}

	public void computeL(){
		
		dblL = Math.exp(dblAvgLnXi + dblStdDev);
	}

	public void computeVL(){
		
		dblVL = Math.exp(dblAvgLnXi + 2*dblStdDev);
	}

	public double getDblVS(){

		return dblVS;
	}

	public double getDblS(){

		return dblS;
	}

	public double getDblM(){

		return dblM;
	}

	public double getDblL(){

		return dblL;
	}

	public double getDblVL(){

		return dblVL;
	}

}//End of class Rangos