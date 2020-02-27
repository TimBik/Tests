import java.io.IOException;
import java.io.InputStream;

public class SumBytesFile {
    public static long sum(InputStream is) throws IOException {
        long sum = 0;
        int n;
        while ((n = is.read()) != -1) {
            sum += n;
        }
        is.close();
        return sum;
    }
}
