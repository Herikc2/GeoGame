package com.bakerystudios.sound;

import com.bakerystudios.tools.Updateble;

public class AudioManager implements Updateble {
	
	private boolean playingMusicBackground = false;
	
	public boolean music = true;
	public boolean sound = true;
	
	private Audio background;
	private Audio select;
	
	public AudioManager() {
		//background = new Music("/audios/background.wav");
		select = new Sound("/audios/select.wav");
	}
	
	public void playSelect() {
		if(sound) select.play();
	}

	@Override
	public void update() {
		if(music && !playingMusicBackground) {
			playingMusicBackground = true;
			if(background != null) background.loop();
		}
		if(!music && playingMusicBackground) {
			playingMusicBackground = false;
			if(background != null) background.stop();
		}
	}
	
}
