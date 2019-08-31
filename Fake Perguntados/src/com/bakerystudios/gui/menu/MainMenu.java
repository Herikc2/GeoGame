package com.bakerystudios.gui.menu;

import com.bakerystudios.game.GameState;
import com.bakerystudios.gui.menu.core.Menu;
import com.bakerystudios.gui.menu.core.MenuOption;
import com.bakerystudios.gui.menu.core.MenuState;

public class MainMenu extends Menu {

	public MainMenu() {
		option.addOption(new MenuOption("NOVO JOGO"));
		option.addOption(new MenuOption("SCORES"));
		option.addOption(new MenuOption("OPÇÕES"));
		option.addOption(new MenuOption("SAIR"));
		option.firstOption();
	}

	@Override
	public void executeOption() {
		if(option.getCurOption() == option.getOption(0)) {
			// NEW GAME
			GameState.state = GameState.PLAYING;
		} else if(option.getCurOption() == option.getOption(1)) {
			// LOAD
		} else if(option.getCurOption() == option.getOption(2)) {
			// OPTIONS
			MenuState.state = MenuState.OPTION;
		} else if(option.getCurOption() == option.getOption(3)) {
			// EXIT
			System.exit(0);
		}
	}

}
