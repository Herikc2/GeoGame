package com.bakerystudios.tools;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {

	private BufferedImage sprite;
	
	public Sprite(String path)
	{
		try {
			setSprite(ImageIO.read(getClass().getResource(path)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public BufferedImage getSprite() {return sprite;}
	public void setSprite(BufferedImage sprite) {this.sprite = sprite;}
}
