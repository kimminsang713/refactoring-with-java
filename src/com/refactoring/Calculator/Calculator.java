package com.refactoring.Calculator;

import java.util.Scanner;

public class Calculator {

    /* 요구사항
    String으로 된 문자열을 받는다

    덧셈을 해서
    결과값을 반환해주는
    함수를 구현한다.
    이때, 숫자와 숫자를 구분할때는 , 로 구분을 o
    따라서 결과값은 무조건 양수이다.
    예 )
        1. "1" => 1
        2. "1,2" => 3
        3. "1,2,3" => 6
        4. "1, 2, 3" => 6
        6. "1, 1 2 3 4, 5," => 1240
        7. ",,,1,2" => 3
        8. "" =>
    */
    public static void calculator(){

        //변수선언
        String str = "";
        int result = 0;
        // 값 받기
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        //공백제거
        str.replace(" " , "");
        // , 로 구분자 지어 배열에 담기
        String arr[] = str.split(",");

        for(String num : arr){
            if(num.equals("")){
                continue;
            }
            result += Integer.parseInt(num);
        }
        System.out.print(result);

    }
}
