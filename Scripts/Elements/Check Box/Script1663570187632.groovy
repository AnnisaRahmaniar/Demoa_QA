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

WebUI.scrollToElement(findTestObject('Object Repository/Check Box/Page_ToolsQA/Menu Elements'), 0)

WebUI.click(findTestObject('Object Repository/Check Box/Page_ToolsQA/Menu Elements'))

WebUI.click(findTestObject('Object Repository/Check Box/Page_ToolsQA/Check Box'))

WebUI.click(findTestObject('Object Repository/Check Box/Page_ToolsQA/Toggle Home'))

WebUI.click(findTestObject('Object Repository/Check Box/Page_ToolsQA/Toggle Sub Menu'))

WebUI.click(findTestObject('Object Repository/Check Box/Page_ToolsQA/Check Desktop'))

notes = WebUI.getText(findTestObject('Object Repository/Check Box/Page_ToolsQA/Response Notes'))

WebUI.verifyTextPresent(notes, false)

WebUI.click(findTestObject('Object Repository/Check Box/Page_ToolsQA/Toggle Sub Menu'))

WebUI.click(findTestObject('Object Repository/Check Box/Page_ToolsQA/Check WorkSpace'))

workspace = WebUI.getText(findTestObject('Object Repository/Check Box/Page_ToolsQA/Response Workspace'))

WebUI.verifyTextPresent(workspace, false)

WebUI.closeBrowser()

