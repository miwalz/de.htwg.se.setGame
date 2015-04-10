package de.htwg.se.setgame.aview.tui;

import de.htwg.se.setgame.controller.IController;
import de.htwg.se.setgame.model.ICard;
import de.htwg.se.setgame.model.IField;
import de.htwg.se.setgame.model.IPack;
import de.htwg.se.setgame.util.observer.Observable;

import java.util.List;
import java.util.Map;

/**
 * @author Philipp Daniels
 */
public class ControllerDummy extends Observable implements IController {

    @Override
    public void isASetForController(ICard cardOne, ICard cardTwo, ICard cardThree, int player) {

    }

    @Override
    public List<ICard> getCardinGame() {
        return null;
    }

    @Override
    public IField getField() {
        return null;
    }

    @Override
    public List<ICard> getASetInGame() {
        return null;
    }

    @Override
    public boolean stillSetInGame() {
        return false;
    }

    @Override
    public List<ICard> getSetInField() {
        return null;
    }

    @Override
    public int getPlayerOnePoints() {
        return 0;
    }

    @Override
    public int getPlayerTwoPoints() {
        return 0;
    }

    @Override
    public int getPlayerOne() {
        return 0;
    }

    @Override
    public int getPlayerTwo() {
        return 0;
    }

    @Override
    public void newGame() {

    }

    @Override
    public void setFieldSize(int size) {

    }

    @Override
    public List<ICard> getCardInFieldGame() {
        return null;
    }

    @Override
    public Map<Integer, ICard> getCardsAndTheIndexOfCardInField() {
        return null;
    }

    @Override
    public IPack getPack() {
        return null;
    }

    @Override
    public void loadFromDB(String name) {

    }

    @Override
    public ICard getFirstInSet() {
        return null;
    }
}