package isiasromero.fca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PLANTAS extends AppCompatActivity {
 private Button btntuber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantas);

        btntuber=(Button)findViewById(R.id.buttonTuber);
        btntuber.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bp =new Intent(v.getContext(),Tuberculos.class);
                startActivityForResult(bp,0);
            }
        });
    }
}
