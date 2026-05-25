class LRUCache {

    class Node {

        int key;
        int val;

        Node next;
        Node prev;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Node head;
    Node tail;

    int cap;

    Map<Integer, Node> map;

    public LRUCache(int capacity) {

        cap = capacity;

        map = new HashMap<>();

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    public void add(Node node) {

        Node temp = head.next;

        head.next = node;

        temp.prev = node;

        node.prev = head;
        node.next = temp;
    }

    public void delete(Node node) {

        Node temp = node.prev;
        Node temp1 = node.next;

        temp.next = temp1;
        temp1.prev = temp;
    }

    public int get(int key) {

        if(map.containsKey(key)) {

            Node node = map.get(key);

            delete(node);

            add(node);

            return node.val;
        }

        return -1;
    }

    public void put(int key, int value) {

        if(map.containsKey(key)) {

            Node existing = map.get(key);

            delete(existing);

            map.remove(key);
        }

        else if(cap == map.size()) {

            Node tal = tail.prev;

            delete(tal);

            map.remove(tal.key);
        }

        Node newNode = new Node(key, value);

        add(newNode);

        map.put(key, newNode);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna