package checkout

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Checkout {
	@Keyword
	def startCheckout() {
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Cart/Actions/act_checkout'), 15)
		Mobile.tap(findTestObject('Mobile/Android/Cart/Actions/act_checkout'), 15)
	}
	
	@Keyword
	def fillInfromationAndContinueCheckout(String firstname, String lastname, String postalcode) {
		// Wait element for filling infromation
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Checkout/Fields/fld_first_name'), 15)
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Checkout/Fields/fld_last_name'), 15)
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Checkout/Fields/fld_postal_code'), 15)
		
		// Set text 
		Mobile.setText(findTestObject('Mobile/Android/Checkout/Texts/txt_first_name'), firstname, 15)
		Mobile.setText(findTestObject('Mobile/Android/Checkout/Texts/txt_last_name'), lastname, 15)
		Mobile.setText(findTestObject('Mobile/Android/Checkout/Texts/txt_postal_code'), postalcode, 15)
		
		// Tap continue
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Checkout/Actions/act_continue'), 15)
		Mobile.tap(findTestObject('Mobile/Android/Checkout/Actions/act_continue'), 15)
	}
	
	@Keyword
	def finishCheckout() {
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Checkout/Actions/act_finish'), 15)
		Mobile.tap(findTestObject('Mobile/Android/Checkout/Actions/act_finish'), 15)
	}
}
