package ma.ipin.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView t1;
    private TextView t2;
    private EditText e1;
    private EditText e2;
    private EditText e3;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= (TextView) findViewById(R.id.t1);
        t2= (TextView) findViewById(R.id.t2);
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        e3 = (EditText) findViewById(R.id.e3);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);

        // Addition
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((e1.getText().length()>0)&&(e2.getText().length()>0)) {
                    double e_1=Double.parseDouble(e1.getText().toString());
                    double e_2=Double.parseDouble(e2.getText().toString());
                    double result=e_1+e_2;
                    e3.setText(Double.toString(result));
                }
            }
        });

        // Soustraction
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((e1.getText().length()>0)&&(e2.getText().length()>0)) {
                    double e_1=Double.parseDouble(e1.getText().toString());
                    double e_2=Double.parseDouble(e2.getText().toString());
                    double result=e_1-e_2;
                    e3.setText(Double.toString(result));
                }
            }
        });
        // Multiplication
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((e1.getText().length()>0)&&(e2.getText().length()>0)) {
                    double e_1=Double.parseDouble(e1.getText().toString());
                    double e_2=Double.parseDouble(e2.getText().toString());
                    double result=e_1*e_2;
                    e3.setText(Double.toString(result));
                }
            }
        });
        // Division
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((e1.getText().length()>0)&&(e2.getText().length()>0)) {
                    double e_1=Double.parseDouble(e1.getText().toString());
                    double e_2=Double.parseDouble(e2.getText().toString());
                    double result=e_1/e_2;
                    e3.setText(Double.toString(result));
                }
            }
        });
        // Reset
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
                e3.setText("0");
                e1.requestFocus();
            }
        });

    }
}