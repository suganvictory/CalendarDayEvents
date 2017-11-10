package com.calendar.daywise.events.decoration;

import android.graphics.Rect;

import com.calendar.daywise.events.DayView;
import com.calendar.daywise.events.EventView;
import com.calendar.daywise.events.PopupView;
import com.calendar.daywise.events.data.IEvent;
import com.calendar.daywise.events.data.IPopup;

/**
 * Created by FRAMGIA\pham.van.khac on 22/07/2016.
 */
public interface CdvDecoration {

    EventView getEventView(IEvent event, Rect eventBound, int hourHeight, int seperateHeight);

    PopupView getPopupView(IPopup popup, Rect eventBound, int hourHeight, int seperateHeight);

    DayView getDayView(int hour);
}
