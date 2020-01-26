package ru.job4j.array;

public class Matrix {

    public int[][] multiple (int size){

        int[][] array2D = new int[size][size];

        for (int i = 0; i < size;i++){
            for (int j = 0; j < size; j++){
                array2D[i][j] = (i+1)*(j+1);
            }
        }
        return array2D;
    }
}
