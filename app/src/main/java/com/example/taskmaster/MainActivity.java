package com.example.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String PRODUCT_NAME_EXTRA_TAG = "productName";
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        createAddTaskButton();
        createAllTaskButton();
        createTaskOneButton();
        createSettingsButton();

    }

    @Override
    protected void onResume(){
        super.onResume();
        String userName = sharedPreferences.getString(SettingsPageActivity.USER_NAME_TAG, "No username");
        TextView userNameEdited = findViewById(R.id.mainActivityUsernameTextView);
        userNameEdited.setText(userName + "'s Tasks");
    }


    private void createAddTaskButton() {
        Button addTaskBttn = MainActivity.this.findViewById(R.id.mainActivityAddTaskButton);

        addTaskBttn.setOnClickListener(view -> {

            Intent goToAddTaskPage = new Intent(MainActivity.this, AddTaskActivity.class);
            startActivity(goToAddTaskPage);
        });
    }

    private void createAllTaskButton() {
        Button allTaskBttn = MainActivity.this.findViewById(R.id.MainActivityAllTaskButton);

        allTaskBttn.setOnClickListener(view -> {

            Intent goToAllTasksPage = new Intent(MainActivity.this, AllTasksActivity.class);
            startActivity(goToAllTasksPage);
        });
    }

    private void createTaskOneButton() {
        Button taskOneButton = MainActivity.this.findViewById(R.id.mainActivityTaskOneButton);

        taskOneButton.setOnClickListener(view -> {
            Intent goToTaskPage = new Intent(MainActivity.this, TaskDetailPageActivity.class);
            startActivity(goToTaskPage);
        });
    }

    private void createSettingsButton() {
        Button settingsButton = MainActivity.this.findViewById(R.id.mainActivitySettingsButton);

        settingsButton.setOnClickListener(view -> {
            Intent goToSettingsPage = new Intent(MainActivity.this, SettingsPageActivity.class);
            startActivity(goToSettingsPage);
        });
    }


}

