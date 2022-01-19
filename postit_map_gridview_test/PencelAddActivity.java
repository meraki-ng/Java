package unjuda.cafe24.com.postit_map_gridview_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PencelAddActivity extends AppCompatActivity {

    EditText EditText_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencel_add);
        EditText_text = findViewById(R.id.EditText_text);

        findViewById(R.id.Button_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String EditTextGet_text = EditText_text.getText().toString().trim();
                if (EditTextGet_text.equals("".trim())) {
                    Toast.makeText(PencelAddActivity.this,"추가할 내용이 없습니다,\n\t 내용을 적어주세요.",Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(PencelAddActivity.this, UserClickHomeActivity.class);
                    intent.putExtra("EditText_text", EditTextGet_text);
                    setResult(RESULT_OK,intent);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    finish();
                }
            }
        });
    }
}
