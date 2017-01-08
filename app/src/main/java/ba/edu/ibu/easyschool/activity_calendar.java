package ba.edu.ibu.easyschool;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;

public class activity_calendar extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        Intent intent = new Intent(Intent.ACTION_INSERT);
        intent.setData(CalendarContract.Events.CONTENT_URI);
        startActivity(intent);
    }
}
