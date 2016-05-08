package com.Application;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


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
 	getChildren().addAll(txt,gridButtons);
 	setSpacing(7.5);
	}
private class Grid extends GridPane {
	//create All Buttons 
	public Grid()
		{

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
}