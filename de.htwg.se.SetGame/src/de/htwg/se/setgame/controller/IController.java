package de.htwg.se.setgame.controller;

import java.util.List;
import java.util.Map;

import de.htwg.se.setgame.model.ICard;
import de.htwg.se.setgame.util.observer.IObservable;

/**
 * @author raina
 */
public interface IController extends IObservable {

	/**
	 * @param cardOne card for set
	 * @param cardTwo card for set
	 * @param cardThree card for set
	 * @param player which player is
	 */
	void isASetForController(ICard cardOne, ICard cardTwo, ICard cardThree, int player);

	/**
	 * @return look trough the pack and see if still a set
	 */
	boolean stillSetInGame();

	/**
	 * @return return the set in field
	 */
	List<ICard> getSetInField();

	/**
	 * @return points player one
	 */
	int getPlayerOnePoints();

	/**
	 * @return points player two
	 */
	int getPlayerTwoPoints();

	/**
	 * @return player one
	 */
	int getPlayerOne();

	/**
	 * @return player two
	 */
	int getPlayerTwo();

	/**
	 * Reset game
	 */
	void newGame();

	/**
	 * @param size set size field
	 */
	void setFieldSize(int size);

	/**
	 * @return index and card in the index
	 */
	Map<Integer, ICard> getCardsAndTheIndexOfCardInField();

	/**
	 * @return Get first ICard of valid set.
	 */
	ICard getFirstInSet();

	/**
	 * Close game.
	 */
	void exit();

}