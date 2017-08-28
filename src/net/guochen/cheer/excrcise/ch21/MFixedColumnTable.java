package net.guochen.cheer.excrcise.ch21;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;

public class MFixedColumnTable extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTable fixedColumnTable; // �̶��б�����
	private FixedColumnTableModel fixedColumnTableModel; // �̶��б��ģ�Ͷ���
	private JTable floatingColumnTable; // �ƶ��б�����
	private FloatingColumnTableModel floatingColumnTableModel;// �ƶ��б��ģ�Ͷ���
	private Vector<String> columnNameV; // �����������
	private Vector<Vector<Object>> tableValueV; // �����������
	private int fixedColumn = 1; // �̶�������

	public  MFixedColumnTable(Vector<String>columnNameV,
			Vector<Vector<Object>>tableValueV,int fixedColum) {
		super();
		setLayout(new BorderLayout());
		
		this.columnNameV=columnNameV;
		this.tableValueV=tableValueV;
		this.fixedColumn=fixedColumn;
		
		fixedColumnTableModel=new FixedColumnTableModel();
		//�����̶��б��ģ�Ͷ���
		fixedColumnTable=new JTable(fixedColumnTableModel);
		ListSelectionModel fixed=fixedColumnTable.getSelectionModel();
		fixed.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		fixed.addListSelectionListener(new MListSelectionListener(true));
		
		floatingColumnTableModel=new FloatingColumnTableModel();
		floatingColumnTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		ListSelectionModel floating=floatingColumnTable.getSelectionModel();
		floating.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		floating.addListSelectionListener(new MListSelectionListener(false));
		
		JScrollPane scrollPane=new JScrollPane();
		scrollPane.setCorner(JScrollPane.UPPER_LEFT_CORNER,fixedColumnTable.getTableHeader());
		
		
		JViewport viewport=new JViewport();
		viewport.setView(fixedColumnTable);
		viewport.setPreferredSize(fixedColumnTable.getPreferredSize());
		
		scrollPane.setRowHeaderView(viewport);
		
		
		scrollPane.setViewportView(floatingColumnTable);
		add(scrollPane,BorderLayout.CENTER);
		
	}

	private class FixedColumnTableModel extends AbstractTableModel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public int getColumnCount() { // ���ع̶��е�����
			return fixedColumn;
		}

		public int getRowCount() { // ��������
			return tableValueV.size();
		}

		public Object getValueAt(int rowIndex, int columnIndex) {
			return tableValueV.get(rowIndex).get(columnIndex);
		}

		public String getColumnName(int columnIndex) {
			return columnNameV.get(columnIndex);
		}

	}

	private class FloatingColumnTableModel extends AbstractTableModel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public int getRowCount() {

			return columnNameV.size() - fixedColumn;
		}

		@Override
		public int getColumnCount() {

			return tableValueV.size();
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {

			return tableValueV.get(rowIndex).get(columnIndex + fixedColumn);
		}

		public String getColumnName(int columnIndex) {
			return columnNameV.get(columnIndex + fixedColumn);
		}

	}

	private class MListSelectionListener implements ListSelectionListener {
		boolean isFixedColumnTable = true;

		public MListSelectionListener(boolean isFixedColumnTable) {
			this.isFixedColumnTable = isFixedColumnTable;
		}

		public void valueChanged(ListSelectionEvent e) {
			if (isFixedColumnTable) {
				int row = fixedColumnTable.getSelectedRow();
				floatingColumnTable.setRowSelectionInterval(row, row);
			} else {
				int row = floatingColumnTable.getSelectedRow();
				fixedColumnTable.setRowSelectionInterval(row, row);
			}
		}

	}

}
