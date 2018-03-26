package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {
	Stack<Interger> bracketCount = new Stack<Interger>();
	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}")s);
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		return false;
	}
	
	boolean doBracketsMatch(){
		if(its a open braket) {
			bracketCount.push(bracket representor);
		}
		if(its a closed brackt) {
			bracketCount.pop(brackt represetor);
			}
		if(bracketCount.size= 0) {
			return true;
		}
		else
		return false;
	}
	
	
	
}