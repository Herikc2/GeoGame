package com.bakerystudios.gui.fps;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.bakerystudios.game.Screen;
import com.bakerystudios.tools.Renderable;
import com.bakerystudios.tools.Updateble;

public class FramesPerSecond implements Renderable, Updateble {

	private String FPS = "00";
	private int frames = 0;
	private double timer;
	
	public FramesPerSecond() {
		timer = System.currentTimeMillis();
	}

	@Override
	public void update(){
		frames++;
		if(System.currentTimeMillis() - timer >= 1000) {
			FPS = Integer.toString(frames);
			frames = 0;
			timer += 1000;
		}
	}

	@Override
	public void render(Graphics g){
		g.setColor(Color.YELLOW);
		g.setFont(new Font("Arial", Font.PLAIN, (int) (Screen.WIDTH * 0.019)));
		g.drawString(FPS, Screen.WIDTH - (int) (Screen.WIDTH * 0.025), (int) (Screen.WIDTH * 0.019));
	}
	
}
