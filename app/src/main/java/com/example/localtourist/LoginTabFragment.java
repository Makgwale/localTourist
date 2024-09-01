package com.example.localtourist;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;

public class LoginTabFragment  extends Fragment {

    EditText email, pass;
    TextView forgetPass;
    Button login;

    float v = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment,container,false);

        email = root.findViewById(R.id.email);
        pass = root.findViewById(R.id.pass);
        forgetPass = root.findViewById(R.id.forget_pass);
        login = root.findViewById(R.id.button);

        email.setTranslationY(300);
        pass.setTranslationY(600);
        forgetPass.setTranslationY(800);
        login.setTranslationY(800);

        email.setAlpha(v);
        pass.setAlpha(v);
        forgetPass.setAlpha(v);
        login.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(600).setStartDelay(500).start();
        pass.animate().translationY(0).alpha(1).setDuration(600).setStartDelay(500).start();
        forgetPass.animate().translationY(0).alpha(1).setDuration(600).setStartDelay(500).start();
        login.animate().translationY(0).alpha(1).setDuration(600).setStartDelay(700).start();


            //get the button view
            //set onclick listener for when the button gets clicked
            login.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    //Start new activity
                    Intent mainIntent = new Intent(getActivity(),MainActivity.class);
                    startActivity(mainIntent);
                }
            });

        return root;
    }


}
