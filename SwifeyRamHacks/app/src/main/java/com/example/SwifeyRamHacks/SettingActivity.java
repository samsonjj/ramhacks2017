package com.example.SwifeyRamHacks;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import static com.example.SwifeyRamHacks.R.id.editTextEmail;
import static com.example.SwifeyRamHacks.R.id.textViewSignUp;

public class SettingActivity extends AppCompatActivity {

    private Button buttonSave;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser() != null) {
            //next activity
            finish();
            startActivity(new Intent(getApplicationContext(), MapsActivityCurrentPlace.class));

        }

//        editTextEmail = (EditText) findViewById(editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        buttonSave = (Button) findViewById(R.id.buttonSave);

        progressDialog = new ProgressDialog(this);
//        buttonSave.setOnClickListener(this);



    }

    private void userLogin() {
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if(TextUtils.isEmpty(email)) {
            //email is empty
            Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(password)) {
            //password is empty
            Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
            return;
        }
        //if validates
        //show progress bar

        progressDialog.setMessage("Registering User...");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();

                        if(task.isSuccessful()) {
                            //start next activity
                            finish();
                            startActivity(new Intent(getApplicationContext(), MapsActivityCurrentPlace.class));
                        }
                    }
                });
    }

//    @Override
    public void onClick(View view) {

        if(view == buttonSave) {
            finish();
            startActivity(new Intent(this,LoginActivity.class));
        }

//        if(view == textViewSignUp) {
//            finish();
//            startActivity(new Intent(this, MainActivity.class));
//        }
    }
}
