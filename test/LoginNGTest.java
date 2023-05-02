import static org.testng.Assert.*;
import org.testng.annotations.Test;
//https://www.youtube.com/watch?v=2EIUHHoVfmU
//import test class
public class LoginNGTest {

    static Login login1 = new Login();
    //declare new login variable
//https://netbeans.apache.org/kb/docs/java/junit-intro.html
    @Test
    public void testCheckUserName() {//class to check username
        assertTrue(Login.checkUserName("kyl_"));//correct format
        assertFalse(Login.checkUserName("kyle!!!!!!!"));//incorrect format
    }

    @Test
    public void testCheckPasswordComplexity() {//class to check password complexity
        assertTrue(Login.checkPasswordComplexity("Ch&&sec@ke99!"));//correct format
        assertFalse(Login.checkPasswordComplexity("password"));    //incorrect format 
    }

    @Test
    public void testRegisterUser() {//class to check register user
        assertTrue(login1.registerUser());
    }

    @Test
    public void testLoginUser() {//class to check login function
       
    }
}
