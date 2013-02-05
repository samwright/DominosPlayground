package artificial_player;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Sam Wright
 * Date: 02/02/2013
 * Time: 13:55
 */
public class Bone2Test {
    @Test
    public void testEquals() throws Exception {
        assertEquals(new Bone2(1,2), new Bone2(2,1));
    }

    @Test
    public void testHashCode() throws Exception {
        assertEquals(new Bone2(1, 2).hashCode(), new Bone2(2, 1).hashCode());
    }
}
