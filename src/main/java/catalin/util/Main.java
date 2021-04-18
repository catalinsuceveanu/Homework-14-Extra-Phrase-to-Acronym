package catalin.util;

public class Main {
    public static void main(String[] args) {

    }

    public static String acronymator(String phrase) {
        String acronym = "";

        if (Character.isLetter(phrase.charAt(0))) {
            acronym = String.valueOf(phrase.charAt(0));
        }
        for (int i = 0; i < phrase.length(); i++) {
            if (!Character.isLetter(phrase.charAt(i)) &&
                    !isException(phrase.charAt(i)) &&
                    i + 1 < phrase.length() &&
                    Character.isLetter(phrase.charAt(i + 1))) {
                acronym = acronym + phrase.charAt(i + 1);
            }
        }
        return acronym.toUpperCase();
    }

    private static boolean isException(char input){
        return input == '\'';
    }
}
