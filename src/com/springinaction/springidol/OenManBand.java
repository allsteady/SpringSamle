package com.springinaction.springidol;

import java.util.Collection;

public class OenManBand implements Performer {

	private Collection<Instrument> instruments;
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments; // 연주할 악기 목록 주입
	}

	
}
