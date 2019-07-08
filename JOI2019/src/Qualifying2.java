import java.util.Scanner;

public class Qualifying2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("プレイヤー数を入力してください");
		int player = scan.nextInt();
		int[] playerPosition = new int[player];
		
		// スタート位置
		for (int cnt='-'-'-';player>cnt;cnt+=('.'-'-')) {
			System.out.println(cnt + 1 + "駒目のスタート位置を指定してください。");
			while (true) {
				boolean flg = true;
				int startPosition = scan.nextInt();
				for (int playerCnt = 0; playerCnt < playerPosition.length; playerCnt++) {
					if (startPosition == playerPosition[playerCnt]) {
						flg = false;
						cnt--;
						System.out.println("他の駒と位置がかぶっています。");
						break;
					}
				}
				if (flg = true) {
					playerPosition[cnt] = startPosition;
					break;
				}
			}
		}
		// 総ゲーム数
		System.out.println("総ゲーム数を入力してください。");
		int gameTime = scan.nextInt();
		int[] gameStep = new int[gameTime];
		
		// 進むマス入力
		for (int gameCount = 0; gameCount < gameStep.length; gameCount++) {
			System.out.println(gameCount + 1 + "回目に進むコマを入力してください。*1以上の入力");
			int coma = scan.nextInt(); 
			gameStep[gameCount] = coma -1; 
		}
		
		for (int gameRound = 0; gameTime > gameRound; gameRound++) {
			boolean isPosition = true;
			int playerChoice = gameStep[gameRound];
			int nextPosition = playerPosition[playerChoice] + 1;
			if (nextPosition > 2019) {
				nextPosition = 2019;
			}
			// 被り確認
			for (int playerCnt = 0; player > playerCnt; playerCnt++) {
				if (nextPosition == playerPosition[playerCnt]) {
					isPosition = false;
					break;
				}
			}
			if (isPosition) {
				playerPosition[playerChoice] = nextPosition;
			}
		}
		
		for (int playerCount = 0; player > playerCount; playerCount++) {
			System.out.println(playerCount + 1 + ":" +playerPosition[playerCount]);
		}
	}
	

}
