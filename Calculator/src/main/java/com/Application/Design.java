package com.Application;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

public class Design extends VBox{
	//Create Calculator Buttons

 	Button b0 = new Button("0");
	
	Button b1 = new Button("1");
	
	Button b2 = new Button("2");
	
	Button b3 = new Button("3");
	
	Button b4 = new Button("4");
	
	Button b5 = new Button("5");
	
	Button b6 = new Button("6");	
	
	Button b7 = new Button("7");		
	
	Button b8 = new Button("8");
	
	Button b9 = new Button("9");
	
	Button div = new Button("/");
	
	Button add = new Button("+");
	
	Button sub = new Button("-");
	
	Button multiple = new Button("*");
	
	Button left_bracket = new Button("(");
	
	Button right_bracket = new Button(")");	
	
	Button dot = new Button(".");
	
	Button remainder = new Button("%");
	
	Button pi = new Button("π");
	
	Button equal = new Button("=");
	
	Button pow2 = new Button("X²");
	
	Button pow3 = new Button("X³");
	
	Button sqrt = new Button("√");
	
	Button del = new Button("↵");
	
	Button tan=new Button("tan");
	
	Button sin=new Button("sin");
	
	Button cos=new Button("cos");
	
	Button c=new Button("C");
	
 	TextField txt= new TextField();
 	

 	public Design()
	{
 		Grid gridButtons=new Grid();
 	 	gridButtons.setPadding(new Insets(5, 5, 5, 5));
 	 	gridButtons.setHgap(7.5);
 	 	gridButtons.setVgap(7.5);
 	 	txt.setEditable(false);
 	 	txt.setMinSize(390, 90);
 	 	getChildren().addAll(txt,gridButtons);
 	 	setPadding(new Insets(7.5, 7.5, 7.5, 7.5));
 	 	setSpacing(7.5);
 	 	handel();
	}
private class Grid extends GridPane {
	//create All Buttons 
	public Grid()
		{

	    //bind buttons on gird 
		b0.prefWidthProperty().bind(widthProperty().divide(7));
		b0.prefHeightProperty().bind(heightProperty().divide(4));
		 
		b1.prefWidthProperty().bind(widthProperty().divide(7));
		b1.prefHeightProperty().bind(heightProperty().divide(4));
		
		b2.prefWidthProperty().bind(widthProperty().divide(7));
		b2.prefHeightProperty().bind(heightProperty().divide(4));
		
		b3.prefWidthProperty().bind(widthProperty().divide(7));
		b3.prefHeightProperty().bind(heightProperty().divide(4));
		
		b4.prefWidthProperty().bind(widthProperty().divide(7));
		b4.prefHeightProperty().bind(heightProperty().divide(4));
		
		b5.prefWidthProperty().bind(widthProperty().divide(7));
		b5.prefHeightProperty().bind(heightProperty().divide(4));
		
		b6.prefWidthProperty().bind(widthProperty().divide(7));
		b6.prefHeightProperty().bind(heightProperty().divide(4));
		
		b7.prefWidthProperty().bind(widthProperty().divide(7));
		b7.prefHeightProperty().bind(heightProperty().divide(4));
		
		b8.prefWidthProperty().bind(widthProperty().divide(7));
		b8.prefHeightProperty().bind(heightProperty().divide(4));
		
		b9.prefWidthProperty().bind(widthProperty().divide(7));
		b9.prefHeightProperty().bind(heightProperty().divide(4));
		
		div.prefWidthProperty().bind(widthProperty().divide(7));
		div.prefHeightProperty().bind(heightProperty().divide(4));
		
		add.prefWidthProperty().bind(widthProperty().divide(7));
		add.prefHeightProperty().bind(heightProperty().divide(4));
		
		sub.prefWidthProperty().bind(widthProperty().divide(7));
		sub.prefHeightProperty().bind(heightProperty().divide(4));
		
		multiple.prefWidthProperty().bind(widthProperty().divide(7));
		multiple.prefHeightProperty().bind(heightProperty().divide(4));
		
		left_bracket.prefWidthProperty().bind(widthProperty().divide(7));
		left_bracket.prefHeightProperty().bind(heightProperty().divide(4));
		
		right_bracket.prefWidthProperty().bind(widthProperty().divide(7));
		right_bracket.prefHeightProperty().bind(heightProperty().divide(4));
		
		dot.prefWidthProperty().bind(widthProperty().divide(7));
		dot.prefHeightProperty().bind(heightProperty().divide(4));
		
		remainder.prefWidthProperty().bind(widthProperty().divide(7));
		remainder.prefHeightProperty().bind(heightProperty().divide(4));
		
		pi.prefWidthProperty().bind(widthProperty().divide(7));
		pi.prefHeightProperty().bind(heightProperty().divide(4));
		
		
		equal.prefWidthProperty().bind(widthProperty().divide(7));
		equal.prefHeightProperty().bind(heightProperty().divide(4));

		pow2.prefWidthProperty().bind(widthProperty().divide(7));
		pow2.prefHeightProperty().bind(heightProperty().divide(4));
					
		pow3.prefWidthProperty().bind(widthProperty().divide(7));
		pow3.prefHeightProperty().bind(heightProperty().divide(4));
		
		
		sqrt.prefWidthProperty().bind(widthProperty().divide(7));
		sqrt.prefHeightProperty().bind(heightProperty().divide(4));

		
		del.prefWidthProperty().bind(widthProperty().divide(7));
		del.prefHeightProperty().bind(heightProperty().divide(4));

		tan.prefWidthProperty().bind(widthProperty().divide(7));
		tan.prefHeightProperty().bind(heightProperty().divide(4));
		
		sin.prefWidthProperty().bind(widthProperty().divide(7));
		sin.prefHeightProperty().bind(heightProperty().divide(4));
		
		cos.prefWidthProperty().bind(widthProperty().divide(7));
		cos.prefHeightProperty().bind(heightProperty().divide(4));
		
		c.prefWidthProperty().bind(widthProperty().divide(7));
		c.prefHeightProperty().bind(heightProperty().divide(4));
		
			//add All Buttons to grid 
			add(b7,0,0);
			add(b8,1,0);
			add(b9,2,0);
			add(div,3,0);
			add(pow2,4,0);
			add(c,5,0);
			add(del,6,0);
			add(b4,0,1);
			add(b5,1,1);
			add(b6,2,1);
			add(multiple,3,1);
			add(left_bracket,4,1);
			add(right_bracket,5,1);
			add(sin,6,1);
			add(b1,0,2);
			add(b2,1,2);
			add(b3,2,2);
			add(sub,3,2);
			add(pow3,4,2);
			add(sqrt,5,2);
			add(cos,6,2);
			add(b0,0,3);
			add(dot,1,3);
			add(remainder,2,3);
			add(pi,3,3);
			add(add,4,3);
			add(equal,5,3);
			add(tan,6,3);
		}	
	}

class Handler implements EventHandler<ActionEvent>{
	
