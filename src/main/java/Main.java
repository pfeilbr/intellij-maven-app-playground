import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello There!");
        AmazonS3Client s3 = new AmazonS3Client();
        List<Bucket> buckets = s3.listBuckets();
        for (Bucket b : buckets) {
            System.out.println(b.getName());
        }

    }

}
