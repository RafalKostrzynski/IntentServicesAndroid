package pl.kostrzynski.intentservice.activities;

import androidx.appcompat.app.AppCompatActivity;
import pl.kostrzynski.intentservice.R;
import pl.kostrzynski.intentservice.service.ChuckNorrisIntentService;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickChuckServiceStart(View view){
        Intent intent=new Intent(this,ChuckNorrisIntentService.class);
        startService(intent);
    }

    public void onClickChuckServiceStop(View view){
        Intent intent=new Intent(this,ChuckNorrisIntentService.class);
        stopService(intent);
    }

    public void onClickChangeActivity(View view){
        Intent intent = new Intent(this, BoundActivity.class);
        startActivity(intent);
    }

}
