package model.Registration;

import java.util.ArrayList;
import java.util.Date;

public class Record {
    private String name;
    private String surName;
    private String nickName;
    private String comment;
    private String group;
    private String homePhone;
    private String mobilePhone1;
    private String mobilePhone2;
    private String email;
    private String skype;
    private String address;
    private String createDate;
    private String lastChangeDate;

    public Record(String[] record) {
        int i = 0;
        name = record[i++];
        surName = record[i++];
        nickName = record[i++];
        comment = record[i++];
        homePhone = record[i++];
        mobilePhone1 = record[i++];
        mobilePhone2 = record[i++];
        email = record[i++];
        skype = record[i++];
        address = generateFullAddress(record[i++], record[i++],
                record[i++], record[i++], record[i++]);
        writeDate(record[i++]);


    }

    public Record(ArrayList<String> arrayList) {
        int i = 0;
        name = arrayList.get(i++);
        surName = arrayList.get(i++);
        nickName = arrayList.get(i++);
        comment = arrayList.get(i++);
        homePhone = arrayList.get(i++);
        mobilePhone1 = arrayList.get(i++);
        mobilePhone2 = arrayList.get(i++);
        email = arrayList.get(i++);
        skype = arrayList.get(i++);
        address = generateFullAddress(arrayList.get(i++), arrayList.get(i++),
                arrayList.get(i++), arrayList.get(i++), arrayList.get(i++));
        writeDate(new Date().toString());

    }

    public String generateFullAddress(String index, String city,
          String street, String house, String appartment) {
        return index + " " + city + " " + street + " h: " + house +
                " ap: " + appartment;
    }

    public void writeDate(String date) {
        if ( createDate == null ) {

            createDate = date;
        } else {
            lastChangeDate = date;
        }
    }

    @Override
    public String toString() {
        return "PhoneRecord{" + name + " " + surName + " " +
                " nickname: " + nickName + " home phone: " + homePhone +
                " mobile1: " + mobilePhone1 +
                " mobile2: " + mobilePhone2 + " " + email + " " + skype +"}\n" +
                "Address{ "+address+" }";
    }


}
