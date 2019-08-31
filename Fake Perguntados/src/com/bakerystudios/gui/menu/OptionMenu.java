package com.bakerystudios.gui.menu;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import com.bakerystudios.game.Game;
import com.bakerystudios.game.GameState;
import com.bakerystudios.gui.menu.core.Menu;
import com.bakerystudios.gui.menu.core.MenuOption;
import com.bakerystudios.gui.menu.core.MenuState;

public class OptionMenu extends Menu {

	private boolean right, left;

	private List<Integer> coordenadasX = new ArrayList<>();
	private List<Integer> coordenadasY = new ArrayList<>();

	private int mx = 0, my = 0;
	private boolean clicked = false;
	
	int currentFrame = 0, maxFrame = 30;

	public OptionMenu() {
		option.addOption(new MenuOption("MÚSICA: < LIGADO >"));
		option.addOption(new MenuOption("SOM: < LIGADO >"));
		option.addOption(new MenuOption("VOLTAR"));

		// MÚSICA Coordenadas
		coordenadasX.add(180);
		coordenadasX.add(619);
		coordenadasY.add(220);
		coordenadasY.add(270);

		// SOM Coordenadas
		coordenadasX.add(170);
		coordenadasX.add(629);
		coordenadasY.add(290);
		coordenadasY.add(338);

		// VOLTAR Coordenadas
		coordenadasX.add(311);
		coordenadasX.add(486);
		coordenadasY.add(357);
		coordenadasY.add(408);
	}

	@Override
	public void executeOption() {
		if (option.getCurOption() == option.getOption(0)) {
			// MUSIC
			if (Game.audio.music == true) {
				Game.audio.music = false;
				option.getOption(0).setName("MÚSICA: < DESLIGADO >");
			} else {
				Game.audio.music = true;
				option.getOption(0).setName("MÚSICA: < LIGADO >");
			}
		} else if (option.getCurOption() == option.getOption(1)) {
			// SOUND
			if (Game.audio.sound == true) {
				Game.audio.sound = false;
				option.getOption(1).setName("SOM: < DESLIGADO >");
			} else {
				Game.audio.sound = true;
				option.getOption(1).setName("SOM: < LIGADO >");
			}
		} else if (option.getCurOption() == option.getOption(2)) {
			// BACK
			MenuState.state = MenuState.MAIN;
			option.firstOption();
		}
	}

	@Override
	public void update() {
		if (right) {
			Game.audio.playSelect();
			right = false;
			executeOption();
		}
		if (left) {
			Game.audio.playSelect();
			left = false;
			executeOption();
		}
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
		}
		
		currentFrame++;
		int j = 0;
		for (int i = 0; i < coordenadasX.size(); i += 2, j++)
			if ((mx > coordenadasX.get(i) && mx < coordenadasX.get(i + 1))
					&& (my > coordenadasY.get(i) && my < coordenadasY.get(i + 1))) {
				option.setCurOption(option.getOption(j));
				if (clicked) {				
					clicked = false;
					if(currentFrame > maxFrame) {
						enter = true;
						currentFrame = 0;
					}					
				}
			}
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
			if (GameState.state == GameState.MENU && MenuState.state == MenuState.OPTION) {
				this.right = true;
			}
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
			if (GameState.state == GameState.MENU && MenuState.state == MenuState.OPTION) {
				this.left = true;
			}
		}

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

		if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
			if (GameState.state == GameState.MENU && MenuState.state == MenuState.OPTION) {
				this.right = false;
			}
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
			if (GameState.state == GameState.MENU && MenuState.state == MenuState.OPTION) {
				this.left = false;
			}
		}

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
	}

	@Override
	public void mouseDragged(MouseEvent e) {

	}

}