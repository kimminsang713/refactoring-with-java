
package com.refactoring;

import java.util.Arrays;
import java.util.Scanner;

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

    public static int[] Lotto(int[] clientInput){
       // -7번 입력을 받는다

//
//        for(int i =0; i<clientInput.length; i++){
//
//        }
        System.out.println(Arrays.toString(clientInput));

        return  clientInput;
    }
}
