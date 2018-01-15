import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Scanner;

public class JeuduPlongeur extends JPanel {

	public int longueur;
	Graphics g;
	public boolean jouer = true;
	public int nbdecoffre = 3;
	Scanner sc;
	public int Nbdecoffres = 3;
	ArrayList<Coffre> Coffre = new ArrayList<Coffre>();

	public JeuduPlongeur(Graphics g, int longueur) {

		this.g = g;
		this.longueur = longueur;
		sc = new Scanner(System.in);
	}

	public void jouer() {

		while (jouer == true) {

			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(0, 0, Fenetre.largeur, Fenetre.hauteur);

			CreationCoffre();
			dessinerCoffre();
		}
	}

	public void CreationCoffre() {

		int randX = 0, randY = 0;
		Boolean Creation = true;

		while (Coffre.size() < Nbdecoffres) {
			Creation = true;
			int widthFen = ((Fenetre.largeur - 20 / 10) - 2); /*
															 * Taille de la
															 * fenêtre pour
															 * l'apparition des
															 * coffres
															 */
			int heightFen = ((Fenetre.hauteur - 20 / 10) - 2);

			randX = (int) ((Math.random() * (widthFen) + 3)); /*
															 * Position du
															 * coffre
															 */
			randY = (int) ((Math.random() * (heightFen) + 3));

			randX = (randX * 10);
			randY = (randY * 10);

			for (int i = 0; i < 5; i++) {
				Creation = true;

			}
			if (Creation == true) {
				Coffre.add(new Coffre(randX, randY, Color.BLACK));
			}
		}
	}

	public void dessinerCoffre() {

		for (int x = 0; x < Nbdecoffres; x++) {

			Coffre C = Coffre.get(x);

			g.setColor(C.couleur); /* couleur du coffre */
			g.fillOval(C.PosX, C.PosY, 10, 10); /* Position du coffre */
		}

	}
}
