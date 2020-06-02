package com.object_demo_1;

import com.sun.java.swing.plaf.windows.WindowsComboBoxUI;

public class SpecialAllowance extends Income {
    public SpecialAllowance(double income){
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}
