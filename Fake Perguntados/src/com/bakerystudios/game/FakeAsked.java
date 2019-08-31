package com.bakerystudios.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import com.bakerystudios.game.questions.Answer;
import com.bakerystudios.game.questions.Question;
import com.bakerystudios.game.questions.QuestionManager;
import com.bakerystudios.game.questions.Region;
import com.bakerystudios.game.questions.State;
import com.bakerystudios.tools.Renderable;
import com.bakerystudios.tools.Text;
import com.bakerystudios.tools.Updateble;

public class FakeAsked implements Updateble, Renderable {
	
	private Player player;
	
	private QuestionManager qm = new QuestionManager();
	
	private Region curRegion;
	private State curState;
	private Question curQuestion;
	
	public FakeAsked() {
	}

	@Override
	public void update() {
		List<State> states = new ArrayList<>();
		List<Question> questions = new ArrayList<>();
		List<Answer> answers = new ArrayList<>();
		answers.add(new Answer("Joinville"));
		answers.add(new Answer("Florianópolis"));
		answers.add(new Answer("Blumenau"));
		answers.add(new Answer("Balneário Camboriú"));
		questions.add(new Question("Qual é a capital de Santa Catarina?", answers));
		states.add(new State("Santa Catarina", questions));
		curRegion = new Region("Sul", states);
		curState = curRegion.getStates().get(0);
		curQuestion = curState.getQuestions().get(0);
	}
	
	@Override
	public void render(Graphics g) {
//		g.setColor(Color.WHITE);
//		g.setFont(new Font("Arial", Font.PLAIN, 20));
//		
//		Text.drawCentralizedText(g, curRegion.getName(), 20);
//		Text.drawCentralizedText(g, curState.getName(), 40);
//		Text.drawCentralizedText(g, curQuestion.getText(), 60);
//		Text.drawCentralizedText(g, curQuestion.getAnswers().get(0).getText(), 80);
//		Text.drawCentralizedText(g, curQuestion.getAnswers().get(1).getText(), 100);
//		Text.drawCentralizedText(g, curQuestion.getAnswers().get(2).getText(), 120);
//		Text.drawCentralizedText(g, curQuestion.getAnswers().get(3).getText(), 140);
	}
	
}
