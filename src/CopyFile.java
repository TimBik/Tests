import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {

    public static void copy(InputStream is, OutputStream os, int nBytes) throws IOException {
        int n;
        while (nBytes > 0 && (n = is.read()) != -1) {
            os.write(n);
            nBytes--;
        }
        os.close();
        is.close();
    }
}
