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

    public boolean search(String word) {
        Node node = root;

        for (char ch : word.toCharArray()) {
            if (!node.containsKey(ch)) {
                return false;
            }

            node = node.get(ch);
        }

        return node.isEnd();
    }

    public boolean startsWith(String prefix) {
        Node node = root;

        for (char ch : prefix.toCharArray()) {
            if (!node.containsKey(ch)) {
                return false;
            }

            node = node.get(ch);
        }

        return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna