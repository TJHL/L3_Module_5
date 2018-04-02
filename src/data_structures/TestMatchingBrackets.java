package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {
	Stack<Integer> bracketCount = new Stack<Integer>();
	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	
	boolean doBracketsMatch(String b){
		for (int i = 0; i < b.length(); i++) {
			
		
		if(b.charAt(i)=='{') {
			bracketCount.push(1);
			
		}
		if(b.charAt(i)=='}') {
			bracketCount.pop();
			}
		
		}	
		if(bracketCount.size()== 0) {
			return true;
		}
		else
		return false;
	
	
	
	}
}