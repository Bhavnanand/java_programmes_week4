package programmes;
//Java programm to overload constructor
public class Students5 {
    int id;
    String  name;
    int age;
    //creating two arg constructor
    Students5(int i,String n){
        id= i;
        name = n;
    }
    //creating three arg constructor
    Students5 (int i,String n,int a){
        id= i;
        name = n;
        age = a;
    }
    public void display(){
        System.out.println(id+ "  "+ name+"  " +age);
    }

    public static void main(String[] args) {
        Students5 s1 = new Students5(111, "Karan");
        Students5 s2 = new Students5(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
    }

