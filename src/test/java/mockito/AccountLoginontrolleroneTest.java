package mockito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.servlet.http.HttpServletRequest;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;

@RunWith(MockitoJUnitRunner.class)
public class AccountLoginontrolleroneTest {


    private AccountDao accountDao;
    private HttpServletRequest httpServletRequest;
    private AccountLoginontroller accountLoginontroller;

    @Before
    public void setUp(){
        this.accountDao= Mockito.mock(AccountDao.class);
        this.httpServletRequest=Mockito.mock(HttpServletRequest.class);
        this.accountLoginontroller=new AccountLoginontroller(accountDao);
    }

    @Test
    public void testLoginSuccess() {
        Account account=new Account();
        Mockito.when(httpServletRequest.getParameter("username")).thenReturn("alex");
        Mockito.when(httpServletRequest.getParameter("password")).thenReturn("123456");
        Mockito.when(accountDao.findAccount(anyString(),anyString())).thenReturn(account);

        String result=accountLoginontroller.login(httpServletRequest);
        Assert.assertEquals(result,"/index.jsp");
    }


    @Test
    public void testLoginFail() {
        Account account=new Account();
        Mockito.when(httpServletRequest.getParameter("username")).thenReturn("alex");
        Mockito.when(httpServletRequest.getParameter("password")).thenReturn("1234561");
        Mockito.when(accountDao.findAccount(anyString(),anyString())).thenReturn(null);

        String result=accountLoginontroller.login(httpServletRequest);
        Assert.assertEquals(result,"/login");

        System.out.println("zenmediya");
    }
}