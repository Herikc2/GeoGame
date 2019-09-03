package com.bakerystudios.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import com.bakerystudios.game.questions.Question;
import com.bakerystudios.game.questions.QuestionManager;
import com.bakerystudios.game.questions.Region;
import com.bakerystudios.game.questions.State;
import com.bakerystudios.tools.InputListener;
import com.bakerystudios.tools.Renderable;
import com.bakerystudios.tools.Sprite;
import com.bakerystudios.tools.Text;
import com.bakerystudios.tools.Updateble;

public class FakeAsked extends InputListener implements Updateble, Renderable {

	private Player player = new Player(null);

	private QuestionManager qm = new QuestionManager();
	private List<Sprite> backgrounds;

	private int state = 0;
	public boolean click = false, clicked = false;
	public int answer;
	
	private boolean correct, wrong;

	private Region curRegion;
	private State curState;
	private Question curQuestion;
	private Sprite curBackground;

	private int selOp = 0;

	private List<Integer> coordenadasX = new ArrayList<>();
	private List<Integer> coordenadasY = new ArrayList<>();

	private int mx = 0, my = 0;

	int currentFrame = 0, maxFrame = 30;
	
	int currentFrame2 = 0, maxFrame2 = 120;

	private boolean end = false;

	private int currentFrame3 = 0;
	private int maxFrame3 = 600;

	public FakeAsked() {
		backgrounds = new ArrayList<>();
		backgrounds.add(new Sprite("/sprites/santacatarina.png"));
		backgrounds.add(new Sprite("/sprites/parana.png"));
		backgrounds.add(new Sprite("/sprites/riosul.png"));
		curBackground = backgrounds.get(0);

		curRegion = qm.getRegions().get(0);
		curState = curRegion.getStates().get(0);
		curQuestion = curState.getQuestions().get(1);

		// Question 01
		coordenadasX.add(258);
		coordenadasX.add(541);
		coordenadasY.add(195);
		coordenadasY.add(236);

		// Question 02
		coordenadasX.add(258);
		coordenadasX.add(541);
		coordenadasY.add(275);
		coordenadasY.add(316);

		// Question 03 
		coordenadasX.add(258);
		coordenadasX.add(541);
		coordenadasY.add(355);
		coordenadasY.add(396);

		// Question 04 
		coordenadasX.add(258);
		coordenadasX.add(541);
		coordenadasY.add(435);
		coordenadasY.add(476);
	}

	private boolean correct() {
		return answer == curQuestion.getCorrectIndex();
	}

	protected void fillCentralizedRect(Graphics g, int y, int width, int height) {
		g.fillRect(Screen.WIDTH / 2 - width / 2, y, width, height);
	}

	@Override
	public void update() {
		currentFrame++;
		int j = 0;
		for (int i = 0; i < coordenadasX.size(); i += 2, j++)
			if ((mx > coordenadasX.get(i) && mx < coordenadasX.get(i + 1)) && 
				(my > coordenadasY.get(i) && my < coordenadasY.get(i + 1))) {
				selOp = j;
				if (clicked) {
					clicked = false;
					if (currentFrame > maxFrame) {
						click = true;
						answer = j;
						currentFrame = 0;
					}
				}
			}

		if (state == 0) {
			curRegion = qm.getRegions().get(0);
			curState = curRegion.getStates().get(0);
			curQuestion = curState.getQuestions().get(0);
			curBackground = backgrounds.get(2);
		} else if (state == 1) {
			curState = curRegion.getStates().get(0);
			curQuestion = curState.getQuestions().get(1);
		} else if (state == 2) {
			curState = curRegion.getStates().get(0);
			curQuestion = curState.getQuestions().get(2);
		} else if (state == 3) {
			curState = curRegion.getStates().get(1);
			curQuestion = curState.getQuestions().get(0);
			curBackground = backgrounds.get(0);
		} else if (state == 4) {
			curState = curRegion.getStates().get(1);
			curQuestion = curState.getQuestions().get(1);
		} else if (state == 5) {
			curState = curRegion.getStates().get(1);
			curQuestion = curState.getQuestions().get(2);
		} else if (state == 6) {
			curState = curRegion.getStates().get(2);
			curQuestion = curState.getQuestions().get(0);
			curBackground = backgrounds.get(1);
		} else if (state == 7) {
			curRegion = qm.getRegions().get(0);
			curState = curRegion.getStates().get(2);
			curQuestion = curState.getQuestions().get(1);
		} else if (state == 8) {
			curState = curRegion.getStates().get(2);
			curQuestion = curState.getQuestions().get(2);
		} else if (state == 9) {
			end = true;
		}
		
		if (click) {
			if (correct()) {
				player.setScore(player.getScore() + 1);
				correct = true;
			} else {
				wrong = true;
			}
			click = false;
			state++;
		}
	}

