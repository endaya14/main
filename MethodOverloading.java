public class MethodOverloading {
    int age;
    String gender = "Male";
    String course = "BSIT";

    MethodOverloading(){
        this(11,"Female","Engineering");
        //age = 19;
        //gender = "Female";
        //course = "Management";
    }

    MethodOverloading(int age,String gender,String course){
        this.age = age;
        this.gender = gender;
        this.course = course;

    }

    public static void main(String[] args) {
        MethodOverloading methodOne = new MethodOverloading();
        MethodOverloading methodTwo = new MethodOverloading(11,"Male","Engineering");

        System.out.println(methodOne.age + " " +methodOne.gender+ " " + methodOne.course);
        System.out.println(methodTwo.age + " " + methodTwo.gender + " " + methodTwo.course);
    }
}
