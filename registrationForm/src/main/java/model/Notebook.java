package model;

import java.util.ArrayList;

public class Notebook {

    private ArrayList<Record> notebook;

    public Notebook() {
        notebook = new ArrayList<Record>();

    }


    public Notebook(Record record) {
        notebook = new ArrayList<Record>();
        notebook.add(record);
    }

    public void addRecord(Record record) {

        notebook.add(record);

    }

}
