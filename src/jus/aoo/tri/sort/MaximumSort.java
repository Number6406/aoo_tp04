package jus.aoo.tri.sort;

import java.util.Comparator;

import jus.aoo.tri.Tri;

/**
 * Coût théorique : O(somme de 1 à N)
 *
 */
public class MaximumSort extends Tri {
	
	public int ite = 0;

	@Override
	protected <T> T[] sort(T[] t, Comparator<T> c) {
		int max;
		for (int i = t.length-1; i >=0; i--) {
			max = rangmax(t,i,c);
			swap(t,max,i);
		}
		int somme = 0;
		for(int i = 1; i<=t.length; i++) {
			somme += i;
		}
		System.out.println("Vérification, somme de 1 à "+ t.length + " ( " + somme + " ) ?= coût théorique : " + ite);
		return t;
	}
	
	private <T> int rangmax(T[] t, int taille,Comparator<T> c){
		int max;
		max = 0;
		
		for (int i = 0; i <= taille; i++) {
			if(c.compare(t[i],t[max])>0)max = i;
			ite++;
		}
		return max;
		
	}

}
