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


String validUserName = GlobalVariable.userName
String validPassword = GlobalVariable.password

// Start application
//Mobile.executeShellCommand("pm clear ${GlobalVariable.appId}")
Mobile.startExistingApplication(GlobalVariable.appId)

// Verify mandatroy element 
Mobile.waitForElementPresent(findTestObject('Mobile/Android/Authentication/Login/Fields/fld_username'), 15)
//Mobile.verifyElementText(findTestObject('Mobile/Android/Authentication/Login/Texts/txt_username'), 'Username')
Mobile.setText(findTestObject('Mobile/Android/Authentication/Login/Texts/txt_username'), validUserName, 15)

Mobile.waitForElementPresent(findTestObject('Mobile/Android/Authentication/Login/Fields/fld_password'), 15)
//Mobile.verifyElementText(findTestObject('Mobile/Android/Authentication/Login/Texts/txt_password'), 'Password')
Mobile.setText(findTestObject('Mobile/Android/Authentication/Login/Texts/txt_password'), validPassword, 15)

// Tap action button login
Mobile.waitForElementPresent(findTestObject('Mobile/Android/Authentication/Login/Actions/act_login'), 15)
Mobile.tap(findTestObject('Mobile/Android/Authentication/Login/Actions/act_login'), 15)
//Mobile.tap(findTestObject('Mobile/Android/Authentication/Login/Texts/txt_login'), 15)

//Verify success login
Mobile.verifyElementText(findTestObject('Mobile/Android/Product List Page/Texts/txt_products'), 'PRODUCTS')
Mobile.waitForElementPresent(findTestObject('Mobile/Android/Product List Page/Images/img_burger_menu'), 15)
Mobile.waitForElementPresent(findTestObject('Mobile/Android/Product List Page/Images/img_cart'), 15)
Mobile.waitForElementPresent(findTestObject('Mobile/Android/Product List Page/Lists/lst_products'), 15)
Mobile.delay(5)
Mobile.closeApplication()


