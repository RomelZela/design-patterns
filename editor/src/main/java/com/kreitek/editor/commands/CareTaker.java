package com.kreitek.editor.commands;

import java.util.*;

import com.kreitek.editor.*;

public class CareTaker {
	
	ConsoleEditor consoleEditor = new ConsoleEditor();

	private List<Memento> mementoList = new ArrayList<Memento>();
	
	
	
	public void addMemento(Memento state) {
		state = consoleEditor.getState();
		mementoList.add(state);
	}
	
	public Memento restoreMemento() {
		if(mementoList.size()> 0) {
			Memento memento = mementoList.get(mementoList.size()-1);
			mementoList.remove(mementoList.size()-1);
			return memento;
		}
		return null;
	}
}
	