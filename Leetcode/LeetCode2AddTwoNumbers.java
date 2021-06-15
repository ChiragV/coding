import java.util.ArrayList;
import java.util.List;
/*
You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
4321+100=4421
 4->3->2->1->null
+
 0->1->0->0->null
 -------
 4->4->2->1
 
Input
[9,9,9,9,9,9,9]
[9,9,9,9]

Expected :[8,9,9,9,0,0,0,1]
 */

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class LeetCode2AddTwoNumbers {

	public static void main(String args[]) {
		
			 
		//-----------
		ListNode l1 = new ListNode(9);
		ListNode l2 = new ListNode(9, l1);
		ListNode l3 = new ListNode(9, l2);
		ListNode l4 = new ListNode(9, l3);
		ListNode l5 = new ListNode(9, l4);
		ListNode l6 = new ListNode(9, l5);
		ListNode l7 = new ListNode(9, l6);
	//	ListNode l8 = new ListNode(9, l7);
		//ListNode l9 = new ListNode(9, l8);

		ListNode l10 = new ListNode(9);
		ListNode l11= new ListNode(9, l10);
		ListNode l12 = new ListNode(9, l11);
		ListNode l13 = new ListNode(9, l12);
				
		ListNode  final1=addTwoNumbers2(l7,l13); 
				  
				  while(final1.next!=null) {
				  System.out.println(final1.val);final1=final1.next;
				  }System.out.println(final1.val); System.out.println("---------------");
			  
	}

	
	public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

		int extra = 0;
		boolean l1Done=false;
		boolean l2Done=false;
		List<Integer> list = new ArrayList<Integer>();
		while (l1.next != null || l2.next != null) {
			
			int ll1=0;
			int ll2=0;
		
			if(!l1Done)
			{
				if(l1.next!=null)
				{
					ll1 = l1.val;	
				}
				else
				{
					ll1 = l1.val;
					l1Done=true;
				}
			}
			else
			{
				ll1=0;
			}
			//------
			if(!l2Done)
			{
				if(l2.next!=null)
				{
					ll2 = l2.val;	
				}
				else
				{
					ll2 = l2.val;
					l2Done=true;
				}
			}
			else
			{
				ll2=0;
			}
			//------------
			
			int sum = extra + ll1 + ll2;

			if (sum > 9) {
				sum = sum % 10;
				extra = 1;
			} else {
				extra = 0;
			}
			list.add(sum);
			if(l1.next!=null)
			l1 = l1.next;
			if(l2.next!=null)
			l2 = l2.next;

		}
		int ll1=l1Done?0:l1.val;
		int ll2=l2Done?0:l2.val;
		int sum = extra + ll1 + ll2;
		if (sum > 9) {
			sum = sum % 10;
			list.add(sum);
			list.add(1);
		} else {
			list.add(sum);
		}
		
	//	list.add(sum);
		ListNode d1 = new ListNode(999, null);
		ListNode d2 = null;// =new ListNode(999,null);
		d2 = d1;
		for (int i = 0; i < list.size(); i++) {
			ListNode li = new ListNode(list.get(i), null);
			d1.next = li;
			d1 = li;

		}
		return d2.next;

	}
}
