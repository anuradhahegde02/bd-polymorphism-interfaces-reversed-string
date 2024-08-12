package com.amazon.ata.interfaces;

/**
 * Reverse a String and act like a <code>CharSequence</code>.
 * <p>
 * Change this class definition to implement CharSequence.
 */
public class ReversedString implements CharSequence {

    private String reversedCharString="";
    private final String inputCharString;

    /**
     * Implement this constructor during the interfaces prework.
     *
     * @param chars The String of chars to be reversed
     */
    public ReversedString(final String chars) {
        this.inputCharString = chars;
        reverseInputString();
    }


    private void reverseInputString() {
        char ch;
        for (int i = 0; i < inputCharString.length(); i++) {
            ch = inputCharString.charAt(i); //extracts each character
            reversedCharString = ch + reversedCharString; //adds each character in front of the existing string
        }
    }

    @Override
    public int length() {
        return reversedCharString.length();
    }

    @Override
    public char charAt(int index) {

        return reversedCharString.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return reversedCharString.substring(start, end);
    }

    @Override
    public String toString() {
        return (reversedCharString.toString());

    }
}
