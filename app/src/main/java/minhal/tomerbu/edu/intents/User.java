package minhal.tomerbu.edu.intents;

import android.os.Parcelable;
import android.view.View;

import java.io.Serializable;

/**
 * Created by ANDROID on 25/10/2017.
 */

public class User implements Serializable/*TODO: Parcelable IS more efficient */{
    private String email;

    //alt - insert constructor + getter for getEmail
    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    //Never ever pass the password.
}
