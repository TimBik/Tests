import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class DownloadFile {
    public static void downloadFileBuUrl(URLConnection urlConnection,String file) throws IOException {
        InputStream is = urlConnection.getInputStream();
        OutputStream os = new FileOutputStream(file);
        int n;
        while ((n = is.read()) != -1) {
            os.write(n);
        }
    }
}
