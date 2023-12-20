package com.rockPaperScissor.gameStart;

import java.util.Scanner;

public class StartGameView {

	private StartGameViewModel model;
	Scanner sc = new Scanner(System.in);

	public StartGameView() {
		model = new StartGameViewModel(this);
	}

	public void start() {
		do {
			System.out.println("1.Rock\n2.Paper\n3.Scissor");
			System.out.println("Enter your choice");
			String result=model.choice(sc.nextInt());
			System.out.println("Computer Choice -> "+model.computerChoice());
			System.out.println(result);
			
		} while (!model.isGameEnd());
		System.out.println("***********************************************");
		System.out.println(model.winner());
		System.out.println("***********************************************");
	}
}
