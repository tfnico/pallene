package com.tfnico.examples.building.pallene;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalleneTest {

	@Test
	public void test() {
		Pallene pallene = new Pallene();
		assertTrue(pallene.toString().startsWith("pallene"));
	}

}
