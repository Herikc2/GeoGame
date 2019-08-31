package com.bakerystudios.game.questions;

import java.util.List;

public class Question {

	private String text;
	private List<Answer> answers;
	
	public Question(String text, List<Answer> answers) {
		this.text = text;
		this.answers = answers;
	}

	public String getName() {return text;}
	public void setName(String text) {this.text = text;}
	public List<Answer> getAnswers() {return answers;}
	public void setAnswers(List<Answer> answers) {this.answers = answers;}
	
}
