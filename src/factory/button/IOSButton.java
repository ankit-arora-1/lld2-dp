package factory.button;

public class IOSButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("Changing size of iOS button");
    }
}
