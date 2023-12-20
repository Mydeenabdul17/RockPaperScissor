package com.rockPaperScissor.gameStart;

import java.util.Random;

import com.rockPaperScissor.Repository.SPSRepository;

public class StartGameViewModel {

	private StartGameView view;
	private int computerChoice;

	public StartGameViewModel(StartGameView view) {
		this.view = view;
	}

	public boolean isGameEnd() {
		return SPSRepository.getInstance().isGameEnd();
	}

	public String choice(int playerChoice) {
		computerChoice = new Random().nextInt(3);
		if (playerChoice == computerChoice) {
			return "Draw";
		} else if ((playerChoice == 1 && computerChoice == 2) || (playerChoice == 2 && computerChoice == 0)
				|| (playerChoice == 3 && computerChoice == 1)) {
			SPSRepository.getInstance().playerWins();
			return "You Wins";
		} else {
			SPSRepository.getInstance().computerWins();
			return "Computer Wins";
		}
	}

	public String computerChoice() {
		switch (computerChoice) {
		case 0: {
			return "Rock";
		}
		case 1: {
			return "Paper";
		}
		case 2: {
			return "Scissor";
		}

		default:
			return "";
		}
	}

	public String winner() {
		return SPSRepository.getInstance().winner();
	}
}
