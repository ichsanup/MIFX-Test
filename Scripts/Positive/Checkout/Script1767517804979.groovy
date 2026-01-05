import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Test Cases/Positive/Login_Valid'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject("Object Repository/Hamburger_Item/btn-Add-to-cart"))
WebUI.delay(3)
WebUI.waitForElementVisible(findTestObject('Object Repository/Checkout/btn-cart'), 3)
WebUI.click(findTestObject("Object Repository/Checkout/btn-cart"))
WebUI.waitForElementVisible(findTestObject('Object Repository/Checkout/btn-checkout'), 3)
WebUI.click(findTestObject('Object Repository/Checkout/btn-checkout'))
WebUI.sendKeys(findTestObject('Object Repository/Checkout/edt-firstName'), "Test")
WebUI.sendKeys(findTestObject('Object Repository/Checkout/edt-lastname'), "ter")
WebUI.sendKeys(findTestObject('Object Repository/Checkout/edt-postal-code'), "12345")
WebUI.click(findTestObject('Object Repository/Checkout/btn-continue'))
WebUI.waitForElementVisible(findTestObject('Object Repository/Checkout/btn-finish'), 3)
WebUI.click(findTestObject("Object Repository/Checkout/btn-finish"))
WebUI.waitForElementVisible(findTestObject('Object Repository/Checkout/VerfiyOrder'), 3)
WebUI.closeBrowser()
