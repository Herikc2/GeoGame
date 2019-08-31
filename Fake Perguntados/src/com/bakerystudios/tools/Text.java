package com.bakerystudios.tools;

import java.awt.Graphics;

import com.bakerystudios.game.Screen;

public class Text {

	public static void drawCentralizedText(Graphics g, String str, int y) {
		g.drawString(str, g.getFontMetrics().stringWidth(str) / 2 - Screen.WIDTH / 2, y);
	}
	
}
