package ir.lazydeveloper.design.Behavioral.state.solve;

/**
 * Created by A_RAYANI on 2/14/2024
 */
public class MainState {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
