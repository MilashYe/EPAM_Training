package model.Registration;

import java.util.ArrayList;

public class Notebook {
    private static Notebook instance;
    private ArrayList<Record> notebook;

    private Notebook() {
        notebook = new ArrayList<Record>();

    }

    public static Notebook getInstance() {
        if ( instance == null ) {
            instance =  new Notebook();
        }
        return instance;

    }

    public void addRecord(Record record) {

        notebook.add(record);

    }
    @Override
    public String toString() {
        String string = "";
        for ( Record r : notebook ) {
            string += r.toString() + "\n";
        }
        return string;
    }

}
