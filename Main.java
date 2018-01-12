package game;

import edu.princeton.cs.introcs.StdDraw;

public class Main {

	public final static int X_MAX= 700;
	public final static int Y_MAX= 500;
	public static Oxygene reserve= new Oxygene();
	public static Oxygene reserve2= new Oxygene();
	public static Oxygene reserve3= new Oxygene();
	
	public static void main(String[] args) {
		
		int a=1;
		int score = 10;
		
		StdDraw.setCanvasSize(X_MAX, Y_MAX);
		StdDraw.setXscale(0, 500);
		StdDraw.setYscale(0, 250);
		StdDraw.picture(250, 110, "background.jpg");
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(250, 245, 100, 10);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(250, 245, 100, 10);
		

		Player Player1= new Player();
		Player Player2= new Player();
		Move Move1 = new Move(200,125);
		Move Move2 = new Move(400,125);
		
		
		StdDraw.picture(Move1.posx, Move1.posy, "plongeur.jpg");
		StdDraw.picture(Move2.posx, Move2.posy, "plongeur.jpg");
		
		
		while (reserve.reserve >0) {
			System.out.println(reserve.reserve);
			
			Move1.movement();
			
			StdDraw.picture(250,  110, "background.jpg");
			StdDraw.picture(Move1.posx ,Move1.posy, "plongeur.jpg");
			StdDraw.picture(Move2.posx ,Move2.posy, "plongeur 2.jpg");
			StdDraw.show(100);
			
			
			a=0;
		}
		
		
		if(a==0) {
			
			StdDraw.text(490, 245, Integer.toString((int) Player2.score));
			
			Move2.movement();
			
			StdDraw.picture(250,  110, "background.png");
			StdDraw.picture(Move1.posx ,Move1.posy, "plongeur.jpg");
			StdDraw.picture(Move2.posx ,Move2.posy, "plongeur 2.jpg");
			StdDraw.show(100);
		
			a=1;
			
		}
		
		
		StdDraw.picture(250,  110, "background.jpg");
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(250, 245, 100, 10);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(250, 245, 100, 10);
		
		Move Move3 = new Move(200,125);
		Move Move4 = new Move(200,125);
	
		StdDraw.picture(Move3.posx, Move3.posy, "plongeur.jpg");
		StdDraw.picture(Move4.posx, Move4.posy, "plongeur 2.jpg");
		reserve.reserve = 2*20;
		
		
		while(reserve.reserve != 0) {
			
			if (a==1) {
				
				StdDraw.text(10, 245, Integer.toString((int) Player1.score));
				
				Move3.movement();
				
				StdDraw.picture(250, 110, "background.jpg");
				StdDraw.picture(Move3.posx, Move3.posy, "plongeur.jpg");
				StdDraw.picture(Move4.posx, Move4.posy, "plongeur 2.jpg");
				StdDraw.show(100);
				
				a=0;
				
			}
			
			if (a==0) {
				
				StdDraw.text(10, 245, Integer.toString((int) Player2.score));
				
				Move4.movement();
				
				StdDraw.picture(250, 110, "background.jpg");
				StdDraw.picture(Move3.posx, Move3.posy, "plongeur.jpg");
				StdDraw.picture(Move4.posx, Move4.posy, "plongeur 2.jpg");
				StdDraw.show(100);
				
				a=1;
			}
		}
		
		
		
	}

}
