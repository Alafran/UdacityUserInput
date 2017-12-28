package lesson3.udacity.com.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore;
    private int teamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.teamAScore = 0;
        this.teamBScore = 0;
    }

    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.teamAPoints);
        scoreView.setText(String.valueOf(this.teamAScore));
    }
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.teamBPoints);
        scoreView.setText(String.valueOf(this.teamBScore));
    }

    public void addThreeTeamA(View view) {
        this.teamAScore += 3;
        displayForTeamA();
    }

    public void addTwoTeamA(View view) {
        this.teamAScore += 2;
        displayForTeamA();
    }

    public void addOneTeamA(View view) {
        this.teamAScore++;
        displayForTeamA();
    }
    public void addThreeTeamB(View view) {
        this.teamBScore += 3;
        displayForTeamB();
    }

    public void addTwoTeamB(View view) {
        this.teamBScore += 2;
        displayForTeamB();
    }

    public void addOneTeamB(View view) {
        this.teamBScore++;
        displayForTeamB();
    }

    public void reset(View view) {
        this.teamAScore = 0;
        this.teamBScore = 0;
        displayForTeamA();
        displayForTeamB();
    }
}
