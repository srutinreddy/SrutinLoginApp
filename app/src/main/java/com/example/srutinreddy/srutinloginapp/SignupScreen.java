package com.example.srutinreddy.srutinloginapp;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.srutin.DbConstants;
import com.srutin.myDb;


public class SignupScreen extends AppCompatActivity {


   private EditText sUnm, sPwd, sFName, sLName, sAddress, sZipCode;
    private Button sSubmit;
    private Spinner sCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);
        sCountry=(Spinner)findViewById(R.id.id_sp_country);
        sUnm =(EditText)findViewById(R.id.id_et_unm);
        sPwd =(EditText)findViewById(R.id.id_et_pwd);
        sFName =(EditText)findViewById(R.id.id_et_fname);
        sLName =(EditText)findViewById(R.id.id_et_lname);
        sAddress =(EditText)findViewById(R.id.id_et_address);
        sZipCode =(EditText)findViewById(R.id.id_et_zipCode);
        sSubmit =(Button)findViewById(R.id.id_btn_submit);
        sSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sUnm1 = sUnm.getText().toString();
                String sPwd1 = sPwd.getText().toString();
                String sFName1 = sFName.getText().toString();
                String sLName1 = sLName.getText().toString();
                String sAddress1 = sAddress.getText().toString();
                String sZipCode1 = sZipCode.getText().toString();
                //String sCountry1= sCountry.getC ;
               /* SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor edit = pref.edit();
                edit.putString("username", sUnm1);
                edit.putString("password", sPwd1);
                edit.putString("firstName", sFName1);
                edit.putLong("time", System.currentTimeMillis());
                edit.commit();*/
                saveInfoDb(sUnm1, sPwd1, sFName1, sLName1, sAddress1, sZipCode1);
                finish();
            }
        });
        //Toast.makeText(getApplication(),"onCreate_signUp",Toast.LENGTH_LONG).show();

    }
     private void saveInfoDb (String userName,String password,String firstName, String lastName, String Address, String zipCode){
            myDb db=new myDb(getApplicationContext());
         ContentValues cv=new ContentValues();
         cv.put("unm", userName);
         cv.put("pwd", password);
         cv.put("fName", firstName);
         cv.put("lName", lastName);
         cv.put("address", Address);
         cv.put("zipCode", zipCode);
         db.insert(DbConstants.TAB_LOGIN, "unm", cv);
     }



  /*  @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplication(), "onStart_signUp", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplication(),"onPause_signUp",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplication(),"onRestart_signUp",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplication(),"onResume_signUp",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplication(),"onStop_signUp",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplication(),"onDestroy_signUp",Toast.LENGTH_LONG).show();
    }
*/

}
