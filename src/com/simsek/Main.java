package com.simsek;

public class Main {

    public static void main(String[] args) {

        String str = "camelCaseExpression";
        System.out.println("Before:" + str);
        str = camelCaseToSentence(str);
        System.out.println("After:" + str);
    }

    private static String camelCaseToSentence(String str) {
        String retVal = String.valueOf(str.charAt(0)).toUpperCase();
        for (int i = 1; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i)).toLowerCase();
            if (Character.isUpperCase(str.charAt(i))) {
                s = " " + s;
            }
            retVal = retVal + s;
        }
        return retVal+".";
    }
}
