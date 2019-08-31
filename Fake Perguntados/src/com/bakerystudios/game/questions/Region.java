package com.bakerystudios.game.questions;

import java.util.List;

public class Region {
	
	private String name;
	private List<State> states;
	
	public Region(String name, List<State> sates) {
		this.name = name;
		this.states = sates;
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public List<State> getStates() {return states;}
	public void setStates(List<State> states) {this.states = states;}
	
}
