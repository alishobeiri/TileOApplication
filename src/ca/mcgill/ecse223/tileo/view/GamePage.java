package ca.mcgill.ecse223.tileo.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import ca.mcgill.ecse223.tileo.controller.InvalidInputException;
import ca.mcgill.ecse223.tileo.controller.PlayModeController;
import ca.mcgill.ecse223.tileo.model.Game;

public class GamePage extends JFrame {

	// data elements
	private String error = null;

	// TESTING
	public static void main(String[] args) {
		GamePage view = new GamePage();
		view.setVisible(true);
	}

	// Components
	JPanel rightPanel = new JPanel();
	BoardPanel board = new BoardPanel(Game.Mode.GAME);
	DeckPanel deck = new DeckPanel();
	JButton getCard = new JButton("Get Action Card");
	JButton rollDie = new JButton("Roll Die");
	JButton finishTurn = new JButton("Move To Tile");
	JButton addConnection = new JButton("Add Connection");
	JButton removeConnection = new JButton("Remove Connection");
	JTextField dieResult = new JTextField(20);
	JLabel status = new JLabel("Current Player:");
	JLabel currentPlayer = new JLabel("Player 1");

	public GamePage() {
		initComponents();
	}

	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(925, 705);
		setResizable(false);

		// Settings for text field
		dieResult.setFont(new Font("Futura", Font.BOLD, 56));
		dieResult.setEditable(true);

		// Change fonts
		status.setFont(new Font("Futura", Font.PLAIN, 26));
		currentPlayer.setFont(new Font("Futura", Font.BOLD, 30));

		// Set Group Layout
		GroupLayout layout = new GroupLayout(getContentPane());
		setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		// Add listeners for buttons
		getCard.addActionListener(new getCardListener());
		rollDie.addActionListener(new rollDieListener());
		finishTurn.addActionListener(new finishTurnListener());
		addConnection.addActionListener(new addConnectionListener());
		removeConnection.addActionListener(new removeConnectionListener());

		// Component placement
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addComponent(board, 647, 647, 647)
				.addGroup(layout.createParallelGroup()
						.addComponent(status)
						.addComponent(currentPlayer)
						.addComponent(deck, 220, 220, 220)
						.addComponent(getCard, 220, 220, 220)
						.addComponent(addConnection, 220, 220, 220)
						.addComponent(removeConnection, 220, 220, 220)
						.addGap(220, 220, 220)
						.addGroup(layout.createSequentialGroup()
								.addGap(70, 70, 70)
								.addComponent(dieResult, 80, 80, 80))
						.addComponent(rollDie, 220, 220, 220).addComponent(finishTurn, 220, 220, 220)));
		layout.setVerticalGroup(layout.createParallelGroup()
				.addComponent(board, 647, 647, 647)
				.addGroup(layout.createSequentialGroup()
						.addComponent(status)
						.addComponent(currentPlayer)
						.addComponent(deck, 300, 300, 300)
						.addComponent(getCard)
						.addComponent(addConnection)
						.addComponent(removeConnection)
						.addComponent(dieResult, 80, 80, 80)
						.addComponent(rollDie)
						.addComponent(finishTurn)));
	}

	class getCardListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			// TODO Add button functionality.
		}
	}

	class rollDieListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			// TODO Add button functionality.
			rollDieActionPerformed(ev);
		}
	}

	class finishTurnListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			// TODO Add button functionality.
		}
	}

	class addConnectionListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			// TODO Add button functionality.
		}
	}

	class removeConnectionListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			// TODO Add button functionality.
		}
	}

	// Thomas
	// TODO Implement this
	public void rollDieActionPerformed(ActionEvent ev) {
		// clear error message
		error = null;

		// Call the controller
		PlayModeController toc = new PlayModeController();

		// pass the returned list of tiles somewhere
		// need to update the visual with the number of the die roll but only
		// the list of tiles is returned
		toc.rollDie();

		// update die visual
		refresh();

	}

	// Thomas
	// TODO Fully implement
	private void refresh() {

		// Call the controller
		PlayModeController toc = new PlayModeController();

		dieResult.setText("");
	}
}
