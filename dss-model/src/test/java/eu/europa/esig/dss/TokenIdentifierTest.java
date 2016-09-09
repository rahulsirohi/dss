package eu.europa.esig.dss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TokenIdentifierTest {

	@Test
	public void testEquals() {

		byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6 };

		byte[] bytes2 = new byte[] { 1, 2, 3, 5, 5, 6 };

		TokenIdentifier t1 = new TokenIdentifier(bytes);
		TokenIdentifier t2 = new TokenIdentifier(bytes);
		TokenIdentifier t3 = new TokenIdentifier(bytes2);

		assertEquals(t1, t2);
		assertFalse(t1.equals(t3));

		String id1 = t1.asXmlId();
		String id2 = t2.asXmlId();
		String id3 = t3.asXmlId();

		assertEquals(id1, id2);
		assertFalse(id2.equals(id3));
	}

}
