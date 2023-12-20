package com.rockPaperScissor;

import java.util.Scanner;

import com.rockPaperScissor.gameStart.StartGameView;

public class RockPaperScissor {

	public static void main(String[] args) {
		RockPaperScissor rps = new RockPaperScissor();
		rps.init();
	}

	Scanner sc = new Scanner(System.in);

	private void init() {

		StartGameView gameView = new StartGameView();
		System.out.println("Welcome to the Game");
		outer: do {
			System.out.println("1.Start Game\n2.End Game");
			switch (sc.nextInt()) {
			case 1: {
				gameView.start();
				break;
			}
			case 2: {

				break outer;
			}

			default: {
				System.out.println("Invalid input");
				break;
			}

			}
		} while (true);
		System.out.println("Good bye");
	}
}
