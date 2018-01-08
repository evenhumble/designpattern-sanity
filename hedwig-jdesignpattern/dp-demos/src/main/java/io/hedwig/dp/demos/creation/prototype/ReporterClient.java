package io.hedwig.dp.demos.creation.prototype;

/**
 * 1. author: patrick
 */
public class ReporterClient {

  public static void main(String[] args) throws Exception {
    DailyReporter reporter = new DailyReporter();
    reporter.setContent("content");
    reporter.setDate("today");
    reporter.setName("today's report:");
    System.out.println(reporter);
    DailyReporter tomorrow =  reporter.clone();
    DailyReporter tomorrowDeep =  reporter.deepclone();
    System.out.println(tomorrow==reporter);
    //this is true
    System.out.println(tomorrow.getAttachment()==reporter.getAttachment());
    System.out.println(tomorrow==tomorrowDeep);
  }
}
