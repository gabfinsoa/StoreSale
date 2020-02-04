package utils;

//import br.com.omni.models.BaseGeneric;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Element extends Browser {

	public static WebElement element(BaseGeneric generic) {
		switch (generic.getType()) {
		case "ID":
			return driver.findElement(By.id(generic.getValue()));
		case "CLASS":
			return driver.findElement(By.className(generic.getValue()));
		case "CSS":
			return driver.findElement(By.cssSelector(generic.getValue()));
		case "XPATH":
			return driver.findElement(By.xpath(generic.getValue()));
		case "NAME":
			return driver.findElement(By.name(generic.getValue()));
		default:
			return null;
		}
	}

	public static List<WebElement> elements(BaseGeneric generic) {
		switch (generic.getType()) {
		case "ID":
			return driver.findElements(By.id(generic.getValue()));
		case "CLASS":
			return driver.findElements(By.className(generic.getValue()));
		case "CSS":
			return driver.findElements(By.cssSelector(generic.getValue()));
		case "XPATH":
			return driver.findElements(By.xpath(generic.getValue()));
		case "NAME":
			return driver.findElements(By.name(generic.getValue()));
		default:
			return null;
		}
	}

	public static boolean exist(BaseGeneric generic) {
		switch (generic.getType()) {
		case "ID":
			try{
				driver.findElement(By.id(generic.getValue()));
				return true;
			}catch(Exception e){
				return false;
			}
		case "CLASS":
			try{
				driver.findElement(By.className(generic.getValue()));
				return true;
			}catch(Exception e){
				return false;
			}
		case "CSS":
			try{
				driver.findElement(By.cssSelector(generic.getValue()));
				return true;
			}catch(Exception e){
				return false;
			}
		case "XPATH":
			try{
				driver.findElement(By.xpath(generic.getValue()));
				return true;
			}catch(Exception e){
				return false;
			}
		case "NAME":
			try{
				driver.findElement(By.name(generic.getValue()));
				return true;
			}catch(Exception e){
				return false;
			}
		default:
			return false;
		}
	}

	public static boolean waitForElementVisible(BaseGeneric generic) {
		switch (generic.getType()) {
			case "ID":
				wait.withTimeout(10, TimeUnit.SECONDS)
						.pollingEvery(100, TimeUnit.MILLISECONDS)
						.ignoring(NoSuchElementException.class)
						.ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.visibilityOfElementLocated(By.id(generic.getValue())));
				return true;
			case "CLASS":
				wait.withTimeout(10, TimeUnit.SECONDS)
						.pollingEvery(100, TimeUnit.MILLISECONDS)
						.ignoring(NoSuchElementException.class)
						.ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.visibilityOfElementLocated(By.className(generic.getValue())));
				return true;
			case "CSS":
				wait.withTimeout(10, TimeUnit.SECONDS)
						.pollingEvery(100, TimeUnit.MILLISECONDS)
						.ignoring(NoSuchElementException.class)
						.ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(generic.getValue())));
				return true;
			case "XPATH":
				wait.withTimeout(10, TimeUnit.SECONDS)
						.pollingEvery(100, TimeUnit.MILLISECONDS)
						.ignoring(NoSuchElementException.class)
						.ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(generic.getValue())));
				return true;
			case "NAME":
				wait.withTimeout(10, TimeUnit.SECONDS)
						.pollingEvery(100, TimeUnit.MILLISECONDS)
						.ignoring(NoSuchElementException.class)
						.ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.visibilityOfElementLocated(By.name(generic.getValue())));
				return true;
		}
		return false;
	}

	public static boolean waitElement(BaseGeneric generic) {
		switch (generic.getType()) {
		case "ID":
			wait.withTimeout(10, TimeUnit.SECONDS)
				 	.pollingEvery(100, TimeUnit.MILLISECONDS)
					.ignoring(NoSuchElementException.class)
					.ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.presenceOfElementLocated(By.id(generic.getValue())));
			return true;
		case "CLASS":
			wait.withTimeout(10, TimeUnit.SECONDS)
					.pollingEvery(100, TimeUnit.MILLISECONDS)
					.ignoring(NoSuchElementException.class)
					.ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.presenceOfElementLocated(By.className(generic.getValue())));
			return true;
		case "CSS":
			wait.withTimeout(10, TimeUnit.SECONDS)
					.pollingEvery(100, TimeUnit.MILLISECONDS)
					.ignoring(NoSuchElementException.class)
					.ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(generic.getValue())));
			return true;
		case "XPATH":
			wait.withTimeout(10, TimeUnit.SECONDS)
					.pollingEvery(100, TimeUnit.MILLISECONDS)
					.ignoring(NoSuchElementException.class)
					.ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(generic.getValue())));
			return true;
		case "NAME":
			wait.withTimeout(10, TimeUnit.SECONDS)
					.pollingEvery(100, TimeUnit.MILLISECONDS)
					.ignoring(NoSuchElementException.class)
					.ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.presenceOfElementLocated(By.name(generic.getValue())));
			return true;
		}
		return false;
	}

	public static boolean isClickable(BaseGeneric generic){
		switch (generic.getType()) {
			case "ID":
				wait.until(ExpectedConditions.elementToBeClickable(By.id(generic.getValue())));
				return true;
			case "CLASS":
				wait.until(ExpectedConditions.elementToBeClickable(By.className(generic.getValue())));
				return true;
			case "CSS":
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(generic.getValue())));
				return true;
			case "XPATH":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(generic.getValue())));
				return true;
			case "NAME":
				wait.until(ExpectedConditions.elementToBeClickable(By.name(generic.getValue())));
				return true;
		}
		return false;
	}

	public static void staticWait(int timeout){
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
