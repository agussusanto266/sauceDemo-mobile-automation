package auth

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

public class Auth {
	@Keyword
	def login(String username, String password) {
		// Input Username
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Authentication/Login/Fields/fld_username'), 15)
		Mobile.setText(findTestObject('Mobile/Android/Authentication/Login/Texts/txt_username'), username, 15)
		
		// Input Password
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Authentication/Login/Fields/fld_password'), 15)
		Mobile.setText(findTestObject('Mobile/Android/Authentication/Login/Texts/txt_password'), password, 15)
		
		// Tap action button login
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Authentication/Login/Actions/act_login'), 15)
		Mobile.tap(findTestObject('Mobile/Android/Authentication/Login/Actions/act_login'), 15)	
	}
	
	@Keyword
	def loginUseLockedCred(String username, String password) {
		// Input Username
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Authentication/Login/Fields/fld_username'), 15)
		Mobile.setText(findTestObject('Mobile/Android/Authentication/Login/Texts/txt_username'), username, 15)
		
		// Input Password
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Authentication/Login/Fields/fld_password'), 15)
		Mobile.setText(findTestObject('Mobile/Android/Authentication/Login/Texts/txt_password'), password, 15)
		
		// Tap action button login
		Mobile.waitForElementPresent(findTestObject('Mobile/Android/Authentication/Login/Actions/act_login'), 15)
		Mobile.tap(findTestObject('Mobile/Android/Authentication/Login/Actions/act_login'), 15)
	}
}
