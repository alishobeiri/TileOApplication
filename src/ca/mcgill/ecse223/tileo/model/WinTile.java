/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.25.0-9e8af9e modeling language!*/

package ca.mcgill.ecse223.tileo.model;

import java.io.Serializable;
import java.util.*;

import ca.mcgill.ecse223.tileo.application.TileOApplication;
import ca.mcgill.ecse223.tileo.model.Game.Mode;

// line 50 "../../../../../TileO (updated Feb10).ump"
public class WinTile extends Tile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5300378506557006889L;

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public WinTile(int aX, int aY, Game aGame) {
		super(aX, aY, aGame);
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	public void delete() {
		super.delete();
	}

	// Thomas
	// TODO
	public void land() {
		// Get the game that this tile is a part of
		Game currentGame = this.getGame();
		// Get the player that wants to move to the tile
		Player currentPlayer = currentGame.getCurrentPlayer();
		// Set the current tile to this tile
		currentPlayer.setCurrentTile(this);

		// TODO CHECK THIS METHOD
		currentPlayer.takeTurn();

		// Get increase the index of the current player by one
		int nextPlayerIndex = currentGame.indexOfPlayer(currentPlayer) + 1;
		// Loop back if it is the last player
		nextPlayerIndex = nextPlayerIndex % currentGame.numberOfPlayers();
		// Get the next player
		Player nextPlayer = currentGame.getPlayer(nextPlayerIndex);
		// Set the next player as the current player
		currentGame.setCurrentPlayer(nextPlayer);

		this.setHasBeenVisited(true);

		TileOApplication.getGamePage().refresh();
		TileOApplication.getGamePage()
				.showMessage("You have found the hidden tile and won the game, good job big boy!");
		TileOApplication.getCurrentGame().setMode(Game.Mode.GAME_WON);
		TileOApplication.deleteGame();

		currentGame.setMode(Mode.GAME_WON);
	}

}