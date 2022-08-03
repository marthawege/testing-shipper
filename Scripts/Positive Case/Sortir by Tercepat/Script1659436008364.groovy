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

WebUI.openBrowser('https://shipper.id')

WebUI.click(findTestObject('Page Produk/tipe_agregatorLogistik'))

WebUI.delay(1)

WebUI.click(findTestObject('Page Shipping/field_asal'))
//ini pakai text di Xpath nya
WebUI.setText(findTestObject('Page Shipping/field_asal'), 'Tegal Parang')

//op using Xpath
WebUI.click(findTestObject('Page Shipping/Daerah/tegal_parang'))

WebUI.delay(1)

WebUI.click(findTestObject('Page Shipping/field_tujuan'))

WebUI.setText(findTestObject('Page Shipping/field_tujuan'), 'Tomang')

//op using full Xpath
//input on console "setTimeout(function(){ debugger }, 5000)"
WebUI.click(findTestObject('Page Shipping/Daerah/Tomang'))

WebUI.click(findTestObject('Page Shipping/field_berat'))

WebUI.setText(findTestObject('Page Shipping/field_berat'), '10')

WebUI.delay(1)

WebUI.click(findTestObject('Page Shipping/cek_tarifBtn'))

WebUI.delay(1)

WebUI.click(findTestObject('Page Check Rates/sortir_btn'))

WebUI.click(findTestObject('Page Check Rates/sortir_tercepat'))

