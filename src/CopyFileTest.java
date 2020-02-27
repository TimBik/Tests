import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CopyFileTest {
    @Test
    public void copyTrueTest() throws IOException {
        InputStream is = mock(InputStream.class);
        when(is.read()).thenReturn(12).thenReturn(13);
        OutputStream os2 = new FileOutputStream("ForCopy");
        int n = 10;
        CopyFile.copy(is, os2, n);
        InputStream is2 = new FileInputStream("ForCopy");
        Assert.assertEquals(12, is2.read());
        for (int i = 0; i < n - 1; i++) {
            Assert.assertEquals(13, is2.read());
        }
    }
}
