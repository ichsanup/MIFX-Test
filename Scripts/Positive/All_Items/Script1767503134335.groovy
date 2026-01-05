import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Test Cases/Positive/Login_Valid'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.waitForElementClickable(findTestObject('Object Repository/Filter/Sauce Lab Backpack'), 5)
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Filter/Sauce Lab Backpack'))
WebUI.waitForElementClickable(findTestObject('Object Repository/Hamburger_Item/btn-hamburger'), 5)
WebUI.click(findTestObject('Object Repository/Hamburger_Item/btn-hamburger'))
WebUI.waitForElementVisible(findTestObject('Object Repository/Hamburger_Item/btntext-allitems'), 5)
WebUI.click(findTestObject('Object Repository/Hamburger_Item/btntext-allitems'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Filter/Sauce Lab Fleece Jacket'), FailureHandling.STOP_ON_FAILURE)
WebUI.closeBrowser()