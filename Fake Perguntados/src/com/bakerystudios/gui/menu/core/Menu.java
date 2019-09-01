package com.bakerystudios.gui.menu.core;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import com.bakerystudios.game.Game;
import com.bakerystudios.game.GameState;
import com.bakerystudios.game.Screen;
import com.bakerystudios.tools.InputListener;
import com.bakerystudios.tools.OptionManager;
import com.bakerystudios.tools.Renderable;
import com.bakerystudios.tools.Sprite;
import com.bakerystudios.tools.Updateble;

public abstract class Menu extends InputListener implements Renderable, Updateble {

	protected OptionManager option = new OptionManager(4);

	protected static boolean up, down, enter;

	protected boolean pause = false;

	private Sprite background;

	public Menu() {
		background = new Sprite("/sprites/background01.jpg");
	}

	public abstract void executeOption();

	@Override
	public void update() {
		if (up) {
			Game.audio.playSelect();
			up = false;
			option.previousOption();
		}
		if (down) {
			Game.audio.playSelect();
			down = false;
			option.nextOption();
		}
		if (enter) {
			Game.audio.playSelect();
			enter = false;
			executeOption();
			option.firstOption();
		}
	}

	protected void drawCentralizedString(Graphics g, String str, int y) {
		g.drawString(str, Screen.WIDTH / 2 - g.getFontMetrics().stringWidth(str) / 2, y);
	}

	protected void fillCentralizedRect(Graphics g, int y, int width, int height) {
		g.fillRect(Screen.WIDTH / 2 - width / 2, y, width, height);
	}

	@Override
	public void render(Graphics g) {
		int y = (int) (Screen.WIDTH * 0.16);
		g.drawImage(background.getSprite(), 0, 0, null);

		g.setColor(Color.WHITE);
		g.setFont(new Font("arial", Font.BOLD, (int) (Screen.WIDTH * 0.07)));

		// GAME TITLE ----------------------------------------------------------
		drawCentralizedString(g, "FAKE PERGUNTADOS", y);
		y += g.getFontMetrics().getHeight() * 2.0;

		// MENU OPTIONS ----------------------------------------------------------
		g.setColor(Color.WHITE);
		g.setFont(new Font("arial", Font.BOLD, (int) (Screen.WIDTH * 0.05)));

		for (int i = 0; i < option.optionAmount(); i++) {
			String name = option.getOption(i).getName();
			int fontHeight = g.getFontMetrics().getHeight();
			if (option.getCurOption() == option.getOption(i)) {
				int fontWidth = g.getFontMetrics().stringWidth(name);
				g.setColor(new Color(0, 0, 0, 80));
				fillCentralizedRect(g, y - (int) (fontHeight * 0.85), (int) (fontWidth * 1.1),
						(int) (fontHeight * 1.1));
			}
			g.setColor(Color.WHITE);
			drawCentralizedString(g, name, y);
			y += fontHeight * 1.5;
		}
		g.setFont(new Font("Arial", Font.PLAIN, 25));
		drawCentralizedString(g, "Equipe: Carlos, Herikc, Caio, Cristiano, Alexandro e Eduardo", 550);
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
			if (GameState.state == GameState.MENU) {
				Menu.setUp(true);
			}
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
			if (GameState.state == GameState.MENU) {
				Menu.setDown(true);
			}
		}

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (GameState.state == GameState.MENU) {
				Menu.setEnter(true);
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
			if (GameState.state == GameState.MENU) {
				Menu.setUp(false);
			}
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
			if (GameState.state == GameState.MENU) {
				Menu.setDown(false);
			}
		}

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (GameState.state == GameState.MENU) {
				Menu.setEnter(false);
			}
		}
	}

	public static boolean isUp() {
		return up;
	}

	public static void setUp(boolean up) {
		Menu.up = up;
	}

	public static boolean isDown() {
		return down;
	}

	public static void setDown(boolean down) {
		Menu.down = down;
	}

	public static boolean isEnter() {
		return enter;
	}

	public static void setEnter(boolean enter) {
		Menu.enter = enter;
	}

}
