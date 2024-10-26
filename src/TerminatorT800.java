class TerminatorT800 extends Robot {
    public TerminatorT800() {
        super ("T800");
    }
    @Override
    public void sayHello() {
        System.out.println("Привет, я модель " + getModel());
    }
}