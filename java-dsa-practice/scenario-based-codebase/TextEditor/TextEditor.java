package com.TextEditor;

import java.util.*;
public class TextEditor {
	String content = "";
	Stack<Action> undoStack  = new Stack<>();
	Stack<Action> redoStack = new Stack<>();
	
	//now make the insert function 
	void insert(String text) {
		content+=text;
		undoStack.push(new Action("insert" , text));
		redoStack.clear();
		System.out.println("Insertesd the text in "+ text) ;
	}
	void delete(int length) {
		if(content.length() < length) return ;
		String removed = content.substring(0 , content.length() - length);
		undoStack.push(new Action("delete" , removed));
		redoStack.clear();
		System.out.print("Removed the text ");
	}
	
	void undo() {
		//last text par jana based on type or string that if delete or insert
		if(undoStack.isEmpty()) {
			System.out.print("No undo done here . ");
		}
		Action action = undoStack.pop();
		if(action.type.equals("insert")) {
			content = content.substring(0,content.length() - action.text.length());
			redoStack.push(action);
		}else if(action.type.equals("delete")){
			content +=action.text;
			redoStack.push(action);
		}
		System.out.print("Undo performed");
		
	}
	void redo() {
		if(redoStack.isEmpty()) {
			System.out.println("Nothing to redo");
			return;
		}		
		Action action = redoStack.pop();
		if(action.type.equals("insert")) {
			content +=action.text;
			undoStack.push(action);
		}else if(action.type.equals("delete")){
			content +=action.text;
			redoStack.push(action);
			undoStack.push(action);
		}
	}
	void showText() {
		System.out.print(content);
	}
	
}
