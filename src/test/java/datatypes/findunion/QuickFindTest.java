package datatypes.findunion;

import datatypes.findunion.QuickFind;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by sgottipamula on 2/15/17.
 */
public class QuickFindTest {

    @Test
    public void testFindAndUnion() {
        QuickFind quickFind = new QuickFind(10);

        quickFind.union(0,1);
        assertTrue(quickFind.find(0,1));
        assertFalse(quickFind.find(0,9));

        quickFind.union(1,9);
        assertTrue(quickFind.find(1,9));
        assertTrue(quickFind.find(0,9));
    }
}
