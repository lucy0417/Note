package org.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseActionListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
