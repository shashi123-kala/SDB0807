package com.sdb.tdd;

import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.Test;

public class CalculateDiscountTest {

	CalculateDiscount calculateDiscount = new CalculateDiscount();;
	@Test
	public void initializeToBuyBook() {
		assertNotNull(calculateDiscount);
	}

	
}
