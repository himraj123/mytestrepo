public class TestInheritance {
    public static void main(String[] args) {
        ParentClass pc = new ChildClass();
        pc.id_form();
        pc.age_form();
        ((ChildClass) pc).node_form();
    }
}

class ParentClass{
    public void id_form(){
        System.out.println("Parent id form");
    }
    public void age_form(){
        System.out.println("Parent age form");
    }
}

class ChildClass extends ParentClass{
    public void id_form(){
        System.out.println("Child id form");
    }
    public void node_form(){
        System.out.println("Child node form");
    }
    int color;

}