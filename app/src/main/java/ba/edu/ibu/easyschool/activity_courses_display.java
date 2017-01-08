package ba.edu.ibu.easyschool;


import android.os.Bundle;
import android.widget.TextView;

public class activity_courses_display extends MainActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        Bundle b = getIntent().getExtras();
        TextView course = (TextView) findViewById(R.id.textView);
    }
}
