package com.bakerystudios.tools;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

public abstract class InputListener implements KeyListener, MouseListener {
	
	protected boolean enter;
	protected boolean esc;
	protected boolean space;
	
	protected boolean up;
	protected boolean down;
	protected boolean right;
	protected boolean left;
	
	protected boolean w;
	protected boolean s;
	protected boolean d;
	protected boolean a;
	
}