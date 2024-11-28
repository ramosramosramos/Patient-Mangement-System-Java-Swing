
package Components;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class WordWrapTableCellRenderer extends JTextArea implements TableCellRenderer {

    public WordWrapTableCellRenderer() {
        setLineWrap(true); // Enable line wrapping
        setWrapStyleWord(true); // Wrap at word boundaries
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus,
                                                   int row, int column) {
        setText(value != null ? value.toString() : "");
        setSize(table.getColumnModel().getColumn(column).getWidth(), getPreferredSize().height);

        // Adjust row height to match content
        int rowHeight = getPreferredSize().height;
        if (table.getRowHeight(row) != rowHeight) {
            table.setRowHeight(row, rowHeight);
        }

        if (isSelected) {
            setBackground(table.getSelectionBackground());
            setForeground(table.getSelectionForeground());
        } else {
            setBackground(table.getBackground());
            setForeground(table.getForeground());
        }

        return this;
    }
}
