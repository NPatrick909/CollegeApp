package org.pltw.examples.collegeapp;

import android.util.Log;

import java.util.ArrayList;


public class Family {
    private static final String TAG = Family.class.getName();
    private ArrayList<FamilyMember> mFamily;
    private static Family sFamily;

    private Family () {
        mFamily = new ArrayList<FamilyMember>();
        mFamily.add(new Guardian());
        mFamily.add(new Guardian("Janis", "Dumas"));
        mFamily.add(new Sibling());
    }

    public static Family get(){
        if (sFamily == null) {
            sFamily = new Family();
        }
        return sFamily;
    }

    public ArrayList<FamilyMember> getFamily() {
        return mFamily;
    }

    public void setFamily(ArrayList<FamilyMember> family) {
        mFamily = family;
    }
    public void addFamilyMember(FamilyMember familyMember){}
    public void deleteFamilyMember(FamilyMember familyMember){}
}
