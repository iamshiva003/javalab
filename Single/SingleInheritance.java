class Parent {

    int a = 10;

    Parent() {
        System.out.println("Class Parent Created");
    }

    // void displayP() {
    //     System.out.println("Parent value is: " + a);
    // }
}

class Child extends Parent {

    int b = 20;

    Child() {
        System.out.println("Class Child Created");
    }

    void displayC() {
    	System.out.println("Parent value is: " + a);
        System.out.println("Child value is: " + b);
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        
        Child c = new Child();

        // c.displayP();
        c.displayC();
    }
}