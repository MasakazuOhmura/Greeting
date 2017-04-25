package com.masakazuohmura.greeting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button greetingButton = (Button) findViewById(R.id.greeting_button);
        final EditText greetingEdit = (EditText) findViewById(R.id.greeting_edit_text);
        TextView greetingText = (TextView) findViewById(R.id.greeting_text);

        greetingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String greetingStr = greetingEdit.getText().toString();
                greetingEdit.setText(greetingStr);
            }
        });
    }
}
