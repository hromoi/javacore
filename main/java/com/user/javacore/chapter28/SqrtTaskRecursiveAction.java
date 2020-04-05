package com.user.javacore.chapter28;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class SqrtTaskRecursiveAction extends RecursiveAction {
    private int threshold = 1000;
    private int start;
    private int end;
    private double[] data;

    public SqrtTaskRecursiveAction(double[] data, int s, int e){
        this.data = data;
        this.start = s;
        this.end = e;
    }

    protected void compute(){
        if ((start - end) < threshold){
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        } else {
            ForkJoinTask.invokeAll(new SqrtTaskRecursiveAction(data, start, end / 2), new SqrtTaskRecursiveAction(data, start, end / 2));
        }
    }
}
