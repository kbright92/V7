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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://snapshot1.profect.de:1337/v7-snapshot/#/login')

WebUI.setText(findTestObject('Page_BusinessRadar-Client 700/Input fields/input_Login_username (2)'), 'demo')

WebUI.setEncryptedText(findTestObject('Page_BusinessRadar-Client 700/Input fields/input_Nutzername_password (2)'), 'W3BsrpIC7rG/OMTzTgbg+A==')

WebUI.click(findTestObject('Page_BusinessRadar-Client 700/Buttons/button_ANMELDEN (2)'))

WebUI.click(findTestObject('Page_BusinessRadar-Client 700/Buttons/button_KAMPAGNENDEFINITION (1)'))

WebUI.waitForElementClickable(findTestObject('Page_BusinessRadar-Client 700/Div/div_Kampagne erstellen'), 10)

WebUI.click(findTestObject('Page_BusinessRadar-Client 700/Div/div_Kampagne erstellen'))

WebUI.setText(findTestObject('Page_BusinessRadar-Client 700/Input fields/input_Beschreibung_mat-input-4'), 'TEst')

WebUI.click(findTestObject('Page_BusinessRadar-Client 700/Span/span_'))

WebUI.waitForElementClickable(findTestObject('Page_BusinessRadar-Client 700/Span/span_Spezialkampagnen'), 10)

WebUI.click(findTestObject('Page_BusinessRadar-Client 700/Span/span_Spezialkampagnen'))

WebUI.click(findTestObject('Page_BusinessRadar-Client 700/Span/span_'))

WebUI.waitForElementClickable(findTestObject('Page_BusinessRadar-Client 700/Span/span_Standard Kampagnenbearbeitung'), 10)

WebUI.click(findTestObject('Page_BusinessRadar-Client 700/Span/span_Standard Kampagnenbearbeitung'))

WebUI.click(findTestObject('Page_BusinessRadar-Client 700/Span/span_WEITER'))

WebUI.closeBrowser()

