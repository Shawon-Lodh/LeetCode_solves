import LinkedListNodeClass.ListNode;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> temp = new ArrayList<>();
        ListNode result = new ListNode(-1);
        ListNode resultHead = result;
        while(head!=null){
            temp.add(head.val);
            head = head.next;
        }
        Collections.reverse(temp);
        System.out.println("List is : "+temp);

        for (Integer integer : temp) {
            resultHead.next = new ListNode(integer);
            resultHead = resultHead.next;
        }

        return result.next;
    }

    public ListNode reverseListEasyAndFastest(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
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

        ReverseLinkedList solutionObj = new ReverseLinkedList();


        ListNode input = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));

        solutionObj.printLinkedList(input,"Input linked list is : ");

        ListNode output = solutionObj.reverseList(input);

        solutionObj.printLinkedList(output,"Result linked list is : ");

    }
}
