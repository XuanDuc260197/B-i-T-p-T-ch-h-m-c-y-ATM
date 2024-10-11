import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username = "Duc";
        String password = "hoclacoviec";
        int balance ;
        Scanner sc = new Scanner(System.in);
        String name =sc.nextLine();
        String pass =sc.nextLine();
        Login login = new Login(username, password);
        if (name.equals(username) && pass.equals(password)) {
            System.out.println("Login success\nWelcome"+" "+name);
            System.out.println("hay lua chon cac giao dich duoi day\n1, Xem thong tin tai khoan\n2, Rut tien");
            int a;
            a = sc.nextInt();
            if (a == 1) {
                login.display();
                System.out.print("Ban co muon thuc hien tiep giao dich khong ?");
                String n;
                n = sc.nextLine();
                if (n.equals("yes")) {
                    main(args);
                }else if (n.equals("no")){
                    System.out.println("Thanks for using our service");
                    System.exit(0);
                }
            } else if (a==2) {
                System.out.println("Hay nhap so tien ban muon rut");
                int b = sc.nextInt();
                if (b > login.balance) {
                    System.out.print("So tien vuot qua so du tai khoan");
                } else {
                    int so_du = login.balance - b;
                    login.processing(so_du);
                }
            }
        }else {
            System.out.println("Login failed\nban co muon thu lai khong ?");
            String n;
            n = sc.nextLine();
            if (n.equals("yes")) {
                main(args);
            }else if (n.equals("no")){
                System.out.println("Thanks for using our service");
                System.exit(0);
            }
        }
    }
}
