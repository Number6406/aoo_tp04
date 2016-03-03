package jus.aoo.tri.sort;

import java.util.Comparator;

import jus.aoo.tri.Tri;

public class MaximumSort extends Tri {

	@Override
	protected <T> T[] sort(T[] t, Comparator<T> c) {
		int max;
		for (int i = t.length-1; i >=0; i--) {
			max = rangmax(t,i,c);
			swap(t,max,i);
		}
		return t;
	}
	
	private <T> int rangmax(T[] t, int taille,Comparator<T> c){
		int max;
		max = 0;
		
		for (int i = 0; i <= taille; i++) {
			if(c.compare(t[i],t[max])>0)max = i;
		}
		return max;
		
	}

}
