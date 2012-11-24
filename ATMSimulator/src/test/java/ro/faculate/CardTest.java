package ro.faculate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {

	@Test
	public void shouldCreateCard() {
		Card card = new Card("gigi", 1);

		assertEquals("gigi", card.getTitular());
	}

}
