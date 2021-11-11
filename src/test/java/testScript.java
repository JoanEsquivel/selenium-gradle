import org.testng.annotations.Test;

import java.util.Properties;

public class testScript {

    @Test
    public void test(){
        String url = System.getProperty("url");

        System.out.println("Hi, I am a test executed by Gradle, and this is the URL from the CLI: " + url);
    }
}
