import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DownloadFileTest {
    @Test
    public void downloadFileTrueTest() throws IOException {
        URLConnection urlConnection = mock(URLConnection.class);
        InputStream isMock = mock(InputStream.class);
        when(isMock.read()).thenReturn(123).thenReturn(122).thenReturn(-1);
        when(urlConnection.getInputStream()).thenReturn(isMock);
        String file = "myFile";
        DownloadFile.downloadFileBuUrl(urlConnection,file);
        InputStream is = new FileInputStream(file);
        int n = is.read();
        Assert.assertEquals(123,n);
        while((n = is.read()) != -1){
            Assert.assertEquals(122,n);
        }

    }

}
