/* $RCSfile$
 * $Author$
 * $Date$
 * $Revision$
 * 
 * Copyright (C) 2003  The Chemistry Development Kit (CDK) project
 * 
 * Contact: cdk-devel@lists.sourceforge.net
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 * All I ask is that proper credit is given for my work, which includes
 * - but is not limited to - adding the above copyright notice to the beginning
 * of your source code files, and to any copyright notice that you may distribute
 * with programs based on this work.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.openscience.cdk.editor;

import org.openscience.cdk.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class DictRefEditorTableModel extends AbstractTableModel {
    
    private String[] columnNames;
    private Vector fields = new Vector();
    private Vector dicts = new Vector();
    private Vector entries = new Vector();
    
    public DictRefEditorTableModel() {
        columnNames = new String[3];
        columnNames[0] = "Field";
        columnNames[1] = "Dictionary";
        columnNames[2] = "Entry";
        
        insertBlankRow(0);
    }
    
    
    public void setValueAt(Object value, int row, int column) {
        if (((String)value).length() == 0 ) {
            fields.removeElementAt(row);
            dicts.removeElementAt(row);
            entries.removeElementAt(row);
            fireTableRowsDeleted(row, row);
            if (fields.size() < 1) {
                insertBlankRow(row);
            }
        } else if (column == 0) {
            fields.setElementAt(value, row);
        } else if (column == 1) {
            dicts.setElementAt(value, row);
        } else if (column == 2) {
            entries.setElementAt(value, row);
        }

        if (row == fields.size()-1) {
            insertBlankRow(row);
        }
        
        fireTableCellUpdated(row, column);
    }
    
    
    public int getColumnCount() {
        return columnNames.length;
    }
    
    public int getRowCount() {
        return fields.size();
    }
    
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    public Class getColumnClass(int col) {
        return getColumnName(col).getClass();
    }
    
    public Object getValueAt(int row, int col) {
        if ( row >= fields.size() || col >= columnNames.length ) {
            return null;
        }
        
        if (col == 0) {
            return fields.elementAt(row);
        } else if (col == 1) {
            return dicts.elementAt(row);
        } else {
            return entries.elementAt(row);
        }
    }
    
    public boolean isCellEditable(int row, int column) {
        return true;
    }
    
    public void setChemObject(ChemObject object) {
        cleanTable();
        Map properties = object.getProperties();
        Iterator iter = properties.getKeys().iterator();
        while (iter.hasNext()) {
            Object key = iter.next();
            if (key instanceof String) {
                String keyName = (String)key;
                if (keyName.startsWith("org.openscience.cdk.dict") {
                }
            }
        }
    }
    
    private void insertRow(Object[] dataInRow) {
        for (int i=0; i<columnNames.length; i++) {
            fields.addElement(dataInRow[i]);
        }
    }
    
    private void cleanTable() {
        fields.clear();
        dicts.clear();
        entries.clear();
        fireTableDataChanged();
        insertBlankRow(0);
    }
    
    private void insertBlankRow(int row) {
        fields.addElement("");
        dicts.addElement("");
        entries.addElement("");
        fireTableRowsInserted(row+1, row+1);
    }
}

