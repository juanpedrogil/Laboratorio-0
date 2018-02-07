package com.debug.prueba.aplicacion.juanpedrog.laboratorio_0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn11,btn12,btn13,btn21,btn22,btn23,btn31,btn32,btn33;
    TextView txtGanador;
    boolean xo=true;//Cuando es verdadero pone una x
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn11=(Button)findViewById(R.id.btn11);
        btn12=(Button)findViewById(R.id.btn12);
        btn13=(Button)findViewById(R.id.btn13);
        btn21=(Button)findViewById(R.id.btn21);
        btn22=(Button)findViewById(R.id.btn22);
        btn23=(Button)findViewById(R.id.btn23);
        btn31=(Button)findViewById(R.id.btn31);
        btn32=(Button)findViewById(R.id.btn32);
        btn33=(Button)findViewById(R.id.btn33);
        txtGanador=(TextView)findViewById(R.id.txtGanador);
    }
    public void onClickButton11(View v){
        if(xo){
            btn11.setText("X");
        }else{
            btn11.setText("O");
        }
        verificarX();
        verificarO();
        xo=!xo;
    }
    public void onClickButton12(View v){
        if(xo){
            btn12.setText("X");
        }else{
            btn12.setText("O");
        }
        verificarX();
        verificarO();
        xo=!xo;
    }
    public void onClickButton13(View v){
        if(xo){
            btn13.setText("X");
        }else{
            btn13.setText("O");
        }
        verificarX();
        verificarO();
        xo=!xo;
    }
    public void onClickButton21(View v){
        if(xo){
            btn21.setText("X");
        }else{
            btn21.setText("O");
        }
        verificarX();
        verificarO();
        xo=!xo;
    }
    public void onClickButton22(View v){
        if(xo){
            btn22.setText("X");
        }else{
            btn22.setText("O");
        }
        verificarX();
        verificarO();
        xo=!xo;
    }
    public void onClickButton23(View v){
        if(xo){
            btn23.setText("X");
        }else{
            btn23.setText("O");
        }
        verificarX();
        verificarO();
        xo=!xo;
    }
    public void onClickButton31(View v){
        if(xo){
            btn31.setText("X");
        }else{
            btn31.setText("O");
        }
        verificarX();
        verificarO();
        xo=!xo;
    }
    public void onClickButton32(View v){
        if(xo){
            btn32.setText("X");
        }else{
            btn32.setText("O");
        }
        verificarX();
        verificarO();
        xo=!xo;
    }
    public void onClickButton33(View v){
        if(xo){
            btn33.setText("X");
        }else{
            btn33.setText("O");
        }
        verificarX();
        verificarO();
        xo=!xo;
    }
    void verificarX(){
        if(btn11.getText().toString().equals("X") && btn12.getText().toString().equals("X") &&
                btn13.getText().toString().equals("X")){
            txtGanador.setText("Ganador: X");
        }
        if(btn11.getText().toString().equals("X") && btn22.getText().toString().equals("X") &&
                btn33.getText().toString().equals("X")){
            txtGanador.setText("Ganador: X");
        }
        if(btn21.getText().toString().equals("X") && btn22.getText().toString().equals("X") &&
                btn23.getText().toString().equals("X")){
            txtGanador.setText("Ganador: X");
        }
        if(btn31.getText().toString().equals("X") && btn32.getText().toString().equals("X") &&
                btn33.getText().toString().equals("X")){
            txtGanador.setText("Ganador: X");
        }
        if(btn31.getText().toString().equals("X") && btn22.getText().toString().equals("X") &&
                btn13.getText().toString().equals("X")){
            txtGanador.setText("Ganador: X");
        }
    }
    void verificarO(){
        if(btn11.getText().toString().equals("O") && btn12.getText().toString().equals("O") &&
                btn13.getText().toString().equals("O")){
            txtGanador.setText("Ganador: O");
        }
        if(btn11.getText().toString().equals("O") && btn22.getText().toString().equals("O") &&
                btn33.getText().toString().equals("O")){
            txtGanador.setText("Ganador: O");
        }
        if(btn21.getText().toString().equals("O") && btn22.getText().toString().equals("O") &&
                btn23.getText().toString().equals("O")){
            txtGanador.setText("Ganador: O");
        }
        if(btn31.getText().toString().equals("O") && btn32.getText().toString().equals("O") &&
                btn33.getText().toString().equals("O")){
            txtGanador.setText("Ganador: O");
        }
        if(btn31.getText().toString().equals("O") && btn22.getText().toString().equals("O") &&
                btn13.getText().toString().equals("O")){
            txtGanador.setText("Ganador: O");
        }
    }
}
