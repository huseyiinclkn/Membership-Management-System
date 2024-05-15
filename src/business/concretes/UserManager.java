package business.concretes;

import business.abstracts.UserService;
import entities.concretes.User;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {

    Scanner scanner = new Scanner(System.in);


    @Override
    public void nameControl(User user) {
        while (true) {
            if (user.getFirstName().length() <= 10 && user.getLastName().length() <= 10) {
                System.out.println("İsminiz: " + user.getFirstName());
                System.out.println("Soyisminiz: " + user.getLastName());
                break;


            } else {
                System.out.println("Geçersiz kullanıcı ismi ve soy ismi girdiniz");
                System.out.println("Geçerli İsim ve Soyismi giriniz");
                System.out.println("FirstName: ");
                String firstName = scanner.nextLine();
                System.out.println("LastName: ");
                String lastName = scanner.nextLine();
                break;
            }
            }
        }

        @Override
        public void passwordControl (User user){
            while (true) {
                if (user.getPassword().length() <= 6) {
                    System.out.println("Password: " + user.getPassword());
                    break;

                } else {
                    System.out.println("Geçersiz password girdiniz");
                    System.out.println("Geçerli şifre giriniz! ");
                    System.out.print("Password: ");
                    String password = scanner.nextLine();
                    break;
                }
            }


        }

        @Override
        public void emailControl (User user){
            while (true) {
                String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
                Pattern pattern = Pattern.compile(emailRegex);
                Matcher matcher = pattern.matcher(user.getEmail());
                if (matcher.matches()) {
                    System.out.print("E-mail: " + user.getEmail());
                    break;
                } else {
                    System.out.println("Geçersiz bir e-posta girdiniz.");
                    System.out.println("Geçerli email giriniz! ");
                    System.out.print("E-mail: ");
                    String email = scanner.nextLine();
                    break;
                }


            }
        }
    }
