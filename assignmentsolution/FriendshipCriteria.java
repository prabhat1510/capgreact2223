package module5.generics;

class FriendshipCriteria<T extends Comparable<? super T>, S extends Comparable<? super S>> 
		implements Comparable<FriendshipCriteria<T,S>>
{
	T t = null;
	S s = null;
	
	public FriendshipCriteria(T t, S s) 
	{
		this.t = t;
		this.s = s;
	}
	
	@Override
	public int compareTo(FriendshipCriteria<T, S> o) 
	{
		int val = t.compareTo(o.t);
		if (val == 0)
			val = s.compareTo(o.s);
			
		return val; 
	}
}
