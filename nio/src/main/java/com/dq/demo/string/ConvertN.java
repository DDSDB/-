package com.dq.demo.string;

public class ConvertN {

    public static String convert(String s, int numRows) {
        /**
         *      0     1   2           0 /2
         *  0   0,0       0,2
         *  1   1,0  1,1
         *  2   2,0
         *
         *       1    2   3    4    5   6   7    8
         *  0   0,0       0,2
         *  1   1,0  1,1
         *  2   2,0  2,1
         *  3   3,0
         *
         */

        
        char[][] array = new char[s.length() / numRows + 1][numRows];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int x = (i % numRows);
            int y = (i / numRows);
            array[x][y] = c;
        }

        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                System.out.print(array[i][i1]+ "    ") ;
            }
            System.out.println();
        }

        return "2";
    }

    public void addElement(char s, char[][] array, int index) {

    }


    public static void main(String[] args) {
        convert("abcdefg", 3);
    }
}
