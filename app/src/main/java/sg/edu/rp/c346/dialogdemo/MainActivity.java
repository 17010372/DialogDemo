package sg.edu.rp.c346.dialogdemo;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnDemo1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDemo1 = findViewById(R.id.buttonDemo1);

        btnDemo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create Dialog Builder
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                //Set details in dialog

                //Title
                myBuilder.setTitle("Demo 1-Simple Dialog");

                //Message
                myBuilder.setMessage("I cannot develop android app");

                //Cancelable
                myBuilder.setCancelable(false);

                myBuilder.setPositiveButton("Close",null);


                //Create dialog
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });
    }
}
