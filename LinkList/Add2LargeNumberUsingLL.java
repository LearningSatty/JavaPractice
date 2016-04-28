
public class Add2LargeNumberUsingLL {

	
	public static void displayListReverse(Link_List link_List) {
		if(link_List == null) {
			return;
		}
		displayListReverse(link_List.next_node);
		System.out.print(link_List.value);
	}
	
	public static void displayList(Link_List link_List) {
		if(link_List == null) {
			return;
		}
		System.out.print(link_List.value);
		displayList(link_List.next_node);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link_List list1 = new Link_List(5);
		list1.add(3);
		list1.add(9);
		list1.add(2);
		list1.add(9);
		//traverse(list1);
		System.out.print("Given Number1: ");
		displayList(list1);
		System.out.println();
		System.out.println("Reversed Number1: ");
		//displayListReverse(list1);
		list1 = list1.reverseList(list1);
		displayList(list1);
		System.out.println();
		
		Link_List list2 = new Link_List(4);
		list2.add(8);
		list2.add(9);
		list2.add(4);
		list2.add(6);
		System.out.print("Given Number2: ");
		displayList(list2);
		System.out.println();
		System.out.println("Reversed Number2: ");
		list2 = list2.reverseList(list2);
		displayList(list1);
		System.out.println();
		Link_List node1 =list1;
		Link_List node2 =list2;
		Link_List final_list = null;
		int carry=0;
		while(node1!=null && node2!=null){
			int sum = node1.value + node2.value + carry;
			
			int x = sum % 10;
			carry = sum / 10;
			
			if(final_list == null) {
				final_list = new Link_List(x);
			} else {
				Link_List temp = new Link_List(x);
				Link_List temp2 = final_list;
				while( temp2.next_node!= null) {
					temp2 = temp2.next_node;
				}
				temp2.next_node = temp;
			}
			node1 = node1.next_node;
			node2 = node2.next_node;
			
		}
		if(carry!=0)
			final_list.add(carry);
		System.out.println();
		System.out.println("Sum with Reverse: ");
		displayList(final_list);
		final_list = final_list.reverseList(final_list);
		System.out.println();
		System.out.println("finally Sum: ");
		displayList(final_list);
	}
	
	
	

}

class Link_List{
	
	Link_List next_node;
	int value;
	
	public Link_List(int value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
	
	public void add(int value){
		Link_List temp = new Link_List(value);
		Link_List temp2 = this;
		while( temp2.next_node!= null) {
			temp2 = temp2.next_node;
		}
		temp2.next_node = temp;
	}
	
	public Link_List reverseList(Link_List current) {
		// TODO Auto-generated method stub
		Link_List previousNode=null;  
		Link_List nextNode;  
		  while(current!=null)  
		  {  
		   nextNode=current.next_node;  
		  // reversing the link  
		   current.next_node=previousNode;  
		  // moving currentNode and previousNode by 1 node  
		   previousNode=current;  
		   current=nextNode;  
		  }  
		  return previousNode;  

	}
	
	
}
