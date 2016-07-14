package tk.muslimzabirov.hangman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startSinglePlayerGame(View view){

    }

    int multiplyNumbers(int num1, int num2){
        int result = num1 * num2;
        return result;
    }
}
