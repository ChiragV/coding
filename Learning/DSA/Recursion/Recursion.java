package DSA.Recursion;

public class Recursion
{

    static class Node
    {
        int data;
        Node next;

        Node(int val)
        {
            this.data = val;
        }

        public void setNext(Node list)
        {
            this.next = list;
        }

        public Node getNext(Node list)
        {
            return this.next;
        }
    }

    public static void main(String[] args)
    {
        // System.out.println(getSumOfArray(new int[]{1, 2, 3, 4}));
        System.out.println(fibo(6));

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        one.setNext(two);
        two.setNext(three);
        three.setNext(four);
        four.setNext(five);


    }

    //--------------------------------------------
    public Node reverseList(Node head)
    {
        if (head == null || head.next == null)
            return head;
        return null;
    }

    //--------------------------------------------
    public static int fibo(int n)
    {
        if (n < 3) return 1;
        else
            return fibo(n - 1) + fibo(n - 2);
    }

    //--------------------------------------------
    public static int getSumOfArray(int arr[])
    {
        return _mySum(arr, 0);
    }

    private static int _mySum(int arr[], int index)
    {
        if (index == arr.length) return 0;

        return arr[index] + _mySum(arr, index + 1);
    }

    //--------------------------------------------
}



