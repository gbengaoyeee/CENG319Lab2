package ayobami.oyesanya.n01326482;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;

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
    ImageButton checkoutButton;

    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    ImageView homeImage1, homeImage2, homeImage3, homeImage4;
    TextView address1, address2, address3, address4;
    TextView price1, price2, price3, price4;

    ApartmentList apartmentList = new ApartmentList();
    DetachedList detachedList = new DetachedList();
    SemiDetachedList semiDetachedList = new SemiDetachedList();

    HashSet<Home> selectedHomes = new HashSet<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set initial screen to be visible
        setContentView(R.layout.activity_oyesanya_second_screen);
        ConstraintLayout initialScreen = findViewById(R.id.initialSecondScreen);
        initialScreen.setVisibility(View.VISIBLE);
        ConstraintLayout updatedScreen = findViewById(R.id.updatedSecondScreen);
        updatedScreen.setVisibility(View.GONE);

        // Setting components
        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);
        checkBox4 = findViewById(R.id.checkbox4);

        homeImage1 = findViewById(R.id.homeImage1);
        homeImage2 = findViewById(R.id.homeImage2);
        homeImage3 = findViewById(R.id.homeImage3);
        homeImage4 = findViewById(R.id.homeImage4);

        address1 = findViewById(R.id.address1);
        address2 = findViewById(R.id.address2);
        address3 = findViewById(R.id.address3);
        address4 = findViewById(R.id.address4);

        price1 = findViewById(R.id.price1);
        price2 = findViewById(R.id.price2);
        price3 = findViewById(R.id.price3);
        price4 = findViewById(R.id.price4);

        checkoutButton = findViewById(R.id.checkoutBtn);
        

        //Handle Checkbox checks
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox1.isChecked()){
                    switch (currentSelectedItem.getItemId()){
                        case R.id.apartmentMenuOption:
                            apartmentList.apartmentList[0].isSelected = true;
                            selectedHomes.add(apartmentList.apartmentList[0]);
                            break;
                        case R.id.detachedMenuOption:
                            detachedList.detachedList[0].isSelected = true;
                            selectedHomes.add(detachedList.detachedList[0]);
                            break;
                        case R.id.semiDetachedMenuOption:
                            semiDetachedList.semidetachedList[0].isSelected = true;
                            selectedHomes.add(semiDetachedList.semidetachedList[0]);
                            break;
                        default:
                            break;
                    }
                }
                else{
                    switch (currentSelectedItem.getItemId()){
                        case R.id.apartmentMenuOption:
                            apartmentList.apartmentList[0].isSelected = false;
                            selectedHomes.remove(apartmentList.apartmentList[0]);
                            break;
                        case R.id.detachedMenuOption:
                            detachedList.detachedList[0].isSelected = false;
                            selectedHomes.remove(detachedList.detachedList[0]);
                            break;
                        case R.id.semiDetachedMenuOption:
                            semiDetachedList.semidetachedList[0].isSelected = false;
                            selectedHomes.remove(semiDetachedList.semidetachedList[0]);
                            break;
                        default:
                            break;
                    }
                }
                Toast.makeText(OyesanyaSecondScreen.this, ""+selectedHomes.size(), Toast.LENGTH_SHORT).show();
            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox2.isChecked()){
                    switch (currentSelectedItem.getItemId()){
                        case R.id.apartmentMenuOption:
                            apartmentList.apartmentList[1].isSelected = true;
                            selectedHomes.add(apartmentList.apartmentList[1]);
                            break;
                        case R.id.detachedMenuOption:
                            detachedList.detachedList[1].isSelected = true;
                            selectedHomes.add(detachedList.detachedList[1]);
                            break;
                        case R.id.semiDetachedMenuOption:
                            semiDetachedList.semidetachedList[1].isSelected = true;
                            selectedHomes.add(semiDetachedList.semidetachedList[1]);
                            break;
                        default:
                            break;
                    }
                }
                else{
                    switch (currentSelectedItem.getItemId()){
                        case R.id.apartmentMenuOption:
                            apartmentList.apartmentList[1].isSelected = false;
                            selectedHomes.remove(apartmentList.apartmentList[1]);
                            break;
                        case R.id.detachedMenuOption:
                            detachedList.detachedList[1].isSelected = false;
                            selectedHomes.remove(detachedList.detachedList[1]);
                            break;
                        case R.id.semiDetachedMenuOption:
                            semiDetachedList.semidetachedList[1].isSelected = false;
                            selectedHomes.remove(semiDetachedList.semidetachedList[1]);
                            break;
                        default:
                            break;
                    }
                }
                Toast.makeText(OyesanyaSecondScreen.this, ""+selectedHomes.size(), Toast.LENGTH_SHORT).show();
            }
        });

        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox3.isChecked()){
                    switch (currentSelectedItem.getItemId()){
                        case R.id.apartmentMenuOption:
                            apartmentList.apartmentList[2].isSelected = true;
                            selectedHomes.add(apartmentList.apartmentList[2]);
                            break;
                        case R.id.detachedMenuOption:
                            detachedList.detachedList[2].isSelected = true;
                            selectedHomes.add(detachedList.detachedList[2]);
                            break;
                        case R.id.semiDetachedMenuOption:
                            semiDetachedList.semidetachedList[2].isSelected = true;
                            selectedHomes.add(semiDetachedList.semidetachedList[2]);
                            break;
                        default:
                            break;
                    }
                }
                else{
                    switch (currentSelectedItem.getItemId()){
                        case R.id.apartmentMenuOption:
                            apartmentList.apartmentList[2].isSelected = false;
                            selectedHomes.remove(apartmentList.apartmentList[2]);
                            break;
                        case R.id.detachedMenuOption:
                            detachedList.detachedList[2].isSelected = false;
                            selectedHomes.remove(detachedList.detachedList[2]);
                            break;
                        case R.id.semiDetachedMenuOption:
                            semiDetachedList.semidetachedList[2].isSelected = false;
                            selectedHomes.remove(semiDetachedList.semidetachedList[2]);
                            break;
                        default:
                            break;
                    }
                }
                Toast.makeText(OyesanyaSecondScreen.this, ""+selectedHomes.size(), Toast.LENGTH_SHORT).show();
            }
        });

        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox4.isChecked()){
                    switch (currentSelectedItem.getItemId()){
                        case R.id.apartmentMenuOption:
                            apartmentList.apartmentList[3].isSelected = true;
                            selectedHomes.add(apartmentList.apartmentList[3]);
                            break;
                        case R.id.detachedMenuOption:
                            detachedList.detachedList[3].isSelected = true;
                            selectedHomes.add(detachedList.detachedList[3]);
                            break;
                        case R.id.semiDetachedMenuOption:
                            semiDetachedList.semidetachedList[3].isSelected = true;
                            selectedHomes.add(semiDetachedList.semidetachedList[3]);
                            break;
                        default:
                            break;
                    }
                }
                else{
                    switch (currentSelectedItem.getItemId()){
                        case R.id.apartmentMenuOption:
                            apartmentList.apartmentList[3].isSelected = false;
                            selectedHomes.remove(apartmentList.apartmentList[3]);
                            break;
                        case R.id.detachedMenuOption:
                            detachedList.detachedList[3].isSelected = false;
                            selectedHomes.remove(detachedList.detachedList[3]);
                            break;
                        case R.id.semiDetachedMenuOption:
                            semiDetachedList.semidetachedList[3].isSelected = false;
                            selectedHomes.remove(semiDetachedList.semidetachedList[3]);
                            break;
                        default:
                            break;
                    }
                }
                Toast.makeText(OyesanyaSecondScreen.this, ""+selectedHomes.size(), Toast.LENGTH_SHORT).show();
            }
        });
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
                checkBox1.setChecked(apartmentList.apartmentList[0].isSelected);
                checkBox2.setChecked(apartmentList.apartmentList[1].isSelected);
                checkBox3.setChecked(apartmentList.apartmentList[2].isSelected);
                checkBox4.setChecked(apartmentList.apartmentList[3].isSelected);

                homeImage1.setImageResource(apartmentList.apartmentList[0].image);
                homeImage2.setImageResource(apartmentList.apartmentList[1].image);
                homeImage3.setImageResource(apartmentList.apartmentList[2].image);
                homeImage4.setImageResource(apartmentList.apartmentList[3].image);

                address1.setText(apartmentList.apartmentList[0].address);
                address2.setText(apartmentList.apartmentList[1].address);
                address3.setText(apartmentList.apartmentList[2].address);
                address4.setText(apartmentList.apartmentList[3].address);

                price1.setText(apartmentList.apartmentList[0].price);
                price2.setText(apartmentList.apartmentList[1].price);
                price3.setText(apartmentList.apartmentList[2].price);
                price4.setText(apartmentList.apartmentList[3].price);
                return true;
            case R.id.detachedMenuOption:
                //do detached here
                checkBox1.setChecked(detachedList.detachedList[0].isSelected);
                checkBox2.setChecked(detachedList.detachedList[1].isSelected);
                checkBox3.setChecked(detachedList.detachedList[2].isSelected);
                checkBox4.setChecked(detachedList.detachedList[3].isSelected);

                homeImage1.setImageResource(detachedList.detachedList[0].image);
                homeImage2.setImageResource(detachedList.detachedList[1].image);
                homeImage3.setImageResource(detachedList.detachedList[2].image);
                homeImage4.setImageResource(detachedList.detachedList[3].image);

                address1.setText(detachedList.detachedList[0].address);
                address2.setText(detachedList.detachedList[1].address);
                address3.setText(detachedList.detachedList[2].address);
                address4.setText(detachedList.detachedList[3].address);

                price1.setText(detachedList.detachedList[0].price);
                price2.setText(detachedList.detachedList[1].price);
                price3.setText(detachedList.detachedList[2].price);
                price4.setText(detachedList.detachedList[3].price);
                return true;

            case R.id.semiDetachedMenuOption:
                //do semidetached here
                checkBox1.setChecked(semiDetachedList.semidetachedList[0].isSelected);
                checkBox2.setChecked(semiDetachedList.semidetachedList[1].isSelected);
                checkBox3.setChecked(semiDetachedList.semidetachedList[2].isSelected);
                checkBox4.setChecked(semiDetachedList.semidetachedList[3].isSelected);

                homeImage1.setImageResource(semiDetachedList.semidetachedList[0].image);
                homeImage2.setImageResource(semiDetachedList.semidetachedList[1].image);
                homeImage3.setImageResource(semiDetachedList.semidetachedList[2].image);
                homeImage4.setImageResource(semiDetachedList.semidetachedList[3].image);

                address1.setText(semiDetachedList.semidetachedList[0].address);
                address2.setText(semiDetachedList.semidetachedList[1].address);
                address3.setText(semiDetachedList.semidetachedList[2].address);
                address4.setText(semiDetachedList.semidetachedList[3].address);

                price1.setText(semiDetachedList.semidetachedList[0].price);
                price2.setText(semiDetachedList.semidetachedList[1].price);
                price3.setText(semiDetachedList.semidetachedList[2].price);
                price4.setText(semiDetachedList.semidetachedList[3].price);
                return true;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

