package com.saksham.sakshambharat.fragments;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.saksham.sakshambharat.R;

import static android.app.Activity.RESULT_OK;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    private EditText emailInput;
    private EditText passwordInput;
    private Button loginButton;
    private Button signupButton;
    private Button forgotButton;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_login, container, false);

        emailInput = (EditText) rootView.findViewById(R.id.emailInputEditText);
        passwordInput = (EditText) rootView.findViewById(R.id.passwordInputEditText);

        loginButton = (Button) rootView.findViewById(R.id.log_butt);
        forgotButton = (Button) rootView.findViewById(R.id.forgo);
        signupButton = (Button) rootView.findViewById(R.id.signup_log);

        forgotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginFragment.this.getContext(), "Forgot Password Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(LoginFragment.this.getContext(), "Login Button Clicked", Toast.LENGTH_SHORT).show();
            login();
            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFragment(new SignupFragment(), 0);
            }
        });
        return rootView;

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

    private void login(){
        if (!validate()) {
            onLoginFailed();
            return;
        }

        loginButton.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(getContext());
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Logging In...");
        progressDialog.show();

        String email = emailInput.getText().toString();
        String password = passwordInput.getText().toString();

        // TODO: Implement your own signup logic here.

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onSignupSuccess or onSignupFailed
                        // depending on success
                        onLoginSuccess();
                        // onSignupFailed();
                        progressDialog.dismiss();
                    }
                }, 3000);
    }


    public void onLoginSuccess() {
        loginButton.setEnabled(true);
        getActivity().setResult(RESULT_OK, null);
        //TODO: updatefragment to profile fragment
    }

    public void onLoginFailed() {
        Toast.makeText(getContext(), "Signup failed", Toast.LENGTH_LONG).show();

        signupButton.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;

        String email = emailInput.getText().toString();
        String password = passwordInput.getText().toString();

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailInput.setError("enter a valid email address");
            valid = false;
        } else {
            emailInput.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 16) {
            passwordInput.setError("between 4 and 16 alphanumeric characters");
            valid = false;
        } else {
            passwordInput.setError(null);
        }
        return valid;
    }

}
