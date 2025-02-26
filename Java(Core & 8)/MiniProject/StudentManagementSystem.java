package MiniProject;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentManagementSystem {
    private List<Student> students;
    private static final String FILE_PATH = "students.txt";

    public StudentManagementSystem(){
        students = new ArrayList<>();
        loadFile();
    }
    public void addStudent(Student student){
        if (!isValidEmail(student.getMailId())){
            System.out.println("Invalid MailId "+student.getMailId());
            return;
        }
        if(students.stream().anyMatch(st -> st.getId()==student.getId())){
            System.out.println(student.getId()+" Already Exists");
        }
        else {
            students.add(student);
            saveStudentToFile();
        }
    }

    public void viewAllStudent(){
        if (students.isEmpty()){
            System.out.println("Empty Records");
        }
        else {
            students.forEach(System.out::println);
        }
    }

    public Optional<Student> searchById(int searchId){
        return students.stream().filter(id -> id.getId() == searchId).findFirst();
    }

    public boolean updateStudent(int id){
        boolean isRemove = students.removeIf(fid -> fid.getId() == id);
        if (isRemove) saveStudentToFile();
        return isRemove;
    }
    public boolean deleteStudent(int id){
        boolean isRemove = students.removeIf(fid -> fid.getId() == id);
        if (isRemove) saveStudentToFile();
        return isRemove;
    }

    public  void sortStudentByName(){
        if (students.isEmpty()){
            System.out.println("Empty record");
        }
        else {
            students = students.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
            System.out.println("After Sorting By Name");
            students.forEach(System.out::println);
        }
    }

    public void filterByGrade(char filterGrade){
        List<Student> filterStudent = students.stream().filter(grade -> grade.getGrade()==filterGrade).collect(Collectors.toList());
        if (filterStudent.isEmpty()) System.out.println("No MiniProject.Student Found with "+filterGrade+" Grade");
        else filterStudent.forEach(System.out::println);
    }

    private void saveStudentToFile(){
        new Thread(()->{
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH))){
                for (Student student : students){
                    bufferedWriter.write(student.getId()+","+student.getName()+","+ student.getAge()
                            +","+student.getGrade()+","+ student.getMailId());
                    bufferedWriter.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

    }

    private void loadFile() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            System.out.println("No existing records");
            return;
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Student student = new Student(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), data[3].charAt(0), data[4]);
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9][a-zA-Z0-9.-_]*@[a-zA-Z0-9.-]+\\.(com|org|net)$");
    }
}