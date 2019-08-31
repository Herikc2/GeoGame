package com.bakerystudios.game.questions;

import java.util.List;

public class Question {

	private String text;
	private List<Answer> answers;
	private int correctIndex;
	
	public Question(String text, List<Answer> answers, int correctIndex) {
		this.text = text;
		this.answers = answers;
		this.setCorrectIndex(correctIndex);
	}

	public String getText() {return text;}
	public void setText(String text) {this.text = text;}
	public List<Answer> getAnswers() {return answers;}
	public void setAnswers(List<Answer> answers) {this.answers = answers;}

	public int getCorrectIndex() {
		return correctIndex;
	}

	public void setCorrectIndex(int correctIndex) {
		this.correctIndex = correctIndex;
	}
	
}
