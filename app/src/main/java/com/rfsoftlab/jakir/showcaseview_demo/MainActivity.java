package com.rfsoftlab.jakir.showcaseview_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.Target;
import com.github.amlcurran.showcaseview.targets.ViewTarget;

public class MainActivity extends AppCompatActivity {
    private EditText etFirstName;
    private EditText etLastName;
    private EditText etEmail;
    private EditText etPhone;
    private Button btnSubmit;
    private ShowcaseView showcaseView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initializations();

        Target firstName=new ViewTarget(R.id.etFirstName,this);
        new ShowcaseView.Builder(this)
                .setTarget(firstName)
                .setContentTitle("Tips & Tricks")
                .setContentText("Put your first name here!")
                .setStyle(2)
                .build();
    }

    private void initializations() {
        etFirstName= (EditText) findViewById(R.id.etFirstName);
        etLastName= (EditText) findViewById(R.id.etLastName);
        etEmail= (EditText) findViewById(R.id.etEmail);
        etPhone= (EditText) findViewById(R.id.etPhone);
        btnSubmit= (Button) findViewById(R.id.btnSubmit);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
