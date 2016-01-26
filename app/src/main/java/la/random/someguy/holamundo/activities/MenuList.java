package la.random.someguy.holamundo.activities;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.content.Intent;


public class MenuList  extends ListActivity {

    private String packageName = "la.random.someguy.holamundo.activities";

    // names of classes in the package
    private String itemsArray[] = {"ToastDemo", "Splash"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int layout = android.R.layout.simple_list_item_1;
        ListAdapter mItems = new ArrayAdapter<String>(this,layout,itemsArray);
        setListAdapter(mItems);

    }

    @Override
    protected void onListItemClick(ListView lv, View v, int position, long id) {
        super.onListItemClick(lv, v, position, id);
        Context context = MenuList.this;
        if(position < itemsArray.length){
            Class target = MenuList.class;
            try {
                target =  Class.forName(packageName + "." + itemsArray[position]);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                target = MenuList.class;
            } finally {

                Intent intent = new Intent(context,target);
                startActivity(intent);
                //finish();
            }

        }

    }

}
