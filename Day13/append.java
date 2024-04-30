public void append(int value){
        Node n=new Node(value);
        if(length==0){
            head=n;
            tail=n;
        }else {
            tail.next=n;
            tail=n;

        }
        length++;
   }
