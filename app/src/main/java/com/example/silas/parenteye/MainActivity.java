package com.example.silas.parenteye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.silas.parenteye.Service.Login;
import com.example.silas.parenteye.model.User;
import com.example.silas.parenteye.network.APIClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText userpassword;
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        userpassword = (EditText) findViewById(R.id.userpassword);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("Username", username.getText().toString().trim());
                startActivity(intent);
                /*String userna = username.getText().toString().trim();
                String userpass = userpassword.getText().toString().trim();
                if(!TextUtils.isEmpty(userna) && !TextUtils.isEmpty(userpass)) {
                    sendPost(userna, userpass);
                }*/
            }
        });
    }
    public void sendPost(String username, String password) {
        Login service = APIClient.getClient().create(Login.class);
        Call<User>  call = service.Userlogin(username,password);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Log.d("Response:",response.body().toString());
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.d("Response:",t.toString());
            }
        });
    }

    private void getuserlist(){
        try{
            Login service = APIClient.getClient().create(Login.class);
            Call<User>  call = service.Userlogin(username.getText().toString(),userpassword.getText().toString());
            call.enqueue(new Callback<User>() {
                @Override
                public void onResponse(Call<User> call, Response<User> response) {
                    Log.d("Response:",response.body().toString());
                }

                @Override
                public void onFailure(Call<User> call, Throwable throwable) {

                }
            });
            /*call.enqueue(new Callback<List<User>>() {
                @Override
                public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                    List<User> rowListItem = response.body();
                    *//*Log.d("Response:",rowListItem.get(0).getName());*//*
                    layoutManager = new LinearLayoutManager(MainActivity.this);
                    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
                    recyclerView.setLayoutManager(layoutManager);
                    RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(rowListItem);
                    recyclerView.setAdapter(recyclerViewAdapter);
                }

                @Override
                public void onFailure(Call<List<User>> call, Throwable t) {
                    Log.d("Failuer:",t.toString());
                }
            });*/

        }catch (Exception ex){

        }
    }
}
