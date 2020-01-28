package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.lang.StringUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;
    public static WebDriverWait wait;


    public static synchronized WebDriver getCurrentDriver() {
        if (driver == null) {
            try {
                ChromeOptions options = new ChromeOptions();
                if (Boolean.valueOf(System.getProperty("headless"))) {
                    options.addArguments("--headless");
                }
                if ("Mobile".equals(Utils.getMode())) {
                    Map<String, String> mobileEmulation = new HashMap<>();
                    mobileEmulation.put("deviceName", "iPhone X");
                    options.setExperimentalOption("mobileEmulation", mobileEmulation);
                    options.addArguments("--touch-events");
                    options.addArguments("--disable-default-apps");
                } else {
                    options.addArguments("--disable-notifications");
                }
                Map<String, Object> prefs = new HashMap<String, Object>();
                prefs.put("credentials_enable_service", false);
                prefs.put("profile.password_manager_enabled", false);
                options.setExperimentalOption("prefs", prefs);
                options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
                options.setExperimentalOption("useAutomationExtension", false);
                options.addArguments("start-maximized");
//                options.addArguments("--host-resolver-rules=MAP www.google-analytics.com 127.0.0.1, MAP www.googletagmanager.com 127.0.0.1");
                if (System.getProperty("driver") == null) {
                    driver = new ChromeDriver(options);
                } else {
                    DesiredCapabilities caps = DesiredCapabilities.chrome();
                    caps.merge(options);
                    String remoteDriver = System.getProperty("remoteDriver");
                    if (StringUtils.isNotEmpty(remoteDriver)) {
                        driver = new RemoteWebDriver(new URL(System.getProperty("remoteDriver")), caps);
                    } else {
                        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
                    }
                }
                wait = new WebDriverWait(driver, 30);
                setPageLoadTimeout();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } finally {
                cleanUp();
            }
        }
        return driver;
    }

    public static void setPageLoadTimeout() {
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
    }

    public static void loadPage(String url) throws InterruptedException {
        getCurrentDriver().get(url);
        Thread.sleep(3000);
    }

    public static class BrowserCleanup implements Runnable {
        @Override
        public void run() {
            close();
        }
    }

    public static void cleanUp() {
        Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
    }

    public static void close() {
        try {
            getCurrentDriver().quit();
            driver = null;
        } catch (UnreachableBrowserException e) {
        }
    }


}
