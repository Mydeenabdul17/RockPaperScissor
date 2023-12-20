package com.rockPaperScissor.Repository;

public class SPSRepository {

	private static SPSRepository repository;

	private int player, computer;

	private SPSRepository() {

	}

	public static SPSRepository getInstance() {
		if (repository == null) {
			repository = new SPSRepository();
		}
		return repository;
	}

	public boolean isGameEnd() {
		return player == 10 || computer == 10;
	}

	public void playerWins() {
		player++;
	}

	public void computerWins() {
		computer++;
	}

	public String winner() {
		return player==10?"You Wins":"Computer Wins";
	}
	
	
}
