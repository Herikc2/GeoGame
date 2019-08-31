package com.bakerystudios.game.questions;

public class Answer {

	private String text;
	private boolean enable = true;
	
	public Answer(String text) {
		this.text = text;
	}

	public String getText() {return text;}
	public void setText(String text) {this.text = text;}
	public boolean isEnable() {return enable;}
	public void setEnable(boolean enable) {this.enable = enable;}
	
}
