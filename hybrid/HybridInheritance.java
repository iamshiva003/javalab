class Parent {

    int a = 10;

    Parent() { 
        System.out.println("Class Parent Created");
    }

    void displayp() {
        System.out.println("Value of Parent is : " + a);
    }
}

class Child extends Parent {

    int b = 20;

    Child() {
        System.out.println("Class Child Created");
    }

    void displayC() {
        System.out.println("Value of child is : " + b);
    }
}

class GrandChild extends Child {

    int c = 30;

    GrandChild() {
        System.out.println("Class GrandChild Created");
    }

    void displayGc() {
        System.out.println("Value of Grand Child is : " + c);
    }
}

class Child2 extends Parent{

    int d = 40;

    Child2() {
        System.out.println("Class Child2 Created");
    }

    void displayC2() {
        System.out.println("Value of Child2 is : " + d);
    }
}

class HybridInheritance {
    public static void main(String[] args) {
        
        GrandChild gc = new GrandChild();
        Child2 c = new Child2();

        gc.displayp();
        gc.displayC();
        gc.displayGc();

        c.displayC2();
    }
}
