/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.25.0-9e8af9e modeling language!*/

package ca.mcgill.ecse223.tileo.model;

import java.util.*;
import ca.mcgill.ecse223.tileo.controller.TileOController;

// line 68 "../../../../../TileO (updated Feb10).ump"
public class RollDieActionCard extends ActionCard
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public RollDieActionCard(String aInstructions, Deck aDeck)
  {
    super(aInstructions, aDeck);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }
  
  //Added play method
  public List<Tile> play(){
	  List<Tile> tiles = new ArrayList<Tile>();
	  //tiles = new TileOController().rollDie();
	  
	  return tiles;
  }

}