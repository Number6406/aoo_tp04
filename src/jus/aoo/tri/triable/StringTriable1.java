package jus.aoo.tri.triable;
import java.util.Comparator;

class StringTriable1$Comparator implements Comparator<String> {
	
	public int compare(String s1, String s2) {
		if(s1.length()==s2.length()){
			return String.CASE_INSENSITIVE_ORDER.compare(s1, s2);
		}
		else{
			if(s1.length()>s2.length()){
				return 1;
			}
			else{
				return -1;
			}
		}
	}

}
public class StringTriable1 extends StringTriable {
	/** restitue l'opérateur de comparaison du Triable
	* @return un comparator
	*/
	public Comparator<String> comparator(){
		return new StringTriable1$Comparator();
	}
}
