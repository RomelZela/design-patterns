package com.kreitek.editor.commands;
import com.kreitek.editor.Command;
import com.kreitek.editor.ConsoleEditor;

import java.util.ArrayList;



public class UndoCommand implements Command{
	
    ConsoleEditor console = new ConsoleEditor();
    CareTaker careTaker = new CareTaker();
    
	@Override
	public void execute(ArrayList<String> documentLines) {
		// TODO Auto-generated method stub
		
		editor.restoreFromMemento(careTaker.restoreMemento());
        
	}
	ConsoleEditor editor = new ConsoleEditor();
}
