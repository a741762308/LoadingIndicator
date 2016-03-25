package com.jsqix.dq.loading;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jsqix.dq.indicator.MonIndicator;

public class MainActivity extends AppCompatActivity {
    private MonIndicator monIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        monIndicator = (MonIndicator) this.findViewById(R.id.monIndicator);
        monIndicator.setColors(new int[]{0xFF942909, 0xFF577B8C, 0xFF201289, 0xFF000000, 0xFF38B549});
    }
}
