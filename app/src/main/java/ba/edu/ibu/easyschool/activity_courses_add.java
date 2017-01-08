package ba.edu.ibu.easyschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class activity_courses_add extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_add);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, Courses);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView);
        textView.setAdapter(adapter);


        final Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), activity_courses_display.class);
                Bundle b= new Bundle();
                startActivity(intent);
            }
        });
    }
    private static final String[] Courses = new String[] {
            "English", "Math", "Physics", "Chemistry", "Computer Science", "Art",
            "P.E.", "Biology", "German", "Geography", "History", "Religious Studies",
            "Psychology"
    };
}
