public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        for(int i=2; i<=n; i++){
            if(first == null) return null;
            first = first.next;
        }
        if(first == null) return null;
        if(first.next == null) return head.next;
        first =first.next;
        ListNode second = head;
        ListNode prev = null;
        while(first != null){
            first = first.next;
            prev = second;
            second = second.next;
        }
        if(prev == null) return null;
        prev.next = second.next;
        return head;
    }
}
