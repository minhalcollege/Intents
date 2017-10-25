package minhal.tomerbu.edu.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //MainActivity.
        setContentView(R.layout.activity_main);//select the xml file! (Layout)


        //Who opened this activity?

        //get the intent/
        Intent intent = getIntent();



        //keys that we mapped
        String email = intent.getStringExtra("email");

        User user = (User) intent.getSerializableExtra("user");


        Toast.makeText(this, email + " \n" + user.getEmail(), Toast.LENGTH_SHORT).show();
    }
}