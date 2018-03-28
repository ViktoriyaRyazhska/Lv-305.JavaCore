package lesson01_intro.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Call {

    private static BufferedReader reader = null;
    public static List<Call> calls = new ArrayList<>();
    private int callId;
    private double costPerMinute;
    private int talkDuration; //seconds

    private Call(double costPerMinnute, int talkDuration, int callId) {
        this.costPerMinute = costPerMinnute;
        this.talkDuration = talkDuration;
        this.callId = callId;
    }

    public static BufferedReader getReader() {
        if (reader == null) {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }
        return reader;
    }

    public static void makeACall(int callCount) {
        String costPerMinnute;
        String talkDuration;
        double cpm;
        int td;

        try {
            BufferedReader reader = getReader();
            System.out.println("Input cost per minute for a call № " + callCount);
            costPerMinnute = reader.readLine().replaceAll(",", ".");
            if (costPerMinnute.matches("\\d+\\.\\d+") || costPerMinnute.matches("\\d+")) {
                cpm = Double.parseDouble(costPerMinnute); // zero cost is available
            } else {
                System.out.println("Invalid data (call cost per minute). Can not make a call");
                return;
            }
            System.out.println("Input duration for a call № " + callCount);
            talkDuration = reader.readLine();
            if (talkDuration.matches("\\d+")) {
                td = Integer.parseInt(talkDuration);
                if (td == 0) {
                    System.out.println("Canceled call");
                    return;
                }
            } else {
                System.out.println("Invalid data (call duration). Can not make a call");
                return;
            }
            calls.add(new Call(cpm, td, callCount));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private double getCostPerMinnute() {
        return costPerMinute;
    }

    private double getTalkDuration() {
        return talkDuration;
    }

    /**
     * The cost of call calculated for every 10 seconds. Connection fee included.
     * Every tenth second includes next 9 seconds.
     * If your call duration is 1 sec you will pay as for a 10 sec.
     * If your call is 15 sec you will pay as for 20 sec.
     * If your call is 30 sec you will pay as for 40 sec.
     *
     * @return the cost of a call
     */
    private double getCountForCall() {
        return (getCostPerMinnute()) * ((getTalkDuration() - (getTalkDuration() % 10) + 10) / 60);
    }

    private int getCallId() {
        return callId;
    }

    public static void printCountForAll() {
        double count = 0;
        for (Call call : calls) {
            count += call.getCountForCall();
            System.out.println("Call № " + call.getCallId() + " cost is : " + String.format("%.2f", call.getCountForCall()) + " standard units");
        }
        System.out.println("All calls cost : " + String.format("%.2f", count) + " standard units");
    }

    public static void main(String[] args) {
        Call.makeACall(1);
        Call.makeACall(2);
        Call.makeACall(3);
        Call.printCountForAll();
    }


}
