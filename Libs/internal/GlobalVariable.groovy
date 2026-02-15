package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile development : Appication ID</p>
     */
    public static Object appId
     
    /**
     * <p></p>
     */
    public static Object invalidPassword
     
    /**
     * <p></p>
     */
    public static Object lockedOutUserName
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object userName
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
    
            appId = selectedVariables['appId']
            invalidPassword = selectedVariables['invalidPassword']
            lockedOutUserName = selectedVariables['lockedOutUserName']
            password = selectedVariables['password']
            userName = selectedVariables['userName']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
