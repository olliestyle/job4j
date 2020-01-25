package ru.job4j.array;



public class MinRange {

    public static int findMin(int[] toFind, int start, int finish){
        int min = toFind[start];
        if (finish == toFind.length-1){
            finish = toFind.length;
        }

        for (int i = start; i < finish; i++){
            if(toFind[i] < min){
                min = toFind[i];
            }
        }

        return min;
    }
}
