package com.mumu.progressbar_demo_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private Button button_1;
    private ProgressBar progressbar_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_1 = (Button) findViewById(R.id.button_1);
        progressbar_1 = (ProgressBar) findViewById(R.id.progressbar_1);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int progress = progressbar_1.getProgress();
                progress += 10;
                progressbar_1.setProgress(progress);
                if(progressbar_1.getProgress() == 100) {
                    progress = 0;
                    progressbar_1.setProgress(progress);
                }
            }
        });
    }
}
