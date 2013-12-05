package org.jboss.aerogear.cryptotest;

import org.arquillian.droidium.native_.api.Instrumentable;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;

import static org.junit.Assert.assertNotNull;

/**
 * @author <a href="mailto:tkriz@redhat.com">Tadeas Kriz</a>
 */
@RunWith(Arquillian.class)
@RunAsClient
public class CryptoTestCase {

    private static final String RIGHT_PASSWORD = "right_password";
    private static final String WRONG_PASSWORD = "wrong_password";

    @Drone
    AndroidDriver driver;

    @Deployment//(testable = false)
    @Instrumentable
    public static Archive<?> createAndroidDeployment()  {
        return Deployments.testedApk();
    }

    @Test
    public void login() {
        assertNotNull(driver);

/*        WebElement password = driver.findElementById("password");
        password.sendKeys(RIGHT_PASSWORD);

        WebElement loginButton = driver.findElementById("login");
        loginButton.click();
*/



    }

}
