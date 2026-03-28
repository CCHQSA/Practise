//import java.util.Collections;
//import java.util.List;
//
//public class LeetCode21 {
//
//
//    public class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode() {
//        }
//
//        ListNode(int val) {
//            this.val = val;
//        }
//
//        ListNode(int val, ListNode next) {
//            this.val = val;
//            this.next = next;
//        }
//    }
//
//        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode listNode = new ListNode();
//            while (list1.next != null && list1.val != null){
//                if (list1.val > list2.val){
//                    listNode.val = list1.val;
//                }else if(list1.val < list2.val) {
//                    listNode.val = list2.val;
//                }else {
//                    listNode.val = list1.val;;
//                }
//                list1.next = list1.next.next;
//            }
//            return listNode;
//    }
//
//}
