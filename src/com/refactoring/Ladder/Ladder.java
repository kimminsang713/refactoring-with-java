package com.refactoring.Ladder;

import java.util.*;

/**
 * Created by marathoner on 2021/05/17
 *
 * - 룰 -
 * 진행 순서
 * 1. 몇개를 선택할지에 대한 수량을 입력 받는다.
 * 2. 입력받은 수량대로 사다리의 결과값을 입력한다.
 * 3. 내가 선택하고 싶은 번호를 입력한다.
 * 4. 결과가 나온다.
 *
 * 위 순서중 3번을 진행하고 나서
 * 어떻게 랜덤의 숫자를 보여줄지는 각자의 생각에 맡긴다.
 * 힌트) 랜덤 함수를 활용하면 쉬워 보인다.
 *
 * 결과 예시 ( 4개의 선택지를 입력했을때 )
 * 1번 => 꽝
 * 2번 => 정답
 * 3번 => 밥쏘기
 * 4번 => 밥 굶기
 */
public class Ladder {

  public static void LadderGo(){
      // 1. 몇개를 선택할지에 대한 개수를 입력 받는다.
      Scanner sc = new Scanner(System.in);
      System.out.print("사다리 갯수 : ");
      int amount = sc.nextInt();
      String[] ladderResult = new String[amount];
      // 2. 결과 값 넣기
      for(int i=0; i<amount; i++){
          System.out.print( i+1 +"번째 사다리 결과 값 입력 : ");
          ladderResult[i] = sc.next();
      }

//      for(int i =0; i<ladderResult.length; i++){
//          int random = (int)(Math.random() * ladderResult.length);
//          String shuffle = ladderResult[random];
//          ladderResult[random] = ladderResult[i];
//          ladderResult[i] = shuffle;
//      }

//      System.out.print(Arrays.toString(ladderResult));
      // 배열 순서를 섞어버림
      Collections.shuffle(Arrays.asList(ladderResult));

      // 배열 index 를 선택하여 결과값 뿌려주기
      int userChoice = 0;
      for(int i=0; i<amount; i++){
          System.out.print("사다리 번호 입력 : ");
          userChoice = sc.nextInt();
          System.out.println( i+1 + "번 사다리 결과 : " + ladderResult[userChoice]);
      }
  }


}
