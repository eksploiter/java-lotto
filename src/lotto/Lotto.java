package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    public static void main(String[] args) {
        // 1부터 45까지의 숫자를 리스트에 추가
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }

        // 리스트를 섞는다 (랜덤으로 섞음)
        Collections.shuffle(numbers);

        // 섞인 리스트에서 처음 6개를 선택
        List<Integer> lottoNumbers = numbers.subList(0, 6);

        // 선택된 로또 번호를 정렬 (선택사항)
        Collections.sort(lottoNumbers);

        // 결과 출력
        System.out.println("로또 번호: " + lottoNumbers);
    }
}

