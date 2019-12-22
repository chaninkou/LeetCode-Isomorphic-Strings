package isomorphic;

public class Main {
	public static void main(String[] args) {
		String s = "paper";
		String t = "title";
		
		System.out.println("S: " + s + " and " + "T: " + t); 
		
		CheckIsomorphicFunction solution = new CheckIsomorphicFunction();
		
		System.out.println("Solution: " + solution.isIsomorphic(s, t));
	}
}
