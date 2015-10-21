class Link{
	public int data; 
	public Link next;

	public Link(int data){

	this.data = data; 
	
	}
}

class LinkedList{
	private Link head; 
	private Link tail; 

	public boolean isEmpty(){
		if(head==null)
			return true;
		return false; 	
	}

	public void prepend(int data){
		Link link = new Link(data);
		if(head ==null)
			head = tail = link; 
		else{
		   link.next = head; 
		   head = link; 
		}
	}

	public void append(int data){
		Link link = new Link(data);
		if(head == null)
			head = tail = link;
		else{
		   tail.next = link; 
		   tail = link; 
		}
	}

	public int size(){
	  if(isEmpty())
	  	return 0; 
	
	   Link link = head;
	   int count = 0; 

	   while(link!=null){
	     count++;
	   	 link = link.next; 
	   }
	   return count; 
	}

	public int [] getDataFromFront(){
		int arr [] = new int[size()]; 
		Link link = head;
		int i = 0; 

		while(link!= null){
			arr[i]= link.data;
			link = link.next;
			i++; 
		}
		System.out.println(); 
		return arr; 
	}

	public int [] getDataFromEnd(){
		int arr [] = new int[size()]; 
		Link link = head;
		int i = arr.length-1; 

		while(link!= null){
			arr[i]= link.data;
			link = link.next;
			i--; 
		}

		return arr; 
	}

	public void reverse(){
		Link previous = null;
		Link nextLink = null;
		Link current = head; 
	
	   if(current == null)
			return;
		while(current.next!= null){
			nextLink = current.next; 
			current.next = previous; 
			previous = current;
			current = nextLink; 
		}
			current.next = previous; 
			tail = head; 
			head = current;  
		
   }
	public void reverseLinkedList() 
	{
	Link previousNode = null;
	Link currentNode = head;
	Link nextNode = null;

	tail = head;

		while (currentNode.next != null)
		{
		nextNode = currentNode.next;
		previousNode = currentNode;
		currentNode = previousNode.next;
		currentNode.next = previousNode;
		}
		head = currentNode;
	}
	public int indexOf(int data){
		Link n = head; 
		int index = 0; 

		if(isEmpty()){
			return -1; 
		}
		while(n!=null) {
			if(n.data == data)
				break; 
			n = n.next;
			index++; 
		}

		return index; 
	}
	
	public int getDataAt(int index) {
		Link n = head; 
		int i = 0; 
		if(isEmpty())
			return -1; 
		
		while(n!=null){
			if(i == index){
				return n.data;
			}
			n = n.next; 
			i++; 
		}
		return -1; 
	}
	
	public Link getLink(int index){
		Link n = head; 
		int i = 0; 
		while(n!=null){
			if(i ==index)
				break; 
			n = n.next;
			i++; 
		}
		return n; 
	}

	public void insertAt(int data, int index){
		Link n = head;
		Link newLink = new Link(data);

		if(index>size()-1)
			System.out.print("Out of Bounds!"); 
		if(index == 0){
			prepend(data);
		  	return;  
		}

		if(index == size()-1){
			append(data);
			return; 
		} 

		int count = -1; 

		while(n!=null){
			count++; 

			if(count == index - 1){
				newLink.next = n.next;
				n.next = newLink; 
				break;
			}
			n = n.next;
		}

		if(n.next == null){
			tail = n;
		}	
	}

	public void deleteFrom(int index){
		if(index == 0){
			head = head.next;
			if(head == null){
				tail = null;
			}
			return; 
		}
		if(index>size()-1)
			System.out.println("Out of Bounds!");

		if(isEmpty())
			System.out.println("List Empty!!!");

		int count = 0; 
		Link n = head;  

		while(n!=null){
			if(count == index-1){
				n.next = n.next.next; 
				break; 
			}
			count++;
			n = n.next;
		}
			if(n.next == null)
				tail = n; 
	}
	
	public void insertSorted(int val){
		Link link = new Link(val);
		Link current = head; 
		
		if(val<current.data) {
			prepend(val);
			return; 
		}
			
		while(current.next!= null) {
			if(val < current.next.data)
				break; 	
			else
				current= current.next;
		}
		link.next = current.next; 
		current.next = link; 		
	}
	
	public int sum(){
		Link current = head; 
		int sum = 0;  
			while(current!=null){
				 sum= sum + current.data;
				 current = current.next; 
			}
			return sum; 
		}	
		
		public Link copy(LinkedList ll) {
			head = new Link(ll.getDataAt(0));
			Link n = head; 
			int i = 1; 
			while(i<ll.size()){
				n.next = new Link(ll.getDataAt(i));
				n = n.next; 
				i++; 
			}
			n.next = tail; 
			return head;
		}
		
		public Link subList(LinkedList ll, int start, int end){
			
			head = new Link(ll.getDataAt(start));
			Link n = head; 
			int i = start+1; 
			while(i<=end){
				n.next = new Link(ll.getDataAt(i));
				n = n.next;
				i++;
			}
			n.next = tail; 
			return head;
		}
		
		public void concat(Link one, Link two){
		  Link x = head;
		  one = head;  
		
		  while(one.next!= null){
				one = one.next;
			}
			one.next = two; 
				
		}
		
		public static LinkedList(Link a, Link b){
			LinkedList ll = new LinkedList(); 
			while(a.next!=null || b.next!= null){
				if(a.data <= b.data){
					ll.append(a.data);
					ll.append(b.data);
					a = a.next; 
					b = b.next; 
				}
				else{
					ll.append(b.data);
					ll.append(a.data);
					a = a.next; 
					b = b.next; 
				}
			}
				if(b.next== null){
					while(a.next!=null){
						ll.append(a.data);
						a = a.next; 
					}
				}
				
				else if(a.next == null){
					while (b.next!= null) {
						ll.append(b.data);
						b = b.next;
					}
				}
		
			return ll; 
		}

	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.prepend(6);
		ll.prepend(4);
		ll.prepend(3);
		ll.prepend(2);
		ll.prepend(1);
		Print(ll.getDataFromFront());
		//ll.reverse();
		//System.out.println("data at index n= " + ll.getDataAt(2));
		ll.insertSorted(5);
		Print(ll.getDataFromFront());
		//System.out.println("sum of LL = " + ll.sum()); 
		LinkedList nl = new LinkedList(); 
		nl.prepend(21);
		nl.prepend(17);
		nl.prepend(10);
		nl.prepend(12);
		nl.prepend(8);
		//Print(nl.getDataFromFront());
		//System.out.println("New List:");
		//ll.concat(ll,nl);
		//Print(nl.getDataFromFront());
	}
	
	public LinkedList merge(LinkedList a, LinkedList b){
		
		Link x = head; 
		
		if(a.data <= b.data)
			head = a; 
		else
			head = b; 
	}

		
	public static void Print(int [] arr){
		System.out.print("[HEAD] -->");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" ["+arr[i]+ "] -->");
		}
		System.out.print(" {NULL} \n");
	}
	
	
}