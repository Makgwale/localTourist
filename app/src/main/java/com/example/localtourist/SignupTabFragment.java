package com.example.localtourist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {

    EditText email, pass, username, conPass;
    Button register;

    float v = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment,container,false);

        username = root.findViewById(R.id.username);
        email = root.findViewById(R.id.email);
        pass = root.findViewById(R.id.pass);
        conPass = root.findViewById(R.id.confirmPass);
        register = root.findViewById(R.id.button);

        username.setTranslationY(300);
        email.setTranslationY(300);
        pass.setTranslationY(600);
        conPass.setTranslationY(800);
        register.setTranslationY(800);

        username.setAlpha(v);
        email.setAlpha(v);
        pass.setAlpha(v);
        conPass.setAlpha(v);
        register.setAlpha(v);

        username.animate().translationY(0).alpha(1).setDuration(600).setStartDelay(500).start();
        email.animate().translationY(0).alpha(1).setDuration(600).setStartDelay(500).start();
        pass.animate().translationY(0).alpha(1).setDuration(600).setStartDelay(500).start();
        conPass.animate().translationY(0).alpha(1).setDuration(600).setStartDelay(500).start();
        register.animate().translationY(0).alpha(1).setDuration(600).setStartDelay(700).start();

        return root;
    }
}
