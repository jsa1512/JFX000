package JFX000;



import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class TableauFX extends Pane{
	
	private int largeur, hauteur;
	private Pane pane;
	private int caseWidth, caseHeight;
	
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
		GridPane grid = new GridPane();
		
		
		
		TextField t1 = new Case("text 1");
		
		TextField t2 = new Case("text 2");
		TextField t3 = new Case("text 3");
		TextField t4 = new Case("text 4");
		TextField t5 = new Case("text 5");
		TextField t6 = new Case("text 6");
		TextField t7 = new Case("text 7");
		TextField t8 = new Case("text 8");
		TextField t9 = new Case("text 9");


        grid.add(t1, 0, 0, 1, 1);
        grid.add(t2, 1, 0, 1, 1);
        grid.add(t3, 2, 0, 1, 1);
        grid.add(t4, 0, 1, 1, 1);
        grid.add(t5, 1, 1, 1, 1);
        grid.add(t6, 2, 1, 1, 1);
        grid.add(t7, 0, 2, 1, 1);
        grid.add(t8, 1, 2, 1, 1);
        grid.add(t9, 2, 2, 1, 1);
		
//		Button button1 = new Button("Button 1");
//        Button button2 = new Button("Button 2");
//        Button button3 = new Button("Button 3");
//        Button button4 = new Button("Button 4");
//        Button button5 = new Button("Button 5");
//        Button button6 = new Button("Button 6");
//        Button button7 = new Button("Button 7");
//        Button button8 = new Button("Button 8");
//        Button button9 = new Button("Button 9");
//
//
//        grid.add(button1, 0, 0, 1, 1);
//        grid.add(button2, 1, 0, 1, 1);
//        grid.add(button3, 2, 0, 1, 1);
//        grid.add(button4, 0, 1, 1, 1);
//        grid.add(button5, 1, 1, 1, 1);
//        grid.add(button6, 2, 1, 1, 1);
//        grid.add(button7, 0, 2, 1, 1);
//        grid.add(button8, 1, 2, 1, 1);
//        grid.add(button9, 2, 2, 1, 1);
        
        this.getChildren().add(grid);
        
	}

}