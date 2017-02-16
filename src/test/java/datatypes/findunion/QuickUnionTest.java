package datatypes.findunion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by sgottipamula on 2/15/17.
 */
public class QuickUnionTest {

    @Test
    public void test() {
        QuickUnion quickUnion = new QuickUnion(10);
        quickUnion.union(0,5);
        quickUnion.union(5,9);

        quickUnion.union(1,3);
        quickUnion.union(7,3);
        quickUnion.union(7,2);

        quickUnion.union(7,9);

        assertEquals(quickUnion.root(9), quickUnion.root(0));
        assertEquals(quickUnion.root(9), quickUnion.root(5));
        assertEquals(quickUnion.root(3), quickUnion.root(7));
        assertTrue(quickUnion.find(9,0));
        assertTrue(quickUnion.find(3,2));
        assertTrue(quickUnion.find(7,5));
    }
}
