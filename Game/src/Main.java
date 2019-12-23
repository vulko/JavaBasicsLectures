import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		GameLoop gameLoop = new GameLoop();
		Thread gameThread = new Thread(gameLoop);
		gameThread.start();
		
		GameWorld gameWorld = new GameWorld();

		gameWorld.initGame();
		
		System.out.println("Поехали!");
	}

}
