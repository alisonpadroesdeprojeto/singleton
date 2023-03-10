package singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicesTest {

    @Test
    public void deveRetornarFinancialServiceHost() {
        Services.getInstance().setFinancialServiceHost("financial.example.com:4000");
        assertEquals("financial.example.com:4000", Services.getInstance().getFinancialServiceHost());
    }

    @Test
    public void deveRetornarFinancialServiceAccessKey() {
        Services.getInstance().setFinancialServiceAccessKey("EE9vm59b1kuJETXcQR055fs7O");
        assertEquals("EE9vm59b1kuJETXcQR055fs7O", Services.getInstance().getFinancialServiceAccessKey());
    }

    @Test
    public void deveRetornarFinancialServiceSecretKey() {
        Services.getInstance().setFinancialServiceSecretKey("!%X&Ske3OgjvPNyXXRw$AgZ9CquqE9VIFBI7$QXV$1D4zDdJww");
        assertEquals("!%X&Ske3OgjvPNyXXRw$AgZ9CquqE9VIFBI7$QXV$1D4zDdJww", Services.getInstance().getFinancialServiceSecretKey());
    }
}
