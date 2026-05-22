import java.util.*;

class Solution {

    class Node {

        Node[] node = new Node[26];
        boolean flag = false;

        boolean containsKey(char ch) {
            return node[ch - 'a'] != null;
        }

        Node get(char ch) {
            return node[ch - 'a'];
        }

        void put(char ch, Node newNode) {
            node[ch - 'a'] = newNode;
        }

        boolean isEnd() {
            return flag;
        }

        void setEnd() {
            flag = true;
        }
    }

    class Trie {

        private Node root;

        public Trie() {
            root = new Node();
        }

        public void insert(String word) {

            Node node = root;

            for (char ch : word.toCharArray()) {

                if (!node.containsKey(ch)) {
                    node.put(ch, new Node());
                }

                node = node.get(ch);
            }

            node.setEnd();
        }

        public boolean checkAllPrefix(String word) {

            Node node = root;

            for (char ch : word.toCharArray()) {

                if (!node.containsKey(ch)) {
                    return false;
                }

                node = node.get(ch);

                if (!node.isEnd()) {
                    return false;
                }
            }

            return true;
        }
    }

    public String longestValidWord(String[] words) {

        Trie trie = new Trie();

        for (String word : words) {
            trie.insert(word);
        }

        Arrays.sort(words);

        String ans = "";

        for (String word : words) {

            if (trie.checkAllPrefix(word)) {

                if (word.length() > ans.length()) {
                    ans = word;
                }
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna