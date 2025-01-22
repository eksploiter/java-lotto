package lotto;

import java.util.Scanner;

public class LottoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 게임 수를 입력하세요: ");
        int gameCount = scanner.nextInt();

        // 입력받은 게임 수 만큼 Lotto 배열 생성
        Lotto[] games = new Lotto[gameCount];
        for (int i = 0; i < gameCount; i++) {
            games[i] = new Lotto(); // Lotto 객체 생성과 동시에 번호 추출
        }

        // 모든 게임의 번호를 출력
        System.out.println("\n추출된 로또 번호:");
        for (int i = 0; i < gameCount; i++) {
            System.out.print((i + 1) + "번째 게임: ");
            games[i].printNumber();
        }

        scanner.close();
    }
}
