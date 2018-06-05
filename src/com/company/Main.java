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
        BigInteger Checker = new BigInteger("2");                    //A Variable to decide if the number is even because you can't direct compare a int to a BigInt, size matters
        int checkerPartTwo = n.compareTo(Checker);

        if (checkerPartTwo == 0){                                       //If number is even
            factorA = 2;
            factorB = n.divide(2);
        }else{                                                          //If number is odd
            BigInteger halfLine = new BigInteger(n.divide(/* Some representation of the number 2*/)) ;   //Only variables that are even will be factors greater than half of them, this case is only for odd integers
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

            if (smallestFactorOdd > halfLine){                          //If the number isn't even and has no numbers that multiply together that are natural
                System.out.println("Prime Number");                     //If the above is true then the number is prime
            }
        }
        System.out.println(factorA);
        System.out.println(factorB);
    }


}


