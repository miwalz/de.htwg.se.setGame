package de.htwg.se.setgame.aview.gui;

import java.awt.GridLayout;

import javax.swing.*;

import de.htwg.se.setgame.controller.IController;
import de.htwg.se.setgame.util.observer.Event;
import de.htwg.se.setgame.util.observer.IObserver;

/**
 * @author Philipp Daniels
 */
public class GUI extends JFrame implements IObserver {

	private static final long serialVersionUID = 1L;
	private static IController controller;
	private static final String TITLE = "SET - The ultimate challenge!";

	private SetButton setbutton;
	private GameField gamefield;

	/**
	 * @param controller Instance of IController
	 */
	public GUI(IController controller) {
		GUI.setController(controller);
		controller.addObserver(this);

		setbutton = new SetButton();
		gamefield = new GameField();

		setJMenuBar(new MenuBar(controller));
		setContentPane(createMainPanel());
		setTitle(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	private JPanel createMainPanel() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
		mainPanel.add(gamefield);
		mainPanel.add(createMiniPanel());
		return mainPanel;
	}

	private JPanel createMiniPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1));
		panel.add(setbutton);
		return panel;
	}

	@SuppressWarnings("static-access")
	@Override
	public void update(Event e) {
		setbutton.updateSB();
		gamefield.updateLink();
	}

	public static IController getController() {
		return controller;
	}

	public static void setController(IController controller) {
		GUI.controller = controller;
	}
}
