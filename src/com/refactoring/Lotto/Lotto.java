
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
     *
     * Lotto 클래스의 구현은 로또번호를 파라미터로 받아서 처리한다.
     *
     * 사용자가 입력하는 상황 예시
     * - 7번을 반복하며 숫자를 입력 받는다.
     * - 마지막 번호가 보너스 번호이다.
     * - 파라미터의 타입은 int[].
     *
     * 결과 과정 예시
     * - 중복을 허용하지 않는 7개의 랜덤의 숫자를 세팅한다.
     * - 랜덤으로 생성된 숫자 7개와 입력받은 숫자 7개를 비교하여 등수를 정한다.
     * - 계산이 끝나면 System.out.println 으로 등수를 표현한다.
     */

    private static final int MIN =1;
    private static final int MAX =45;


    public static void Lotto(int[] userNumber){
        //random 값
        int[] num = new int[7];
        int count = 0;
        int lastNumber =0;

        // 7개 랜덤값 중복제거 용
        HashSet<Integer> random = new HashSet<Integer>();
        for(int i =0; i<num.length; i++){
            num[i] = new Random().nextInt(MAX) +MIN;
            random.add(num[i]);
        }
        System.out.println(random);
        Iterator intrator = random.iterator();

        for(int i =0; i<random.size(); i++){
            System.out.println(i);
            int lottoNum = (int) intrator.next();
        }
//        System.out.print(Arrays.toString(userNumber) + " 하단");
    }
}
