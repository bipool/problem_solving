package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zulfiquer on 12/9/17.
 */
public class TrieNode {
    private Map<Character, TrieNode> children;
    private boolean endOfWord = false;

    public TrieNode() {
        this.children = new HashMap();
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(final Map<Character, TrieNode> children) {
        this.children = children;
    }

    public boolean isEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(final boolean endOfWord) {
        this.endOfWord = endOfWord;
    }
}
