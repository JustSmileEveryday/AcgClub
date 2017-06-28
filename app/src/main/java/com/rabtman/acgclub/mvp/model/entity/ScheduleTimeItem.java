package com.rabtman.acgclub.mvp.model.entity;

import com.chad.library.adapter.base.entity.SectionEntity;
import com.rabtman.acgclub.mvp.model.jsoup.ScheduleWeek.ScheduleItem;

/**
 * @author Rabtman
 */

public class ScheduleTimeItem extends SectionEntity<ScheduleItem> {

  public int headerIndex;

  public ScheduleTimeItem(boolean isHeader, String header, int index) {
    super(isHeader, header);
    headerIndex = index;
  }

  public ScheduleTimeItem(ScheduleItem scheduleItem) {
    super(scheduleItem);
  }
}