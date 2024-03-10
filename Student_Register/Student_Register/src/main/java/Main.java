import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Kalkulyator proqramıma xoş gəlmisiniz");
        System.out.println(" ");


            System.out.println("2 Rəqəm daxil edin");

            //Birinci reqemi daxil edin
            System.out.print("Rəqəm 1: ");
            double number1 = scanner.nextDouble();

            //Ikinci reqemi daxil edin
            System.out.println("Rəqəm 2: ");
            double number2 = scanner.nextDouble();

            while (true) {
                System.out.println("Əməliyyatı seçin");
                System.out.println("Toplama(+):");
                System.out.println("Çıxma(-):");
                System.out.println("Vurma(*):");
                System.out.println("Bölmə(/):");
                System.out.println("Davam et:");
                System.out.println("Çıxış et:");


                //Emeliyati secin
                System.out.println("Seçiminizi daxil edin (1/2/3/4/5/6):");
                int choice = scanner.nextInt();

                double result = 0;

                //// Seçim əsasında hesablama aparın
                switch (choice) {
                    case 1:
                        result = number1 + number2;
                        break;
                    case 2:
                        result = number1 - number2;
                        break;
                    case 3:
                        result = number1 * number2;
                        break;
                    case 4:
                        if (number2 != 0) {
                            result = number1 / number2;
                        } else {
                            System.out.println("Xəta:Sıfıra bölmək olmaz");
                            continue;//basa geri donur davam edir
                        }
                        break;
                    case 5:
                        System.out.println("Yeni  əməliyyat üçün rəqəmləri yazın");
                        number1 = scanner.nextDouble();
                        number2 = scanner.nextDouble();
                        continue;// basa geri donur davam edir
                    case 6:
                        System.out.println("Proqramı bağlandı");
                        return;
                    default:
                        System.out.println("Xətalı seçim");
                        continue;// basa geri donur davam edir
                }

                System.out.println("nəticə:" + result);
                break;

            }
            scanner.close();
        }

    }


