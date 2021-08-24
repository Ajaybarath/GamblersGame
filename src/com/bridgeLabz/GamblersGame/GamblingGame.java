package com.bridgeLabz.GamblersGame;

public class GamblingGame {
	
	static final int INITIAL_STAKE = 100;
	static final int EVERY_GAME_STAKE = 1;
	
	int gamesWon = 0;
	
	public static void main(String args[]) {
		

		System.out.println("Money at stake for every game : " + EVERY_GAME_STAKE);
		System.out.println("Money at stake for every day : " + INITIAL_STAKE);
		
		GamblingGame player = new GamblingGame();
		player.exitLogic();
 		
	}
	
	public void gamePlay() {
		
		int gameStatus = (int) (Math.random()*10) % 2;
		
		if (gameStatus == 1) {
			gamesWon ++;
			System.out.println("Gambler won 1 $");
		}
		else {
			gamesWon --;
			System.out.println("Gambler lost 1 $");
		}
		
	}
	
	public void exitLogic() {
		
		while(Math.abs(gamesWon) < (INITIAL_STAKE/2)) {
			gamePlay();
		}
		 	
		if (gamesWon == (INITIAL_STAKE/2)) {
			System.out.println("Player resigned by winning " + (INITIAL_STAKE + gamesWon));
		}
		else {
			System.out.println("Player resigned by loosing " + (INITIAL_STAKE + gamesWon));
		}
	}
 
	
}
