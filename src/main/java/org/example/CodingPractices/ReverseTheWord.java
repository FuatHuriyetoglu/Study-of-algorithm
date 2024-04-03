package org.example.CodingPractices;


 //Bir string içindeki karakterleri tersine çeviren bir Java programı yazın.

    public class ReverseTheWord {
        public static void main(String[] args) {
            String original = "fuat mersin üniversitesini bitirdi";
            String reversed = reverseString(original);
            System.out.println("Tersine çevrilmiş string: " + reversed);
        }

        public static String reverseString(String str) {
            StringBuilder reversed = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }
            return reversed.toString();
        }
    }

