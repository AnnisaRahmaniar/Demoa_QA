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

WebUI.scrollToPosition(89, 450)

WebUI.click(findTestObject('Object Repository/Button/Page_ToolsQA/Menu Elements'))

WebUI.scrollToPosition(86, 516)

WebUI.click(findTestObject('Object Repository/Button/Page_ToolsQA/Sub Menu Buttons'))

WebUI.doubleClick(findTestObject('Object Repository/Button/Page_ToolsQA/Button Double Click Me'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Button/Page_ToolsQA/Response You have done a double click'), 
    0)

WebUI.rightClick(findTestObject('Object Repository/Button/Page_ToolsQA/Button Right Click Me'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Button/Page_ToolsQA/Response You have done a right click'), 
    0)

WebUI.scrollToElement(findTestObject('Button/Page_ToolsQA/button Click Me'), 0)

'Reminder : Dynamic Button Using Relative '
WebUI.click(findTestObject('Object Repository/Button/Page_ToolsQA/button Click Me'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Button/Page_ToolsQA/Response You have done a dynamic click'), 
    0)

WebUI.closeBrowser()

