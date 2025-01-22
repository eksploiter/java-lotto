// Lotto.java
package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private List<Integer> numbers; // 추출된 6개의 번호

    // 생성자: 객체 생성 시 자동으로 번호를 추출
    public Lotto() {
        selectNumber();
    }

    // 번호를 추출하는 메서드
    private void selectNumber() {
        List<Integer> pool = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            pool.add(i);
        }
        Collections.shuffle(pool); // 리스트를 섞음
        numbers = new ArrayList<>(pool.subList(0, 6)); // 처음 6개 번호 추출
        Collections.sort(numbers); // 번호 정렬
    }

    // 추출된 번호를 출력하는 메서드
    public void printNumber() {
        System.out.println("로또 번호: " + numbers);
    }

    // 번호를 반환하는 메서드 (필요 시 사용)
    public List<Integer> getNumbers() {
        return numbers;
    }
}
