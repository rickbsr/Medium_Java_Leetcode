package com.rick.problems;

public class RepeatedStringMatch {

    public static void main(String[] args) {
        String A = "abcd", B = "cdabcdab";
        int res = new RepeatedStringMatch().repeatedStringMatch(A, B);
        System.out.println(res);
    }

    public int repeatedStringMatch(String A, String B) {
        String str = A;
        for (int i = 1; i <= B.length() / A.length() + 2; i++, str = A.concat(str))
            if (str.contains(B)) return i;
        return -1;
    }
}
