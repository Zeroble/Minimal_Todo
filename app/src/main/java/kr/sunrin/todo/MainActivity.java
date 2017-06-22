package kr.sunrin.todo;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    FrameLayout container;
    LinearLayout noTodoContainer;
    FloatingActionButton fab;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.main_toorbar);
        setSupportActionBar(toolbar); //v7 only

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(true);
            getSupportActionBar().setTitle(getString(R.string.app_name));
        }

        container = (FrameLayout) findViewById(R.id.container);
        noTodoContainer = (LinearLayout) findViewById(R.id.no_to_container);
        findViewById(R.id.main_fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Click FAB", Toast.LENGTH_SHORT).show();
            }
        });

        listView = (ListView) findViewById(R.id.main_list);

    }
}
