public Node removeLast(){
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            temp = pre;
            temp = temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if(length ==0){
            head=null;
            tail=null;
        }
        return temp;
   }
