import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.url)
WebUI.maximizeWindow()
WebUI.waitForElementClickable(findTestObject('Object Repository/Login/edt-password'), 0)
WebUI.sendKeys(findTestObject('Object Repository/Login/edt-password'), password)
WebUI.click(findTestObject('Object Repository/Login/btn-Login'))
String errorText = WebUI.getText(
	findTestObject('Object Repository/Login/Error-Massage-EmptyUsername')
)
//println("LOGIN ERROR: " + errorText)
KeywordUtil.logInfo("LOGIN ERROR: " + errorText)
WebUI.verifyMatch(
    errorText,
    'Epic sadface: Username is required',
    true
)
WebUI.closeBrowser()