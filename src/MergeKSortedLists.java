import java.util.PriorityQueue;
public class MergeKSortedLists {
    public LinkedListNodeClass.ListNode mergeKLists(LinkedListNodeClass.ListNode[] lists) {

        PriorityQueue<Integer> getMergedListVal = getMergedList(lists);

        LinkedListNodeClass.ListNode result = new LinkedListNodeClass.ListNode(-1);
        LinkedListNodeClass.ListNode current = result;

        while (!getMergedListVal.isEmpty()){
            current.next = new LinkedListNodeClass.ListNode(getMergedListVal.poll());
            current = current.next;
        }

        return result.next;
    }

    public PriorityQueue<Integer> getMergedList(LinkedListNodeClass.ListNode[] lists) {
        PriorityQueue<Integer> result = new PriorityQueue<>();
        for(int i = 0; i < lists.length; i++){
            LinkedListNodeClass.ListNode temp = lists[i];
            System.out.println();
            while(temp!=null){
                result.add(temp.val);
                temp = temp.next;
            }
        }
        return result;
    }

    public void printLinkedList(LinkedListNodeClass.ListNode result , String msg){
        LinkedListNodeClass.ListNode resultTemp = result;
        System.out.print(msg);
        while(resultTemp!=null){
            System.out.print(resultTemp.val+" => ");
            resultTemp = resultTemp.next;
        }
    }

    public static void main(String[] args) {

        MergeKSortedLists solutionObj = new MergeKSortedLists();

        LinkedListNodeClass.ListNode[] input = new LinkedListNodeClass.ListNode[3];

//        for(int i = 0 ;i < inputLists.length ; i++){
//            LinkedListNodeClass.ListNode temp = new LinkedListNodeClass.ListNode(new Random().nextInt(100),new LinkedListNodeClass.ListNode(new Random().nextInt(100),new LinkedListNodeClass.ListNode(new Random().nextInt(100))));
//            inputLists[i] = temp;
//        }


        input[0] = new LinkedListNodeClass.ListNode(1,new LinkedListNodeClass.ListNode(4,new LinkedListNodeClass.ListNode(5)));
        input[1] = new LinkedListNodeClass.ListNode(1,new LinkedListNodeClass.ListNode(3,new LinkedListNodeClass.ListNode(4)));
        input[2] = new LinkedListNodeClass.ListNode(2,new LinkedListNodeClass.ListNode(6));

//        System.out.print("Input Linked List is :");
//        for(int i = 0 ;i < input.length ; i++){
//            solutionObj.printLinkedList(input[i],"Input Linked List is of index "+(i+1)+" is : ");
//            System.out.println();
//        }

        LinkedListNodeClass.ListNode output = solutionObj.mergeKLists(input);

        solutionObj.printLinkedList(output,"Result linked list is : ");

    }

}
