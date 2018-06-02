package com.company;

public class Main {

    public static void main(String[] args) {
        factorize(33);
    }


    public static void factorize(int n){
        int factorA = 0;
        int factorB = 0;

        if (n % 2 == 0){                                                //If number is even
            factorA = 2;
            factorB = n/2;
        }else{                                                          //If number is odd
            int halfLine = n/2;                                         //Only variables that are even will be factors greater than half of them, this case is only for odd integers
            int smallestFactorOdd = 3;

            while (smallestFactorOdd < halfLine){                       //Until you've found the smallest factor for add variables
                if (n % smallestFactorOdd == 0){                        //If smallestFactorOdd is a factor of n
                    factorA = smallestFactorOdd;
                    factorB = n/smallestFactorOdd;
                }else{
                    smallestFactorOdd += 2;
                }
            }
        }
        System.out.println(factorA);
        System.out.println(factorB);
    }


}


