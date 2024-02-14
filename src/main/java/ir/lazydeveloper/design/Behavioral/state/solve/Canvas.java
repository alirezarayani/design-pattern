package ir.lazydeveloper.design.Behavioral.state.solve;

/**
 * Created by A_RAYANI on 2/12/2024
 */
// This class  respond to mouse events like mouse down and mouse up
public class Canvas {

    private Tool currentTool;

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public Canvas setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
        return this;
    }
}
