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

WebUI.navigateToUrl(GlobalVariable.base_url)

WebUI.scrollToElement(findTestObject('Object Repository/Text Box/Page_ToolsQA/Menu Elements'), 0)

WebUI.click(findTestObject('Object Repository/Text Box/Page_ToolsQA/Menu Elements'))

WebUI.click(findTestObject('Object Repository/Text Box/Page_ToolsQA/Sub Menu Text Box'))

WebUI.setText(findTestObject('Object Repository/Text Box/Page_ToolsQA/input Full Name'), inputfullname)

WebUI.setText(findTestObject('Object Repository/Text Box/Page_ToolsQA/input Email'), inputemail)

WebUI.setText(findTestObject('Object Repository/Text Box/Page_ToolsQA/Current Addres'), inputcurrent)

WebUI.setText(findTestObject('Object Repository/Text Box/Page_ToolsQA/Permanent Address'), inputpermanent)

WebUI.scrollToElement(findTestObject('Text Box/Page_ToolsQA/button Submit'), 0)

WebUI.click(findTestObject('Object Repository/Text Box/Page_ToolsQA/button Submit'))

WebUI.verifyElementPresent(findTestObject('Text Box/Page_ToolsQA/Name Annisa Rahmaniar Dwi Pratiwi'), 15)

WebUI.verifyElementPresent(findTestObject('Text Box/Page_ToolsQA/Email annisagmail.com'), 15)

WebUI.verifyElementPresent(findTestObject('Text Box/Page_ToolsQA/Current Address Yogyakarta'), 15)

WebUI.verifyElementPresent(findTestObject('Text Box/Page_ToolsQA/Permananet Address Yogyakarta'), 15)

WebUI.takeScreenshot('Screenshot/Elements/Text Box/Text Box 01.jpg')

WebUI.closeBrowser()

