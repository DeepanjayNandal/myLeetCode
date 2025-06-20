/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MyInitialSolution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;

        ListNode temp = head;
        Stack<Integer> stack = new Stack<>();

        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while (!stack.isEmpty()) {
            temp.val = stack.pop();
            temp = temp.next;
        }
        return head;
    }
}
