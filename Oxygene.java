package game;

import edu.princeton.cs.introcs.StdDraw;

public class Oxygene {

	public double reserve;
	public double fullReserve;
	
	public Oxygene () {
		reserve = 2*20/*nombre niveaux*/;
		fullReserve = 2*20/*nombre niveaux*/;
	}
	
	public void oxygene (double move) {
		System.out.println(this.reserve);
		
		if (this.reserve==0) {
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledRectangle(250,  245,  100,  10);
			
		}
		
		if (move == 0 && this.reserve>0) {
			this.reserve=this.reserve-1 /*coffre*/;
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledRectangle(250,  245,  100,  10);
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.filledRectangle(250+((100/this.fullReserve))*(this.reserve-this.fullReserve),245,100,10);
		}
		
		else if(this.reserve>0) {
			this.reserve=this.reserve-1 /*coffre*/;
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledRectangle(250,  245,  100,  10);
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.filledRectangle(250+((100/this.fullReserve))*(this.reserve-this.fullReserve),245,100,10);
		}
	}
}
