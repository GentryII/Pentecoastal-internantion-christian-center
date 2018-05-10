package com.example.android.uamp.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;


import java.util.HashMap;
import java.util.Map;

import com.example.android.uamp.R;
import com.example.android.uamp.utils.Constants;
import com.example.android.uamp.utils.RequestHandler;

import org.json.JSONObject;


public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editTextName;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button registerButton;
    private ProgressDialog progressDialog;
    private Button userLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        TextView textView = (TextView) findViewById(R.id.toolbar_title);
        textView.setText("Registration");
        //mToolbar.setTitle("Registration");


        editTextName = (EditText) findViewById(R.id.usernameText);
        editTextEmail = (EditText) findViewById(R.id.emailText);
        editTextPassword = (EditText) findViewById(R.id.password);
        registerButton = (Button) findViewById(R.id.buttonRegister);
        //userLoginButton = (Button) findViewById(R.id.buttonLogin);
        progressDialog = new ProgressDialog(this);
        //userLoginButton.setOnClickListener(this);
        registerButton.setOnClickListener(this);
    }

    public void registerUser()
    {
        final String name = editTextName.getText().toString().trim();
        final String email = editTextEmail.getText().toString().trim().toLowerCase();
        final String password = editTextPassword.getText().toString().trim().toLowerCase();

        progressDialog.setMessage("Registering user...");
        progressDialog.show();
        StringRequest stringRequest = new StringRequest(Request.Method.POST,
                Constants.URL_REGISTR,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        progressDialog.dismiss();
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Toast.makeText(getApplicationContext(), jsonObject.getString("message")
                                    , Toast.LENGTH_LONG).show();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        progressDialog.hide();
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("username", name);
                params.put("email", email);
                params.put("password", password);

                return params;
            }

            /*@Override
            public String getBodyContentType() {
                return "application/json; charset=utf-8";
            }*/

        };
        RequestHandler.getInstance(this).addToRequestQueue(stringRequest);
    }

    @Override
    public void onClick(View v)
    {
        if(v == registerButton)
            registerUser();
        //if(v == userLoginButton)
            //startActivity(new Intent(this, LoginActivity.class));
    }
}
