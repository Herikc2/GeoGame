package com.bakerystudios.game;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.JFrame;

import com.bakerystudios.tools.InputListener;

public class Screen extends Canvas {
	
	private static final long serialVersionUID = 1L;
	
	private boolean userScreeResolution = false;
	
	public static int SCALE = 4;
	public static int WIDTH = 200;
	public static int HEIGHT = 150;
	public static int SCALE_WIDTH = WIDTH * SCALE;
	public static int SCALE_HEIGHT = HEIGHT * SCALE;

	public static JFrame frame;
	
	public Screen(List<InputListener> inputs) {
		for(InputListener input : inputs) {
			addKeyListener(input);
			addMouseListener(input);
		}
		if(userScreeResolution) initScreenSize();
		setPreferredSize(new Dimension(SCALE_WIDTH, SCALE_HEIGHT));
		//System.out.println(SCALE_WIDTH);
		//System.out.println(SCALE_HEIGHT);
		frame = new JFrame("Fake Perguntados");
		frame.add(this);
		frame.setResizable(true);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		if(userScreeResolution) frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		if(userScreeResolution) frame.setResizable(false);
	}

	// pega a resolução do monitor para inicializar
	// a resolução do jogo
	private void initScreenSize() {
		Toolkit tk = Toolkit.getDefaultToolkit();
	    Dimension d = tk.getScreenSize();
		WIDTH = d.width / SCALE;
		HEIGHT = d.height / SCALE;
		SCALE_WIDTH = WIDTH * SCALE;
		SCALE_HEIGHT = HEIGHT * SCALE;
	}
	
}
