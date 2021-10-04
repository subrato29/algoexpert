package strings;

public class CaesarCypherEncryptor {

    public static String caesarCypherEncryptor(String str, int key) {
        StringBuilder sb = new StringBuilder();
        key = key % 26;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++) {
            int newLetter = alphabet.indexOf(str.charAt(i)) + key;
            sb.append(alphabet.charAt(newLetter % 26));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}