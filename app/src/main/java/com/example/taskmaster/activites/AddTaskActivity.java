package com.example.taskmaster.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.taskmaster.R;

public class AddTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        Button addTaskSubmitButton = AddTaskActivity.this.findViewById(R.id.addTaskSubmitButton);
        addTaskSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context submitted = getApplicationContext();
                CharSequence text = "Task Submitted!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(submitted, text, duration);
                toast.show();
            }
        });
    }
}