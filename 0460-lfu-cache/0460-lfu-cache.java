class LFUCache {

    class Node {

        int key;
        int val;
        int freq;

        Node prev;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
            freq = 1;
        }
    }

    class DLL {

        Node head;
        Node tail;
        int size;

        DLL() {

            head = new Node(-1, -1);
            tail = new Node(-1, -1);

            head.next = tail;
            tail.prev = head;

            size = 0;
        }

        void add(Node node) {

            Node temp = head.next;

            head.next = node;
            node.prev = head;

            node.next = temp;
            temp.prev = node;

            size++;
        }

        void remove(Node node) {

            Node p = node.prev;
            Node n = node.next;

            p.next = n;
            n.prev = p;

            size--;
        }

        Node removeLast() {

            if (size == 0)
                return null;

            Node last = tail.prev;

            remove(last);

            return last;
        }
    }

    int capacity;
    int minFreq;

    Map<Integer, Node> keyMap;
    Map<Integer, DLL> freqMap;

    public LFUCache(int capacity) {

        this.capacity = capacity;

        keyMap = new HashMap<>();
        freqMap = new HashMap<>();

        minFreq = 0;
    }

    public int get(int key) {

        if (!keyMap.containsKey(key))
            return -1;

        Node node = keyMap.get(key);

        updateFreq(node);

        return node.val;
    }

    public void put(int key, int value) {

        if (capacity == 0)
            return;

        if (keyMap.containsKey(key)) {

            Node node = keyMap.get(key);

            node.val = value;

            updateFreq(node);

            return;
        }
        if (keyMap.size() == capacity) {

            DLL list = freqMap.get(minFreq);

            Node removeNode = list.removeLast();

            keyMap.remove(removeNode.key);
        }

        Node newNode = new Node(key, value);

        keyMap.put(key, newNode);

        minFreq = 1;

        DLL list = freqMap.getOrDefault(1, new DLL());

        list.add(newNode);

        freqMap.put(1, list);
    }

    void updateFreq(Node node) {

        int freq = node.freq;

        DLL oldList = freqMap.get(freq);

        oldList.remove(node);

        if (freq == minFreq && oldList.size == 0)
            minFreq++;

        node.freq++;

        DLL newList =
                freqMap.getOrDefault(node.freq, new DLL());

        newList.add(node);

        freqMap.put(node.freq, newList);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna