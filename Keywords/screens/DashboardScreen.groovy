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
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class DashboardScreen {

	@Keyword
	def tapBtnBurgerMenu() {
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Pages/DashboardPages/btnBurgerMenu'), 15)
		Mobile.tap(findTestObject('Mobile/Android/Pages/DashboardPages/btnBurgerMenu'), 15)
	}
	
	@Keyword
	def tapBtnAddProduct() {
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Pages/DashboardPages/btnAddProduct'), 15)
		Mobile.tap(findTestObject('Mobile/Android/Pages/DashboardPages/btnAddProduct'), 15)
	}
	
	@Keyword
	def tapBtnRemoveProduct() {
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Pages/DashboardPages/btnRemove'), 15)
		Mobile.verifyElementVisible(findTestObject('Mobile/Android/Pages/DashboardPages/btnRemove'), 15, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Mobile/Android/Pages/DashboardPages/btnRemove'), 15)
	}
	
	@Keyword
	def tapBtnCart() {
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Pages/DashboardPages/btnCart'), 15)
		Mobile.verifyElementVisible(findTestObject('Mobile/Android/Pages/DashboardPages/btnCart'), 15)
		Mobile.tap(findTestObject('Mobile/Android/Pages/DashboardPages/btnCart'), 15)
	}
}
