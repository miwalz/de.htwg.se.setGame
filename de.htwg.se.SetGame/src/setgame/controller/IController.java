package setgame.controller;

import java.util.List;

import setgame.modell.impl.Card;

public interface IController {

	/* (non-Javadoc)
	 * @see setgame.controller.IController#spielModus()
	 */
	public int getPlayModus();

	/* (non-Javadoc)
	 * @see setgame.controller.IController#isAset(setgame.modell.impl.Card, setgame.modell.impl.Card, setgame.modell.impl.Card, int)
	 */
	public boolean isAset(Card cardOne, Card cardTwo, Card cardThree,
			int player);
	public List<Card> getCardinGame();

}