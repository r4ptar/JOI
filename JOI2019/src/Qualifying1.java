import java.util.Scanner;

public class Qualifying1 {
	public static final int WEEKCONTINUATION = 7;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("実行する問題を選んでください。\n1.SocialGame");
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
			System.out.println("ログインした際に一日に貰えるコイン枚数を入力してください。\nコイン枚数：");
			int dailyCoin = scanner.nextInt();
			System.out.println("7日間連続でログインした際に貰えるコイン枚数を入力してください。\nコイン枚数:");
			int weeklyCoin = scanner.nextInt();
			System.out.println("丸山さんが欲しいコイン枚数は幾つですか?");
			int maruyamaGetCoin = scanner.nextInt();
			
			// Coin & Day Count
			while (maruyamaGetCoin > nowCoin) {
				day += 1;
				nowCoin += dailyCoin;
				if (day % WEEKCONTINUATION == 0) {
					nowCoin += weeklyCoin;
				}
			}
			
			System.out.println("丸山さんが少なくとも"+maruyamaGetCoin+"枚のコインを得るためには"+day+"日のログインをしなければならない。");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("1~9までの整数を入力してください。");
		}

	}
}
