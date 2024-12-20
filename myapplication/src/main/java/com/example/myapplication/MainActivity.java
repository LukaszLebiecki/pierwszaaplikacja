package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button okButton = findViewById(R.id.ok);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText nameTextView = findViewById(R.id.name);
                RadioButton ganderMale = findViewById(R.id.male);
                RadioButton ganderFemale = findViewById(R.id.female);

                String name = nameTextView.getText().toString();
                String gander = "";

                if (ganderMale.isChecked()) {
                    gander = "Facet! ";
                }

                if (ganderFemale.isChecked()) {
                    gander = "Kobieta! ";
                }

                Toast.makeText(getApplicationContext(), gander + name, Toast.LENGTH_SHORT).show();
            }
        });


    }

}