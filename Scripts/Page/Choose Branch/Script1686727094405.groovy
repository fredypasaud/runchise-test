import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.verifyElementPresent(findTestObject('text_dynamic', [('text') : nama_branch]), 10)

WebUI.click(findTestObject('text_dynamic', [('text') : nama_branch]))

WebUI.waitForElementPresent(findTestObject('text_dynamic', [('text') : 'Food']), 10)