package cw.momo.com.nanodegree;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnClickListener {
    static int [] buttons={R.id.btn_app1,R.id.btn_app2,R.id.btn_app3,R.id.btn_app4,R.id.btn_app5,R.id.btn_app6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i:buttons){
            ((Button)findViewById(i)).setOnClickListener(this);
        }
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_app1:
                ShowToast(getString(R.string.app_spot));
                break;
            case R.id.btn_app2:
                ShowToast(getString(R.string.app_scores));
                break;
            case R.id.btn_app3:
                ShowToast(getString(R.string.app_lib));
                break;
            case R.id.btn_app4:
                ShowToast(getString(R.string.app_build));
                break;
            case R.id.btn_app5:
                ShowToast(getString(R.string.app_bacon));
                break;
            case R.id.btn_app6:
                ShowToast(getString(R.string.app_capstone));
                break;
        }


    }
    private void ShowToast(String msg){
        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
