package ru.job4j.array;

public class Min {

    public static int findMin(int[] toFind){

        int min = toFind[0];

        for (int i = 0; i < toFind.length; i++){
            if(toFind[i] < min){
                min = toFind[i];
            }
        }

        return min;
    }
}
