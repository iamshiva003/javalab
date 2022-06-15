class Parent {

    int a = 10;

    Parent() { 
        System.out.println("Class Parent Created");
    }

    void displayP1() {
        System.out.println("Value of Parent is : " + a);
    }
}

class Parent2 {

    int a = 10;

    Parent2() { 
        System.out.println("Class Parent2 Created");
    }

    void displayP2() {
        System.out.println("Value of Parent2 is : " + a);
    }
}

class Child extends Parent, extends Parent2 {

    int c = 30;

    Child() {
        System.out.println("Class Child Created");
    }

    void displayC() {
        System.out.println("Value of Child is : " + c);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        
        Child c = new Child();

        c.displayP1();
        c.displayP2();
        c.displayC();
    }
}
