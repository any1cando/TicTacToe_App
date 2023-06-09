package com.mirea.kt.android2023.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class FourTimesFourGameActivity extends AppCompatActivity {

    private ImageView firstCell;
    private ImageView secondCell;
    private ImageView thirdCell;
    private ImageView fourthCell;
    private ImageView fifthCell;
    private ImageView sixthCell;
    private ImageView seventhCell;
    private ImageView eighthCell;
    private ImageView ninthCell;
    private ImageView tenthCell;
    private ImageView eleventhCell;
    private ImageView twelfthCell;
    private ImageView thirteenthCell;
    private ImageView fourteenthCell;
    private ImageView fifteenthCell;
    private ImageView sixteenthCell;
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
        setContentView(R.layout.activity_four_times_four_game);

        firstCell = findViewById(R.id.imageViewFourFieldFirst);
        secondCell = findViewById(R.id.imageViewFourFieldSecond);
        thirdCell = findViewById(R.id.imageViewFourFieldThird);
        fourthCell = findViewById(R.id.imageViewFourFieldFourth);
        fifthCell = findViewById(R.id.imageViewFourFieldFifth);
        sixthCell = findViewById(R.id.imageViewFourFieldSixth);
        seventhCell = findViewById(R.id.imageViewFourFieldSeventh);
        eighthCell = findViewById(R.id.imageViewFourFieldEighth);
        ninthCell = findViewById(R.id.imageViewFourFieldNinth);
        tenthCell = findViewById(R.id.imageViewFourFieldTenth);
        eleventhCell = findViewById(R.id.imageViewFourFieldEleventh);
        twelfthCell = findViewById(R.id.imageViewFourFieldTwelfth);
        thirteenthCell = findViewById(R.id.imageViewFourFieldThirteenth);
        fourteenthCell = findViewById(R.id.imageViewFourFieldFourteenth);
        fifteenthCell = findViewById(R.id.imageViewFourFieldFifteenth);
        sixteenthCell = findViewById(R.id.imageViewFourFieldSixteenth);
        textViewTurn = findViewById(R.id.textViewFourTimesFourGameTurn);
        retry = findViewById(R.id.imageViewFourTimesFourRetry);
        back = findViewById(R.id.imageViewFourTimesFourBack);

        field = new String[16];
        gameIsFinished = false;
        counter = 0;

        Intent intent = getIntent();
        p1 = intent.getStringExtra("first_player");
        p2 = intent.getStringExtra("second_player");

        turn = p1;

        textViewTurn.setText("Ход " + turn);

        firstCell.setOnClickListener(x -> {
            Log.i("app_tag", "Four times four game first cell was pressed");

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
            Log.i("app_tag", "Four times four game second cell was pressed");

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
            Log.i("app_tag", "Four times four game third cell was pressed");

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
            Log.i("app_tag", "Four times four game fourth cell was pressed");

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
            Log.i("app_tag", "Four times four game fifth cell was pressed");

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
            Log.i("app_tag", "Four times four game sixth cell was pressed");

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
            Log.i("app_tag", "Four times four game seventh cell was pressed");

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
            Log.i("app_tag", "Four times four game eighth cell was pressed");

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
            Log.i("app_tag", "Four times four game ninth cell was pressed");

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

        tenthCell.setOnClickListener(x -> {
            Log.i("app_tag", "Four times four game tenth cell was pressed");

            if (field[9] == null && !gameIsFinished) {
                if (turn.equals(p1)) {
                    field[9] = "X";
                    tenthCell.setImageResource(R.drawable.ic_x);
                    turn = p2;
                } else {
                    field[9] = "O";
                    tenthCell.setImageResource(R.drawable.ic_o);
                    turn = p1;
                }

                textViewTurn.setText("Ход " + turn);
                counter++;
                checkWinner();
            }
        });

        eleventhCell.setOnClickListener(x -> {
            Log.i("app_tag", "Four times four game eleventh cell was pressed");

            if (field[10] == null && !gameIsFinished) {
                if (turn.equals(p1)) {
                    field[10] = "X";
                    eleventhCell.setImageResource(R.drawable.ic_x);
                    turn = p2;
                } else {
                    field[10] = "O";
                    eleventhCell.setImageResource(R.drawable.ic_o);
                    turn = p1;
                }

                textViewTurn.setText("Ход " + turn);
                counter++;
                checkWinner();
            }
        });

        twelfthCell.setOnClickListener(x -> {
            Log.i("app_tag", "Four times four game twelfth cell was pressed");

            if (field[11] == null && !gameIsFinished) {
                if (turn.equals(p1)) {
                    field[11] = "X";
                    twelfthCell.setImageResource(R.drawable.ic_x);
                    turn = p2;
                } else {
                    field[11] = "O";
                    twelfthCell.setImageResource(R.drawable.ic_o);
                    turn = p1;
                }

                textViewTurn.setText("Ход " + turn);
                counter++;
                checkWinner();
            }
        });

        thirteenthCell.setOnClickListener(x -> {
            Log.i("app_tag", "Four times four game thirteenth cell was pressed");

            if (field[12] == null && !gameIsFinished) {
                if (turn.equals(p1)) {
                    field[12] = "X";
                    thirteenthCell.setImageResource(R.drawable.ic_x);
                    turn = p2;
                } else {
                    field[12] = "O";
                    thirteenthCell.setImageResource(R.drawable.ic_o);
                    turn = p1;
                }

                textViewTurn.setText("Ход " + turn);
                counter++;
                checkWinner();
            }
        });

        fourteenthCell.setOnClickListener(x -> {
            Log.i("app_tag", "Four times four game fourteenth cell was pressed");

            if (field[13] == null && !gameIsFinished) {
                if (turn.equals(p1)) {
                    field[13] = "X";
                    fourteenthCell.setImageResource(R.drawable.ic_x);
                    turn = p2;
                } else {
                    field[13] = "O";
                    fourteenthCell.setImageResource(R.drawable.ic_o);
                    turn = p1;
                }

                textViewTurn.setText("Ход " + turn);
                counter++;
                checkWinner();
            }
        });

        fifteenthCell.setOnClickListener(x -> {
            Log.i("app_tag", "Four times four game fifteenth cell was pressed");

            if (field[14] == null && !gameIsFinished) {
                if (turn.equals(p1)) {
                    field[14] = "X";
                    fifteenthCell.setImageResource(R.drawable.ic_x);
                    turn = p2;
                } else {
                    field[14] = "O";
                    fifteenthCell.setImageResource(R.drawable.ic_o);
                    turn = p1;
                }

                textViewTurn.setText("Ход " + turn);
                counter++;
                checkWinner();
            }
        });

        sixteenthCell.setOnClickListener(x -> {
            Log.i("app_tag", "Four times four game sixteenth cell was pressed");

            if (field[15] == null && !gameIsFinished) {
                if (turn.equals(p1)) {
                    field[15] = "X";
                    sixteenthCell.setImageResource(R.drawable.ic_x);
                    turn = p2;
                } else {
                    field[15] = "O";
                    sixteenthCell.setImageResource(R.drawable.ic_o);
                    turn = p1;
                }

                textViewTurn.setText("Ход " + turn);
                counter++;
                checkWinner();
            }
        });

        retry.setOnClickListener(x -> {
            Log.i("app_tag", "Four times four game retry button was pressed");

            newGame();
        });

        back.setOnClickListener(x -> {
            Log.i("app_tag", "Four times four game back button was pressed");

            finish();
        });

        Log.i("app_tag", "FourTimesFourGameActivity was created");
    }

    private void checkWinner() {

        String line;
        for (int i=0; i<10; i++) {
            line = null;

            switch (i) {
                case 0:
                    line = field[0] + field[1] + field[2] + field[3];
                    break;
                case 1:
                    line = field[4] + field[5] + field[6] + field[7];
                    break;
                case 2:
                    line = field[8] + field[9] + field[10] + field[11];
                    break;
                case 3:
                    line = field[12] + field[13] + field[14] + field[15];
                    break;
                case 4:
                    line = field[0] + field[4] + field[8] + field[12];
                    break;
                case 5:
                    line = field[1] + field[5] + field[9] + field[13];
                    break;
                case 6:
                    line = field[2] + field[6] + field[10] + field[14];
                    break;
                case 7:
                    line = field[3] + field[7] + field[11] + field[15];
                    break;
                case 8:
                    line = field[0] + field[5] + field[10] + field[15];
                    break;
                case 9:
                    line = field[3] + field[6] + field[9] + field[12];
                    break;
            }

            if ("XXXX".equals(line)) {
                showDialog(p1, false);
                gameIsFinished = true;
                return;
            } else if ("OOOO".equals(line)) {
                showDialog(p2, false);
                gameIsFinished = true;
                return;
            }
        }

        if (counter == 16) {
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

        textViewTurn.setText(title);
    }

    private void newGame() {

        field = new String[16];
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
        tenthCell.setImageDrawable(null);
        eleventhCell.setImageDrawable(null);
        twelfthCell.setImageDrawable(null);
        thirteenthCell.setImageDrawable(null);
        fourteenthCell.setImageDrawable(null);
        fifteenthCell.setImageDrawable(null);
        sixteenthCell.setImageDrawable(null);
    }
}