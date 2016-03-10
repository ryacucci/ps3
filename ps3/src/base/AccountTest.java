package base;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class AccountTest {
/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
*/
	
	Account c;
	
	@Before
	public void setUp() throws Exception {
		c = new Account(1122,2000);
		c.setAnnualIntrestRate(0.045);
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test(expected=InsufficientFunds.class)
	public final void testWithdraw() throws InsufficientFunds {
		c.depoist(3000.00);
		assertEquals("$400 Expected, actual is $3000",(long)c.getBalance(),(long)3000.00);
        c.withdraw(9000);
	}

	@Test
	public final void testDeposit() {
		c.depoist(3000);
		assertEquals(c.getBalance(),23000,001);
		
		
		}
	@Test
	public final void testgetBalance() {
		assertEquals(c.getBalance(),20000,001);
	}
	@Test
	public final void testGetID() {
		assertEquals(c.getId(),1122);
	}
}