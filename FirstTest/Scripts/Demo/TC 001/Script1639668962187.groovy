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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app.proposify.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Your Email Address_email'), 'sony.guntuka+approver@proposify.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Forgot password_password'), 'SRxpt9EXqTYhMAI+66fGMw==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Proposify  Proposals/a_Document'))

WebUI.click(findTestObject('Object Repository/Page_Templates/span_Start from scratch'))

WebUI.setText(findTestObject('Object Repository/Page_Document Settings/input_Document name_name'), 'Test katalon 001')

WebUI.click(findTestObject('Object Repository/Page_Document Settings/input_Company_client-typeahead'))

WebUI.click(findTestObject('Object Repository/Page_Document Settings/div_Car company'))

WebUI.click(findTestObject('Object Repository/Page_Document Settings/label_Allow Stripe payments on this document'))

WebUI.click(findTestObject('Object Repository/Page_Document Settings/button_Next Step'))

WebUI.click(findTestObject('Object Repository/Page_Car company  Editor/a_Content'))

WebUI.click(findTestObject('Object Repository/Page_Car company  Editor/p_Content_ppStyleBody'))

WebUI.click(findTestObject('Object Repository/Page_Car company  Editor/div_This is a sample text and formatsClick _7a6ddc'))

WebUI.setText(findTestObject('Object Repository/Page_Car company  Editor/div_This is a sample text and formats'), '<p class="ppStyleBody" style="">This is a sample text and formats</p>')

WebUI.click(findTestObject('Object Repository/Page_Car company  Editor/span_13'))

WebUI.click(findTestObject('Object Repository/Page_Car company  Editor/a_14'))

WebUI.setText(findTestObject('Object Repository/Page_Car company  Editor/div_This is a sample text and formats'), '<p class="ppStyleBody"><span style="font-size: 14px;">This is a sample text and formats</span></p>')

WebUI.click(findTestObject('Object Repository/Page_Car company  Editor/div_This is a sample text and formatsClick _7a6ddc'))

WebUI.setText(findTestObject('Object Repository/Page_Car company  Editor/div_This is a sample text and formats'), '<p class="ppStyleBody"><span style="font-size: 14px;">This is a sample text and formats</span></p>')

WebUI.click(findTestObject('Object Repository/Page_Car company  Editor/div_This is a sample text and formatsClick _7a6ddc'))

WebUI.setText(findTestObject('Object Repository/Page_Car company  Editor/div_This is a sample text and formats'), '<p class="ppStyleBody"><span style="font-size: 14px;">This is a sample text and formats</span></p>')

WebUI.click(findTestObject('Object Repository/Page_Car company  Editor/div_This is a sample text and formatsClick _7a6ddc'))

WebUI.setText(findTestObject('Object Repository/Page_Car company  Editor/div_This is a sample text and formats'), '<p class="ppStyleBody"><span style="font-size: 14px;">This is a sample text and formats</span></p>')

WebUI.click(findTestObject('Object Repository/Page_Car company  Editor/div_This is a sample text and formatsClick _7a6ddc'))

WebUI.click(findTestObject('Object Repository/Page_Car company  Editor/p_This is a sample text and formats'))

WebUI.click(findTestObject('Object Repository/Page_Car company  Editor/span_Fee Library_svg svg-signature_pen'))

WebUI.click(findTestObject('Object Repository/Page_Car company  Editor/body_You are impersonating Unaliasupload lo_5a40b6'))

WebUI.click(findTestObject('Object Repository/Page_Car company  Editor/div_BodyBodyBodyEdit BodyUpdate Body to mat_8a47d6'))

WebUI.click(findTestObject('Object Repository/Page_Car company  Editor/button_Toggle dropdown'))

WebUI.click(findTestObject('Object Repository/Page_Car company  Editor/a_To snapshot'))

WebUI.closeBrowser()

