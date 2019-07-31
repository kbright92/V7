import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nostromo.profect.de:8444/v7-snapshot/#/login')

WebUI.setText(findTestObject('Page_BusinessRadar-Client 700/Input fields/input_Login_username (4)'), 'demo')

WebUI.setEncryptedText(findTestObject('Page_BusinessRadar-Client 700/Input fields/input_Nutzername_password (4)'), 'W3BsrpIC7rG/OMTzTgbg+A==')

WebUI.click(findTestObject('Page_BusinessRadar-Client 700/Span/span_ANMELDEN (2)'))

WebUI.click(findTestObject('Page_BusinessRadar-Client 700/Span/span_KAMPAGNENDEFINITION (1)'))

WebUI.click(findTestObject('Page_BusinessRadar-Client 700/Div/div_Kampagne modifizieren'))

CustomKeywords.'Jscript.clickUsingJS'(findTestObject('Page_BusinessRadar-Client 700/Span/span_WEITER (1)'), 0)

WebUI.waitForPageLoad(5)

CustomKeywords.'Jscript.clickUsingJS'(findTestObject('Page_BusinessRadar-Client 700/Span/span_WEITER (1)'), 0)

WebUI.waitForPageLoad(5)

CustomKeywords.'Jscript.clickUsingJS'(findTestObject('Page_BusinessRadar-Client 700/Span/span_WEITER (1)'), 5)

WebUI.waitForPageLoad(5)

CustomKeywords.'Jscript.clickUsingJS'(findTestObject('Page_BusinessRadar-Client 700/Span/span_WEITER (1)'), 0)

WebUI.waitForPageLoad(5)

CustomKeywords.'Jscript.clickUsingJS'(findTestObject('Page_BusinessRadar-Client 700/Span/span_WEITER (1)'), 0)

WebUI.waitForPageLoad(5)

CustomKeywords.'Jscript.clickUsingJS'(findTestObject('Page_BusinessRadar-Client 700/Input fields/input_Status_mat-input-13'), 0)

not_run: WebUI.click(findTestObject('Page_BusinessRadar-Client 700/Input fields/input_Status_mat-input-13'))

WebUI.closeBrowser()

