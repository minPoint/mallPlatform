package org.minpoint;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * @ClassName Dem
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/5 14:27
 */
public class Demo{
    private static Pattern humpPattern = Pattern.compile("[A-Z]");

    public static void main(String[] args) {
        String a = "hello %s";
        System.out.println(String.format(a, "parentId"));

    }


    class A {
        private char a;
        private Character a1;

        private int b;
        private Integer b1;

        private byte c;
        private Byte c1;

        private short d;
        private Short d1;

        private long e;
        private Long e1;

        private float f;
        private Float f1;

        private double g;
        private Double g1;

        private boolean h;
        private Boolean h1;

        private String i;
    }
}
