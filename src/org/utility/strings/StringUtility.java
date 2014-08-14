package org.utility.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class StringUtility {

	private static final String EMPTY = "";
	
	// ArrayList to String Array
	public static String[] listToStringArray(ArrayList<String> list) {
		if (list == null || list.size() == 0)
			return null;
		return (String[]) list.toArray(new String[0]);
	}

	// String Array to ArrayList
	public static ArrayList<String> stringArrayToArrayList(String[] strArray) {
		if (strArray.length == 0 || strArray == null) {
			return null;
		}
		return new ArrayList<String>(Arrays.asList(strArray));
	}

	// Vector to String Array
	public static String[] vectorToStringArray(Vector<String> vector) {

		if (vector == null || vector.size() == 0) {
			return null;
		}
		return (String[]) vector.toArray(new String[0]);

	}

	// String Array to Vector
	public static Vector<String> stringArrayToVector(String[] strArray) {
		if (strArray.length == 0 || strArray == null) {
			return null;
		}
		return new Vector<String>(Arrays.asList(strArray));
	}

	// LinkedList to String Array
	public static String[] linkedListToStringArray(LinkedList<String> list) {
		if (list == null || list.size() == 0) {
			return null;
		}
		return (String[]) list.toArray(new String[0]);
	}

	// String Array to Linked List
	public static LinkedList<String> stringArrayToLinkedList(String[] strArray) {
		if (strArray.length == 0 || strArray == null) {
			return null;
		}
		return new LinkedList<String>(Arrays.asList(strArray));
	}

	// Stack to String Array
	public static String[] stackToStringArray(Stack<String> stack) {
		if (stack == null || stack.size() == 0) {
			return null;
		}
		return stack.toArray(new String[0]);
	}

	// String Array to Stack
	public static Stack<String> stringArrayToStack(String[] strArray) {
		if (strArray.length == 0 || strArray == null) {
			return null;
		}
		Stack<String> stack = new Stack<String>();
		// Order of array will be same as order of stack
		stack.addAll(Arrays.asList(strArray));
		return stack;
	}

	// String Array to CopyOnWriteArrayList
	// Needs Testing
	public static CopyOnWriteArrayList<String> stringArrayToCopyOnWriteArrayList(
			String[] strArr) {
		if (strArr.length == 0 || strArr == null) {
			return null;
		}
		return new CopyOnWriteArrayList<String>(Arrays.asList(strArr));
	}

	// CopyOnWriteArrayList<String> To String Array
	public static String[] copyOnWriteArrayListToStringArray(
			CopyOnWriteArrayList<String> list) {
		if (list.size() == 0 || list == null) {
			return null;
		}
		return (String[]) list.toArray(new String[0]);
	}

	// ------------------------------------------------------------------------------------------
	// Set to Array
	public static String[] setToArray(Set<String> stringSet) {
		if (stringSet.size() == 0 || stringSet == null)
			return null;
		return stringSet.toArray(new String[0]);
	}

	// ------------------------------------------------------------------------------------------
	// Array to HashSet
	public static HashSet<String> stringArrayToSet(String[] strArr) {
		if (strArr == null || strArr.length == 0) {
			return null;
		}
		return new HashSet<String>(Arrays.asList(strArr));
	}

	// ------------------------------------------------------------------------------------------
	// Set to ArrayList
	public static ArrayList<String> setToArrayList(Set<String> stringSet) {
		if (stringSet.size() == 0 || stringSet == null)
			return null;
		return new ArrayList<String>(stringSet);
	}

	// ------------------------------------------------------------------------------------------
	// ArrayList to Set
	public static Set<String> arrayListToSet(ArrayList<String> list) {
		if (list.size() == 0 || list == null)
			return null;
		return new HashSet<>(list);
	}

	// ------------------------------------------------------------------------------------------
	// Trim Set .trim() removes spaces from front and end
	public static Set<String> trimSet(Set<String> stringSet) {
		if (stringSet == null || stringSet.size() == 0) {
			return null;
		}
		Set<String> set = new HashSet<String>();
		for (String str : stringSet) {
			set.add(str.trim());
		}
		return set;
	}
	
	// ------------------------------------------------------------------------------------------
	// Trim ArrayList
	public static ArrayList<String> trimArrayList(ArrayList<String> list) {
		if (list.size() == 0 || list == null) {
			return list;
		}
		ArrayList<String> newList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			newList.add(list.get(i).trim());
		}
		return newList;
	}
	
	// ------------------------------------------------------------------------------------------
	// is String empty
	public static boolean isEmpty(CharSequence charSeq) {
		return (charSeq == null || charSeq.length() == 0);
	}
	
	// ------------------------------------------------------------------------------------------
	// isAnyEmpty
	public static boolean isAnyEmpty(CharSequence... charSeq) {

		if (charSeq == null || charSeq.length == 0) {
			return true;
		}
		for (CharSequence c : charSeq) {
			if (isEmpty(c)) {
				return true;
			}
		}
		return false;
	}

	// ------------------------------------------------------------------------------------------
	// isNoneEmpty
	public static boolean isNoneEmpty(CharSequence... charSeq) {
		return !isAnyEmpty(charSeq);
	}
	
	// ------------------------------------------------------------------------------------------
	//trim - removes leading and trailing spaces from String
	public static String trim(String str) {
		return str == null ? null : str.trim();
	}
	
	// ------------------------------------------------------------------------------------------
	// trimToNull is empty after trim then return null else return string
	public static String trimToNull(String str) {
		String temp = trim(str);
		return isEmpty(temp) ? null : temp;
	}
	
	// ------------------------------------------------------------------------------------------
	// trimToEmpty empty is ""
	public static String trimToEmpty(String str) {
		return str == null ? EMPTY : str.trim();
	}
	
	// ------------------------------------------------------------------------------------------
	// left(String str, int length) get left side of string
	public static String left(String str, int length) {
		if (str == null) {
			return null;
		}
		if (length < 0) {
			return EMPTY;
		}
		if (str.length() <= length) {
			return str;
		}
		return str.substring(0, length);
	}
}
