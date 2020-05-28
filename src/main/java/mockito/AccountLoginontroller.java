package mockito;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class AccountLoginontroller {

    private final AccountDao accountDao;
    public AccountLoginontroller(AccountDao accountDao){
        this.accountDao=accountDao;
    }
    public String login(HttpServletRequest request){
        final String userName=request.getParameter("username");
        final String password=request.getParameter("password");
        try{
        Account account= accountDao.findAccount(userName,password);
        if(account==null){
            return "/login";
        }else{
            return "/index.jsp";
        }
        }catch(Exception e){
            return "/505";
    }
    }
}
