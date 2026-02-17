package screens

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

public class CheckoutInformationScreen {

	@Keyword
	def tapBtnContinue() {
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Pages/CheckoutInformationPages/btnContinue'), 15)
		Mobile.tap(findTestObject('Mobile/Android/Pages/CheckoutInformationPages/btnContinue'), 15)
	}
	
	@Keyword
	def inputFirstName(String firstName) {
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Pages/CheckoutInformationPages/inputFirstName'), 15)
		Mobile.setText(findTestObject('Mobile/Android/Pages/CheckoutInformationPages/inputFirstName'), firstName, 15)
	}
	
	@Keyword
	def inputLastName(String lastName) {
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Pages/CheckoutInformationPages/inputLastName'), 15)
		Mobile.setText(findTestObject('Mobile/Android/Pages/CheckoutInformationPages/inputLastName'), lastName, 15)
	}
	
	@Keyword
	def inputPostalCode(String postalCode) {
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Pages/CheckoutInformationPages/inputPostalCode'), 15)
		Mobile.setText(findTestObject('Mobile/Android/Pages/CheckoutInformationPages/inputPostalCode'), postalCode, 15)
	}
}
