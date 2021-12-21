package codesignal.interview.linkedList;

public class RemoveKFromList {
    static ListNode<Integer> solution(ListNode<Integer> node, int k) {
        if(node == null)
        return null;

        node.next = solution(node.next, k);

        if (node.value == k)
            return node.next;

        return node;
    }
}

class ListNode<T> {
    ListNode(T x) {
        value = x;
    }

    T value;
    ListNode<T> next;
}


