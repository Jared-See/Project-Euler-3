package com.company;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger Base = new BigInteger("600851475143");
        factorize(Base);
    }


    public static void factorize(BigInteger n){
        BigInteger factorA = new BigInteger("0");
        BigInteger factorB = new BigInteger("0");
        BigInteger checker = new BigInteger("2");                    //A Variable to decide if the number is even because you can't direct compare a int to a BigInt, size matters
        int checkerPartTwo = n.compareTo(checker);

        if (checkerPartTwo == 0){                                       //If number is even
            factorA.equals(2);                                          //Factor a is 2 because of factorBs value
            factorB = n.divide(factorA);                                //Factor B is half the original number
        }else{                                                          //If number is odd
            BigInteger halfLine = new BigInteger("0") ;             //Acts as a makeshift line of code to declare a variable which will have its actual value assigned on the nex line
            halfLine.equals(n.divide(checker));                        //No odd number will have a pair of factors where one of them is greater then half of the input, "n"
            BigInteger smallestFactorOdd = new BigInteger("3");

            while (smallestFactorOdd.compareTo(halfLine) == -1){                       //Until you've found the smallest factor for add variables
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


