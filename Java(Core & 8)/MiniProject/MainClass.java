package MiniProject;

import java.util.Optional;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("                                MiniProject.Student Management System");
        int choice;
        do{
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("1. Add MiniProject.Student\n2. View All Students\n3. Search MiniProject.Student by ID\n4. Update MiniProject.Student" +
                    "\n5. Delete MiniProject.Student\n6. Sort Students by Name\n7. Filter Students by Grade\n8. Exit");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.print("Enter you choice : ");
            choice = sc.nextInt();
            System.out.println("------------------------------------------------------------------------------------------");
            switch (choice){
                case 1:
                    int id,age;
                    String name,mailId;
                    char grade;
                    System.out.print("Enter MiniProject.Student Id : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter MiniProject.Student Name : ");
                    name = sc.nextLine().toUpperCase();
                    System.out.print("Enter MiniProject.Student Age : ");
                    age = sc.nextInt();
                    System.out.print("Enter MiniProject.Student Grade : ");
                    grade = sc.next().toUpperCase().charAt(0);
                    sc.nextLine();
                    System.out.print("Enter MiniProject.Student MailId : ");
                    mailId = sc.nextLine();
                    sms.addStudent(new Student(id,name,age,grade,mailId));
                    break;
                case 2:
                    sms.viewAllStudent();
                    break;
                case 3:
                    System.out.print("Enter MiniProject.Student ID To Search : ");
                    int searchId = sc.nextInt();
                    Optional<Student> student = sms.searchById(searchId);
                    student.ifPresentOrElse(System.out::println,() -> System.out.println("Id not found"));
                    break;
                case 4:
                    System.out.print("Enter MiniProject.Student ID To Update : ");
                    int Id = sc.nextInt();
                    if (sms.updateStudent(Id)){
                        System.out.print("Enter MiniProject.Student Updated Id : ");
                        int uid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter MiniProject.Student Updated Name : ");
                        String uname = sc.nextLine().toUpperCase();
                        System.out.print("Enter MiniProject.Student Updated Age : ");
                        int uage = sc.nextInt();
                        System.out.print("Enter MiniProject.Student Updated Grade : ");
                        char ugrade = sc.next().toUpperCase().charAt(0);
                        sc.nextLine();
                        System.out.print("Enter MiniProject.Student MailId : ");
                        String umailId = sc.nextLine();
                        if(!sms.isValidEmail(umailId)){
                            System.out.println("Invalid MailId"+umailId);
                            break;
                        }
                        sms.addStudent(new Student(uid,uname,uage,ugrade,umailId));
                        System.out.println("After Updated ");
                        sms.viewAllStudent();

                    }else System.out.println("ID "+Id+" Not Found");
                    break;
                case 5:
                    System.out.print("Enter MiniProject.Student ID To Delete : ");
                    int deleteId = sc.nextInt();
                    if (sms.deleteStudent(deleteId)){
                        System.out.println("After Deleted MiniProject.Student Detail ID "+deleteId);
                        sms.viewAllStudent();
                    }
                    else System.out.println("ID "+deleteId+" Not Found");
                    break;
                case 6:
                    sms.sortStudentByName();
                    break;
                case 7:
                    System.out.print("Enter Grade To Filter : ");
                    char filterGrade = sc.next().charAt(0);
                    sms.filterByGrade(filterGrade);
                    break;
                case 8:
                    System.out.println("Exiting MiniProject.Student Management System");
                    break;
                default:
                    System.out.println("Invalid choice ! ");
            }
        }while(choice!=8);
    }
}