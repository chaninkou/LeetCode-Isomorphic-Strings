package isomorphic;

import java.util.HashMap;
import java.util.Map;

public class CheckIsomorphicFunction {
    // Great solution
    public boolean isIsomorphic(String s, String t) {
    	// Checking null and they need to be same length
        if(s == null || t == null){
            return false;
        }
        if(s.length() != t.length()){
            return false;
        }
        
        // Each holds different key but same value as index
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
        	// Default doesn't really matter if its -1 or -2
        	// Both index will be -1 if its the first time we seen, this way the if statement won't trigger
            int indexS = mapS.getOrDefault(s.charAt(i), -1);
            int indexT = mapT.getOrDefault(t.charAt(i), -1);
            
            // This will know if it should return false or not
            // Both index need to be the same position
            if(indexS != indexT){
                return false;
            }
            
            // put the key with the value into the maps
            // This will prevent duplicates anyway
            mapS.put(s.charAt(i),i);
            mapT.put(t.charAt(i),i);
        }
        
        // Return true means it passes all the cases
        return true;
    }
    
//    public boolean isIsomorphic(String s, String t) {
//		int[] map = new int[128];
//		
//		int[] book = new int[128];
//		
//		for (int i = 0; i < s.length(); i++) {
//			int cs = (int) s.charAt(i);
//			int ts = (int) t.charAt(i);
//			
//			if (map[cs] == 0 && book[ts] == 0) {
//				map[cs] = ts;
//				book[ts] = 1;
//			} else if (map[cs] != ts)
//				return false;
//		}
//		
//		return true;
//    }
}
