package org.example.CodingPractices;

public class MergingIntAndStringBySum2 {
    public static void main(String[] args) {
        Object[] mixedArray = {10, "Merhaba", 20, "Dunya", 30, "Kalbim" , 50 , "Kırık"};

        int sum = 0;
        StringBuilder concatenatedString = new StringBuilder();

        for (Object obj : mixedArray) {
            if (obj instanceof Integer) {
                sum += (int) obj;
            } else if (obj instanceof String) {
                concatenatedString.append((String) obj).append(" ");
            }
        }

        System.out.println("Sayıların toplamı: " + sum);
        System.out.println("Stringlerin birleşimi: " + concatenatedString.toString().trim());
    }
}


