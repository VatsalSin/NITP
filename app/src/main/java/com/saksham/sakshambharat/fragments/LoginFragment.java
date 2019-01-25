package com.saksham.sakshambharat.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.saksham.sakshambharat.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate= inflater.inflate(R.layout.fragment_login, container, false);
        inflate.findViewById(R.id.forgo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginFragment.this.getContext(), "Forgot Password Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        inflate.findViewById(R.id.log_butt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginFragment.this.getContext(), "Login Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        inflate.findViewById(R.id.signup_log).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginFragment.this.getContext(), "Signup button pressed in Login page", Toast.LENGTH_SHORT).show();
            }
        });
        return inflate;

    }

}
