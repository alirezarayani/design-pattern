package ir.lazydeveloper.design.Behavioral.state.solve;

/**
 * Created by A_RAYANI on 2/12/2024
 */
public class EraserTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Eraser Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase something");
    }
}
