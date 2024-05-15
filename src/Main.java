import business.abstracts.UserService;
import business.concretes.UserManager;
import dataAccess.concretes.UserRepository;
import entities.concretes.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        UserRepository userRepository = new UserRepository(new UserManager());
        System.out.println("Hoşgeldiniz Üyelik İşlemlerini Girebilirsiniz");

    Scanner input = new Scanner(System.in);
    System.out.print("İD: " );
    int id = input.nextInt();
    user.setId(id);
    System.out.print("FirstName: ");
    String firstName = input.next();
    user.setFirstName(firstName);
    System.out.print("LastName: ");
    String lastName = input.next();
    user.setLastName(lastName);
    System.out.print("Email: ");
    String email = input.next();
    user.setEmail(email);
    System.out.print("Password: ");
    String password = input.next();
    user.setPassword(password);

    userRepository.add( user);



    }
}