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

WebUI.click(findTestObject('Object Repository/Page_BusinessRadar-Client 700/div_Nutzername'))

WebUI.setText(findTestObject('Object Repository/Page_BusinessRadar-Client 700/input_Login_username'), 'demo')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BusinessRadar-Client 700/input_Nutzername_password'), 'W3BsrpIC7rG/OMTzTgbg+A==')

WebUI.click(findTestObject('Page_BusinessRadar-Client 700/Buttons/button_ANMELDEN'))

WebUI.click(findTestObject('Object Repository/Page_BusinessRadar-Client 700/button_KAMPAGNENDEFINITION'))

WebUI.click(findTestObject('Object Repository/Page_BusinessRadar-Client 700/div_Kampagne erstellen'))

WebUI.setText(findTestObject('Object Repository/Page_BusinessRadar-Client 700/input_Beschreibung_mat-input-4'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_BusinessRadar-Client 700/input_Bearbeitungszeitraum von_mat-input-9'), 
    '06.09.2019')

WebUI.click(findTestObject('Object Repository/Page_BusinessRadar-Client 700/span_KAMPAGNE SPEICHERN'))

