package com.company;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger Base = new BigInteger("600851475143");
        factorize(Base);
    }


    public static void factorize(BigInteger n){
        int factorA = 0;
        int factorB = 0;
        BigInteger aChecker = new BigInteger("2");
        int checkerPartTwo = n.compareTo(aChecker);

        if (checkerPartTwo == 0){                                       //If number is even
            factorA = 2;
            factorB = n.divide(2);
        }else{                                                          //If number is odd
            int halfLine = n/2;                                         //Only variables that are even will be factors greater than half of them, this case is only for odd integers
            int smallestFactorOdd = 3;

            while (smallestFactorOdd < halfLine){                       //Until you've found the smallest factor for add variables
                if (n % smallestFactorOdd == 0){                        //If smallestFactorOdd is a factor of n
                    factorA = smallestFactorOdd;
                    factorB = n/smallestFactorOdd;
                    break;
                }else {
                    smallestFactorOdd += 2;
                }
            }

            if (smallestFactorOdd > halfLine){                          //If the number isnt even and has no numbers that multiply together that are natural
                System.out.println("Prime Number");                     //If the above is true then the number is prime
            }
        }
        System.out.println(factorA);
        System.out.println(factorB);
    }


}


