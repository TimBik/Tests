import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SumBytesFileTest {
    @Test
    public void SumBytesTrueTest() throws IOException {
        InputStream is = mock(InputStream.class);
        when(is.read())
                .thenReturn(1)
                .thenReturn(2)
                .thenReturn(3)
                .thenReturn(4)
                .thenReturn(5)
                .thenReturn(6)
                .thenReturn(7)
                .thenReturn(8)
                .thenReturn(9)
                .thenReturn(10)
                .thenReturn(-1);
        Assert.assertEquals(55, SumBytesFile.sum(is));
    }
}
