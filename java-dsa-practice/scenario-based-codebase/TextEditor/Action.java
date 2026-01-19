package com.TextEditor;

public class Action {
//type or delete 
	//delete goes to stack
	String type ;
	String text ;
	Action(String type , String text){
		this.type = type ;
		this.text = text;
	}
}
