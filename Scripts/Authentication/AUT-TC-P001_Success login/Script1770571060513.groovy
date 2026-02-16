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
Mobile.startExistingApplication(GlobalVariable.appId)
CustomKeywords.'auth.Auth.login'(validUserName, validPassword)

//Verify success login
Mobile.verifyElementText(findTestObject('Mobile/Android/Product/Texts/txt_products'), 'PRODUCTS')
Mobile.waitForElementPresent(findTestObject('Mobile/Android/Product/Images/img_burger_menu'), 15)
Mobile.waitForElementPresent(findTestObject('Mobile/Android/Product/Images/img_cart'), 15)
Mobile.waitForElementPresent(findTestObject('Mobile/Android/Product/Lists/lst_products'), 15)
Mobile.closeApplication()