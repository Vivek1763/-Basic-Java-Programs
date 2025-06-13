public class Constructor {
    int age;
    String name;

    Constructor() {
        System.out.println("Constructor is called");
    }
    public void printinfo(){
      System.out.println(this.name);
      System.out.println(this.age);
    }
public static void main(String[] args) {
    Constructor s1=new Constructor();
    s1.name="vivek";
    s1.age=20;
    s1.printinfo();
}
}

