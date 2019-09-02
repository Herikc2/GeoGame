package com.bakerystudios.game;

import java.awt.Canvas;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JFrame;

import com.bakerystudios.tools.InputListener;

public class Screen extends Canvas {
	
	private static final long serialVersionUID = 1L;
	
	private boolean userScreeResolution = false;
	
	public static int WIDTH = 800;
	public static int HEIGHT = 600;

	public static JFrame frame;
	
	public Screen(List<InputListener> inputs) {
		for(InputListener input : inputs) {
			addKeyListener(input);
			addMouseListener(input);
			addMouseMotionListener(input);
		}
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame = new JFrame("Fake Perguntados");
		frame.add(this);
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		if(userScreeResolution) frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		if(userScreeResolution) frame.setResizable(false);
	}
	
}
