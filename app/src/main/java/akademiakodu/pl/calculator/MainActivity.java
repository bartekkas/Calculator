package akademiakodu.pl.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends Activity implements View.OnClickListener {

    Button addButton, subtrButton, multiButton, divButton;
    EditText number1, number2;
    TextView score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        score = (TextView) findViewById(R.id.score);
        addButton = (Button) findViewById(R.id.addButton);
        subtrButton = (Button) findViewById(R.id.subtrButton);
        multiButton = (Button) findViewById(R.id.multiButton);
        divButton = (Button) findViewById(R.id.divButton);

        addButton.setOnClickListener(this);
        subtrButton.setOnClickListener(this);
        multiButton.setOnClickListener(this);
        divButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        double num1;
        double num2;
        double result;

        if (addButton.getId() == v.getId()) {
            num1 = Integer.parseInt(number1.getText().toString());
            num2 = Integer.parseInt(number2.getText().toString());
            result = num1 + num2;
            score.setText(Double.toString(result));

        }else

        if (subtrButton.getId() == v.getId()) {
            num1 = Integer.parseInt(number1.getText().toString());
            num2 = Integer.parseInt(number2.getText().toString());
            result = num1 - num2;
            score.setText(Double.toString(result));

        }else

        if (multiButton.getId() == v.getId()) {
            num1 = Integer.parseInt(number1.getText().toString());
            num2 = Integer.parseInt(number2.getText().toString());
            result = num1 * num2;
            score.setText(Double.toString(result));

        }else

        if (divButton.getId() == v.getId()) {
            num1 = Integer.parseInt(number1.getText().toString());
            num2 = Integer.parseInt(number2.getText().toString());
            result = num1 / num2;
            score.setText(Double.toString(result));
        }

    }

}
