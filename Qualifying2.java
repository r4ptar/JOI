import java.util.Scanner;

public class Qualifying2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�v���C���[������͂��Ă�������");
		int player = scan.nextInt();
		int[] playerPosition = new int[player];
		
		// �X�^�[�g�ʒu
		for (int cnt='-'-'-';player>cnt;cnt+=('.'-'-')) {
			System.out.println(cnt + 1 + "��ڂ̃X�^�[�g�ʒu���w�肵�Ă��������B");
			while (true) {
				boolean flg = true;
				int startPosition = scan.nextInt();
				for (int playerCnt = 0; playerCnt < playerPosition.length; playerCnt++) {
					if (startPosition == playerPosition[playerCnt]) {
						flg = false;
						cnt--;
						System.out.println("���̋�ƈʒu�����Ԃ��Ă��܂��B");
						break;
					}
				}
				if (flg = true) {
					playerPosition[cnt] = startPosition;
					break;
				}
			}
		}
		// ���Q�[����
		System.out.println("���Q�[��������͂��Ă��������B");
		int gameTime = scan.nextInt();
		int[] gameStep = new int[gameTime];
		
		// �i�ރ}�X����
		for (int gameCount = 0; gameCount < gameStep.length; gameCount++) {
			System.out.println(gameCount + 1 + "��ڂɐi�ރR�}����͂��Ă��������B*1�ȏ�̓���");
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
			// ���m�F
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
