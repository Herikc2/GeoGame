package com.bakerystudios.game.questions;

import java.util.ArrayList;
import java.util.List;

public class QuestionManager {

	private List<Region> regions;
	
	public QuestionManager() {
		regions = new ArrayList<>();
		loadRegions();
	}
	
	//SUL
	private List<Question> rs() {
		List<Question> questions = new ArrayList<>();
		List<Answer> answers = new ArrayList<>();
		
		answers.add(new Answer("1. " + "resposta errada"));
		answers.add(new Answer("2. " + "resposta errada"));
		answers.add(new Answer("3. " + "resposta certa"));
		answers.add(new Answer("4. " + "resposta errada"));
		questions.add(new Question("pergunta pergunta pergunta pergunta?", answers, 2));
		
		answers.add(new Answer("1. " + "resposta errada"));
		answers.add(new Answer("2. " + "resposta errada"));
		answers.add(new Answer("3. " + "resposta errada"));
		answers.add(new Answer("4. " + "resposta certa"));
		questions.add(new Question("pergunta pergunta pergunta pergunta?", answers, 3));
		
		answers.add(new Answer("1. " + "resposta certa"));
		answers.add(new Answer("2. " + "resposta errada"));
		answers.add(new Answer("3. " + "resposta errada"));
		answers.add(new Answer("4. " + "resposta errada"));
		questions.add(new Question("pergunta pergunta pergunta pergunta?", answers, 0));
		
		return questions;
	}
	private List<Question> sc() {
		List<Question> questions = new ArrayList<>();
		List<Answer> answers = new ArrayList<>();

		answers.add(new Answer("1. " + "resposta errada"));
		answers.add(new Answer("2. " + "resposta errada"));
		answers.add(new Answer("3. " + "resposta certa"));
		answers.add(new Answer("4. " + "resposta errada"));
		questions.add(new Question("pergunta pergunta pergunta pergunta?", answers, 2));
		
		answers.add(new Answer("1. " + "resposta errada"));
		answers.add(new Answer("2. " + "resposta errada"));
		answers.add(new Answer("3. " + "resposta errada"));
		answers.add(new Answer("4. " + "resposta certa"));
		questions.add(new Question("pergunta pergunta pergunta pergunta?", answers, 3));
		
		answers.add(new Answer("1. " + "resposta certa"));
		answers.add(new Answer("2. " + "resposta errada"));
		answers.add(new Answer("3. " + "resposta errada"));
		answers.add(new Answer("4. " + "resposta errada"));
		questions.add(new Question("pergunta pergunta pergunta pergunta?", answers, 0));
		
		return questions;
	}
	private List<Question> pr() {
		List<Question> questions = new ArrayList<>();
		List<Answer> answers = new ArrayList<>();

		answers.add(new Answer("1. " + "resposta errada"));
		answers.add(new Answer("2. " + "resposta errada"));
		answers.add(new Answer("3. " + "resposta certa"));
		answers.add(new Answer("4. " + "resposta errada"));
		questions.add(new Question("pergunta pergunta pergunta pergunta?", answers, 2));
		
		answers.add(new Answer("1. " + "resposta errada"));
		answers.add(new Answer("2. " + "resposta errada"));
		answers.add(new Answer("3. " + "resposta errada"));
		answers.add(new Answer("4. " + "resposta certa"));
		questions.add(new Question("pergunta pergunta pergunta pergunta?", answers, 3));
		
		answers.add(new Answer("1. " + "resposta certa"));
		answers.add(new Answer("2. " + "resposta errada"));
		answers.add(new Answer("3. " + "resposta errada"));
		answers.add(new Answer("4. " + "resposta errada"));
		questions.add(new Question("pergunta pergunta pergunta pergunta?", answers, 0));
		
		return questions;
	}
	private void sul() {
		List<State> states = new ArrayList<>();
		
		states.add(new State("Rio Grande do Sul", rs()));
		states.add(new State("Santa Catarina", sc()));
		states.add(new State("Paraná", pr()));
		
		regions.add(new Region("Sul", states));
	}
	
//	//SUDESTE
//	private List<Question> es() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> mg() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> sp() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> rj() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private void sudeste() {
//		List<State> states = new ArrayList<>();
//		
//		states.add(new State("Espírito Santo", es()));
//		states.add(new State("Minas Gerais", mg()));
//		states.add(new State("São Paulo", sp()));
//		states.add(new State("Rio de Janeiro", rj()));
//		
//		regions.add(new Region("Sudeste", states));
//	}
//
//	//CENTRO-OESTE
//	private List<Question> go() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> mt() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> ms() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> df() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private void centrooeste() {
//		List<State> states = new ArrayList<>();
//		
//		states.add(new State("Goiás", go()));
//		states.add(new State("Mato Grosso", mt()));
//		states.add(new State("Mato Grosso do Sul", ms()));
//		states.add(new State("Distrito Federal", df()));
//		
//		regions.add(new Region("Centro-Oeste", states));
//	}
//
//	//NORDESTE
//	private List<Question> al() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> bh() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> ce() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> ma() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> pb() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> pe() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> pi() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> rn() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> se() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private void nordeste() {
//		List<State> states = new ArrayList<>();
//		
//		states.add(new State("Goiás", al()));
//		states.add(new State("Mato Grosso", bh()));
//		states.add(new State("Mato Grosso do Sul", ce()));
//		states.add(new State("Distrito Federal", ma()));
//		states.add(new State("Goiás", pb()));
//		states.add(new State("Mato Grosso", pe()));
//		states.add(new State("Mato Grosso do Sul", pi()));
//		states.add(new State("Distrito Federal", rn()));
//		states.add(new State("Distrito Federal", se()));
//		
//		regions.add(new Region("Nordeste", states));
//	}
//
//	//NORTE
//	private List<Question> ac() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> ap() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> am() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> pa() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> ro() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> rr() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private List<Question> to() {
//		List<Question> questions = new ArrayList<>();
//		List<Answer> answers = new ArrayList<>();
//		
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		answers.add(new Answer("1. " + ""));
//		answers.add(new Answer("2. " + ""));
//		answers.add(new Answer("3. " + ""));
//		answers.add(new Answer("4. " + ""));
//		questions.add(new Question("", answers));
//		
//		return questions;
//	}
//	private void norte() {
//		List<State> states = new ArrayList<>();
//		
//		states.add(new State("Acre", ac()));
//		states.add(new State("Amapá", ap()));
//		states.add(new State("Amazonas", am()));
//		states.add(new State("Pará", pa()));
//		states.add(new State("Rondônia", ro()));
//		states.add(new State("Roraima", rr()));
//		states.add(new State("Tocantins", to()));
//		
//		regions.add(new Region("Norte", states));
//	}

	private void loadRegions() {
		sul();
//		sudeste();
//		centrooeste();
//		nordeste();
//		norte();
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}
	
}
