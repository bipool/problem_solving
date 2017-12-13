package algorithm;

/**
 * Created by zulfiquer on 12/9/17.
 */
public class Dictonary {

    private TrieNode root = new TrieNode();

    public void addWord(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (!current.getChildren().containsKey(c)) {
                current.getChildren().put(c, new TrieNode());
            }

            current = current.getChildren().get(c);
        }
        current.setEndOfWord(true);
    }

    public void deleteWord(String word) {

    }


    public boolean searchWord(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (!current.getChildren().containsKey(c)) {
                return false;
            }

            current = current.getChildren().get(c);

        }

        return current.isEndOfWord();

    }


    public boolean prefixSearch(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (!current.getChildren().containsKey(c)) {
                return false;
            }

            current = current.getChildren().get(c);

        }

        return true;
    }
}
