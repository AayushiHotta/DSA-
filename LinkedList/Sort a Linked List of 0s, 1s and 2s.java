public Node sortList(Node head){
    int count[] = {0,0,0}; // array to track the count of 0s, 1s and 2s

    Node temp = head;
    //count the number of 0s, 1s and 2s
    while(temp != null){
        count[temp.data]++;
        temp = temp.next;
    }

    temp = head;
    int i = 0; //traverse the count array
    //Traverse the list again, fill the first count[0] nodes with 0, then count[1] nodes with 1 and count[2] nodes with 2
    while(temp != null){
        if(count[i] == 0) i++;
        else{
            temp.data = i; //repalce the node's value in place
            count[i]--; // decrement the count after every fill
            temp= temp.next; //increment the temp to go forward in the linked list
        }
    }

    return head;
  
}
  
