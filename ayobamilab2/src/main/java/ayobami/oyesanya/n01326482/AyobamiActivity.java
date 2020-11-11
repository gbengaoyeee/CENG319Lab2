package ayobami.oyesanya.n01326482;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author Ayobami Oyesanya
 * @student_id n01326482
 */
public class AyobamiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayobami);

        Button enter = findViewById(R.id.mainScreenEnter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondScreen = new Intent(AyobamiActivity.this, OyesanyaSecondScreen.class);
                startActivity(secondScreen);
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.alertDialogQuitMsg)
                .setPositiveButton(R.string.alertQuitYes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton(R.string.alertQuitNo, null);

        AlertDialog alert = builder.create();
        alert.show();
    }
}