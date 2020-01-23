package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int finish){

        if(finish <= 1)
            return false;

        boolean prime = true;

        for (int i = 2 ; i <= finish/2; i++){
            if (finish % i == 0){
                prime = false;
                break;
            }
        }

        return prime;
    }
}
