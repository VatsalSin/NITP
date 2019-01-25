package com.saksham.sakshambharat.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
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
                updateFragment(new SignupFragment(), 0);
            }
        });
        return inflate;

    }

    private void updateFragment(Fragment fragment, int bStack) {

        FragmentManager manager = getActivity().getSupportFragmentManager();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.setCustomAnimations(R.anim.right_in, R.anim.right_out, R.anim.right_in, R.anim.right_out)
                .replace(R.id.frame_layout_account, fragment, fragment.getTag());

        if (bStack ==1) {
            transaction.addToBackStack(fragment.getTag());
        } else if (bStack == 0){
            manager.popBackStack();
            transaction.disallowAddToBackStack();
        }
        transaction.commit();
    }

}
