package java.web.skp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int turn = 0;
    public boolean end = false;

    private void endGame() {
        end = true;
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtTurn = findViewById(R.id.txtTurn);
        Button btnRU    = findViewById(R.id.buttonRU);
        Button btnU     = findViewById(R.id.buttonU);
        Button btnLU    = findViewById(R.id.buttonLU);
        Button btnRM    = findViewById(R.id.buttonRM);
        Button btnM     = findViewById(R.id.buttonM);
        Button btnLM    = findViewById(R.id.buttonLM);
        Button btnRB    = findViewById(R.id.buttonRB);
        Button btnB     = findViewById(R.id.buttonB);
        Button btnLB    = findViewById(R.id.buttonLB);
        Button btnReset = findViewById(R.id.btnReset);

        btnRU.setOnClickListener(view -> {
            String btnRUStr = btnRU.getText().toString();

            if (btnRUStr.isEmpty() && !end) {
                if (turn == 0 && btnRUStr.equals("")) {
                    btnRU.setText("X");
                    turn = 1;
                    txtTurn.setText("It's <O> turn.");
                } else {
                    btnRU.setText("O");
                    turn = 0;
                    txtTurn.setText("It's <X> turn.");
                }
                checkWinCondition();
            }
        });
        btnU.setOnClickListener(view -> {
            String btnUStr = btnU.getText().toString();

            if (btnUStr.isEmpty() && !end) {
                if (turn == 0 && btnUStr.equals("")) {
                    btnU.setText("X");
                    turn = 1;
                    txtTurn.setText("It's <O> turn.");
                } else {
                    btnU.setText("O");
                    turn = 0;
                    txtTurn.setText("It's <X> turn.");
                }
                checkWinCondition();
            }
        });
        btnLU.setOnClickListener(view -> {
            String btnLUStr = btnLU.getText().toString();

            if (btnLUStr.isEmpty() && !end) {
                if (turn == 0 && btnLUStr.equals("")) {
                    btnLU.setText("X");
                    turn = 1;
                    txtTurn.setText("It's <O> turn.");
                } else {
                    btnLU.setText("O");
                    turn = 0;
                    txtTurn.setText("It's <X> turn.");
                }
                checkWinCondition();
            }
        });
        btnRM.setOnClickListener(view -> {
            String btnRMStr = btnRM.getText().toString();

            if (btnRMStr.isEmpty() && !end) {
                if (turn == 0 && btnRMStr.equals("")) {
                    btnRM.setText("X");
                    turn = 1;
                    txtTurn.setText("It's <O> turn.");
                } else {
                    btnRM.setText("O");
                    turn = 0;
                    txtTurn.setText("It's <X> turn.");
                }
                checkWinCondition();
            }
        });
        btnM.setOnClickListener(view -> {
            String btnMStr = btnM.getText().toString();

            if (btnMStr.isEmpty() && !end) {
                if (turn == 0 && btnMStr.equals("")) {
                    btnM.setText("X");
                    turn = 1;
                    txtTurn.setText("It's <O> turn.");
                } else {
                    btnM.setText("O");
                    turn = 0;
                    txtTurn.setText("It's <X> turn.");
                }
                checkWinCondition();
            }
        });
        btnLM.setOnClickListener(view -> {
            String btnLMStr = btnLM.getText().toString();

            if (btnLMStr.isEmpty() && !end) {
                if (turn == 0 && btnLMStr.equals("")) {
                    btnLM.setText("X");
                    turn = 1;
                    txtTurn.setText("It's <O> turn.");
                } else {
                    btnLM.setText("O");
                    turn = 0;
                    txtTurn.setText("It's <X> turn.");
                }
                checkWinCondition();
            }
        });
        btnRB.setOnClickListener(view -> {
            String btnRBStr = btnRB.getText().toString();

            if (btnRBStr.isEmpty() && !end) {
                if (turn == 0 && btnRBStr.equals("")) {
                    btnRB.setText("X");
                    turn = 1;
                    txtTurn.setText("It's <O> turn.");
                } else {
                    btnRB.setText("O");
                    turn = 0;
                    txtTurn.setText("It's <X> turn.");
                }
                checkWinCondition();
            }
        });
        btnB.setOnClickListener(view -> {
            String btnBStr = btnB.getText().toString();

            if (btnBStr.isEmpty() && !end) {
                if (turn == 0 && btnBStr.equals("")) {
                    btnB.setText("X");
                    turn = 1;
                    txtTurn.setText("It's <O> turn.");
                } else {
                    btnB.setText("O");
                    turn = 0;
                    txtTurn.setText("It's <X> turn.");
                }
                checkWinCondition();
            }
        });
        btnLB.setOnClickListener(view -> {
            String btnLBStr = btnLB.getText().toString();

            if (btnLBStr.isEmpty() && !end) {
                if (turn == 0 && btnLBStr.equals("")) {
                    btnLB.setText("X");
                    turn = 1;
                    txtTurn.setText("It's <O> turn.");
                } else {
                    btnLB.setText("O");
                    turn = 0;
                    txtTurn.setText("It's <X> turn.");
                }
                checkWinCondition();
            }
        });

        btnReset.setOnClickListener(view -> {
            txtTurn.setText("X starts");
            btnRU.setText("");
            btnU.setText("");
            btnLU.setText("");
            btnRM.setText("");
            btnM.setText("");
            btnLM.setText("");
            btnRB.setText("");
            btnB.setText("");
            btnLB.setText("");
            turn = 0;
            end = false;
        });
    }
    @SuppressLint("SetTextI18n")
    private void checkWinCondition() {
        TextView txtTurn = findViewById(R.id.txtTurn);
        Button btnRU    = findViewById(R.id.buttonRU);
        Button btnU     = findViewById(R.id.buttonU);
        Button btnLU    = findViewById(R.id.buttonLU);
        Button btnRM    = findViewById(R.id.buttonRM);
        Button btnM     = findViewById(R.id.buttonM);
        Button btnLM    = findViewById(R.id.buttonLM);
        Button btnRB    = findViewById(R.id.buttonRB);
        Button btnB     = findViewById(R.id.buttonB);
        Button btnLB    = findViewById(R.id.buttonLB);

        String btnRUStr = btnRU.getText().toString();
        String btnUStr = btnU.getText().toString();
        String btnLUStr = btnLU.getText().toString();
        String btnRMStr = btnRM.getText().toString();
        String btnMStr = btnM.getText().toString();
        String btnLMStr = btnLM.getText().toString();
        String btnRBStr = btnRB.getText().toString();
        String btnBStr = btnB.getText().toString();
        String btnLBStr = btnLB.getText().toString();

        if (!end) {
            if (!txtTurn.getText().toString().equals("X won") || !txtTurn.getText().toString().equals("O won")) {
                // This checks if all the buttons on the right is the same. This this for the rest.
                if (!btnRUStr.isEmpty() && !btnRMStr.isEmpty() && !btnRBStr.isEmpty()) {
                    if (btnRUStr.equals(btnRMStr) && btnRUStr.equals(btnRBStr)) {
                        if (btnRU.getText().toString().equals("X")) {
                            txtTurn.setText("X won");
                        } else {
                            txtTurn.setText("O won");
                        }
                        endGame();
                    }
                }
                // all middle buttons down
                if (!btnUStr.isEmpty() && !btnMStr.isEmpty() && !btnBStr.isEmpty()) {
                    if (btnUStr.equals(btnMStr) && btnUStr.equals(btnBStr)) {
                        if (btnU.getText().toString().equals("X")) {
                            txtTurn.setText("X won");
                        } else {
                            txtTurn.setText("O won");
                        }
                        endGame();
                    }
                }
                // All left buttons down
                if (!btnLUStr.isEmpty() && !btnLMStr.isEmpty() && !btnLBStr.isEmpty()) {
                    if (btnLUStr.equals(btnLMStr) && btnLUStr.equals(btnLBStr)) {
                        if (btnLU.getText().toString().equals("X")) {
                            txtTurn.setText("X won");
                        } else {
                            txtTurn.setText("O won");
                        }
                        endGame();
                    }
                }
                // Top row
                if (!btnLUStr.isEmpty() && !btnUStr.isEmpty() && !btnRUStr.isEmpty()) {
                    if (btnUStr.equals(btnRUStr) && btnUStr.equals(btnLUStr)) {
                        if (btnU.getText().toString().equals("X")) {
                            txtTurn.setText("X won");
                        } else {
                            txtTurn.setText("O won");
                        }
                        endGame();
                    }
                }
                // Middle row
                if (!btnLMStr.isEmpty() && !btnMStr.isEmpty() && !btnRMStr.isEmpty()) {
                    if (btnMStr.equals(btnRMStr) && btnMStr.equals(btnLMStr)) {
                        if (btnM.getText().toString().equals("X")) {
                            txtTurn.setText("X won");
                        } else {
                            txtTurn.setText("O won");
                        }
                        endGame();
                    }
                }
                // Bottom row
                if (!btnLBStr.isEmpty() && !btnBStr.isEmpty() && !btnRBStr.isEmpty()) {
                    if (btnBStr.equals(btnRBStr) && btnBStr.equals(btnLBStr)) {
                        if (btnB.getText().toString().equals("X")) {
                            txtTurn.setText("X won");
                        } else {
                            txtTurn.setText("O won");
                        }
                        endGame();
                    }
                }
                // Y = -x
                if (!btnLBStr.isEmpty() && !btnMStr.isEmpty() && !btnRUStr.isEmpty()) {
                    if (btnMStr.equals(btnLBStr) && btnMStr.equals(btnRUStr)) {
                        if (btnM.getText().toString().equals("X")) {
                            txtTurn.setText("X won");
                        } else {
                            txtTurn.setText("O won");
                        }
                        endGame();
                    }
                }
                // Y = x
                if (!btnLUStr.isEmpty() && !btnMStr.isEmpty() && !btnRBStr.isEmpty()) {
                    if (btnMStr.equals(btnLUStr) && btnMStr.equals(btnRBStr)) {
                        if (btnM.getText().toString().equals("X")) {
                            txtTurn.setText("X won");
                        } else {
                            txtTurn.setText("O won");
                        }
                        endGame();
                    }
                }
            }
        }
    }

}