package ir.lazydeveloper.design.Behavioral.state.solve;

/**
 * Created by A_RAYANI on 2/12/2024
 */
public class SelectionTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Selection Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
}
