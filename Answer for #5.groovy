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

WebUI.navigateToUrl('https://www.stoodeo.com/')

WebUI.click(findTestObject('Object Repository/Page_Stoodeo  Affordable SEO  Web Design Tyler TX/span_Contact'))

WebUI.setText(findTestObject('Object Repository/Page_Free Business Website Consultation  Stoodeo/input__website'), 'Test1')

WebUI.setText(findTestObject('Object Repository/Page_Free Business Website Consultation  Stoodeo/input__name'), 'Test01')

WebUI.setText(findTestObject('Object Repository/Page_Free Business Website Consultation  Stoodeo/input__organization'), 
    'Org01')

WebUI.setText(findTestObject('Object Repository/Page_Free Business Website Consultation  Stoodeo/input__goals'), 'Goal01')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Free Business Website Consultation  Stoodeo/select_--2-4 weeks1-3 Months3-6 Months'), 
    '2-4 weeks', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Free Business Website Consultation  Stoodeo/select_--3,9505,4506,9508,450'), 
    '$3,950', true)

WebUI.setText(findTestObject('Object Repository/Page_Free Business Website Consultation  Stoodeo/input__email'), 'Test1@mailinator.com')

//WebUI.waitForElementClickable(findTestObject(null), 3)
WebUI.setText(findTestObject('Object Repository/Page_Free Business Website Consultation  Stoodeo/input__phone'), '+639120000000')

WebUI.click(findTestObject('Object Repository/Page_Free Business Website Consultation  Stoodeo/span_Send It'))

