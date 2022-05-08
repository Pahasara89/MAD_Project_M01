package com.example.bow_wow;

import android.os.Parcelable;

public class PaymentRVModel {


        private String PaymentName;
        private String PaymentPhone;
        private String PaymentAddress;
        private String PaymentPlace;
        private String PaymentCard;
        private String PaymentNote;
        private String PaymentId;

        public PaymentRVModel(){

        }

        public PaymentRVModel(String paymentName, String paymentPhone, String paymentAddress, String paymentPlace, String paymentCard, String paymentNote, String paymentId) {
            PaymentName = paymentName;
            PaymentPhone = paymentPhone;
            PaymentAddress = paymentAddress;
            PaymentPlace = paymentPlace;
            PaymentCard = paymentCard;
            PaymentNote = paymentNote;
            PaymentId = paymentId;
        }
}
