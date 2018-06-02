package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static void factorize(int n){
        if (n % 2 == 0){                                                //If number is even
            int factorA = 2;
            int factorB = n/2;
        }else{                                                          //If number is odd
            int halfLine = n/2;                                         //Only variables that are even will be factors greater than half of them, this case is only for odd integers
            int smallestFactorOdd = 3;

            while (smallestFactorOdd < halfLine){                       //Until you've found the smallest factor for add variables
                if (n % smallestFactorOdd == 0){                        //If smallestFactorOdd is a factor of n
                    int factorA = smallestFactorOdd;
                    int factorB = n/smallestFactorOdd;
                }else{
                    smallestFactorOdd += 2;
                }
            }
        }
    }
}


