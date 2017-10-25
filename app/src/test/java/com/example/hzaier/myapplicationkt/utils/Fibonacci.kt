package com.example.hzaier.myapplicationkt.utils

import java.math.BigInteger

/**
 * Created by houssem on 24/10/2017.
 */
class Fibonacci {
    companion object {


        tailrec fun fibunatciSeqFun(i: Int): BigInteger {
            if (i < 0) throw Exception("can't provide a negative number for the occurrence ")
            if (i == 0) {
                return BigInteger.valueOf(0);
            }
            if (i == 1) {
                return BigInteger.valueOf(1);
            }


            var result = fibunatciSeqFun(i - 1) + fibunatciSeqFun(i - 2);
            return result;

        }
    }
}