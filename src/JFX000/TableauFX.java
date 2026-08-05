package JFX000;



import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class TableauFX extends Pane{
	
	private int largeur, hauteur;
	private Pane pane;
	
	public TableauFX(int largeur, int hauteur) {
		super();
		this.largeur = largeur;
		this.hauteur = hauteur;
		GridPane grid = new GridPane();
		
		TextArea t1 = new TextArea("text 1");
		t1.setMaxHeight(20);
		t1.setMaxWidth(200);
		
		TextArea t2 = new TextArea("text 2");
		TextArea t3 = new TextArea("text 3");
		TextArea t4 = new TextArea("text 4");
		TextArea t5 = new TextArea("text 5");
		TextArea t6 = new TextArea("text 6");
		TextArea t7 = new TextArea("text 7");
		TextArea t8 = new TextArea("text 8");
		TextArea t9 = new TextArea("text 9");


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