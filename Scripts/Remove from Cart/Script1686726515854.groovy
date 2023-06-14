import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.verifyElementVisible(findTestObject('button_remove_first_item_absolute'))

WebUI.click(findTestObject('button_remove_first_item_absolute'))

WebUI.verifyElementVisible(findTestObject('text_dynamic', [('text') : item_dua]))