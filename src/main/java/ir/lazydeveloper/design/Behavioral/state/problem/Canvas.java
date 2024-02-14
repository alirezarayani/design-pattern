package ir.lazydeveloper.design.Behavioral.state.problem;

/**
 * Created by A_RAYANI on 2/12/2024
 */
// This class  respond to mouse events like mouse down and mouse up
public class Canvas {

    private ToolType currentTool;

    public void mouseDown() {
        if (currentTool == ToolType.SELECTION) {
            System.out.println("Selection Icon");
        } else if (currentTool == ToolType.BRUSH) {
            System.out.println("Brush Icon");
        } else if (currentTool == ToolType.ERASER) {
            System.out.println("Eraser Icon");
        }
    }

    public void mouseUp() {
        if (currentTool == ToolType.SELECTION) {
            System.out.println("Draw dashed rectangle");
        } else if (currentTool == ToolType.BRUSH) {
            System.out.println("Draw a line");
        } else if (currentTool == ToolType.ERASER) {
            System.out.println("Erase something");
        }
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public Canvas setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
        return this;
    }
}
