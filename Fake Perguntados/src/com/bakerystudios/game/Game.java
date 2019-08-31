package com.bakerystudios.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.bakerystudios.gui.GraphicUserInterface;
import com.bakerystudios.sound.AudioManager;
import com.bakerystudios.tools.InputListener;
import com.bakerystudios.tools.Renderable;
import com.bakerystudios.tools.Updateble;

public class Game implements Runnable, Renderable, Updateble {

	private boolean isRunning;
	
	private Thread thread;
	private Screen screen;
	private List<InputListener> inputs = new ArrayList<>();

	public static Random rand;

	private BufferedImage frame;
	private GraphicUserInterface gui;
	public static AudioManager audio;
	
	private FakeAsked fa;
	
	public Game(){
		// Object instantiation
		gui = new GraphicUserInterface();
		inputs = new ArrayList<>();
		inputs.add(gui.getUi().getMainMenu());
		inputs.add(gui.getUi().getOptionMenu());
		screen = new Screen(inputs);
		rand = new Random();
		frame = new BufferedImage(Screen.WIDTH, Screen.HEIGHT, BufferedImage.TYPE_INT_RGB);
		audio = new AudioManager();
	}
	
	public synchronized void start(){
		thread = new Thread(this);
		isRunning = true;
		thread.start();
	}
	
	public synchronized void stop(){
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(){
		gui.update();
		audio.update();
		
		if(GameState.state == GameState.PLAYING) {
			
		} else if(GameState.state == GameState.OVER) {
			
		}
	}
	
	private void nonPixelatedRender(Graphics g) {
		gui.render(g);
		
		if(GameState.state == GameState.PLAYING) {
			g.setColor(Color.GREEN);
			g.fillOval(60, 60, 50, 50);
			
		} else if(GameState.state == GameState.OVER) {
			
		}
	}
	
	private void pixelatedRender(Graphics g) {
		
		if(GameState.state == GameState.PLAYING) {
			g.setColor(Color.BLUE);
			g.fillOval(0, 0, 50, 50);
			
		} else if(GameState.state == GameState.OVER) {
			
		}
	}

	@Override
	public void render(Graphics g){
		BufferStrategy bs = screen.getBufferStrategy();
		if(bs == null) {
			screen.createBufferStrategy(3);
			return;
		}
		
		g = frame.getGraphics();
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Screen.WIDTH, Screen.HEIGHT);

		pixelatedRender(g);
		
		g.dispose();
		g = bs.getDrawGraphics();
		g.drawImage(frame, 0, 0, Screen.SCALE_WIDTH, Screen.SCALE_HEIGHT, null);

		nonPixelatedRender(g);
		
		bs.show();
	}

	@Override
	public void run() {
		double amountOfTicks = 60.0;
		double ns = 1000000000.0 / amountOfTicks;
		double delta = 0;
		long lastTime = System.nanoTime();

		screen.requestFocus();
		while(isRunning){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			
			if(delta >= 1) {
				update();
				render(null);
				delta--;
			}
		}
		
		stop();
	}
}
