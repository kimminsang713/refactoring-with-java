
package com.refactoring.Lotto;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class Lotto {

    /**
     * 로또 당첨 규칙
     * 숫자는 1 ~ 45까지의 숫자
     * 꽝 -> 로또 번호 2개 이하 당첨
     * 5등 -> 로또 번호 3개 당첨
     * 4등 -> 로또 번호 4개 당첨
     * 3등 -> 로또 번호 5개 당첨
     * 2등 -> 로또 번호 5개 + 보너스 번호 당첨
     * 1등 -> 로또 번호 6개 당첨
     * <p>
     * Lotto 클래스의 구현은 로또번호를 파라미터로 받아서 처리한다.
     * <p>
     * 사용자가 입력하는 상황 예시
     * - 7번을 반복하며 숫자를 입력 받는다.
     * - 마지막 번호가 보너스 번호이다.
     * - 파라미터의 타입은 int[].
     * <p>
     * 결과 과정 예시
     * - 중복을 허용하지 않는 7개의 랜덤의 숫자를 세팅한다.
     * - 랜덤으로 생성된 숫자 7개와 입력받은 숫자 7개를 비교하여 등수를 정한다.
     * - 계산이 끝나면 System.out.println 으로 등수를 표현한다.
     */

    private final int MIN = 1;
    private final int MAX = 45;
    private int[] userNumber;
    private HashSet<Integer> random;
    private int lastNumber;

    public Lotto(int[] userNumber) {
        this.userNumber = userNumber;
        this.random = createRandomNum();
    }


    public void start() {
        printResult(ranKing(getCount()));
    }

    private HashSet<Integer> createRandomNum() {
        HashSet<Integer> random = new HashSet<>();
        while (random.size() < 7) {
            int randomNum = (int) (Math.random() * (MAX - MIN) + MIN);
            random.add(randomNum);
        }
        return random;
    }

    private int getCount() {
        Iterator intrator = random.iterator();
        int result = 0;
        for (int i = 0; i < random.size(); i++) {
            int lottoNum = (int) intrator.next();
            lastNumber = lottoNum;
            result += (int)Arrays.stream(userNumber)
                    .filter(number-> lottoNum == number)
                    .count();
        }
        return result;
    }


    private boolean isBonusNumber() {
        return lastNumber == userNumber[userNumber.length -1];
    }

    private String ranKing(int count) {
        String result = "꽝";

        if(count == 3) result ="5등";
        else if(count == 4) result ="4등";
        else if(count == 5 && isBonusNumber()) result = "2등";
        else if(count == 5) result = "3등";
        else if(count == 6) result = "1등";
        return result;

    }
    private void printResult(String result){
        System.out.println(result);
        System.out.println("사용자 : " + Arrays.toString(userNumber));
        System.out.print("로또 : " + random);
    }
}
