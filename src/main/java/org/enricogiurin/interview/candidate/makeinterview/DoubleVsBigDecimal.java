package org.enricogiurin.interview.candidate.makeinterview;
//https://www.linkedin.com/pulse/why-we-should-use-bigdecimal-instead-double-java-financial-ismail

import java.math.BigDecimal;

public class DoubleVsBigDecimal {
    public static void main(String[] args) {
      //  new DoubleVsBigDecimal().sumWithDouble();
        new DoubleVsBigDecimal().sumWithBigDecimal();
    }

    static void sumWithDouble(){
        double a =2.1;
        double b =2.2;
        double c = a + b;
        System.out.println(c);
    }

    static void sumWithBigDecimal(){
        BigDecimal a = new BigDecimal("1.1");
        BigDecimal b = new BigDecimal("2.2");
        BigDecimal c = a.add(b);
        System.out.println(c);


    }
}
