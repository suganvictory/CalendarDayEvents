package com.calendar.daywise.events;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import com.calendar.daywise.events.data.IEvent;
import com.calendar.daywise.events.model.Event;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Suganya on 3/8/2017.
 */

public class AddEvents {

    public static final String TAG = "Calendar Day Events";


    public static void addEventstoCalanderDay(Context mContext, ArrayList<IEvent> events, int id, int start_hour, int end_hour, int start_min, int end_min, String eventName, String subname) {
        int eventColor = ContextCompat.getColor(mContext, R.color.eventColor);
        Calendar timeStart = Calendar.getInstance();
        timeStart.set(Calendar.HOUR_OF_DAY, start_hour);
        timeStart.set(Calendar.MINUTE, start_min);
        Calendar timeEnd = (Calendar) timeStart.clone();
        timeEnd.set(Calendar.HOUR_OF_DAY, end_hour);
        timeEnd.set(Calendar.MINUTE, end_min);
        Event event = new Event(id, timeStart, timeEnd, eventName, subname, eventColor);
        events.add(event);
        Log.d(TAG, eventName);
    }

}
