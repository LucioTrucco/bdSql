package com.example.linearlayout;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class activityRegistro extends AppCompatActivity {

    public EditText etMail,etPw,etRpPw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        etMail = (EditText)findViewById(R.id.etCorreo);
        etPw = (EditText)findViewById(R.id.etPassword);
        etRpPw = (EditText)findViewById(R.id.etRpPw);
    }


    public void volver (View view){
        Toast.makeText(this, "Hola", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void altaUser (View view){
        AdminSQLiteOpenHelper adm = new AdminSQLiteOpenHelper(this,"administracion",null,1);
        SQLiteDatabase bd =adm.getWritableDatabase();

        String mail = etMail.getText().toString();
        String password = etPw.getText().toString();
        //String rpContra = etRpPw.getText().toString();

        if (!mail.isEmpty() && !password.isEmpty()){
            ContentValues registro = new ContentValues();
            registro.put("mail",mail);
            registro.put("password",password);

            bd.insert("users",null,registro);
            bd.close();



            Toast.makeText(this, "Usuario registrado con exito", Toast.LENGTH_LONG).show();

        }else{

            Toast.makeText(this, "Debes llenar todos los campos", Toast.LENGTH_LONG).show();
        }

    }

}
