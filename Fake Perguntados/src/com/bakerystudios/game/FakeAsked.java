package com.bakerystudios.game;

import java.awt.Graphics;

import com.bakerystudios.game.questions.QuestionManager;
import com.bakerystudios.game.questions.Region;
import com.bakerystudios.tools.Renderable;
import com.bakerystudios.tools.Updateble;

public class FakeAsked implements Updateble, Renderable {
	
	private QuestionManager qm = new QuestionManager();
	
	private Region curRegion = new Region(null, null);

	@Override
	public void update() {
		
	}
	
	@Override
	public void render(Graphics g) {
		
	}
	
}
