import java.util.*;
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode node = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }

        return node;        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;
        for(int i = 1; i < n; i++){
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }
        Solution s = new Solution();
        ListNode ans = s.reverseList(head);
        while(ans != null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
        
    }
}