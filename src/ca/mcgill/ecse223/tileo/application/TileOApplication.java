package ca.mcgill.ecse223.tileo.application;

import ca.mcgill.ecse223.tileo.model.*;


public class TileOApplication {
	private static TileO tileO;
	
	public static void main(String args[]){

	}
	
	public static Game getCurrentGame(){
		return tileO.getCurrentGame();
	}
	
	//Thomas generated - on advice of Berk in tutorial
	public static boolean setCurrentGame(Game aNewCurrentGame){
		return tileO.setCurrentGame(aNewCurrentGame);
	}
	
	public static void save() {
		//Use to save
	}
	
	public static void load() {
		//Use to load
	}
}
