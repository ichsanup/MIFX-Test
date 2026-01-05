import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

response = WS.sendRequest(findTestObject('Object Repository/API/API_REQRES_PAGE2'))

WS.verifyResponseStatusCode(response, 200)