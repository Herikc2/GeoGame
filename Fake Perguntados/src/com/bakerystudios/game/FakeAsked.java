package com.bakerystudios.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import com.bakerystudios.game.questions.Answer;
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
	
	private Player player;
	
	private QuestionManager qm = new QuestionManager();
	private List<Sprite> backgrounds;
	
	private int state = 0;
	public boolean click;
	public int answer;
	
	private Region curRegion;
	private State curState;
	private Question curQuestion;
	private Sprite curBackground;
	
	private int selOp = 0;
	
	public FakeAsked() {
		backgrounds = new ArrayList<>();
		backgrounds.add(new Sprite("/sprites/background01.jpg"));
		curBackground = backgrounds.get(0);
		
		List<State> states = new ArrayList<>();
		List<Question> questions = new ArrayList<>();
		List<Answer> answers = new ArrayList<>();
		answers.add(new Answer("Joinville"));
		answers.add(new Answer("Florianópolis"));
		answers.add(new Answer("Blumenau"));
		answers.add(new Answer("Balneário Camboriú"));
		questions.add(new Question("Qual é a capital de Santa Catarina?", answers, 1));
		states.add(new State("Santa Catarina", questions));
		curRegion = new Region("Sul", states);
		curState = curRegion.getStates().get(0);
		curQuestion = curState.getQuestions().get(0);
	}
	
	private boolean correct() {
		return answer == curQuestion.getCorrectIndex();
	}
	
	protected void fillCentralizedRect(Graphics g, int y, int width, int height) {
		g.fillRect(Screen.WIDTH / 2 - width / 2, y, width, height);
	}

	@Override
	public void update() {
		if(state == 0) {
			curRegion = qm.getRegions().get(0);
			curState = curRegion.getStates().get(0);
			curQuestion = curState.getQuestions().get(0);
			//curBackground = ;
			
			if(click) {
				if(correct()) {
					player.setScore(player.getScore() + 10);
				}
				click = false;
				state++;
			}
		} else if(state == 1) {
			curRegion = qm.getRegions().get(0);
			curState = curRegion.getStates().get(0);
			curQuestion = curState.getQuestions().get(1);
			//curBackground = ;
			
			if(click) {
				if(correct()) {
					player.setScore(player.getScore() + 10);
				}
				click = false;
				state++;
			}
		} else if(state == 2) {
			curRegion = qm.getRegions().get(0);
			curState = curRegion.getStates().get(0);
			curQuestion = curState.getQuestions().get(2);
			//curBackground = ;
			
			if(click) {
				if(correct()) {
					player.setScore(player.getScore() + 10);
				}
				click = false;
				state++;
			}
		}
	}
	
	@Override
	public void render(Graphics g) {
		if(GameState.state == GameState.PLAYING) {
			float s = 0;
			int ts1 = 35;
			int ts2 = 30;
			float c1 = (float) 2.5;
			float c2 = (float) 1.2;
			Font f1 = new Font("Arial", Font.PLAIN, ts1);
			Font f2 = new Font("Arial", Font.PLAIN, ts2);
			Font f3 = new Font("Arial", Font.PLAIN, 22);
			
			g.drawImage(curBackground.getSprite(), 0, 0, null);

			s = (float) (s + ts1 * c2 * 1.7);
			g.setFont(f3);
			g.setColor(new Color(0, 0, 0, 80));
			fillCentralizedRect(g, (int) (s * 0.4), (int) (g.getFontMetrics().stringWidth(curQuestion.getText()) * 1.8), (int) (ts1 + ts2 * 3.2));
			g.setColor(Color.WHITE);
			Text.drawCentralizedText(g, "Região " + curRegion.getName(), (int) s);

			g.setFont(f1);
			s = (float) (s + ts2 * c1 * 0.8);
			Text.drawCentralizedText(g, curQuestion.getText(), (int) s);

			//aiusdfhguiaysgfosadeuilhfliuasd

			s = (float) (s + ts2 * c1 * 1.3);
			g.setFont(f2);
			g.setColor(new Color(0, 0, 0, 80));
			if(selOp == 0) {
				fillCentralizedRect(g, (int) (s * 0.86), (int) (g.getFontMetrics().stringWidth(curQuestion.getAnswers().get(0).getText()) * 1.2), (int) (g.getFontMetrics().getHeight() * 1.2));
			} else if(selOp == 1) {
				fillCentralizedRect(g, (int) (s * 0.86), (int) (g.getFontMetrics().stringWidth(curQuestion.getAnswers().get(0).getText()) * 1.2), (int) (g.getFontMetrics().getHeight() * 1.2));
			} else if(selOp == 2) {
				fillCentralizedRect(g, (int) (s * 0.86), (int) (g.getFontMetrics().stringWidth(curQuestion.getAnswers().get(0).getText()) * 1.2), (int) (g.getFontMetrics().getHeight() * 1.2));
			} else if(selOp == 3) {
				fillCentralizedRect(g, (int) (s * 0.86), (int) (g.getFontMetrics().stringWidth(curQuestion.getAnswers().get(0).getText()) * 1.2), (int) (g.getFontMetrics().getHeight() * 1.2));
			}
			
			g.setColor(Color.WHITE);
			Text.drawCentralizedText(g, curQuestion.getAnswers().get(0).getText(), (int) s);
			s = (float) (s + ts2 * c1 * 0.8);
			Text.drawCentralizedText(g, curQuestion.getAnswers().get(1).getText(), (int) s);
			s = (float) (s + ts2 * c1 * 0.8);
			Text.drawCentralizedText(g, curQuestion.getAnswers().get(2).getText(), (int) s);
			s = (float) (s + ts2 * c1 * 0.8);
			Text.drawCentralizedText(g, curQuestion.getAnswers().get(3).getText(), (int) s);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
