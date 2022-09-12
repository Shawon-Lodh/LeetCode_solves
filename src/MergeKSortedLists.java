import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<Integer> getMergedListVal = getMergedList(lists);

        ListNode result = new ListNode(-1);
        ListNode current = result;

        while (!getMergedListVal.isEmpty()){
            current.next = new ListNode(getMergedListVal.poll());
            current = current.next;
        }

        return result.next;
    }

    public PriorityQueue<Integer> getMergedList(ListNode[] lists) {
        PriorityQueue<Integer> result = new PriorityQueue<>();
        for(int i = 0; i < lists.length; i++){
            ListNode temp = lists[i];
            System.out.println();
            while(temp!=null){
                result.add(temp.val);
                temp = temp.next;
            }
        }
        return result;
    }

    public void printLinkedList(ListNode result , String msg){
        ListNode resultTemp = result;
        System.out.print(msg);
        while(resultTemp!=null){
            System.out.print(resultTemp.val+" => ");
            resultTemp = resultTemp.next;
        }
    }

    public static void main(String[] args) {

        MergeKSortedLists solutionObj = new MergeKSortedLists();

        ListNode[] input = new ListNode[3];

//        for(int i = 0 ;i < inputLists.length ; i++){
//            ListNode temp = new ListNode(new Random().nextInt(100),new ListNode(new Random().nextInt(100),new ListNode(new Random().nextInt(100))));
//            inputLists[i] = temp;
//        }


        input[0] = new ListNode(1,new ListNode(4,new ListNode(5)));
        input[1] = new ListNode(1,new ListNode(3,new ListNode(4)));
        input[2] = new ListNode(2,new ListNode(6));

//        System.out.print("Input Linked List is :");
//        for(int i = 0 ;i < input.length ; i++){
//            solutionObj.printLinkedList(input[i],"Input Linked List is of index "+(i+1)+" is : ");
//            System.out.println();
//        }

        ListNode output = solutionObj.mergeKLists(input);

        solutionObj.printLinkedList(output,"Result linked list is : ");

    }

}
