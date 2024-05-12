public void prepend(int value) {
        Node ap = new Node(value);
        if (length == 0) {
            head = ap;
            tail = ap;
        } else {
            ap.next = head;
            head=ap;
        }
        length++;
    }
