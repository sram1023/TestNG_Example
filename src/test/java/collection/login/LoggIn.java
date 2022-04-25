package collection.login;

import com.demo.base.Context;
import com.demo.pages.SignIn;
import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.*;

public class LoggIn extends Context{

//    public Context context;
    SignIn signIn;
//    CreateAccount createAccount;

    public LoggIn() {
//        context =  new Context();
        signIn = new SignIn();
//        createAccount = new CreateAccount(context);
    }

    @BeforeTest
    public void start(){
        init();
    }

    @Test
    public void login(){
        signIn.signIn();
        signIn.verifyLoginPage();
    }

    @AfterTest
    public void tearDown1(){
        tearDown();
    }
}
