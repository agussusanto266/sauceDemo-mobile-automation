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

String username = GlobalVariable.userName
String password = GlobalVariable.password
String firstname = GlobalVariable.firstName
String lastname = GlobalVariable.lastName
String postalcode = GlobalVariable.postalcode

Mobile.startExistingApplication(GlobalVariable.appId, FailureHandling.STOP_ON_FAILURE)

// Login app
CustomKeywords.'auth.Auth.login'(username, password)

// Add product to cart
CustomKeywords.'product.Cart.addProductToCart'()

// Tap open cart menu
CustomKeywords.'product.Cart.openCart'()

// Tap checkout
CustomKeywords.'checkout.Checkout.startCheckout'()

// Wait, fill information and continue checkout
CustomKeywords.'checkout.Checkout.fillInfromationAndContinueCheckout'(firstname, lastname, postalcode)

// Finish checkout
CustomKeywords.'checkout.Checkout.finishCheckout'()

// Verify checkout success
Mobile.waitForElementPresent(findTestObject('Mobile/Android/Checkout/Images/img_success_transaction'), 15)
Mobile.verifyElementText(findTestObject('Mobile/Android/Checkout/Texts/txt_checkout_complete'), 'CHECKOUT: COMPLETE!')
Mobile.verifyElementText(findTestObject('Mobile/Android/Checkout/Texts/txt_title_success_transaction'), 'THANK YOU FOR YOU ORDER')
Mobile.verifyElementText(findTestObject('Mobile/Android/Checkout/Texts/txt_desc_success_transaction'), 'Your order has been dispatched, and will arrive just as fast as the pony can get there!')
Mobile.closeApplication()