package com.md.zeroXCTF;

import android.content.Intent;
import androidx.databinding.DataBindingUtil;
import androidx.core.view.LayoutInflaterCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.md.zeroXCTF.databinding.ActivityLoginBinding;
import com.mikepenz.iconics.context.IconicsLayoutInflater2;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    Button btnL;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LayoutInflaterCompat.setFactory2(getLayoutInflater(), new IconicsLayoutInflater2(getDelegate()));
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        init();

    }

    private void init() {
        btnL=findViewById(R.id.btn_login);
        mAuth= FirebaseAuth.getInstance();
        exit=findViewById(R.id.ann);
        ins=findViewById(R.id.inscri);
        ecouteur();
    }

    public void signup(View view) {
        startActivity(new Intent(this, SignupActivity.class));
    }

 =
    private void ecouteur(){
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().IsEmpty)
                    Toast.makeText(RegForm.this, "error user", Toast.LENGTH_SHORT).show();
                if (email.getText().toString().IsEmpty)
                    Toast.makeText(RegForm.this, "error email", Toast.LENGTH_SHORT).show();
                if (pasword.getText().toString().IsEmpty)
                    Toast.makeText(RegForm.this, "error pasword", Toast.LENGTH_SHORT).show();
                else
                    mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                        }

                    });
            }
        });
    }

}
