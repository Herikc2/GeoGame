package com.bakerystudios.gui;

import java.awt.Graphics;

import com.bakerystudios.game.GameState;
import com.bakerystudios.gui.fps.FramesPerSecond;
import com.bakerystudios.gui.menu.MainMenu;
import com.bakerystudios.gui.menu.OptionMenu;
import com.bakerystudios.gui.menu.core.Menu;
import com.bakerystudios.gui.menu.core.MenuState;
import com.bakerystudios.tools.Renderable;
import com.bakerystudios.tools.Updateble;

public class UserInterface implements Renderable, Updateble {

	private FramesPerSecond fps;
	private Menu mainMenu;
	private Menu optionMenu;
	
	public UserInterface() {
		fps = new FramesPerSecond();
		mainMenu = new MainMenu();
		optionMenu = new OptionMenu();
	}
	
	@Override
	public void update() {
		fps.update();
		
		if(GameState.state == GameState.MENU) {
			if(MenuState.state == MenuState.MAIN) {
				mainMenu.update();
			} else if(MenuState.state == MenuState.OPTION) {
				optionMenu.update();
			} else if(MenuState.state == MenuState.IN_GAME_CONFIG) {
				//pauseMenu.update();
			}
		}
	}

	@Override
	public void render(Graphics g) {
		fps.render(g);
		
		if(GameState.state == GameState.MENU) {
			if(MenuState.state == MenuState.MAIN) {
				mainMenu.render(g);
			} else if(MenuState.state == MenuState.OPTION) {
				optionMenu.render(g);
			} else if(MenuState.state == MenuState.IN_GAME_CONFIG) {
				//pauseMenu.render(g);
			}
		}
	}

	public Menu getMainMenu() {
		return mainMenu;
	}

	public void setMainMenu(Menu mainMenu) {
		this.mainMenu = mainMenu;
	}

	public Menu getOptionMenu() {
		return optionMenu;
	}

	public void setOptionMenu(Menu optionMenu) {
		this.optionMenu = optionMenu;
	}
	
}
