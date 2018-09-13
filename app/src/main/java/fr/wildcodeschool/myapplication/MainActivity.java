package fr.wildcodeschool.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button accept = findViewById(R.id.button2);
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editFirstname = findViewById(R.id.editFirstname);
                EditText editLastname = findViewById(R.id.editLastname);
                String firstnameValue = editFirstname.getText().toString();
                String lastnameValue = editLastname.getText().toString();


                if (firstnameValue.isEmpty() || lastnameValue.equals("")) {
                    Toast.makeText(MainActivity.this, "Please fill your firstname and lastname !", Toast.LENGTH_LONG).show();

                } else{
                    TextView textcongrats = findViewById(R.id.congratulation);
                    textcongrats.setVisibility(view.VISIBLE);
                    textcongrats.setText(String.format("Congratulation %s %s", firstnameValue, lastnameValue));


                }

            }

        });


        CheckBox checkbox = findViewById(R.id.checkBox);
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                EditText editFirstname = findViewById(R.id.editFirstname);
                EditText editLastname = findViewById(R.id.editLastname);
                Button accept = findViewById(R.id.button2);


                editFirstname.setEnabled(isChecked);
                editLastname.setEnabled(isChecked);
                accept.setEnabled(isChecked);


            }
        });

    }

    ;
}





