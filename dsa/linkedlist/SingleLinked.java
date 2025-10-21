package com.dsa.linkedlist;

public class SingleLinked {
	private Node first=null;
	private Node last=null;
	private int count;
		void add(Object e)
		{
			if(first==null)
			{
				first=new Node(e,null);
				last=first;
				count++;
				return;
			}
			last.next=new Node(e,null);
			last=last.next;
			count++;
		}
		
		
		public int size()
		{
			return count;
		}
		
		
		void add(int index,Object e)
		{
			if(index<0 && index>size())
				throw  new IndexOutOfBoundsException();
			if(index==0)
			{
				Node curr=new Node(e,first);
				first=curr;
				count++;
				return;
			}
			Node curr=first;
			for(int i=1;i<index;i++)
				curr=curr.next;
			curr.next=new Node(e,curr.next);
			count++;
		}
		
		
		void remove(int index)
		{
			if(index<0 && index>size())
				throw  new IndexOutOfBoundsException();
			if(index==0)
			{
				first=first.next;
				if(first==null) last=null;
				count--;
				return;
			}
			Node curr=first;
			for(int i=1;i<index;i++)
			{curr=curr.next;}
				curr.next=curr.next.next;
				
				if(curr.next==null) last=curr;
				count--;
			
		}
		@Override
		public String toString()
		{
			if(size()==0)
				return "[]";
			Node curr=first;String s="["+first.ele;
			while(curr.next!=null)
			{
				
				curr=curr.next;
				s=s+","+curr.ele;
			}
			s=s+"]";
			return s;
		}
}
