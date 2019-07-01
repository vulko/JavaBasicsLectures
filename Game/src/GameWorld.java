import java.util.Scanner;

public class GameWorld {
	
	enum GameState {
		NEW,
		SAVING,
		LOADING,
		GAME_OVER,
		IN_PROGRESS
	}

	private GameObject mPlayer = new GameObject();
	private boolean mInitialized = false;
	private GameState mState = GameState.NEW;
	
	public GameObject getPlayer() {
		return mPlayer;
	}
	
	public void initGame() {
		Scanner inputReader = new Scanner(System.in);

		System.out.println("Введите имя");
		while (inputReader.hasNext()) {
			String name = inputReader.next();
			
			if (tryToSetName(name)) {
				break;
			}
		}
		System.out.println("Привет, " + mPlayer.getName());
		
		System.out.println("Введите возраст");
		while (inputReader.hasNextInt()) {
			Integer age = inputReader.nextInt();
			
			if (tryToSetAge(age)) {
				break;
			}
		}
		
		mInitialized = true;
		
		System.out.println(mPlayer.getName() + ", ты готов начать?");
		while (inputReader.hasNext()) {
			String input = inputReader.next();
			
			if (input.equals("да")) {
				mState = GameState.IN_PROGRESS;
				break;
			} else {
				System.out.println("хаха, че зассал???");
			}
		}		
	}
	
	private boolean tryToSetName(String name) {
		if (name.length() > 0 && name.length() < 20) {
			mPlayer.setName(name);
			return true;
		}
		
		System.out.println("Имя должно быть не пустым и не более 20 символов!");
		System.out.println("Введите имя ещё раз");
		return false;
	}
	
	private boolean tryToSetAge(int age) {
		if (age > 0 && age < 150) {
			mPlayer.setAge(age);
			return true;
		}
		
		System.out.println("Возраст должен быть от 0 до 150 лет");
		System.out.println("Введите возраст ещё раз");
		return false;
	}
	
}
