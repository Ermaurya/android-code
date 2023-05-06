package digi.coders.bottomsheetexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    RelativeLayout mainRelative;
    Button buttonopenSheet,buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainRelative = findViewById(R.id.mainRelative);
        buttonopenSheet = findViewById(R.id.btnOpenSheet);


        buttonopenSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(MainActivity.this);
                View bottomSheetView = LayoutInflater.from(MainActivity.this).inflate(R.layout.mybottomsheet,mainRelative,false);
               bottomSheetDialog.setContentView(bottomSheetView);
               bottomSheetDialog.show();

               buttonSave = bottomSheetView.findViewById(R.id.btnSave);

               buttonSave.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Toast.makeText(MainActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();
                   }
               });


            }
        });


    }
}