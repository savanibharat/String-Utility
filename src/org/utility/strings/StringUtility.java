package org.utility.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

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
}
