package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.ConsoleEditor;

import java.util.ArrayList;

public class DeleteCommand implements Command {
    private final int lineNumber;
    ConsoleEditor console = new ConsoleEditor();
    CareTaker careTaker = new CareTaker();

    public DeleteCommand(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
    	
    	console.getState();
    	careTaker.addMemento(console.getState());
    	
        documentLines.remove(lineNumber);
    }
}