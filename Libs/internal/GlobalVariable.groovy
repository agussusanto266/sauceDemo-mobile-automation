package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object appId
     
    /**
     * <p></p>
     */
    public static Object firstName
     
    /**
     * <p></p>
     */
    public static Object lastName
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object postalCode
     
    /**
     * <p></p>
     */
    public static Object std_timeout
     
    /**
     * <p></p>
     */
    public static Object userName
     
    /**
     * <p></p>
     */
    public static Object lockedUser
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
    
            appId = selectedVariables['appId']
            firstName = selectedVariables['firstName']
            lastName = selectedVariables['lastName']
            password = selectedVariables['password']
            postalCode = selectedVariables['postalCode']
            std_timeout = selectedVariables['std_timeout']
            userName = selectedVariables['userName']
            lockedUser = selectedVariables['lockedUser']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
