package kr.sunrin.todo;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
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

        container = (FrameLayout) findViewById(R.id.container);
        noTodoContainer = (LinearLayout) findViewById(R.id.no_to_container);
        toolbar = (Toolbar) findViewById(R.id.main_toorbar);
        listView = (ListView) findViewById(R.id.main_list);
        setSupportActionBar(toolbar); //v7 only

        if (getSupportActionBar() != null) { //안정성을 위해 null체크
            getSupportActionBar().setDisplayShowTitleEnabled(true);
            getSupportActionBar().setTitle(R.string.app_name);
        }

        findViewById(R.id.main_fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Click FAB", Toast.LENGTH_SHORT).show();
            }
        });

        listView = (ListView) findViewById(R.id.main_list);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.setting:
                Toast.makeText(this,"Setting",Toast.LENGTH_LONG).show();
                break;
            case R.id.about :
                Toast.makeText(this,"Aobut",Toast.LENGTH_LONG).show();
                break;

        }
        return true;
    }
}
