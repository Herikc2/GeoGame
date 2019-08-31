package com.bakerystudios.gui.menu;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import com.bakerystudios.game.Game;
import com.bakerystudios.game.GameState;
import com.bakerystudios.gui.menu.core.Menu;
import com.bakerystudios.gui.menu.core.MenuOption;
import com.bakerystudios.gui.menu.core.MenuState;

public class MainMenu extends Menu {

	private List<Integer> coordenadasX = new ArrayList<>();
	private List<Integer> coordenadasY = new ArrayList<>();

	private int mx = 0, my = 0;
	private boolean clicked = false;

	int currentFrame = 0, maxFrame = 30;

	public MainMenu() {
		option.addOption(new MenuOption("NOVO JOGO"));
		option.addOption(new MenuOption("SCORES"));
		option.addOption(new MenuOption("OPÇÕES"));
		option.addOption(new MenuOption("SAIR"));
		option.firstOption();

		// Novo Jogo Coordenadas
		coordenadasX.add(266);
		coordenadasX.add(533);
		coordenadasY.add(219);
		coordenadasY.add(268);

		// Scores Coordenadas
		coordenadasX.add(306);
		coordenadasX.add(494);
		coordenadasY.add(288);
		coordenadasY.add(337);

		// OPÇÕES Coordenadas
		coordenadasX.add(306);
		coordenadasX.add(494);
		coordenadasY.add(359);
		coordenadasY.add(408);

		// SAIR Coordenadas
		coordenadasX.add(358);
		coordenadasX.add(451);
		coordenadasY.add(429);
		coordenadasY.add(477);
	}

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

		currentFrame++;
		int j = 0;
		for (int i = 0; i < coordenadasX.size(); i += 2, j++)
			if ((mx > coordenadasX.get(i) && mx < coordenadasX.get(i + 1))
					&& (my > coordenadasY.get(i) && my < coordenadasY.get(i + 1))) {
				option.setCurOption(option.getOption(j));
				if (clicked) {
					clicked = false;
					if (currentFrame > maxFrame) {
						enter = true;
						currentFrame = 0;
					}
				}				
			}
	}

	@Override
	public void executeOption() {
		if (option.getCurOption() == option.getOption(0)) {
			// NEW GAME
			GameState.state = GameState.PLAYING;
		} else if (option.getCurOption() == option.getOption(1)) {
			// LOAD
		} else if (option.getCurOption() == option.getOption(2)) {
			// OPTIONS
			MenuState.state = MenuState.OPTION;
		} else if (option.getCurOption() == option.getOption(3)) {
			// EXIT
			System.exit(0);
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
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		clicked = false;
		mx = e.getX();
		my = e.getY();
	}

}
