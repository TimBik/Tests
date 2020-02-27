import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Vector2DTest {

    @Test
    public void defaultVectorHasZeroX() {
        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getX(), 1e-9);
    }


    @Test
    public void testSum() {
        Vector2D v1 = new Vector2D(1, 2);
        //Vector2D v2 = new Vector2D(5, 7);
        Vector2D v2 = mock(Vector2D.class);
        when(v2.getX()).thenReturn(5.0);
        when(v2.getY()).thenReturn(7.0);

        Assert.assertEquals(
                6, v1.add(v2).getX(), 1e-9
        );
    }

}
