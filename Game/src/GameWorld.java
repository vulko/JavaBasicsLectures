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

		System.out.println("������� ���");
		while (inputReader.hasNext()) {
			String name = inputReader.next();
			
			if (tryToSetName(name)) {
				break;
			}
		}
		System.out.println("������, " + mPlayer.getName());
		
		System.out.println("������� �������");
		while (inputReader.hasNextInt()) {
			Integer age = inputReader.nextInt();
			
			if (tryToSetAge(age)) {
				break;
			}
		}
		
		mInitialized = true;
		
		System.out.println(mPlayer.getName() + ", �� ����� ������?");
		while (inputReader.hasNext()) {
			String input = inputReader.next();
			
			if (input.equals("��")) {
				mState = GameState.IN_PROGRESS;
				break;
			} else {
				System.out.println("����, �� ������???");
			}
		}		
	}
	
	private boolean tryToSetName(String name) {
		if (name.length() > 0 && name.length() < 20) {
			mPlayer.setName(name);
			return true;
		}
		
		System.out.println("��� ������ ���� �� ������ � �� ����� 20 ��������!");
		System.out.println("������� ��� ��� ���");
		return false;
	}
	
	private boolean tryToSetAge(int age) {
		if (age > 0 && age < 150) {
			mPlayer.setAge(age);
			return true;
		}
		
		System.out.println("������� ������ ���� �� 0 �� 150 ���");
		System.out.println("������� ������� ��� ���");
		return false;
	}
	
}
