import java.util.Scanner;
public class Smart_login_system {
    public static void main(String[] args) {
        Scanner sc new Scanner(System.in);
        System.out.print("Enter Username :");
        String username=sc.nextLine();
        System.out.print("enter Password :");
        String password =sc.nextLine();
        switch(username)
        {
            case "admin":
                switch(password)
                {
                    case "Java@123":
                        System.out.print("Enter OTP :");
                        int otp =sc.nextInt();

                        if(otp>1000 && otp<9999)
                        {
                            System.out.println("***LOGIN SUCCESSFULL***");
                        }
                        else
                        {
                            System.out.println("Invalid OTP !!!");
                            System.out.print("Enter correct OTP : ");
                            otp=sc.nextInt();
                            if(otp>1000 && otp<9999)
                            {
                            System.out.println("***LOGIN SUCCESSFULL***");
                            }
                            else
                            {
                                System.out.println("Invalid OTP !!!");
                                System.out.print("Enter correct OTP : ");
                                otp=sc.nextInt();
                            
                                if(otp>1000 && otp<9999)
                                {
                                System.out.println("***LOGIN SUCCESSFULL***");
                                }
                                else
                                {
                                 System.out.println("Invalid OTP !!!");
                                    System.out.println("Please try again later !!!");
                                }
                            }
                        }
                     break;
                     case "Java":
                     case "123":
                        System.out.println("Almost correct password");
                        System.out.print("Enter correct Password : ");
                        password = sc.nextLine();
                        if(password == "Java@123")
                        {
                            System.out.print("Enter OTP :");
                        int otp =sc.nextInt();

                        if(otp>1000 && otp<9999)
                        {
                            System.out.println("***LOGIN SUCCESSFULL***");
                        }
                        else
                        {
                            System.out.println("Invalid OTP !!!");
                            System.out.print("Enter correct OTP : ");
                            otp=sc.nextInt();
                            if(otp>1000 && otp<9999)
                            {
                            System.out.println("***LOGIN SUCCESSFULL***");
                            }
                            else
                            {
                                System.out.println("Invalid OTP !!!");
                                System.out.print("Enter correct OTP : ");
                                otp=sc.nextInt();
                            
                                if(otp>1000 && otp<9999)
                                {
                                System.out.println("***LOGIN SUCCESSFULL***");
                                }
                                else
                                {
                                 System.out.println("Invalid OTP !!!");
                                    System.out.println("Please try again later !!!");
                                }
                            }
                        }
                        }

                     default:
                        System.out.println("Invalid Password !!!");
                        System.out.print("Enter correct Password : ");
                        password = sc.nextLine();
                        if(password == "Java@123")
                        {
                            System.out.print("Enter OTP :");
                        int otp =sc.nextInt();

                        if(otp>1000 && otp<9999)
                        {
                            System.out.println("***LOGIN SUCCESSFULL***");
                        }
                        else
                        {
                            System.out.println("Invalid OTP !!!");
                            System.out.print("Enter correct OTP : ");
                            otp=sc.nextInt();
                            if(otp>1000 && otp<9999)
                            {
                            System.out.println("***LOGIN SUCCESSFULL***");
                            }
                            else
                            {
                                System.out.println("Invalid OTP !!!");
                                System.out.print("Enter correct OTP : ");
                                otp=sc.nextInt();
                            
                                if(otp>1000 && otp<9999)
                                {
                                System.out.println("***LOGIN SUCCESSFULL***");
                                }
                                else
                                {
                                 System.out.println("Invalid OTP !!!");
                                    System.out.println("Account Blocked!!");
                                }
                            }
                        }

                }
                
                break;
            
            default:
                System.out.println("Invalid Username !!!");
                System.out.println("Please try again with correct username :");
                username =sc.nextLine();
                 switch(username)   
                {
                    case "admin":
                        switch(password)
                        {
                            case "Java@123":
                                System.out.print("Enter OTP :");
                                int otp =sc.nextInt();

                                if(otp>1000 && otp<9999)
                                {
                                    System.out.println("***LOGIN SUCCESSFULL***");
                                }
                                else
                                {
                                    System.out.println("Invalid OTP !!!");
                                    System.out.print("Enter correct OTP : ");
                                    otp=sc.nextInt();
                                    if(otp>1000 && otp<9999)
                                    {
                                    System.out.println("***LOGIN SUCCESSFULL***");
                                    }
                                    else
                                    {
                                        System.out.println("Invalid OTP !!!");
                                        System.out.print("Enter correct OTP : ");
                                        otp=sc.nextInt();
                                    
                                        if(otp>1000 && otp<9999)
                                        {
                                        System.out.println("***LOGIN SUCCESSFULL***");
                                        }
                                        else
                                        {
                                         System.out.println("Invalid OTP !!!");
                                            System.out.println("Please try again later !!!");
                                        }
                                    }
                                }
                             break;
                             case "Java":
                             case "123":
                                System.out.println("Almost correct password");
                                System.out.print("Enter correct Password : ");
                                password = sc.nextLine();
                                if(password == "Java@123")
                                {
                                    System.out.print("Enter OTP :");
                                int otp =sc.nextInt();

                                if(otp>1000 && otp<9999)
                                {
                                    System.out.println("***LOGIN SUCCESSFULL***");
                                }
                                else
                                {
                                    System.out.println("Invalid OTP !!!");
                                    System.out.print("Enter correct OTP : ");
                                    otp=sc.nextInt();
                                    if(otp>1000 && otp<9999)
                                    {
                                    System.out.println("***LOGIN SUCCESSFULL***");
                                    }
                                    else
                                    {
                                        System.out.println("Invalid OTP !!!");
                                        System.out.print("Enter correct OTP : ");
                                        otp=sc.nextInt();
                                    
                                        if(otp>1000 && otp<9999)
                                        {
                                        System.out.println("***LOGIN SUCCESSFULL***");
                                        }
                                        else
                                        {
                                         System.out.println("Invalid OTP !!!");
                                            System.out.println("Please try again later !!!");
                                        }
                                    }
                                }
                        

                            default:
                                System.out.println("Invalid Password !!!");
                             System.out.print("Enter correct Password : ");
                             password = sc.nextLine();
                                if(password == "Java@123")
                                {
                                System.out.print("Enter OTP : ");
                                }
                        }

                
                
                break;
            
                default:
                System.out.println("Invalid Username !!!");
                System.out.println("Please try again after some time:");
                break;

        }
        
    }

    
}
