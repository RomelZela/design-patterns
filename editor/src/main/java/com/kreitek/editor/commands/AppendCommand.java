package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.ConsoleEditor;

import java.util.ArrayList;

public class AppendCommand implements Command {
    private final String text;
    ConsoleEditor console = new ConsoleEditor();
    CareTaker careTaker = new CareTaker();

    public AppendCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
        documentLines.add(text);
        console.getState();
    	careTaker.addMemento(console.getState());
    }
}