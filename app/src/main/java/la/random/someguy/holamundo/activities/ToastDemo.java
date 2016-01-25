package la.random.someguy.holamundo.activities;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import la.random.someguy.holamundo.R;

public class ToastDemo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast_demo);
    }

    public void btnToastDemo(View view) {
        Toast.makeText(this, "Hello from toast!", Toast.LENGTH_SHORT).show();
    }
}
