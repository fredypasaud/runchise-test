import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Page/Open Page'), [('nama_toko') : 'Maestro Cafe'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page/Choose Branch'), [('nama_branch') : 'Test Loc2'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('div_popular_item_absolute'))

WebUI.click(findTestObject('div_popular_item_absolute'))

WebUI.waitForElementVisible(findTestObject('div_option_one_column_one_absolute'), 10)

WebUI.waitForElementVisible(findTestObject('div_option_one_column_two_absolute'), 10)

WebUI.verifyElementVisible(findTestObject('image_item_absolute'))

WebUI.verifyElementVisible(findTestObject('div_popup_food_absolute'))

WebUI.click(findTestObject('div_option_one_column_one_absolute'))

WebUI.click(findTestObject('div_option_one_column_two_absolute'))

WebUI.click(findTestObject('text_dynamic', [('text') : 'Tambah ke Keranjang']))

WebUI.verifyElementVisible(findTestObject('button_tambah_item_pertama_absolute'))

WebUI.click(findTestObject('button_tambah_item_pertama_absolute'))

WebUI.waitForElementVisible(findTestObject('div_option_one_column_one_absolute'), 10)

WebUI.waitForElementVisible(findTestObject('div_option_one_column_two_absolute'), 10)

WebUI.verifyElementVisible(findTestObject('image_item_absolute'))

WebUI.verifyElementVisible(findTestObject('div_popup_food_absolute'))

WebUI.click(findTestObject('div_option_one_column_one_absolute'))

WebUI.click(findTestObject('div_option_one_column_two_absolute'))

WebUI.click(findTestObject('text_dynamic', [('text') : 'Tambah ke Keranjang']))

WebUI.verifyElementClickable(findTestObject('button_cart_absolute'))

WebUI.click(findTestObject('button_cart_absolute'))

WebUI.verifyElementVisible(findTestObject('text_dynamic', [('text') : item_satu]))

WebUI.verifyElementVisible(findTestObject('text_dynamic', [('text') : item_dua]))