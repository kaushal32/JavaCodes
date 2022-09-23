public class AddTwoNums {
        int d = 0;

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null && l2 == null){
                if(d!= 0){
                    l1 = new ListNode(d);
                }
                return l1;
            }

            if (l1 == null){
                l1 = l2;
                l2 = null;
                addTwoNumbers(l1, l2);
                return l1;
            }

            if (l2 == null){
                d += l1.val;
                l1.val = d % 10;
                d /= 10;

                if (l1.next == null && d != 0){
                    l1.next = new ListNode(d);
                    d = 0;
                }

                addTwoNumbers(l1.next, null);

                return l1;
            }

            d += l1.val + l2.val;
            l1.val = d % 10;
            d /= 10;

            l1.next = addTwoNumbers(l1.next, l2.next);

            return l1;
        }

}
