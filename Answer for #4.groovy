import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.edamama.ph/')

WebUI.click(findTestObject('Page_Shop_Edamama/span_Login'))

WebUI.click(findTestObject('Page_Shop_Edamama/div_LOG IN'))

WebUI.setText(findTestObject('Page_Shop_Edamama/input_SIGN UP_mat-input-0'), 'testedamama@mailinator.com')

WebUI.setEncryptedText(findTestObject('Page_Shop_Edamama/input_Email Address_mat-input-1'), 'DwTTIjmC6TINHlIjJvfyFw==')

WebUI.click(findTestObject('Page_Shop_Edamama/button_CONTINUE'))

WebUI.click(findTestObject('Page_Shop_Edamama/mat-icon_keyboard_arrow_down'))

WebUI.click(findTestObject('Page_Shop_Edamama/button_My Profile'))

WebUI.click(findTestObject('Page_Shop_Edamama/mat-icon_keyboard_arrow_down'))

WebUI.click(findTestObject('Page_Shop_Edamama/button_My Beans'))

WebUI.click(findTestObject('Page_Shop_Edamama/mat-icon_keyboard_arrow_down'))

WebUI.click(findTestObject('Page_Shop_Edamama/button_Wishlist'))

WebUI.click(findTestObject('Page_Shop_Edamama/mat-icon_keyboard_arrow_down'))

WebUI.click(findTestObject('Page_Shop_Edamama/button_My Orders'))

WebUI.click(findTestObject('Page_Shop_Edamama/mat-icon_keyboard_arrow_down'))

WebUI.click(findTestObject('Page_Shop_Edamama/button_My Subscriptions'))

WebUI.click(findTestObject('Page_Shop_Edamama/mat-icon_keyboard_arrow_down'))

WebUI.click(findTestObject('Page_Shop_Edamama/button_Change Password'))

WebUI.click(findTestObject('Page_Shop_Edamama/button_Copyright 2023 Edamama_mat_close'))

WebUI.click(findTestObject('Page_Shop_Edamama/mat-icon_keyboard_arrow_down'))

WebUI.click(findTestObject('Page_Shop_Edamama/button_Logout'))

WebUI.click(findTestObject('Page_Shop_Edamama/mat-dialog-container_LogoutDo you wish to l_25b214'))

