package id.joney.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{
    private TextView tvScoreTeamA;
    private TextView tvScoreTeamB;
    private Button btn3A;
    private Button btn2A;
    private Button btn3B;
    private Button btn2B;
    private Button btnFreeA;
    private Button btnFreeB;
    private Button btnReset;
    private int scoreTeamA;
    private int scoreTeamB;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init()
    {
        tvScoreTeamA= (TextView) findViewById(R.id.tv_score_team_a);
        tvScoreTeamB= (TextView) findViewById(R.id.tv_score_team_b);
        btn3A= (Button) findViewById(R.id.btn_3_a);
        btn2A= (Button) findViewById(R.id.btn_2_a);
        btnFreeA= (Button) findViewById(R.id.btn_free_a);
        btn3B= (Button) findViewById(R.id.btn_3_b);
        btn2B= (Button) findViewById(R.id.btn_2_b);
        btnFreeB= (Button) findViewById(R.id.btn_free_b);
        btnReset= (Button) findViewById(R.id.btn_reset);
        scoreTeamA = scoreTeamB = 0;

        btn3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                addPointToTeamA(3);
            }

        });

        btn2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPointToTeamA(2);

            }
        });

        btnFreeA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPointToTeamA(1);
            }

        }));

        btn3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPointToTeamB(3);

            }
        });

        btn2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPointToTeamB(2);

            }
        });

        btnFreeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                addPointToTeamB(1);
            }

        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void addPointToTeamB(int point) {
        scoreTeamB += point;

    }

    private void addPointToTeamA(int point) {
        scoreTeamA += point;
    }
}
