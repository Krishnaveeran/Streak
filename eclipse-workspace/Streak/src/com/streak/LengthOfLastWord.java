package com.streak;

import java.util.ArrayList;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = " fly me to the moon ";
		// String s = "Hello World";
		//String s = "luffy is still joyboy";
		 System.out.println(       s.trim());
		int res = lengthOfLastWord(s);
		System.out.println(res);
	}

	private static int lengthOfLastWord(String s) {

		/*
		 * ArrayList<String> al = new ArrayList<String>(); String key = "";
		 * for (int i = 0; i < s.length(); i++) { if (s.charAt(i) != ' ') key = key +
		 * s.charAt(i);
		 * if (s.charAt(i) == ' ' || i == s.length() - 1) { if (key != "") al.add(key);
		 * key = ""; } }
		 * for (int i = 0; i < al.size(); i++) { if (i == al.size() - 1) return
		 * al.get(i).length(); } return 0;
		 */
		int i = s.length() - 1;
	    // Move pointer to the left while encountering consecutive spaces
	    while (i >= 0 && s.charAt(i) == ' ')
	      --i;
	    // Set lastIndex to the current position of i
	    final int lastIndex = i;
	    // Move pointer to the left until the start of the last word
	    while (i >= 0 && s.charAt(i) != ' ')
	      --i;
	    // Calculate the length of the last word
	    return lastIndex - i;
	}
}
