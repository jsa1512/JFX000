package JFX000;

import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class TableauFX extends Pane{
	
	private int largeur, hauteur;
	private int caseWidth, caseHeight;
	private Case[][] cases;
	
	public class Case extends TextField{
		private int largeur, hauteur;
		
		public Case(String text) {
			super(text);
			this.largeur = caseWidth;
			this.hauteur = caseHeight;
			this.setMaxWidth(largeur);
			this.setMaxHeight(hauteur);
		}
		
		public Case(String text, int larg, int haut) {
			super(text);
			this.largeur = larg;
			this.hauteur = haut;
			this.setMaxWidth(largeur);
			this.setMaxHeight(hauteur);
		}
	}
	
	public TableauFX(int largeur, int hauteur, int caseWidth, int caseHeight) {
		super();
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.caseWidth = caseWidth;
		this.caseHeight = caseHeight;
		
		this.cases = new Case[largeur - 1][hauteur - 1];
		
		
		
		GridPane grid = new GridPane();
		
		for(int x = 0; x < largeur - 1; x++)
			for(int y = 0; y < hauteur - 1; y++) {
				int coul = (x + y) % 6;
				String couleur;
				
				switch(coul) {
				case 1:
					couleur ="green";
					break;
				case 2:
					couleur ="blue";
					break;
				case 3:
					couleur ="red";
					break;
				case 4:
					couleur ="white";
					break;
				default:
					couleur ="yellow";
					break;				
				}
				
				cases[x][y] = new Case("case " + x + " " + y);
				cases[x][y].setStyle("-fx-background-color: " + couleur + ";");
				
				grid.add(cases[x][y], x, y, 1, 1);
				System.out.println("ajout de case " + x + " " + y);
			}			


        
        this.getChildren().add(grid);
        
	}

}