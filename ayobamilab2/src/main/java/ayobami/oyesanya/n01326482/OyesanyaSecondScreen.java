package ayobami.oyesanya.n01326482;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

/**
 * @author Ayobami Oyesanya
 * @student_id n01326482
 */

public class OyesanyaSecondScreen extends AppCompatActivity {

    ListView listView;
    MenuItem currentSelectedItem;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyesanya_second_screen);
        ConstraintLayout initialScreen = findViewById(R.id.initialSecondScreen);
        initialScreen.setVisibility(View.VISIBLE);
        ConstraintLayout updatedScreen = findViewById(R.id.updatedSecondScreen);
        updatedScreen.setVisibility(View.GONE);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_types_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        this.currentSelectedItem = item;
        ConstraintLayout initialScreen = findViewById(R.id.initialSecondScreen);
        initialScreen.setVisibility(View.GONE);
        ConstraintLayout updatedScreen = findViewById(R.id.updatedSecondScreen);
        updatedScreen.setVisibility(View.VISIBLE);
        switch (item.getItemId()){
            case R.id.apartmentMenuOption:
                //do apartment here
                return true;
            case R.id.detachedMenuOption:
                //do detached here
                return true;
            case R.id.semiDetachedMenuOption:
                //do semidetached here
                return true;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}

