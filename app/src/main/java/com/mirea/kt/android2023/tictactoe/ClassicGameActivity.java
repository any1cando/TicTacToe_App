package com.mirea.kt.android2023.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ClassicGameActivity extends AppCompatActivity {

    private ImageView firstCell;
    private ImageView secondCell;
    private ImageView thirdCell;
    private ImageView fourthCell;
    private ImageView fifthCell;
    private ImageView sixthCell;
    private ImageView seventhCell;
    private ImageView eighthCell;
    private ImageView ninthCell;
    private TextView textViewTurn;
    private ImageView retry;
    private ImageView back;

    private String[] field;
    private String turn;
    private String p1;
    private String p2;
    private boolean gameIsFinished;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_game);

        firstCell = findViewById(R.id.imageViewClassicFirst);
        secondCell = findViewById(R.id.imageViewClassicSecond);
        thirdCell = findViewById(R.id.imageViewClassicThird);
        fourthCell = findViewById(R.id.imageViewClassicFourth);
        fifthCell = findViewById(R.id.imageViewClassicFifth);
        sixthCell = findViewById(R.id.imageViewClassicSixth);
        seventhCell = findViewById(R.id.imageViewClassicSeventh);
        eighthCell = findViewById(R.id.imageViewClassicEighth);
        ninthCell = findViewById(R.id.imageViewClassicNinth);
        textViewTurn = findViewById(R.id.textViewClassicGameTurn);
        retry = findViewById(R.id.imageViewClassicRetry);
        back = findViewById(R.id.imageViewClassicBack);

        field = new String[9];
        gameIsFinished = false;
        counter = 0;

        Intent intent = getIntent();
        p1 = intent.getStringExtra("first_player");
        p2 = intent.getStringExtra("second_player");

        turn = p1;

        textViewTurn.setText("Ход " + turn);

        firstCell.setOnClickListener(x -> {
            Log.i("app_tag", "Classic game first cell was pressed");

            if (field[0] == null && !gameIsFinished) {
                if (turn.equals(p1)) {
                    field[0] = "X";
                    firstCell.setImageResource(R.drawable.ic_x);
                    turn = p2;
                } else {
                    field[0] = "O";
                    firstCell.setImageResource(R.drawable.ic_o);
                    turn = p1;
                }

                textViewTurn.setText("Ход " + turn);
                counter++;
                checkWinner();
            }
        });

        secondCell.setOnClickListener(x -> {
            Log.i("app_tag", "Classic game second cell was pressed");

            if (field[1] == null && !gameIsFinished) {
                if (turn.equals(p1)) {
                    field[1] = "X";
                    secondCell.setImageResource(R.drawable.ic_x);
                    turn = p2;
                } else {
                    field[1] = "O";
                    secondCell.setImageResource(R.drawable.ic_o);
                    turn = p1;
                }

                textViewTurn.setText("Ход " + turn);
                counter++;
                checkWinner();
            }
        });

        thirdCell.setOnClickListener(x -> {
            Log.i("app_tag", "Classic game third cell was pressed");

            if (field[2] == null && !gameIsFinished) {
                if (turn.equals(p1)) {
                    field[2] = "X";
                    thirdCell.setImageResource(R.drawable.ic_x);
                    turn = p2;
                } else {
                    field[2] = "O";
                    thirdCell.setImageResource(R.drawable.ic_o);
                    turn = p1;
                }

                textViewTurn.setText("Ход " + turn);
                counter++;
                checkWinner();
            }
        });

        fourthCell.setOnClickListener(x -> {
            Log.i("app_tag", "Classic game fourth cell was pressed");

            if (field[3] == null && !gameIsFinished) {
                if (turn.equals(p1)) {
                    field[3] = "X";
                    fourthCell.setImageResource(R.drawable.ic_x);
                    turn = p2;
                } else {
                    field[3] = "O";
                    fourthCell.setImageResource(R.drawable.ic_o);
                    turn = p1;
                }

                textViewTurn.setText("Ход " + turn);
                counter++;
                checkWinner();
            }
        });

        fifthCell.setOnClickListener(x -> {
            Log.i("app_tag", "Classic game fifth cell was pressed");

            if (field[4] == null && !gameIsFinished) {
                if (turn.equals(p1)) {
                    field[4] = "X";
                    fifthCell.setImageResource(R.drawable.ic_x);
                    turn = p2;
                } else {
                    field[4] = "O";
                    fifthCell.setImageResource(R.drawable.ic_o);
                    turn = p1;
                }

                textViewTurn.setText("Ход " + turn);
                counter++;
                checkWinner();
            }
        });

        sixthCell.setOnClickListener(x -> {
            Log.i("app_tag", "Classic game sixth cell was pressed");

            if (field[5] == null && !gameIsFinished) {
                if (turn.equals(p1)) {
                    field[5] = "X";
                    sixthCell.setImageResource(R.drawable.ic_x);
                    turn = p2;
                } else {
                    field[5] = "O";
                    sixthCell.setImageResource(R.drawable.ic_o);
                    turn = p1;
                }

                textViewTurn.setText("Ход " + turn);
                counter++;
                checkWinner();
            }
        });

        seventhCell.setOnClickListener(x -> {
            Log.i("app_tag", "Classic game seventh cell was pressed");

            if (field[6] == null && !gameIsFinished) {
                if (turn.equals(p1)) {
                    field[6] = "X";
                    seventhCell.setImageResource(R.drawable.ic_x);
                    turn = p2;
                } else {
                    field[6] = "O";
                    seventhCell.setImageResource(R.drawable.ic_o);
                    turn = p1;
                }

                textViewTurn.setText("Ход " + turn);
                counter++;
                checkWinner();
            }
        });

        eighthCell.setOnClickListener(x -> {
            Log.i("app_tag", "Classic game eighth cell was pressed");

            if (field[7] == null && !gameIsFinished) {
                if (turn.equals(p1)) {
                    field[7] = "X";
                    eighthCell.setImageResource(R.drawable.ic_x);
                    turn = p2;
                } else {
                    field[7] = "O";
                    eighthCell.setImageResource(R.drawable.ic_o);
                    turn = p1;
                }

                textViewTurn.setText("Ход " + turn);
                counter++;
                checkWinner();
            }
        });

        ninthCell.setOnClickListener(x -> {
            Log.i("app_tag", "Classic game ninth cell was pressed");

            if (field[8] == null && !gameIsFinished) {
                if (turn.equals(p1)) {
                    field[8] = "X";
                    ninthCell.setImageResource(R.drawable.ic_x);
                    turn = p2;
                } else {
                    field[8] = "O";
                    ninthCell.setImageResource(R.drawable.ic_o);
                    turn = p1;
                }

                textViewTurn.setText("Ход " + turn);
                counter++;
                checkWinner();
            }
        });

        retry.setOnClickListener(x -> {
            Log.i("app_tag", "Classic game retry button was pressed");

            newGame();
        });

        back.setOnClickListener(x -> {
            Log.i("app_tag", "Classic game back button was pressed");

            finish();
        });

        Log.i("app_tag", "ClassicGameActivity was created");
    }

    private void checkWinner() {

        String line;
        for (int i=0; i<9; i++) {
            line = null;

            switch (i) {
                case 0:
                    line = field[0] + field[1] + field[2];
                    break;
                case 1:
                    line = field[3] + field[4] + field[5];
                    break;
                case 2:
                    line = field[6] + field[7] + field[8];
                    break;
                case 3:
                    line = field[0] + field[3] + field[6];
                    break;
                case 4:
                    line = field[1] + field[4] + field[7];
                    break;
                case 5:
                    line = field[2] + field[5] + field[8];
                    break;
                case 6:
                    line = field[0] + field[4] + field[8];
                    break;
                case 7:
                    line = field[2] + field[4] + field[6];
                    break;
            }

            if ("XXX".equals(line)) {
                showDialog(p1, false);
                gameIsFinished = true;
                return;
            } else if ("OOO".equals(line)) {
                showDialog(p2, false);
                gameIsFinished = true;
                return;
            }
        }

        if (counter == 9) {
            showDialog("", true);
            gameIsFinished = true;
        }
    }

    private void showDialog(String winner, boolean draw) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        String title;
        if (draw) {
            title = "Ничья";
        } else {
            title = "Победил " + winner;
        }

        AlertDialog dialog = builder
                .setTitle(title)
                .setPositiveButton("Играть снова", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        newGame();
                        dialog.cancel();
                    }
                })
                .setNegativeButton("Посмотреть поле", null)
                .create();

        dialog.show();

        Log.i("app_tag", "Alert dialog was shown");

        textViewTurn.setText(title);
    }

    private void newGame() {

        field = new String[9];
        turn = p1;
        gameIsFinished = false;
        counter = 0;
        textViewTurn.setText("Ход " + turn);

        firstCell.setImageDrawable(null);
        secondCell.setImageDrawable(null);
        thirdCell.setImageDrawable(null);
        fourthCell.setImageDrawable(null);
        fifthCell.setImageDrawable(null);
        sixthCell.setImageDrawable(null);
        seventhCell.setImageDrawable(null);
        eighthCell.setImageDrawable(null);
        ninthCell.setImageDrawable(null);
    }
}