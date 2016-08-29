package isiasromero.fca;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PRINCIPAL extends AppCompatActivity {
private ImageButton butonplanta;
    private ImageButton BTNMAQUINARIAS;
    private ImageButton BTNINSECTOS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        butonplanta=(ImageButton)findViewById(R.id.imageButtonPLANTAS);//LLAMAR  OTRA  VISTA DESDE OTRO OBJETO
        BTNMAQUINARIAS=(ImageButton)findViewById(R.id.imageButtonMaquinarias);
        BTNINSECTOS=(ImageButton)findViewById(R.id.imageButtonInsectos);
        butonplanta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               Intent bp =new Intent(v.getContext(),PLANTAS.class);
                startActivityForResult(bp,0);
            }
        });

        BTNMAQUINARIAS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bp =new Intent(v.getContext(),MAQUINARIAS.class);
                startActivityForResult(bp,0);
            }
        });


        BTNINSECTOS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bp =new Intent(v.getContext(),INSECTOS.class);
                startActivityForResult(bp,0);
            }
        });
    }
}
