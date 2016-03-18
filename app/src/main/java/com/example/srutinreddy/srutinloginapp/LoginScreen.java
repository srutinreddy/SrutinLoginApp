package com.example.srutinreddy.srutinloginapp;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.srutin.DbConstants;
import com.srutin.myDb;

public class LoginScreen extends AppCompatActivity {
    private EditText unm, pwd;

    private Button login,closeApp,signUp, clear, settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        unm=(EditText)findViewById(R.id.id_et_username);
        pwd=(EditText)findViewById(R.id.id_et_password);
      //  settings =(Button)findViewById(R.id.id_btn_settings);
       // Toast.makeText(getApplication(),"onCreate",Toast.LENGTH_LONG).show();

    }



    /*
        @Override
        protected void onStart() {
            super.onStart();
            Toast.makeText(getApplication(),"onStart",Toast.LENGTH_LONG).show();

        }

        @Override
        protected void onPause() {
            super.onPause();
            Toast.makeText(getApplication(),"onPause",Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Toast.makeText(getApplication(),"onRestart",Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onResume() {
            super.onResume();
            Toast.makeText(getApplication(),"onResume",Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onStop() {
            super.onStop();
            Toast.makeText(getApplication(),"onStop",Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Toast.makeText(getApplication(),"onDestroy",Toast.LENGTH_LONG).show();
        }

        public void CloseClick(View v) {
            // Close button
            finish();
        }
    */
    public void LoginClick(View v) {
        //Login Button
        if (unm.length()==0)
        {
            Toast.makeText(getApplicationContext(),"Enter username",Toast.LENGTH_LONG).show();
        }
        else if (pwd.length()==0)
        {
            Toast.makeText(getApplicationContext(),"Enter password",Toast.LENGTH_LONG).show();
        }
        //String unm=unm.getText().toString();

        myDb db=new myDb(getApplicationContext());
        db.close();

    }

    public void VideoClick(View view){
        //VideoClick Button
        Intent SignUp_intent= new Intent(LoginScreen.this,VideoPlayer.class);
        startActivity(SignUp_intent);
    }
    public void SignUpClick(View v) {

        //SignUp Button
        Intent SignUp_intent= new Intent(LoginScreen.this,SignupScreen.class);
        startActivity(SignUp_intent);
    }

    public void ClearClick(View v) {

        //Clear Button
        unm.setText("");
        pwd.setText("");

        }
    public void SettingsClick(View view){
        Intent List_intent= new Intent(LoginScreen.this,SettingsScreen.class);
        startActivity(List_intent);
    }
    }