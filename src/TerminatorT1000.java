class TerminatorT1000 extends Robot {
    public TerminatorT1000() {
        super("T1000");
    }
    @Override
    public void sayHello() {
        System.out.println("Привет, я модель " + getModel());
    }
}