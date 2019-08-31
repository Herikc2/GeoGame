package com.bakerystudios.gui;

import java.awt.Graphics;

import com.bakerystudios.tools.Renderable;
import com.bakerystudios.tools.Updateble;

public class GraphicUserInterface implements Renderable, Updateble {

	private UserInterface ui;
	private HeadsUpDisplay hud;
	
	public GraphicUserInterface() {
		ui = new UserInterface();
		hud = new HeadsUpDisplay();
	}
	
	@Override
	public void update() {
		ui.update();
		hud.update();
	}

	@Override
	public void render(Graphics g) {
		ui.render(g);
		hud.render(g);
	}

	public UserInterface getUi() {
		return ui;
	}

	public void setUi(UserInterface ui) {
		this.ui = ui;
	}

	public HeadsUpDisplay getHud() {
		return hud;
	}

	public void setHud(HeadsUpDisplay hud) {
		this.hud = hud;
	}

}
