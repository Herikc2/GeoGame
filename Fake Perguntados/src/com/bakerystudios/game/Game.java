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

	public static boolean newGame = false;

	private BufferedImage frame;
	private GraphicUserInterface gui;
	public static AudioManager audio;

	private FakeAsked fa;

	public Game() {
		// Object instantiation
		gui = new GraphicUserInterface();
		fa = new FakeAsked();
		inputs = new ArrayList<>();
		inputs.add(gui.getUi().getMainMenu());
		inputs.add(gui.getUi().getOptionMenu());
		inputs.add(fa);
		screen = new Screen(inputs);
		frame = new BufferedImage(Screen.WIDTH, Screen.HEIGHT, BufferedImage.TYPE_INT_RGB);
		audio = new AudioManager();
	}

	public synchronized void start() {
		thread = new Thread(this);
		isRunning = true;
		thread.start();
	}

	public synchronized void stop() {
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update() {
		gui.update();
		audio.update();
		
		if(newGame) {
			fa = new FakeAsked();
			newGame = false;
		}

		if (GameState.state == GameState.PLAYING) {
			fa.update();
		}
	}

	private void renderRoutines(Graphics g) {
		gui.render(g);
		fa.render(g);
	}

	@Override
	public void render(Graphics g) {
		BufferStrategy bs = screen.getBufferStrategy();
		if (bs == null) {
			screen.createBufferStrategy(3);
			return;
		}

		g = frame.getGraphics();

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Screen.WIDTH, Screen.HEIGHT);

		renderRoutines(g);

		g.dispose();
		g = bs.getDrawGraphics();
		g.drawImage(frame, 0, 0, Screen.WIDTH, Screen.HEIGHT, null);

		bs.show();
	}

	@Override
	public void run() {
		double amountOfTicks = 60.0;
		double ns = 1000000000.0 / amountOfTicks;
		double delta = 0;
		long lastTime = System.nanoTime();

		screen.requestFocus();
		while (isRunning) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;

			if (delta >= 1) {
				update();
				render(null);
				delta--;
			}
		}

		stop();
	}
}
