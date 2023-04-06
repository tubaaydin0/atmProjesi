import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        int hak = 3;
        int balance = 1500;
        int select;

        Scanner inp = new Scanner(System.in);
        while (hak > 0) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = inp.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = inp.nextLine();
            if (userName.equals("patika") && password.equals("123")) {
                System.out.println("Sisteme giriş yaptınız.");
                System.out.println("Merhaba kodluyoruz bankasına hoşgeldiniz");
                do {
                    System.out.println(" Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    System.out.println("1.Para Yatırma \n2.Para Çekme \n3.Bakiye Sorgula \n4.Çıkış Yap");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print(" Yatırmak istediğiniz tutarı giriniz : ");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println(" Çekmek istediğniz tutarı giriniz: .");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;

                    }
                }
                    while (select != 4) ;
                    System.out.println("Tekrar görüşmek üzere...");
                    break;
            }
           else{
                    hak--;
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    if (hak == 0) {
                        System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                    }
                    System.out.println("Kalan hakkınız: " + hak);
                }

            }


        }
    }
