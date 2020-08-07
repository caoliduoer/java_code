package Practice1;
class UserError extends Throwable{
    public UserError(String infor){
        super(infor);
    }
}
class PasswordError extends Throwable{
    public PasswordError(String infor){
        super(infor);
    }
}
public class Exception {
    public static void lingo(String user,String password)throws UserError,PasswordError{

        if(!user.equals("caoliduo")){
            throw  new UserError("用户名错误！");
        }
        if(!password.equals("12345")){
            throw new PasswordError("密码错误！");
        }
        System.out.println("登陆成功！");
    }
    public static void main(String[] args){
        try{
            lingo("caoliduo","123456");
        }
        catch(UserError u) {
            u.printStackTrace();
        }
        catch (PasswordError p){
            p.printStackTrace();
        }
    }
}
