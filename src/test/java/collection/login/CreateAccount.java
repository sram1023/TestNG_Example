package collection.login;

import com.demo.base.Context;
import com.demo.pages.AccountCreation;
import org.testng.annotations.Test;

public class CreateAccount extends Context {

    AccountCreation accountCreation;
//    Context context;
    public CreateAccount() {
//        this.context = context;
        accountCreation = new AccountCreation();
    }

    @Test
    public void emailAddress(){
        accountCreation.setEmailAddress(properties.getProperty("email"));
        accountCreation.clickCreateAccount();
    }

    @Test
    public void personalInformation(){
        accountCreation.title("Mr.");
        accountCreation.firstName("John");
        accountCreation.lastName("Miller");
        accountCreation.password("test123");
//        Context.log.info("Personal information details are entered");
    }

}
