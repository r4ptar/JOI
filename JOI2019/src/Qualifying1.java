import java.util.Scanner;

public class Qualifying1 {
	public static final int WEEKCONTINUATION = 7;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("���s�������I��ł��������B\n1.SocialGame");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		switch(num) {
			case 1: 
				SocialGame();
				break;
		}

	}
	
	@SuppressWarnings("resource")
	public static void SocialGame() {
		Scanner scanner = new Scanner(System.in);
		int day = 0;
		int nowCoin = 0;
		try {
			System.out.println("���O�C�������ۂɈ���ɖႦ��R�C����������͂��Ă��������B\n�R�C�������F");
			int dailyCoin = scanner.nextInt();
			System.out.println("7���ԘA���Ń��O�C�������ۂɖႦ��R�C����������͂��Ă��������B\n�R�C������:");
			int weeklyCoin = scanner.nextInt();
			System.out.println("�ێR���񂪗~�����R�C�������͊�ł���?");
			int maruyamaGetCoin = scanner.nextInt();
			
			// Coin & Day Count
			while (maruyamaGetCoin > nowCoin) {
				day += 1;
				nowCoin += dailyCoin;
				if (day % WEEKCONTINUATION == 0) {
					nowCoin += weeklyCoin;
				}
			}
			
			System.out.println("�ێR���񂪏��Ȃ��Ƃ�"+maruyamaGetCoin+"���̃R�C���𓾂邽�߂ɂ�"+day+"���̃��O�C�������Ȃ���΂Ȃ�Ȃ��B");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("1~9�܂ł̐�������͂��Ă��������B");
		}

	}
}
