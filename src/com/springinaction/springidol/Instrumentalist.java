package com.springinaction.springidol;

public class Instrumentalist implements Performer {

	private String song;
	
	private Instrument instrument;
	

	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public Instrumentalist(){
		
	}
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.print("Playing " + song + " : ");
		instrument.play();
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}
	
	

}
