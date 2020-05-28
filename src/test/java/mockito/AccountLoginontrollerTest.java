package mockito;

import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.servlet.http.HttpServletRequest;

import static org.mockito.Matchers.anyString;
import static org.testng.Assert.*;

public class AccountLoginontrollerTest {
    private AccountDao accountDao;
    private HttpServletRequest httpServletRequest;
    private AccountLoginontroller accountLoginontroller;
    private Account account;
    @BeforeMethod
    public void setUp() {
        this.accountDao= Mockito.mock(AccountDao.class);
        this.httpServletRequest=Mockito.mock(HttpServletRequest.class);
        this.accountLoginontroller=new AccountLoginontroller(accountDao);
        this.account=new Account();
    }

    @Test
    public void testLogin() {
        Mockito.when(httpServletRequest.getParameter("username")).thenReturn("alex");
        Mockito.when(httpServletRequest.getParameter("password")).thenReturn("123456");
        Mockito.when(accountDao.findAccount(anyString(),anyString())).thenReturn(account);
        String result=accountLoginontroller.login(httpServletRequest);
        Assert.assertEquals(result,"/index.jsp");
        System.out.println(result);
    }
}