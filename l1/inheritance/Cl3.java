package stp2.l1.inheritance;

public class Cl3 implements If3{
    /**
     Output the information about class and method
     */
    @Override
    public void meth3() {
        System.out.println("Class name : Cl3. Method name : meth3");
    }

    @Override
    public void meth1() {
        System.out.println("Class name : Cl2. Method name : meth1");
    }
}
