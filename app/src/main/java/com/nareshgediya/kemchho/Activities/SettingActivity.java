package com.nareshgediya.kemchho.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.nareshgediya.kemchho.R;

import java.util.Locale;

public class SettingActivity extends AppCompatActivity {
    CardView logout, editProfile, langaguge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        logout = findViewById(R.id.logout);
editProfile = findViewById(R.id.editPro);
//langaguge = findViewById(R.id.language);

logout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        AlertDialog.Builder dialog;
        dialog = new AlertDialog.Builder(SettingActivity.this)
                .setTitle("Delete Message")
                .setMessage("Are you sure want to logout ?")
                .setPositiveButton("Ohk", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        FirebaseAuth.getInstance().signOut();
                        startActivity( new Intent(SettingActivity.this,PhoneNumberActivity.class));
                        finish();
                    }
                }).setNegativeButton("No", null);

        dialog.show();
    }
});

//
//        langaguge.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AlertDialog.Builder langDialog;
//                langDialog = new AlertDialog.Builder(SettingActivity.this)
//                        .setTitle("Select a Language")
//                        .setPositiveButton("Gujarati", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                                setLangauge(SettingActivity.this,"gu");
//                                Toast.makeText(SettingActivity.this, "Language", Toast.LENGTH_SHORT).show();
//                            }
//                        }).setNegativeButton("No", null);
//
//                langDialog.show();
//            }
//        });






editProfile.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
       startActivity( new Intent(SettingActivity.this,SetupProfileActivity.class));
    }
});

    }
    public void setLangauge(Activity activity, String langauge){
        Locale locale = new Locale(langauge);
        Resources resources = activity.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        resources.updateConfiguration(configuration,resources.getDisplayMetrics());
    }
}