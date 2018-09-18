/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.healthcare;

import javax.swing.text.*;

/**
 *
 * @author navjo
 */
public class JTextFieldCharacterLimit extends PlainDocument {
    private int pinCodeLimit;
    
    public JTextFieldCharacterLimit(int pinCodeLimit) {
        this.pinCodeLimit = pinCodeLimit;
    }
    
    public void insertString(int offs,
                         String str, AttributeSet a)
    throws BadLocationException {

        if ((getLength() + str.length()) <= pinCodeLimit)
        {
            str = str.toUpperCase();
            super.insertString(offs, str, a);
        }
        else {
            return;
        }
    }
}
