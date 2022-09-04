package trips;

public class HowToAcessClassProperties {
}


class A{
     static int i;

    void me(){

    }

    static void hello(){

    }
}

class B {



    public static void main(String[] args) {
        // inhertries

        // Create an object of the Class
        A obj = new A();
        obj.me();

        // If you name the properties static
        A.hello();


    }

}