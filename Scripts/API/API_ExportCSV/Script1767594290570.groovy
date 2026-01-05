import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.builtin.GetResponseStatusCodeKeyword

// Hit API menggunakan Request Object
def response = WS.sendRequest(findTestObject('Object Repository/API/API_REQRES_PAGE2'))

// Validasi response
assert response.getStatusCode() == 200
int statusCode = response.getStatusCode()

println("Status Code: " + statusCode)

if (statusCode != 200) {
	println("Request gagal, response: " + response.getResponseText())
	return
}
// Parse JSON
def json = new JsonSlurper().parseText(response.getResponseText())

// Buat file CSV
def file = new File("Reports/users_page_2.csv")
file.text = "id,email,first_name,last_name,avatar\n"

// Loop data
json.data.each { user ->
    file.append("${user.id},${user.email},${user.first_name},${user.last_name},${user.avatar}\n")
}

println("CSV berhasil dibuat")
