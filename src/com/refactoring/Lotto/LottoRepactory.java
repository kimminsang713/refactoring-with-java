package com.refactoring.Lotto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class LottoRepactory {
    private static final int MIN = 1;
    private static final int MAX = 45;

    public static void sortition(int[] userNumbers) {
        HashSet<Integer> pcNumbers = new HashSet<>();
        int count = 0;
        int lastNum = 0;
        boolean isBonus = false;

        while (pcNumbers.size() < 7) {
            int pcNumber = (int) (Math.random() * (MAX - MIN) + MIN);
            pcNumbers.add(pcNumber);
        }
        Iterator interator = pcNumbers.iterator();
        for (int i = 0; i < pcNumbers.size(); i++) {
            int pcNum = (int) interator.next();
            lastNum = pcNum;
            for (int j = 0; j < userNumbers.length; j++) {
                if (pcNum == userNumbers[j]) {
                    ++count;
                }
            }
        }

        if (lastNum == userNumbers[userNumbers.length - 1]) {
            isBonus = true;
        }

        switch (count) {
            case 0:
            case 1:
            case 2:
                System.out.println("꽝");
                break;
            case 3:
                System.out.println("5등!!!!!!!!!");
                break;
            case 4:
                System.out.println("4등!!!!!!!!!");
                break;
            case 5:
                if(isBonus) System.out.println("2등!!!!!!!!!!");
                else System.out.println("3등!!!!!!!!!!!");
                break;
            case 6:
                System.out.println("1등!!!!!!!!!!!!!!");
                break;

        }

        System.out.println("사용자 :: " + Arrays.toString(userNumbers));
        System.out.println("PC :: " + pcNumbers);


    }

}