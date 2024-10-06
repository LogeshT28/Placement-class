import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LLMergeListIntoLL {
    Node head;
    LLMergeListIntoLL(){
        head=null;
    }
    public Node mergeKList(Node[] lists){
        if(lists ==null || lists.length==0){
            return null;
        }
        return mergeLists(lists,0,lists.length-1);
    }

    public Node mergeLists(Node[] lists,int start,int end){
        if(start== end){
            return lists[start];
        }
        int mid = start+(end-start)/2;
        Node left = mergeLists(lists, start, mid);
        Node right = mergeLists(lists, mid+1, end);

        return mergeTwoLists(left,right);
    }


    public Node mergeTwoLists(Node l1,Node l2){
        Node dummy = new Node(0);
        Node temp = dummy;

        while(l1 != null && l2 != null){
            if(l1.data <= l2.data){
                temp.next = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if(l1 !=null){
            temp.next = l1;
        }
        else{
            temp.next = l2;
        }


        return dummy.next;
    }

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        
        LLMergeListIntoLL obj = new LLMergeListIntoLL();

        // Get the number of linked lists from the user
        System.out.println("Enter the number of linked lists:");
        int n = s.nextInt();

        // Array to hold the head nodes of the linked lists
        Node[] lists = new Node[n];

        // Get each linked list from the user
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number of elements in list " + (i + 1) + ":");
            int numElements = s.nextInt();

            Node head = null;
            Node tail = null;

            // Read the elements for the current list
            System.out.println("Enter the elements for list " + (i + 1) + ":");
            for (int j = 0; j < numElements; j++) {
                int element = s.nextInt();
                Node newNode = new Node(element);

                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = tail.next;
                }
            }

            // Store the head of the current list
            lists[i] = head;
        }

        // Merge all the linked lists
        Node mergedHead = obj.mergeKList(lists);

        // Display the merged linked list
        System.out.println("Merged sorted linked list:");
        obj.display(mergedHead);

        s.close();




    }


}
