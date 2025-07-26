public class Stacks {

    public static void main(String[] args) {

        // stacks
        Student s = new Student("Raj", 19);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.setAge(-8);
        System.out.println(s.getAge());
    }

}

class Student {
    private String name = "omkar";
    private int age = 20;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){

        try {
            if(age<0){
                System.out.println("Bklol age -ve nhi hota hai");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("muh mai le le chod de coding bkl!!! lol");
        }
        finally{
            System.out.println("finally block handled expection handling");
        }
     
    /*throws Exception{
        if (age < 0) {
            throw new Exception("Bklol age -ve nhi hota hai");
        }
            */
        this.age = age;
}

    public int DelAge(int age) {
        if (age < 0 && age == 0) {
            return -1;
        }
        return age;
    }
}

class Student_Client {

}
