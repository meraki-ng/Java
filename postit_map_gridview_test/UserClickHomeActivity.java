
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class UserClickHomeActivity extends AppCompatActivity {
    String getIntentTextInput;
    List textGetList;
    MyAdapter adapter;
    TextView TextView_text;
    String getIntentAddress;
    GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_click_home);

        TextView_text = findViewById(R.id.TextView_text);
        textGetList = new ArrayList<>();
        getIntentAddress = getIntent().getStringExtra("address");
        gv = findViewById(R.id.gridView1);
        adapter = new MyAdapter(getApplicationContext(), R.layout.row, textGetList);
        gv.setAdapter(adapter);
                /*Log.d("SIZE : ", "" + textGetList.size());
                Log.d("SIZE : ", "" + adapter.getCount());*/
        findViewById(R.id.Button_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PencelAddActivity.class);
                intent.putExtra("address", getIntentAddress);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivityForResult(intent,0);
            }
        });
    } // end of onCreate

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(resultCode == RESULT_OK){
            switch (requestCode){
                case 0:
                    textGetList.add(data.getStringExtra("EditText_text"));
                    gv.setAdapter(adapter);
                    break;
            }
        }
    }
} // end of class
