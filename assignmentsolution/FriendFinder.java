package module5.generics;

import java.util.Collections;
import java.util.Vector;

/**
 * A class that finds friends based on generic criteria.
 * @author pbose
 *
 */
public class FriendFinder
{
	/**
	 * Static method wrapping the binary search call.
	 * @param friends
	 * @param f
	 * @return
	 */
	public static int findFriend(Vector<FriendshipCriteria<String,Integer>> friends, 
			FriendshipCriteria<String,Integer> f)
	{ return Collections.binarySearch(friends, f); }

	/**
	 * Helper method to create a friends database
	 * @param args
	 */
	protected static void createDb(Vector<FriendshipCriteria<String,Integer>> list)
	{
		list.add(new FriendshipCriteria<String,Integer>(new String("ABC DEF"), 
				new Integer(30)));
		list.add(new FriendshipCriteria<String,Integer>(new String("XYZ MNO"), 
				new Integer(40)));
	}

	public static void main(String[] args) 
	{
		// Creating the friendship criteria list
		Vector<FriendshipCriteria<String,Integer>> list = 
				new Vector<FriendshipCriteria<String,Integer>>();
		FriendFinder.createDb(list);
		
		// Search for my friend
		FriendshipCriteria<String, Integer> f = 
				new FriendshipCriteria<String, Integer>("ABC DEF", 30);
		int ret_val = FriendFinder.findFriend(list, f);

		if (ret_val < 0)
			System.out.println("Item not found...");
		else System.out.println("Item found...");
		}
}

