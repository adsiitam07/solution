
/*
 * Verifico cual es la cadena que se tiene que comparar buscando la primera repeticiond de la primera letra.
 * Como conozco su externsion, puedo moverme a traves de la cadena para verificar si es igual a lo que quiero comparar.
 * La solucion no es optima, porque no encuentro aquellas cadenas cuyas letras se repitan incluso en la cadena que se repite.
 * 
 * */
public class Solution {
  public static boolean problema(String s) {
	    boolean sol = true;
	    boolean notFound = true;
	    char primeraCaracter = s.charAt(0);
	    int i = 1;
	    
	    while (notFound && i < s.length()) {
	    	if(primeraCaracter == s.charAt(i)) {
	    		notFound = false;
	    	}
	    	i++;
	    }
	    
	    String aComparar = s.substring(0,i-1);
	    int index = i-1;
	    int end = i-1 + aComparar.length();
	    
	    while(sol && index < s.length() && end < s.length()) {
	    	sol = aComparar.equals(s.substring(index,end));
	    	index = index+end;
	    	end = end+aComparar.length();
	    }
	    
	    return sol;
  }
  
  public static void main(String[] args) { 
	    System.out.println(problema("ferferferferfe"));
  }
  
}

