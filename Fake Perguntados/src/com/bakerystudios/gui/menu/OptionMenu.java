package com.bakerystudios.gui.menu;

import java.awt.event.KeyEvent;

import com.bakerystudios.game.Game;
import com.bakerystudios.game.GameState;
import com.bakerystudios.gui.menu.core.Menu;
import com.bakerystudios.gui.menu.core.MenuOption;
import com.bakerystudios.gui.menu.core.MenuState;

public class OptionMenu extends Menu {
	
	private boolean right, left;

	public OptionMenu() {
		option.addOption(new MenuOption("MÚSICA: < LIGADO >"));
		option.addOption(new MenuOption("SOM: < LIGADO >"));
		option.addOption(new MenuOption("VOLTAR"));
	}

	@Override
	public void executeOption() {
		if(option.getCurOption() == option.getOption(0)) {
			// MUSIC
			if(Game.audio.music == true) {
				Game.audio.music = false;
				option.getOption(0).setName("MÚSICA: < DESLIGADO >");
			} else {
				Game.audio.music = true;
				option.getOption(0).setName("MÚSICA: < LIGADO >");
			}
		} else if(option.getCurOption() == option.getOption(1)) {
			// SOUND
			if(Game.audio.sound == true) {
				Game.audio.sound = false;
				option.getOption(1).setName("SOM: < DESLIGADO >");
			} else {
				Game.audio.sound = true;
				option.getOption(1).setName("SOM: < LIGADO >");
			}
		} else if(option.getCurOption() == option.getOption(2)) {
			// BACK
			MenuState.state = MenuState.MAIN;
			option.firstOption();
		}
	}
	
	@Override
	public void update() {
		if(right) {
			Game.audio.playSelect();
			right = false;
			executeOption();
		}
		if(left) {
			Game.audio.playSelect();
			left = false;
			executeOption();
		}
		if(up) {
			Game.audio.playSelect();
			up = false;
			option.previousOption();
		}
		if(down) {
			Game.audio.playSelect();
			down = false;
			option.nextOption();
		}
		if(enter) {
			Game.audio.playSelect();
			enter = false;
			executeOption();
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
			if(GameState.state == GameState.MENU && MenuState.state == MenuState.OPTION) {
				this.right = true;
			}
		} else if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
			if(GameState.state == GameState.MENU && MenuState.state == MenuState.OPTION) {
				this.left = true;
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
			if(GameState.state == GameState.MENU) {
				Menu.setUp(true);
			}
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
			if(GameState.state == GameState.MENU) {
				Menu.setDown(true);
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			if(GameState.state == GameState.MENU) {
				Menu.setEnter(true);
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
			if(GameState.state == GameState.MENU && MenuState.state == MenuState.OPTION) {
				this.right = false;
			}
		} else if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
			if(GameState.state == GameState.MENU && MenuState.state == MenuState.OPTION) {
				this.left = false;
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
			if(GameState.state == GameState.MENU) {
				Menu.setUp(false);
			}
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
			if(GameState.state == GameState.MENU) {
				Menu.setDown(false);
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			if(GameState.state == GameState.MENU) {
				Menu.setEnter(false);
			}
		}
	}

}