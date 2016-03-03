package jus.aoo.tri.triable;

import java.util.Comparator;

import jus.aoo.tri.Triable;

public class StringTriable implements Triable<String> {

	public String newInstance() {
		int val = (int)(Math.random() * 100000);
		return Integer.toString(val);
	}

	public Comparator<String> comparator() {
		return String.CASE_INSENSITIVE_ORDER;
	}

	public String toString(String t) {
		return t;
	}

	public long count() {
		return 0;
	}

	public void resetCount() {};

}
