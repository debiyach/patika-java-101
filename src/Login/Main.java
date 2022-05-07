package Login;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String
                CONST_USERNAME = "debiyach",
                CONST_PASSWORD = "deneme";

        String userName, password;
        String changePassword;

        int isChanger;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adı: ");
        userName = input.nextLine();

        System.out.print("Parola : ");
        password = input.nextLine();


        if (userName.equals(CONST_USERNAME) && password.equals(CONST_PASSWORD)){
            System.out.println("Giriş başarılı!");
        }else{

            System.out.print("Parolanızı hatalı girdiniz. Parolanızı değiştirmek istiyor musunuz?\n Evet ise => 1\nHayır ise =>2\nDeğer: ");
            isChanger = input.nextInt();

            if (isChanger == 1){
                System.out.print("Yeni parola : ");
                input.nextLine();
                // nextInt() kullanıldıktan sonraki satırı okumamız gerekmiş.
                // https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/
                changePassword = input.nextLine();

                if (changePassword.equals(CONST_PASSWORD) || changePassword.equals(password)){
                    System.out.println("Şifre oluşturulamadı! Lütfen daha sonra tekrar deneyiniz.");
                    System.exit(0);
                }else{
                    System.out.println("Şifre oluşturuldu!");
                }
            }
            else if(isChanger == 2){
                System.out.println("Program bitti!");
            }


        }
    }

}
