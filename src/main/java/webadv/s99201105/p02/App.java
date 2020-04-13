package webadv.s99201105.p02;

import org.apache.commons.codec.digest.DigestUtils;
import java.util.Scanner;
public class App {
    private static String account = "";
    private static String pwd= "";
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Please provide an account and password!");
            System.exit(0);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户账号：");
        account = input.next();
        System.out.println("请输入用户密码：");
        pwd = input.next();
        if (account.equals(args[0])&&sha256hex(pwd).equals(sha256hex(args[1]))){
	System.out.println("登录成功");
	System.exit(0);
        }
        else{
	System.out.println("登录失败");
	System.exit(0);
        }
        
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}

