package com.example.bow_wow;

import android.content.Context;

import java.util.ArrayList;

public class PaymentRVAdapter {

    private ArrayList paymentRVModelArrayList;
    private Context context;
    int lastPos = -1;


    public PaymentRVAdapter(ArrayList paymentRVModelArrayList, Context context) {
        this.paymentRVModelArrayList = paymentRVModelArrayList;
        this.context = context;

    }
}
