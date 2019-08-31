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

	private Player player;

	private QuestionManager qm = new QuestionManager();
	private List<Sprite> backgrounds;

	private int state = 0;
	public boolean click = false, clicked = false;
	public int answer;

	private Region curRegion;
	private State curState;
	private Question curQuestion;
	private Sprite curBackground;

	private int selOp = 0;

	private List<Integer> coordenadasX = new ArrayList<>();
	private List<Integer> coordenadasY = new ArrayList<>();

	private int mx = 0, my = 0;

	int currentFrame = 0, maxFrame = 30;

	public FakeAsked() {
		backgrounds = new ArrayList<>();
		backgrounds.add(new Sprite("/sprites/background01.jpg"));
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
		//coordenadasX.add(266);
		//coordenadasX.add(533);
		//coordenadasY.add(219);
		coordenadasY.add(268);

		// Question 03 
		//coordenadasX.add(266); 
		//coordenadasX.add(533);
		//coordenadasY.add(219);
		//coordenadasY.add(268);

		// Question 04 
		//coordenadasX.add(266); 
		//coordenadasX.add(533);
		//coordenadasY.add(219);
		//coordenadasY.add(268);
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
			if ((mx > coordenadasX.get(i) && mx < coordenadasX.get(i + 1))
					&& (my > coordenadasY.get(i) && my < coordenadasY.get(i + 1))) {
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
			// curBackground = ;

			if (click) {
				if (correct()) {
					player.setScore(player.getScore() + 10);
				}
				click = false;
				state++;
			}
		} else if (state == 1) {
			curRegion = qm.getRegions().get(0);
			curState = curRegion.getStates().get(0);
			curQuestion = curState.getQuestions().get(1);
			// curBackground = ;

			if (click) {
				if (correct()) {
					player.setScore(player.getScore() + 10);
				}
				click = false;
				state++;
			}
		} else if (state == 2) {
			curRegion = qm.getRegions().get(0);
			curState = curRegion.getStates().get(0);
			curQuestion = curState.getQuestions().get(2);
			// curBackground = ;

			if (click) {
				if (correct()) {
					player.setScore(player.getScore() + 10);
				}
				click = false;
				state++;
			}
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

			s = (float) (s + ts1 * c2 * 1.7);
			g.setFont(f3);
			g.setColor(new Color(0, 0, 0, 80));
			fillCentralizedRect(g, (int) (s * 0.4), (int) (g.getFontMetrics().stringWidth(curQuestion.getText()) * 1.8),
					(int) (ts1 + ts2 * 3.2));
			g.setColor(Color.WHITE);
			Text.drawCentralizedText(g, "Região " + curRegion.getName(), (int) s);

			g.setFont(f1);
			s = (float) (s + ts2 * c1 * 0.8);
			Text.drawCentralizedText(g, curQuestion.getText(), (int) s);

			// aiusdfhguiaysgfosadeuilhfliuasd

			s = (float) (s + ts2 * c1 * 1.3);
			g.setFont(f2);
			g.setColor(new Color(0, 0, 0, 80));
			if (selOp == 0) {
				g.setColor(new Color(0, 0, 0, 80));
				fillCentralizedRect(g, (int) (s * 0.86),
						(int) (g.getFontMetrics().stringWidth(curQuestion.getAnswers().get(0).getText()) * 1.2),
						(int) (g.getFontMetrics().getHeight() * 1.2));
			}
			g.setColor(Color.WHITE);
			Text.drawCentralizedText(g, curQuestion.getAnswers().get(0).getText(), (int) s);
			s = (float) (s + ts2 * c1 * 0.8);
			if (selOp == 0) {
				g.setColor(new Color(0, 0, 0, 80));
				fillCentralizedRect(g, (int) (s * 0.86),
						(int) (g.getFontMetrics().stringWidth(curQuestion.getAnswers().get(1).getText()) * 1.2),
						(int) (g.getFontMetrics().getHeight() * 1.2));
			}
			g.setColor(Color.WHITE);
			Text.drawCentralizedText(g, curQuestion.getAnswers().get(1).getText(), (int) s);
			s = (float) (s + ts2 * c1 * 0.8);
			if (selOp == 0) {
				g.setColor(new Color(0, 0, 0, 80));
				fillCentralizedRect(g, (int) (s * 0.86),
						(int) (g.getFontMetrics().stringWidth(curQuestion.getAnswers().get(2).getText()) * 1.2),
						(int) (g.getFontMetrics().getHeight() * 1.2));
			}
			g.setColor(Color.WHITE);
			Text.drawCentralizedText(g, curQuestion.getAnswers().get(2).getText(), (int) s);
			s = (float) (s + ts2 * c1 * 0.8);
			if (selOp == 0) {
				g.setColor(new Color(0, 0, 0, 80));
				fillCentralizedRect(g, (int) (s * 0.86),
						(int) (g.getFontMetrics().stringWidth(curQuestion.getAnswers().get(3).getText()) * 1.2),
						(int) (g.getFontMetrics().getHeight() * 1.2));
			}

			g.setColor(Color.WHITE);
			s = (float) (s + ts2 * c1 * 0.8);
			Text.drawCentralizedText(g, curQuestion.getAnswers().get(3).getText(), (int) s);
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
		System.out.println("x: " + mx);
		System.out.println("y: " + my);
	}

}
