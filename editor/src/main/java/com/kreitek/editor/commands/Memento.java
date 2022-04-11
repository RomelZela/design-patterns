package com.kreitek.editor.commands;

import java.util.ArrayList;

public class Memento {
	
	public Memento(ArrayList<Object> state) {
		
		this.state=state;
	}
	
	public ArrayList<Object> getState() {
		return state;
	}

	
	private final ArrayList<Object> state;
}
