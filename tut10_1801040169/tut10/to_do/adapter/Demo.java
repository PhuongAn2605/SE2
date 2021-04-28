package tut10.to_do.adapter;

import tut10.to_do.adapter.adapter.SquarePegAdapter;
import tut10.to_do.adapter.round.RoundHole;
import tut10.to_do.adapter.round.RoundPeg;
import tut10.to_do.adapter.square.SquarePeg;

/**
 * Somewhere in client code...
 */
public class Demo {
	public static void main(String[] args) {
		//TO-DO: Create 2 instances of RoundHole and RoundPeg with same radius
		RoundHole roundHole = new RoundHole(10);
		RoundPeg roundPeg = new RoundPeg(10);
	 
		//TO-DO: If RoundHole instance can "fits" with RoundPeg instance => show a message
		if(roundHole.fits(roundPeg)) {
			System.out.println("RoundHole can fit with RoundPeg.");
		}
	 
		//TO-DO: Create 2 instances of SquarePeg with 2 different widths
		SquarePeg small_peg = new SquarePeg(5);
		SquarePeg big_peg = new SquarePeg(15);
		
		
 
		//Note: You can't make RoundHole instance "fit" with SquarePeg instance
		//Therefore, we need to use Adapter for solving the problem.
		
		//TO-DO: Create 2 corresponding instances of SquarePegAdapter
		SquarePegAdapter small_adapter = new SquarePegAdapter(small_peg);
		SquarePegAdapter big_adapter = new SquarePegAdapter(big_peg);
		 
		//TO-DO: If the RoundHole instance can "fits" with "small" RoundPegAdapter instance 
		//show a suitable message
		if(roundHole.fits(small_adapter)) {
			System.out.println("RoundHole can fit with small adater");
		}else {
			System.out.println("RoundHole can not fit with small adater");
		}
	 
		//TO-DO: If the RoundHole instance can not "fits" with "big" RoundPegAdapter instance 
		//show a suitable message
		if(roundHole.fits(big_adapter)) {
			System.out.println("RoundHole can not fit with big adapter");
		}else {
			System.out.println("RoundHole can fit with big adater");
		}
	}
}