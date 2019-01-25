package com.saksham.sakshambharat.fragments;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.saksham.sakshambharat.R;

import static android.app.Activity.RESULT_OK;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignupFragment extends Fragment {

    private EditText nameText;
    private EditText emailText;
    private EditText passwordText;
    private Button signupButton;
    private TextView loginLink;
    private Spinner spinner;
    private EditText occupationText;
    private EditText usernameText;
    private EditText qualificationText;
    private EditText aimText;
    private RadioGroup employmentGroup;
    private boolean employmentStatus;
    private String userCategory;

    private final String TAG = "Signup Fragment";


    public SignupFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_signup, container, false);

        nameText = (EditText) rootView.findViewById(R.id.input_name);
        emailText = (EditText) rootView.findViewById(R.id.input_email);
        passwordText = (EditText) rootView.findViewById(R.id.input_password);
        signupButton = (Button) rootView.findViewById(R.id.btn_signup);
        loginLink = (TextView) rootView.findViewById(R.id.link_login);
        qualificationText = (EditText) rootView.findViewById(R.id.input_education);
        aimText = (EditText) rootView.findViewById(R.id.input_aim);
        occupationText = (EditText) rootView.findViewById(R.id.input_occupation);
        usernameText = (EditText) rootView.findViewById(R.id.input_username);
        employmentGroup = (RadioGroup) rootView.findViewById(R.id.signup_radio_emp);

        spinner = (Spinner) rootView.findViewById(R.id.spinner_category_signup);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.category_spinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (employmentGroup.getCheckedRadioButtonId()){
                    case R.id.signup_radio_yes:
                        employmentStatus = true;
                        break;
                    case R.id.signup_radio_no:
                        employmentStatus = false;
                        break;
                    default:
                }
                userCategory = spinner.getSelectedItem().toString();
                signup();
            }
        });

        loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        return rootView;
    }

    public void updateFragment(Fragment fragment, int bStack) {

        FragmentManager manager = getActivity().getSupportFragmentManager();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_layout_account, fragment, fragment.getTag());

        if (bStack ==1) {
            transaction.addToBackStack(fragment.getTag());
        } else if (bStack == 0){
            manager.popBackStack();
            transaction.disallowAddToBackStack();
        }
        transaction.commit();
    }

    public void signup() {
        Log.d(TAG, "Signup");

        if (!validate()) {
            onSignupFailed();
            return;
        }

        signupButton.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(getContext());
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Creating Account...");
        progressDialog.show();

        String name = nameText.getText().toString();
        String email = emailText.getText().toString();
        String password = passwordText.getText().toString();

        // TODO: Implement your own signup logic here.

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onSignupSuccess or onSignupFailed
                        // depending on success
                        onSignupSuccess();
                        // onSignupFailed();
                        progressDialog.dismiss();
                    }
                }, 3000);
    }


    public void onSignupSuccess() {
        signupButton.setEnabled(true);
        getActivity().setResult(RESULT_OK, null);
        //TODO: updatefragment to profile fragment
    }

    public void onSignupFailed() {
        Toast.makeText(getContext(), "Signup failed", Toast.LENGTH_LONG).show();

        signupButton.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;

        String name = nameText.getText().toString();
        String email = emailText.getText().toString();
        String password = passwordText.getText().toString();
        String username = usernameText.getText().toString();
        String occupation = occupationText.getText().toString();
        String qualification = qualificationText.getText().toString();
        String aim = aimText.getText().toString();

        if (name.isEmpty() || name.length() < 3) {
            nameText.setError("at least 3 characters");
            valid = false;
        } else {
            nameText.setError(null);
        }

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailText.setError("enter a valid email address");
            valid = false;
        } else {
            emailText.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 16) {
            passwordText.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            passwordText.setError(null);
        }

        if (username.isEmpty() || !checkUsername(username)){
            usernameText.setError("change username");
            valid = false;
        } else usernameText.setError(null);

        if (occupation.isEmpty()){
            occupationText.setError("enter an occupation");
            valid = false;
        } else occupationText.setError(null);

        if (qualification.isEmpty()){
            qualificationText.setError("enter a valid qualification");
            valid = false;
        } else qualificationText.setError(null);

        return valid;
    }

    private boolean checkUsername(String username){
        return true;
    }

}
