package ayobami.oyesanya.n01326482;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OyesanyaCheckOutScreen extends AppCompatActivity {
    RadioGroup checkoutRadioGrp;
    ArrayList<Home> selectedHomes;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyesanya_checkout);
        checkoutRadioGrp = findViewById(R.id.checkoutRadioGrp);

        Intent incomingIntent = getIntent();
        selectedHomes = incomingIntent.getParcelableArrayListExtra("selectedHomes");
        Toast.makeText(this, "HERE IS: "+selectedHomes.size(), Toast.LENGTH_LONG).show();

        populateRadioGrp();
    }

    public void populateRadioGrp(){

        for(int i=0; i<selectedHomes.size(); i++){
            LayoutInflater layoutInflater = getLayoutInflater();
            View radioBtnLayout = layoutInflater.inflate(R.layout.custom_radio_button_layout, (ViewGroup) findViewById(R.id.radioLayout));
            RadioButton radioBtn = radioBtnLayout.findViewById(R.id.radioBtn);
            radioBtn.setId(i+1);
            ImageView radioBtnImg = radioBtnLayout.findViewById(R.id.radioBtnImg);
            TextView radioBtnAddress = radioBtnLayout.findViewById(R.id.radioBtnAddress);
            TextView radioBtnPrice = radioBtnLayout.findViewById(R.id.radioBtnPrice);

            Home currentHome = selectedHomes.get(0);
            radioBtnImg.setImageResource(currentHome.image);
            radioBtnAddress.setText(currentHome.address);
            radioBtnPrice.setText(currentHome.price);
            checkoutRadioGrp.addView(radioBtnLayout);

            if(radioBtnLayout.getParent() != null){
                ((ViewGroup) radioBtnLayout.getParent()).removeView(radioBtnLayout);
            }
        }

    }
}
