package com.TextEditor;

public class Main {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		editor.insert("Hello");
        editor.insert(" World");
        editor.showText();

        editor.delete(6);
        editor.showText();

        editor.undo();
        editor.showText();

        editor.redo();
        editor.showText();

	}
}
