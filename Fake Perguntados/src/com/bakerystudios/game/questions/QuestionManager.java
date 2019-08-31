package com.bakerystudios.game.questions;

import java.util.ArrayList;
import java.util.List;

public class QuestionManager {

	private List<Question> questions;
	private List<Integer> alreadyUsed;
	
	public QuestionManager() {
		questions = new ArrayList<Question>();
		loadQuestions();
	}
	
	private void addQuestion(String q, String a1, String a2, String a3, String a4) {
		List<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("1. " + a1));
		answers.add(new Answer("2. " + a2));
		answers.add(new Answer("3. " + a3));
		answers.add(new Answer("4. " + a4));
		questions.add(new Question(q, answers));
	}
	
	private void loadQuestions() {
		addQuestion("Isso � um exemplo de pergunta, eu acho interessante"
				+ 	"a pergunta ter no m�ximo 4 (quatro) linhas, caso"
				+ 	"haja d�vidas de como separar uma string em linhas,"
				+ 	"existe uma fun��o no Graphics que faz isso.",
					"Isso � um exemplo de resposta.",
					"Aqui est� outro exemplo.",
					"Esse ja � o terceiro exemplo.",
					"E finalmente o �ltimo exemplo.");
	}
	
}
