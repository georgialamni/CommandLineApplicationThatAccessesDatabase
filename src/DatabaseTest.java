import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class DatabaseTest {

    private String dbUrl;
    private String dbUser;
    private String dbPassword;

    public void writeProperties() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("dbUrl", "localhost");
        prop.setProperty("dbUser", "username");
        prop.setProperty("dbPassword", "password");

        try (OutputStream out = new FileOutputStream("project.properties")) {
            prop.store(out, "Database properties File");
        }
    }
}
