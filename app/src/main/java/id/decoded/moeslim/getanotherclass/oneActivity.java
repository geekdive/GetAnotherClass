package id.decoded.moeslim.getanotherclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class oneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        TextView id = (TextView)findViewById(R.id.simple);


        classChange classSebelah = new classChange();

        id.setText(classSebelah.setPesan());
        String pesan = classSebelah.setPesan();

        System.out.println("Pesan Adalah : " + pesan);
    }
}
