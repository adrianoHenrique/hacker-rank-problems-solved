package algorithms.solved;

import java.util.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {

        var principal = 0;
        var secondary = 0;
        var principalCounter = 0;
        var secondaryCounter = arr.size() - 1;

        for (List<Integer> integers : arr) {
            principal = Integer.sum(principal, integers.get(principalCounter));
            secondary = Integer.sum(secondary, integers.get(secondaryCounter));

            principalCounter++;
            secondaryCounter--;
        }

        return Math.abs(principal - secondary);
    }
}

class Solution {

    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();

        arr.add(List.of(11, 2, 4));
        arr.add(List.of(4, 5, 6));
        arr.add(List.of(10, 8, -12));

        int result = Result.diagonalDifference(arr);

        System.out.println(result);
    }
}