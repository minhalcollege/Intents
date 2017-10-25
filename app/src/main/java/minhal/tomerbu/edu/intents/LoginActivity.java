package minhal.tomerbu.edu.intents;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.Executors;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.etEmail)
    EditText etEmail;
    @BindView(R.id.btnLogin)
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.btnLogin)
    public void onViewClicked() {
        //Intent is an object.
        //parameters: 1) Context: access to private files, db, res
        //parameters: 2) The class to initialize.
        Intent intent = new Intent(this/*Context = Activity, Application, Service*/, MainActivity.class/*Where to?*/);
        String email = etEmail.getText().toString();//???
        //put some extras send user name...
        intent.putExtra("email", email);//can pass as many extras as needed
        intent.putExtra("user", new User(email));
        intent.putExtra("score", 20);
        //Map. Dictionary.
        //start Activity?
        startActivity(intent);

        //Run code in 1 sec
        //The Handler manages the Queue of tasks for the A Thread
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        }, 1000);
    }

}
