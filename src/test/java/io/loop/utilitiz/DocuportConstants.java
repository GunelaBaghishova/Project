package io.loop.utilitiz;

public class DocuportConstants {

    public static final String USERNAME_SUPERVISOR = "b1g2_supervisor@gmail.com";
    public static final String USERNAME_EMPLOYEE = "b1g2_employee@gmail.com";
    public static final String USERNAME_CLIENT = "b1g2_client@gmail.com";
    public static final String USERNAME_ADVISOR = "b1g2_advisor@gmail.com";
    public static final String PASSWORD = "Group2";
    public static final String DOCUPORT_URL = "https://beta.docuport.app/";
   public static final String PASSWORD_CLIENT = "Group2";
   public static final String PASSWORD_ADVISOR = "Group2";
   public static final String ERROR_MASSAGE_FOR_EMPTY_PASSWORD = "Plea enter your password";

   public static final String LOGO_DOCUPORT = "Docuport";
    public static final String RESET_PASSWORD_URL = "reset-password";
    public static final String RESET_PASSWORD_MESSAGE = "Enter the email address associated with your account";

    public static final String EMAIL_FOR_RESET_PASSWORD = "forgotpasswordg1@gmail.com";

    public static final String ADVISOR = "advisor";
    public static final String CLIENT = "client";
    public static final String SUPERVISOR = "supervisor";
    public static final String EMPLOYEE = "employee";


    // DOCUPORT TABLE HEADS

    public static final String FULL_NAME = "full name";
    public static final String EMAIL_ADDRESS = "email address";
    public static final String USERNAME = "username";
    public static final String PHONE_NUMBER = "phone number";
    public static final String ROLE = "role";

   //  Docuport constans for client:
    public static final String CLIENTFULLNAME = "Alex De Souza";
    public static final String CLIENTEMAIL = "alex.de.souza@gmail.com";
    public static final String CLIENTUSERNAME = "alexdesouze";
    public static final String CLIENTPHONENUMBER = "+994512060042";
    public static final String CLIENTROLE = "Client";
    public static final String ADVISORFORCLIENT = "Batch1 Group1";

    //Docuport constance for Supervisor :
    public static final String SUPERVISORFULLNAME = "Batch1 Group1";
    public static final String SUPERVISOREMAIL = "b1g1_supervisor@gmail.com";
    public static final String SUPRTVISORUSERNAME = "b1g1_supervisor@gmail.com";
    public static final String SUPERVISORPHONENUMBER = "0000000000";
    public static final String SUPERVISORROLE = "Supervisor";
    public static final String ADVISORFORSUPERVISOR = null;

    //Docuport constance for Advisor :
    public static final String ADVISORFULLNAME = "advisor advisor";
    public static final String ADVISOREMAIL = "shukranadvisorr@gmail.com";
    public static final String ADVISORURERNAME = "shukranadvisor";
    public static final String ADVISORPHONENUMBER = "33 / 3322";
    public static final String ADVISORROLE = "Advisor";











//    public static void docuportCredential(String role, WebDriver driver) {
//        driver.get(DocuportConstants.DOCUPORT_URL);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        WebElement userName = driver.findElement(By.cssSelector("input[type='text']"));
//
//        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
//
//        WebElement loginButton = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
//
//
//
//        if(role.contains("client")) {
//            userName.sendKeys(DocuportConstants.USERNAME_CLIENT);
//            password.sendKeys(DocuportConstants.PASSWORD_CLIENT);
//        }
//        if(role.contains("advisor")){
//            userName.sendKeys(DocuportConstants.USERNAME_ADVISOR);
//            password.sendKeys(DocuportConstants.PASSWORD_CLIENT);
//        }
//
//    }


}