	@Override
	public void render(Graphics g) {
		if (GameState.state == GameState.PLAYING) {
			float s = 0;
			int ts1 = 35;
			int ts2 = 30;
			float c1 = (float) 2.5;
			float c2 = (float) 1.2;
			Font f1 = new Font("Arial", Font.PLAIN, ts1);
			Font f2 = new Font("Arial", Font.PLAIN, ts2);
			Font f3 = new Font("Arial", Font.PLAIN, 22);

			g.drawImage(curBackground.getSprite(), 0, 0, null);
			
			if(end) {
				g.setFont(f1);
				g.setColor(new Color(0, 0, 0, 80));
				fillCentralizedRect(g, 260, 600, 100);
				g.setColor(Color.WHITE);
				Text.drawCentralizedText(g, "Parabéns, você completou o desafio.", 260 + ts1);
				Text.drawCentralizedText(g, "Você acertou " + player.getScore() + " perguntas.", 310 + ts1);
				
				currentFrame3++;
				if(currentFrame3 >= maxFrame3) {
					GameState.state = GameState.MENU;
					Game.newGame = true;
				}
			} else {
				if(!correct && !wrong) {
	
					s = (float) (s + ts1 * c2 * 1.7);
					g.setFont(f3);
					g.setColor(new Color(0, 0, 0, 80));
					fillCentralizedRect(g, (int) (s * 0.4), (int) (g.getFontMetrics().stringWidth(curQuestion.getText()) * 1.8), (int) (ts1 + ts2 * 3.2));
					g.setColor(Color.WHITE);
					Text.drawCentralizedText(g, "Região " + curRegion.getName(), (int) s);
	
					g.setFont(f1);
					s = (float) (s + ts2 * c1 * 0.8);
					Text.drawCentralizedText(g, curQuestion.getText(), (int) s);
	
					
					// respostas
					g.setFont(f2);
					if (selOp == 0) {
						g.setColor(new Color(0, 0, 0, 80));
						fillCentralizedRect(g, 195, 283, 41);
					}
					g.setColor(Color.WHITE);
					Text.drawCentralizedText(g, curQuestion.getAnswers().get(0).getText(), 195 + ts2);
					
					if (selOp == 1) {
						g.setColor(new Color(0, 0, 0, 80));
						fillCentralizedRect(g, 275, 283, 41);
					}
					g.setColor(Color.WHITE);
					Text.drawCentralizedText(g, curQuestion.getAnswers().get(1).getText(), 275 + ts2);
					
					if (selOp == 2) {
						g.setColor(new Color(0, 0, 0, 80));
						fillCentralizedRect(g, 355, 283, 41);
					}
					g.setColor(Color.WHITE);
					Text.drawCentralizedText(g, curQuestion.getAnswers().get(2).getText(), 355 + ts2);
	
					if (selOp == 3) {
						g.setColor(new Color(0, 0, 0, 80));
						fillCentralizedRect(g, 435, 283, 41);
					}
					g.setColor(Color.WHITE);
					Text.drawCentralizedText(g, curQuestion.getAnswers().get(3).getText(), 435 + ts2);
					
				} else if(correct) {
					g.setFont(f1);
					g.setColor(new Color(0, 0, 0, 80));
					fillCentralizedRect(g, 280, 250, 41);
					g.setColor(Color.WHITE);
					Text.drawCentralizedText(g, "CORRETO", 280 + ts1);
					
					currentFrame2++;
					if(currentFrame2 >= maxFrame2) {
						currentFrame2=0;
						correct = false;
					}
				} else if(wrong) {
					g.setFont(f1);
					g.setColor(new Color(0, 0, 0, 80));
					fillCentralizedRect(g, 280, 250, 41);
					g.setColor(Color.WHITE);
					Text.drawCentralizedText(g, "ERRADO", 280 + ts1);
					
					currentFrame2++;
					if(currentFrame2 >= maxFrame2) {
						currentFrame2=0;
						wrong = false;
					}
				}
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		clicked = true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		clicked = false;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		clicked = false;
		mx = e.getX();
		my = e.getY();
//		System.out.println("x: " + mx);
//		System.out.println("y: " + my);
	}

}
