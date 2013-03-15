package com.springinaction.springidol;

/*
 * Singleton
 */
public class Stage {

   	private Stage() {
	}
	
	private static class StageSignletonHolder {
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance(){
		return StageSignletonHolder.instance;
	}
}
