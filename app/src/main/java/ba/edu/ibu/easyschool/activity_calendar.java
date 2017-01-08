package ba.edu.ibu.easyschool;

import android.content.Intent;
import android.net.Uri;
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

        static Uri asSyncAdapter(Uri uri, String account, String accountType) {
            return uri.buildUpon()
                    .appendQueryParameter(android.provider.CalendarContract.CALLER_IS_SYNCADAPTER,"true")
                    .appendQueryParameter(CalendarContract.Calendars.ACCOUNT_NAME, account)
                    .appendQueryParameter(CalendarContract.Calendars.ACCOUNT_TYPE, accountType).build();
        }
    }

