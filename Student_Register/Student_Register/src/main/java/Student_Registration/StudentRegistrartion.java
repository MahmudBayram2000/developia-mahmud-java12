package Student_Registration;

import java.util.Scanner;

public class StudentRegistrartion {
    private static final int MAX_STUDENTS = 100;
    private static Student[] students = new Student[MAX_STUDENTS];
    private static int numStudents = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.Qeydiyyatdan keçin:\n2.Daxil olun:\n3.Bütün qeydiyyatdan keçən istifadəçilərin siyahısı:\n4.Id-ə görə istifadəçini tapmaq: \n5.İstifadəçini məlumatlarını dəyişmək:\n6.İstidaçini silmək:\n7.Çıxış");
            System.out.println("\nEdəcəyiniz əməliyyatı secin:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // yeni setire kecmek

            switch (choice) {
                case 1:
                    register(scanner);
                    break;
                case 2:
                    login(scanner);
                    break;
                case 3:
                    showRegisteredUsers();
                    break;
                case 4:
                    findUserById(scanner);
                    break;
                case 5:
                    editUserDetails(scanner);
                case 6:
                    deleteUser(scanner);
                    break;
                case 7:
                    System.out.println("Çıxır...");
                    return;
                default:
                    System.err.println("Yanlış seçim! Zəhmət olmasa yenidən daxil olun.");
            }
        }
    }

    private static void register(Scanner scanner) {
        if (numStudents >= MAX_STUDENTS) {
            System.out.println("Daha çox tələbə qeydiyyatdan keçə bilməz. Maksimum limitə çatıldı.");
            return;
        }
        System.out.println("İstifadəçi adinizi girin:");
        String username = scanner.nextLine();
        System.out.println("Şifrənizi girin:");
        String password = scanner.nextLine();
        System.out.println("Adınızı girin:");
        String name = scanner.nextLine();
        System.out.println("Yaşınızı girin:");
        int age = scanner.nextInt();


        students[numStudents] = new Student(username, password, name, age);
        numStudents++;
        System.out.println("Qeydiyyat uğurla tamamlandı");
    }

    private static void login(Scanner scanner) {
        System.out.println("İstifadəçi adını girin:");
        String username = scanner.nextLine();
        System.out.println("Şifrənizi girin:");
        String password = scanner.nextLine();

        for (int i = 0; i < numStudents; i++) {
            if (students[i].getUsername().equals(username) && students[i].getPassword().equals(password)) {
                System.out.println("Girildi");
                System.out.println("Xoş gəlmisiz, " + students[i].getName() + "!");
                System.out.println("Yaş: " + students[i].getAge());
                return;
            }
        }
        System.err.println("Xətalı istifadəçi adı vəya xətalı şifrə");
    }

    private static void showRegisteredUsers() {
        if (numStudents == 0) {
            System.out.println("Qeydiyyatdan keçən istifadəçi yoxdur");
            return;
        }
        System.out.println("Qeydiyyatdan keçən istifadəçilərin siyahısı:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("ID:" + students[i].getId());
            System.out.println("Username:" + students[i].getUsername());
            System.out.println("Name:" + students[i].getName());
            System.out.println("Age:" + students[i].getAge());
            System.out.println();

        }
    }

    private static void findUserById(Scanner scanner) {
        System.out.println("Id-ni girin:");
        int id = scanner.nextInt();
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getId() == id) {
                System.out.println("İstifadəçi tapıldı:");
                Student student = students[i];
                System.out.println("ID:" + student.getId());
                System.out.println("Username:" + student.getUsername());
                System.out.println("Name:" + student.getName());
                System.out.println("Age:" + student.getAge());
                return;
            }

        }
        System.err.println(id + " " + "id-li istifadəçi tapılmadı!" + "\nZəhmət olmasa yenidən cəhd edin!");
        System.out.println();
    }

    private static void editUserDetails(Scanner scanner) {
        System.out.println("İstifadəçi məlumatlarını dəyişmək üçün  istifadəçi id-inizi girin:");
        int id = scanner.nextInt();
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getId() == id) {
                System.out.println("ID olan istifadəçi üçün redaktə təfərrüatları: " + id);
                System.out.println("1.İstifadəçi adı redaktə et:");
                System.out.println("2.Şifrəni redaktə et:");
                System.out.println("3.Adı redaktə et:");
                System.out.println("4.Yaşı redaktə et:");
                System.out.print("Seçimini daxil et:");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Yeni istifadəçi adı daxil edin");
                        String newUsername = scanner.nextLine();
                        students[i].setUsername(newUsername);
                        System.out.println("İstifadəçi adınız başarıyla dəyişdirildi");
                        break;
                    case 2:
                        System.out.println("Yeni şifrənizi daxil edin");
                        String newPassword = scanner.nextLine();
                        students[i].setPassword(newPassword);
                        System.out.println("Şifrəniz dəyişdirildi");
                        break;
                    case 3:
                        System.out.println("Yeni adınızı daxil edin");
                        String newName = scanner.nextLine();
                        students[i].setName(newName);
                        System.out.println("Adınız başarıyla dəyişdirildi");
                        break;
                    case 4:
                        System.out.println("Yeni yaşınızı daxil edin");
                        int newAge = scanner.nextInt();
                        students[i].setAge(newAge);
                        System.out.println("Yaşınız başarıyla dəyişdirildi");
                        break;
                }
            }
            System.err.println(id + " " + "id-li istifadəçi tapılmadı!" + "\nZəhmət olmasa yenidən cəhd edin!");
            System.out.println();

        }
    }

    private static void deleteUser(Scanner scanner) {
        System.out.println("İstifadəçini silmək üçün istifadiçinin id-sini daxil edin");
        int id = scanner.nextInt();
        boolean found = true;

        Student[] newStudents = new Student[MAX_STUDENTS];
        int j = 0;
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getId() != id) {
                newStudents[j++] = students[i];
            }
        }
        students = newStudents;
        if (found) {
            System.out.println(id+" id-si ilə olan istifadəçi silindi");
        } else {
            System.out.println(id+" id-si ilə istifadəçi tapılmadı");
        }
    }
}