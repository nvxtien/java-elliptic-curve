package com.tiennv.ec;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class Multiplication {


    /**
     * INPUT: A positive integer k.
     * OUTPUT: NAF(k).
     *        i←0.
     *        While k≥1 do
     *              If k is odd then: ki ←2−(k mod 4), k←k−ki;
     *              Else: ki ←0.
     *              k←k/2, i←i+1.
     * Return(ki−1, ki−2,..., k1, k0).
     *
     * @param k
     */
    public static List<BigInteger> NAF(BigInteger k) {
        List<BigInteger> naf = new ArrayList<>();

        int i = 0;
        BigInteger ki;
        while (k.compareTo(BigInteger.ZERO) == 1) {
            if (k.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ONE) == 0) {
                ki = BigInteger.valueOf(2).subtract(k.mod(BigInteger.valueOf(4)));
                k = k.subtract(ki);
            } else {
                ki = BigInteger.ZERO;
            }
            naf.add(ki);

            k = k.divide(BigInteger.valueOf(2));
            i = i + 1;


        }
        System.out.println(naf);

        return naf;
    }
}