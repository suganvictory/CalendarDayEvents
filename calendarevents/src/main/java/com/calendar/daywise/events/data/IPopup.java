package com.calendar.daywise.events.data;

/**
 * Created by FRAMGIA\pham.van.khac on 11/07/2016.
 */
public interface IPopup extends ITimeDuration {

    String getTitle();

    String getDescription();

    String getQuote();

    String getImageStart();

    String getImageEnd();

    Boolean isAutohide();
}
