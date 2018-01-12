package game;

import java.awt.event.KeyEvent;
import edu.princeton.cs.introcs.StdDraw;

public class Move extends Main{
	
	double posx;
	double posy;
	
	public Move() {
		posx=250;
		posy=125;
		
	}

	public Move(double posxb, double posyb) {
		posx=posxb;
		posy=posyb;
	}
	
	public void movement () {
		int p = 0;
		
		while (p==0) {
			
			if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)) {
				this.posy = this.posy-10;
				this.posx = this.posx;
				StdDraw.show(100);
				p=1;
				reserve.oxygene(0);
			}
			
			if (StdDraw.isKeyPressed(KeyEvent.VK_UP)) {
				this.posy = this.posy+10;
				this.posx = this.posx;
				StdDraw.show(100);
				p=1;
				reserve.oxygene(1);
				
			}
			
			
}
		

}}
