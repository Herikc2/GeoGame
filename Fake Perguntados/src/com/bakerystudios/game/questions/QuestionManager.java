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
		answers.add(new Answer("1. " + "Curitiba"));
		answers.add(new Answer("2. " + "Florianópolis"));
		answers.add(new Answer("3. " + "Porto Alegre"));
		answers.add(new Answer("4. " + "São Paulo"));
		questions.add(new Question("Qual é a capital do Rio Grande do Sul?", answers, 2));

		List<Answer> answers1 = new ArrayList<>();
		answers1.add(new Answer("1. " + "Tropical"));
		answers1.add(new Answer("2. " + "Amazônia"));
		answers1.add(new Answer("3. " + "Cerrado"));
		answers1.add(new Answer("4. " + "Pampa"));
		questions.add(new Question("Qual é o bioma do Rio Grande do Sul?", answers1, 3));

		List<Answer> answers2 = new ArrayList<>();
		answers2.add(new Answer("1. " + "Matambre Recheado"));
		answers2.add(new Answer("2. " + "Bolo de Rolo"));
		answers2.add(new Answer("3. " + "Arroz Boliviano"));
		answers2.add(new Answer("4. " + "Muma de Siri"));
		questions.add(new Question("Qual é a comida típica do Rio Grande do Sul?", answers2, 0));
		
		return questions;
	}
	private List<Question> sc() {
		List<Question> questions = new ArrayList<>();

		List<Answer> answers = new ArrayList<>();
		answers.add(new Answer("1. " + "Rio Branco"));
		answers.add(new Answer("2. " + "Maceió"));
		answers.add(new Answer("3. " + "Florianópolis"));
		answers.add(new Answer("4. " + "Fortaleza"));
		questions.add(new Question("Qual é a capital de Santa Catarina?", answers, 2));

		List<Answer> answers1 = new ArrayList<>();
		answers1.add(new Answer("1. " + "Cerrado"));
		answers1.add(new Answer("2. " + "Semi-árido"));
		answers1.add(new Answer("3. " + "Caatinga"));
		answers1.add(new Answer("4. " + "Mata Atlântica"));
		questions.add(new Question("Qual é o bioma de Santa Catarina?", answers1, 3));

		List<Answer> answers2 = new ArrayList<>();
		answers2.add(new Answer("1. " + "Pastel de Berbigão"));
		answers2.add(new Answer("2. " + "Acarajé"));
		answers2.add(new Answer("3. " + "Feijão tropeiro"));
		answers2.add(new Answer("4. " + "Virado Paulista"));
		questions.add(new Question("Qual é a comida típica de Santa Catarina?", answers2, 0));
		
		return questions;
	}
	private List<Question> pr() {
		List<Question> questions = new ArrayList<>();

		List<Answer> answers = new ArrayList<>();
		answers.add(new Answer("1. " + "Porto Velho"));
		answers.add(new Answer("2. " + "Manaus"));
		answers.add(new Answer("3. " + "Curitiba"));
		answers.add(new Answer("4. " + "Macapá"));
		questions.add(new Question("Qual é a capital do Paraná?", answers, 2));

		List<Answer> answers1 = new ArrayList<>();
		answers1.add(new Answer("1. " + "Pampa"));
		answers1.add(new Answer("2. " + "Amazônia"));
		answers1.add(new Answer("3. " + "Tropical"));
		answers1.add(new Answer("4. " + "Mata Atlântica"));
		questions.add(new Question("Qual é o bioma do Paraná?", answers1, 3));

		List<Answer> answers2 = new ArrayList<>();
		answers2.add(new Answer("1. " + "Barreado"));
		answers2.add(new Answer("2. " + "Vatapá"));
		answers2.add(new Answer("3. " + "Chambari"));
		answers2.add(new Answer("4. " + "Furrundu"));
		questions.add(new Question("Qual é a comida típica do Paraná?", answers2, 0));
		
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
