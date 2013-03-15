package com.springinaction.springidol;

import java.util.Map;

public class OneManBand2 implements Performer {

	private Map<String, Instrument> instruments;
	
	public OneManBand2() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		for (String key : instruments.keySet()) {
			Instrument instrument = instruments.get(key);
			System.out.print(key + " : ");
			instrument.play();
		}
	}

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

		
	
}
