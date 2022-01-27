public class compare {
    public static void main(String[] args) {
//        Queue<CCNode> heap = new PriorityQueue<>();
//        heap.offer(new CCNode(2));
//        heap.offer(new CCNode(1));
//        heap.offer(new CCNode(3));
//        System.out.println(heap.peek().value);

//        Set<CCNode> set = new TreeSet<>(new Comparator<CCNode>() {
//            @Override
//            public int compare(CCNode o1, CCNode o2) {
//                return o2.value - o1.value;
//            }
//        });
        Set<CCNode> set = new TreeSet<>((n1, n2) -> n2.value - n1.value);
        set.add(new CCNode(2));
        set.add(new CCNode(1));
        set.add(new CCNode(3));
        System.out.println(set.stream().findFirst().get().value);

    }

}

class MyComparator implements Comparator<CCNode> {
    @Override
    public int compare(CCNode n1, CCNode n2) {
        return n2.value - n1.value;
    }
}

class CCNode implements Comparable<CCNode>{
    int value;
    CCNode(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(CCNode other) {
        if (this.value == other.value) {
            return 0;
        }
        return this.value < other.value? -1: 1; // bit wise operation

//        return this.value - other.value;  // integer overflow   Integer.MIN_VALUE - Integer.MAX_VALUE;
    }

    // int res = node1.compareTo(node2)
    // Node (value, key, firstName, lastName)
}

}
