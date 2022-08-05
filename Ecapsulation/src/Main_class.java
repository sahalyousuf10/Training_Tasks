public class Main_class {

    public static void main(String[] args) {

        Student_info info = new Student_info();
        info.setName("Mohammad Sahal Yousuf");
        info.setAge(22);
        info.setContactNo("03132674262");
        info.setDepartment("Computer Science");
        info.setId(15213);
        info.setUniversity("Iqra University");

        System.out.println("Student name is: "+info.getName());
        System.out.println("Student ID is: "+info.getId());
        System.out.println("Student Age is: "+info.getAge());
        System.out.println("Student Department is: "+info.getDepartment());
        System.out.println("Student University is: "+info.getUniversity());
        System.out.println("Student Contact Number is: "+info.getContactNo());

    }
}
