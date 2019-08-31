package com.bakerystudios.game.questions;

import java.util.List;

public class State {

	private String name;
	private List<Question> questions;
	
	public State(String name, List<Question> questions) {
		this.name = name;
		this.questions = questions;
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public List<Question> getQuestions() {return questions;}
	public void setQuestions(List<Question> questions) {this.questions = questions;}
	
}
