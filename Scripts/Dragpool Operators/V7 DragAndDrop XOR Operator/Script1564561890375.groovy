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

WebUI.navigateToUrl('https://nostromo.profect.de:8444/v7-snapshot/#/main')

WebUI.click(findTestObject('Page_BusinessRadar-Client 700/Div/div_Nutzername'))

WebUI.setText(findTestObject('Page_BusinessRadar-Client 700/Input fields/input_Login_username'), 'demo')

WebUI.setEncryptedText(findTestObject('Page_BusinessRadar-Client 700/Input fields/input_Nutzername_password'), 'W3BsrpIC7rG/OMTzTgbg+A==')

WebUI.click(findTestObject('Page_BusinessRadar-Client 700/Buttons/button_ANMELDEN (1)'))

WebUI.click(findTestObject('Page_BusinessRadar-Client 700/Buttons/button_SELEKTIEREN'))

CustomKeywords.'com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDropHtml5'(findTestObject('Page_BusinessRadar-Client 700/Drag/div_XOR_operator xor'), 
    findTestObject('Object Repository/Page_BusinessRadar-Client 700/Trichter/div_VERKNPFUNG NDERN Und Oder  Ohne  XOR'))

