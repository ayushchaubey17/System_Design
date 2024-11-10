package solid_principles.single_Responsibilty.dependencyInversionPrinciple;

public class Macbook {
//    private Keyboard keyboard;
//    private Mouse mouse;
//
//    public Macbook(Keyboard keyboard, Mouse mouse) {
//        this.keyboard = keyboard;
//        this.mouse = mouse;
//    }


    private WiredKeyBoard keyBoard;
    private  WiredMouse mouse;

    public Macbook() {
        this.keyBoard = new WiredKeyBoard();
        this.mouse = new WiredMouse();
    }

    public void show() {
        keyBoard.typing();
        mouse.draging();
    }

}
