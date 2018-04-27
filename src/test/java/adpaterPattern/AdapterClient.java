package adpaterPattern;

import org.junit.Test;

public class AdapterClient {
	
	@Test
	public void testAdapter() {
		System.out.println("Testing Adpater Pattern");
		System.out.println("using Archer to throw fireballs");
		Wizard wizard = new Adpater(new NormalArcher());
		wizard.fireBall();
	}
}
