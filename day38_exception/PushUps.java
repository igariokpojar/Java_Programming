package day38_exception;

public class PushUps {

    public static void main(String[] args) {
        String s = "push-up";
        String p = "pull-up";

        for (int i = 0; i < 30; i++) {
            System.out.println(s);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(p);
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
/*
 MorningWorkOut:
            1. Do 30 push-ups and try pausing 1.5 seconds in each

            2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */