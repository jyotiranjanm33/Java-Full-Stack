package com.dsa;

public class List1 {
	private Object[]a=new Object[3];
	private int p=0;
	public void add(Object e)
	{
		if(p>=a.length) IncArr();
		a[p++]=e;
	}
	public void IncArr()
	{
		Object temp[]=new Object[a.length+3];
		for(int i=0;i<a.length;i++)
		{
			temp[i]=a[i];
		}
		a=temp;;
	}
	public int size()
	{
		return p;
	}
	public Object get(int index)
	{
		if(index<0 || index>=size())
			throw new IndexOutOfBoundsException();
		return a[index];
	}
	public void remove(int index)
	{
		if(index<0 || index>=size())
			throw new IndexOutOfBoundsException();
		for(int i=index;i<size()-1;i++)
		{
			a[i]=a[i+1];
		}
		a[--p]=null;
	}
	public void add(int index,Object e)
	{
		if(index<0 || index>=size())
			throw new IndexOutOfBoundsException();
		for(int i=size()-1;i>=index;i--)
		{
			a[i+1]=a[i];
		}
		a[index]=e;
		p++;
	}

	@Override
	public String toString()
	{
		if(size()==0) return "[]";
		String s="[" +a[0];
		for(int i=1;i<size();i++)
		{
			s=s+" "+a[i];
		}
		s=s+"]";
		return s;
	}
	
	public static void main(String[] args) {
	List l=new List();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	System.out.println(l.get(2));
	l.remove(2);
	System.out.println(l.get(2));
	System.out.println(l.size());
	System.out.println(l.toString());
	}
}

