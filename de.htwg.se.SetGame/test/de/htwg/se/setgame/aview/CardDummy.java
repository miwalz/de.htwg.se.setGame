package de.htwg.se.setgame.aview;

import de.htwg.se.setgame.model.ICard;

/**
 * @author Philipp Daniels
 */
public class CardDummy implements ICard {
    @Override
    public String getColor() {
        return null;
    }

    @Override
    public String getForm() {
        return null;
    }

    @Override
    public String getPanelFilling() {
        return null;
    }

    @Override
    public Integer getNumberOfComponents() {
        return null;
    }

    @Override
    public void setColor(String color) {

    }

    @Override
    public void setForm(String form) {

    }

    @Override
    public void setPanelFilling(String panelFilling) {

    }

    @Override
    public void setNumberOfComponents(int numberOfComponents) {

    }
}