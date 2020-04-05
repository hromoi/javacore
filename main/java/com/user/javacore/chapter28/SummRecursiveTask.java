package com.user.javacore.chapter28;

import java.util.concurrent.RecursiveTask;

public class SummRecursiveTask extends RecursiveTask<Double> {
    private double[] data;
    private int start;
    private int end;
    private double summ = 0;
    private int threshold = 501;

    public SummRecursiveTask(double[] data, int s, int e){
        this.data = data;
        this.start = s;
        this.end = e;
    }

    protected Double compute(){
        if ((end - start) < threshold){
            for (int i = start; i < end; i++) {
                summ += data[i];
            }
        }
        else {
            SummRecursiveTask t1 = new SummRecursiveTask(data, start, end / 2);
            SummRecursiveTask t2 = new SummRecursiveTask(data, end / 2, end);
            t1.fork();
            t2.fork();
            summ += t1.join() + t2.join();
//            summ += t1.invoke() + t2.invoke();
        }
        return summ;
    }
}
