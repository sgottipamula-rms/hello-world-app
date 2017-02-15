import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by sgottipamula on 2/15/17.
 */
public class FindUnionTest {

    @Test
    public void testFindAndUnion() {
        FindUnion findUnion = new FindUnion(10);

        findUnion.union(0,1);
        assertTrue(findUnion.find(0,1));
        assertFalse(findUnion.find(0,9));

        findUnion.union(1,9);
        assertTrue(findUnion.find(1,9));
        assertTrue(findUnion.find(0,9));
    }
}
