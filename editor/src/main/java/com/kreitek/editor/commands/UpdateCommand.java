package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.ConsoleEditor;

import java.util.ArrayList;

public class UpdateCommand implements Command {
    private final String text;
    private final int lineNumber;
    ConsoleEditor console = new ConsoleEditor();
    CareTaker careTaker = new CareTaker();

    
    public UpdateCommand(String text, int lineNumber) {
        this.text = text;
        this.lineNumber = lineNumber;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
        if (documentLines.size() > lineNumber)
            documentLines.set(lineNumber, text);
        else
            documentLines.add(text);
        	console.getState();
        	careTaker.addMemento(console.getState());
        	
        	
    }
}