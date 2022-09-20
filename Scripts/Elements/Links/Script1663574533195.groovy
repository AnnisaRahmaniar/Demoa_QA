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

WebUI.scrollToElement(findTestObject('Object Repository/Links/Page_ToolsQA/Menu Elements'), 0)

WebUI.click(findTestObject('Object Repository/Links/Page_ToolsQA/Menu Elements'))

WebUI.scrollToElement(findTestObject('Links/Page_ToolsQA/Sub Menu Links'), 0)

WebUI.click(findTestObject('Object Repository/Links/Page_ToolsQA/Sub Menu Links'))

WebUI.click(findTestObject('Object Repository/Links/Page_ToolsQA/Click Link Home'))

WebUI.navigateToUrl('https://demoqa.com/')

'Switch digunkan ketika ada screen yang bertumpuk'
WebUI.navigateToUrl('https://demoqa.com/links')

WebUI.scrollToElement(findTestObject('Links/Page_ToolsQA/Click Link Created'), 0)

'Not Clickable : Periksa id mungkin dinamic'
WebUI.click(findTestObject('Object Repository/Links/Page_ToolsQA/Click Link Created'))

'Object is null : Periksa Object mungkin salah Object Repo'
WebUI.verifyElementPresent(findTestObject('Links/Page_ToolsQA/Response Created'), 15)

WebUI.click(findTestObject('Object Repository/Links/Page_ToolsQA/Click Link No Content'))

WebUI.verifyElementPresent(findTestObject('Links/Page_ToolsQA/Response No Contend'), 15)

WebUI.click(findTestObject('Object Repository/Links/Page_ToolsQA/Click Link Not Found'))

WebUI.verifyElementPresent(findTestObject('Links/Page_ToolsQA/Response Not Found'), 15)

WebUI.switchToDefaultContent()

