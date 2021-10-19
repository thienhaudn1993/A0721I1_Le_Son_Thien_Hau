package bai4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_stopwatch;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Thời gian bắt đầu là: "+stopWatch.getStartTime()+" milisecond giây");
        //Ham delay 2s
        TimeUnit.SECONDS.sleep(5);
        stopWatch.stop();
        System.out.println("Thời gian kết thúc là: "+stopWatch.getEndTime()+" milisecond giây");
        System.out.println("Thời gian tính toán là: "+stopWatch.getElapsedTime()+" milisecond giây");
    }
}
