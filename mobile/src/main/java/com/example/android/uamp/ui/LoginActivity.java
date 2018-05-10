package com.example.android.uamp.ui;

import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.widget.Toolbar;
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
import com.example.android.uamp.ui.tv.LiveActivity;
import com.example.android.uamp.ui.tv.SharedPrefManager;
import com.example.android.uamp.utils.Constants;
import com.example.android.uamp.utils.RequestHandler;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    EditText usernameText;
    EditText passwordText;
    Button loginButton;
    Button backLogin;
    ProgressDialog progressDialog;
    private Toolbar toolbar;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if(SharedPrefManager.getInstance(this).isLoggedIn())
        {
            startActivity(new Intent(this, ProfileActivity.class));
            return;
        }
        toolbar = (Toolbar) findViewById(R.id.include4);
        textView = (TextView) findViewById(R.id.toolbar_title);
        textView.setText("Member Login");

        usernameText = findViewById(R.id.editTextUsername);
        passwordText = findViewById(R.id.editTextPassword);
        loginButton =  findViewById(R.id.buttonLogin);
        backLogin = (Button) findViewById(R.id.button3);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please wait...");

        loginButton.setOnClickListener(this);
        backLogin.setOnClickListener(this);
    }

    private void userLogin()
    {
        final String username = usernameText.getText().toString().trim();
        final String password = passwordText.getText().toString().trim();

        progressDialog.show();
        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
        finish();

        StringRequest stringRequest = new StringRequest(
                Request.Method.POST,
                Constants.URL_LOGIN,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        progressDialog.dismiss();
                        try {
                        JSONObject object = new JSONObject(response);
                        /*if(!object.getBoolean("error"))
                        {*/
                            /*SharedPrefManager.getInstance(getApplicationContext())
                                    .userLogin(
                                            object.getInt("id"),
                                            object.getString("username"),
                                            object.getString("email")
                                    );*/
                            //startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                            //finish();
                        //}
                       /* else
                        {
                        Toast.makeText(getApplicationContext(), object.getString("message"), Toast.LENGTH_LONG).show();
                        }*/
                        } catch (JSONException e) {
                        e.printStackTrace();
                        }
                        }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        progressDialog.dismiss();
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("username", username);
                params.put("password", password);
                return params;
            }
        };
        RequestHandler.getInstance(this).addToRequestQueue(stringRequest);
    }

    @Override
    public void onClick(View view) {
        if(view == loginButton)
        {
            userLogin();
        }
    }
}
