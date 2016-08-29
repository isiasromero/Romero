package isiasromero.fca;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class INICIO extends AppCompatActivity {
    private long retraso=3000;//indica los segudos de la pantalla al iniciar
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent nuevolayaut;
                nuevolayaut= new Intent(INICIO.this,PRINCIPAL.class);
                startActivity(nuevolayaut);
               INICIO.this.finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task,retraso);
    }
	//Este es un "cambio" que hice en el codigo
}
