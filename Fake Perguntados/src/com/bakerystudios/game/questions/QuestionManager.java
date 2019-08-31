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
		addQuestion("Isso é um exemplo de pergunta, eu acho interessante"
				+ 	"a pergunta ter no máximo 4 (quatro) linhas, caso"
				+ 	"haja dúvidas de como separar uma string em linhas,"
				+ 	"existe uma função no Graphics que faz isso.",
					"Isso é um exemplo de resposta.",
					"Aqui está outro exemplo.",
					"Esse ja é o terceiro exemplo.",
					"E finalmente o último exemplo.");
	}
	
}
