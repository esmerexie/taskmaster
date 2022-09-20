package com.example.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addTaskBttn = MainActivity.this.findViewById(R.id.mainActivityAddTaskButton);

        addTaskBttn.setOnClickListener(view -> {

            Intent goToAddTaskPage = new Intent(MainActivity.this, AddTaskActivity.class);
            startActivity(goToAddTaskPage);
        });

        Button allTaskBttn = MainActivity.this.findViewById(R.id.MainActivityAllTaskButton);

        allTaskBttn.setOnClickListener(view -> {

            Intent goToAllTasksPage = new Intent(MainActivity.this, AllTasksActivity.class);
            startActivity(goToAllTasksPage);
        });
    }
}