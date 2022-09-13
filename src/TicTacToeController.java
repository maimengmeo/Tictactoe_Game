import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Screen;

public class TicTacToeController {

    @FXML
    private Label label;

    @FXML
    private Button eight;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button one;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button zero;

    String player = "O";
    boolean isGameDone = false;
    String [] grid = new String[9];

    @FXML
    void handleTrigger(ActionEvent event) {
        Button triggerButton = (Button) event.getSource();
        if (triggerButton.getText() != "" || isGameDone) {
            return; 
        }

        triggerButton.setText(player);

        if (triggerButton == zero) {
            grid[0] = zero.getText();
        }
        else if(triggerButton == one) {
            grid[1] = one.getText();
        }
        else if (triggerButton == two) {
            grid[2] = two.getText();
        }
        else if(triggerButton == three) {
            grid[3] = three.getText();
        }
        else if (triggerButton == four) {
            grid[4] = four.getText();
        }
        else if(triggerButton == five) {
            grid[5] = five.getText();
        }
        else if (triggerButton == six) {
            grid[6] = six.getText();
        }
        else if(triggerButton == seven) {
            grid[7] = seven.getText();
        }
        else if (triggerButton == eight) {
            grid[8] = eight.getText();
        }

        winnerDeclare();
        
        if(!isGameDone) {
            if (player == "O") {
                player = "X";
            } else {
                player = "O";
            }
        }
    }

    public void winnerDeclare() {
        if((grid[0] != null && grid[0] == grid[1] && grid[0] == grid[2]) ||
        (grid[3] != null && grid[3] == grid[4] && grid[3] == grid[5]) ||
        (grid[6] != null && grid[6] == grid[7] && grid[6] == grid[8]) ||
        (grid[0] != null && grid[0] == grid[3] && grid[0] == grid[6]) ||
        (grid[0] != null && grid[0] == grid[4] && grid[0] == grid[8]) ||
        (grid[1] != null && grid[1] == grid[4] && grid[1] == grid[7]) ||
        (grid[2] != null && grid[2] == grid[5] && grid[2] == grid[8]) ||
        (grid[2] != null && grid[2] == grid[4] && grid[2] == grid[6])) {
            isGameDone = true;
            label.setText(player + " WON!!");
        } 
    }
}
