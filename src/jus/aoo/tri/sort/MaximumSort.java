package jus.aoo.tri.sort;

import java.util.Comparator;

import jus.aoo.tri.Tri;

public class MaximumSort extends Tri {

	@Override
	protected <T> T[] sort(T[] t, Comparator<T> c) {
		int max;
		for (int i = t.length-1; i >=0; i--) {
			max = rangmax(t,i,c);
			echange(t,max,i);
		}
		return t;
	}
	
	private <T> void echange(T[] t, int indice1, int indice2){
		T temp;
		temp = t[indice2];
		t[indice2]=t[indice1];
		t[indice1]=temp;
	}
	
	private <T> int rangmax(T[] t, int taille,Comparator<T> c){
		int max;
		max = 0;
		
		for (int i = 0; i < taille; i++) {
			if(c.compare(t[i],t[max])>0)max = i;
		}
		return max;
		
	}

}
