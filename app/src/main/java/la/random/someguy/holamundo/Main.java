package la.random.someguy.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;


public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Context context = Main.this;
        Class target = la.random.someguy.holamundo.activities.MenuList.class;
        Intent intent = new Intent(context, target);
        startActivity(intent);
        finish();
    }
}
