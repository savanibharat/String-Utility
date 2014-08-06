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
	// Trim Set
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
}
