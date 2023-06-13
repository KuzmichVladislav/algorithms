package com.company.algorithms.logger;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class LogbackCapturingAppender extends AppenderBase<ILoggingEvent> {
  private final List<ILoggingEvent> events = new ArrayList<>();

  @Override
  protected void append(ILoggingEvent event) {
    events.add(event);
  }

  public List<ILoggingEvent> getEvents() {
    return events;
  }
}
