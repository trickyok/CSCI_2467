package edu.cscc;

/* Gage Farmer
10/12/2021
Main.java- is the main file idk
it just does the stuff
 */
public class Main {

    public static void main(String[] args) {

	    HoldingTank tank = new HoldingTank(350, 1000);
	    tank.print();

	    tank.add(350);
	    tank.drain(100);
	    tank.print();

	    tank.add(800);
	    tank.drain(175);
	    tank.print();
	    
	    tank.drain(1200);
	    tank.add(900);
	    tank.drain(25);
	    tank.print();

    }
}
