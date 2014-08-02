package org.utility.strings;

import java.util.ArrayList;
import java.util.Arrays;

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
}
