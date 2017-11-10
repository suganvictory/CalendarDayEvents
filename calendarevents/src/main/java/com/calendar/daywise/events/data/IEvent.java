package com.calendar.daywise.events.data;

/**
 * Created by FRAMGIA\pham.van.khac on 11/07/2016.
 */
public interface IEvent extends ITimeDuration {

    String getName();
    String getEventid();

    int getColor();
}