	@Override
	public void handle(ActionEvent e) {
		Button source = (Button) e.getSource();
		String str= source.getText();
		txt.appendText(str+" ");
	}
}
public void handel ()
{

  	Handler h1=new Handler();
	b0.setOnAction(h1);
	b1.setOnAction(h1);
	b2.setOnAction(h1);	
	b3.setOnAction(h1);
	b4.setOnAction(h1);
	b5.setOnAction(h1);
	b6.setOnAction(h1);
	b7.setOnAction(h1);
	b8.setOnAction(h1);
	b9.setOnAction(h1);
	div.setOnAction(h1);
	add.setOnAction(h1);
	sub.setOnAction(h1);
	multiple.setOnAction(h1);
	left_bracket.setOnAction(h1);
	right_bracket.setOnAction(h1);
	dot.setOnAction(h1);
	remainder.setOnAction(h1);
	tan.setOnAction(h1);
	sin.setOnAction(h1);
	cos.setOnAction(h1);

	
	del.setOnAction(new EventHandler<ActionEvent>(){
		@Override
        public void handle(ActionEvent event) {
		

		StringBuilder str=new StringBuilder( txt.getText());
			str=str.deleteCharAt(str.length()-1);
			String x=new String(str);
            txt.setText(x);
		}		
     });
	

	c.setOnAction(new EventHandler<ActionEvent>(){
		@Override
        public void handle(ActionEvent event) {
            txt.clear();
		}		
     });

     pow2.setOnAction(new EventHandler<ActionEvent>(){
		@Override
        public void handle(ActionEvent event) {
       txt.appendText("^2 ");
		}		
     });;
	
     pow3.setOnAction(new EventHandler<ActionEvent>(){
		@Override
        public void handle(ActionEvent event) {
       txt.appendText("^3 ");
		}		
     });;
	
}
}