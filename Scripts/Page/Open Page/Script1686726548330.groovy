import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://wetwo.id/')

WebUI.waitForElementVisible(findTestObject('text_dynamic', [('text') : nama_toko]), 10)

WebUI.verifyElementVisible(findTestObject('text_dynamic', [('text') : 'Lain kali']))

WebUI.click(findTestObject('text_dynamic', [('text') : 'Lain kali']))