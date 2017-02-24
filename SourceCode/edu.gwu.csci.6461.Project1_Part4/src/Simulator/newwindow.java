package Simulator;
import java.text.BreakIterator;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/*
 * newwindow.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class newwindow extends javax.swing.JFrame {
	MainFrame frame = new MainFrame();
	static public int program_flag = 1;

	/** Creates new form newwindow */
	public newwindow() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jPanel1 = new javax.swing.JPanel();
		cash = new javax.swing.JLabel();
		cash0 = new javax.swing.JLabel();
		cash1 = new javax.swing.JLabel();
		cash2 = new javax.swing.JLabel();
		cash3 = new javax.swing.JLabel();
		cash4 = new javax.swing.JLabel();
		cash5 = new javax.swing.JLabel();
		cash6 = new javax.swing.JLabel();
		cash7 = new javax.swing.JLabel();
		cash8 = new javax.swing.JLabel();
		cash9 = new javax.swing.JLabel();
		cash10 = new javax.swing.JLabel();
		cash11 = new javax.swing.JLabel();
		cash12 = new javax.swing.JLabel();
		cash13 = new javax.swing.JLabel();
		cash14 = new javax.swing.JLabel();
		cash15 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		R00 = new javax.swing.JLabel();
		R3 = new javax.swing.JLabel();
		R2 = new javax.swing.JLabel();
		R1 = new javax.swing.JLabel();
		GPR = new javax.swing.JLabel();
		GPR4 = new javax.swing.JTextField();
		changeGPR4 = new javax.swing.JButton();
		GPR1 = new javax.swing.JTextField();
		changeGPR1 = new javax.swing.JButton();
		GPR2 = new javax.swing.JTextField();
		changeGPR2 = new javax.swing.JButton();
		GPR3 = new javax.swing.JTextField();
		changeGPR3 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		IX01 = new javax.swing.JLabel();
		IX4 = new javax.swing.JLabel();
		IX5 = new javax.swing.JLabel();
		IX3 = new javax.swing.JTextField();
		IX2 = new javax.swing.JTextField();
		IX1 = new javax.swing.JTextField();
		changeIX1 = new javax.swing.JButton();
		changeIX2 = new javax.swing.JButton();
		changeIX3 = new javax.swing.JButton();
		jPanel5 = new javax.swing.JPanel();
		Instruction = new javax.swing.JLabel();
		keyboard = new javax.swing.JLabel();
		InsturctionText = new javax.swing.JTextField();
		keyboardfield = new javax.swing.JTextField();
		LOAD = new javax.swing.JButton();
		GO = new javax.swing.JButton();
		steps = new javax.swing.JButton();
		input = new javax.swing.JButton();
		init = new javax.swing.JButton();
		jPanel6 = new javax.swing.JPanel();
		cc = new javax.swing.JLabel();
		MAR = new javax.swing.JLabel();
		MBR = new javax.swing.JLabel();
		PC = new javax.swing.JLabel();
		MBR1 = new javax.swing.JLabel();
		MAR1 = new javax.swing.JLabel();
		PC1 = new javax.swing.JLabel();
		ccvalue = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		MEM = new javax.swing.JLabel();
		IR = new javax.swing.JLabel();
		IR1 = new javax.swing.JTextField();
		changeIR = new javax.swing.JButton();
		MEMfield = new javax.swing.JTextField();
		lookMEM = new javax.swing.JButton();
		MEM1 = new javax.swing.JTextField();
		changeMEM1 = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		number = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane4 = new javax.swing.JScrollPane();
		monitor = new javax.swing.JTextArea();
		screen = new javax.swing.JLabel();
		initialize = new javax.swing.JButton();
		initialize2 = new javax.swing.JButton();
		jPanel8 = new javax.swing.JPanel();
		FR0 = new javax.swing.JLabel();
		FR00 = new javax.swing.JTextField();
		changeFR0 = new javax.swing.JButton();
		changeFR1 = new javax.swing.JButton();
		FR01 = new javax.swing.JTextField();
		FR1 = new javax.swing.JLabel();
		FR = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
		
		
		
		cash.setText("cache");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(45, 45, 45)
						.addComponent(cash0, javax.swing.GroupLayout.PREFERRED_SIZE, 1287,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(45, Short.MAX_VALUE)
								.addComponent(cash1, javax.swing.GroupLayout.PREFERRED_SIZE, 1287,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(45, Short.MAX_VALUE)
								.addComponent(cash2, javax.swing.GroupLayout.PREFERRED_SIZE, 1287,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(45, Short.MAX_VALUE)
								.addComponent(cash3, javax.swing.GroupLayout.PREFERRED_SIZE, 1287,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(45, Short.MAX_VALUE)
								.addComponent(cash4, javax.swing.GroupLayout.PREFERRED_SIZE, 1287,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(45, Short.MAX_VALUE)
								.addComponent(cash5, javax.swing.GroupLayout.PREFERRED_SIZE, 1287,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(45, Short.MAX_VALUE)
								.addComponent(cash6, javax.swing.GroupLayout.PREFERRED_SIZE, 1287,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(45, Short.MAX_VALUE)
								.addComponent(cash7, javax.swing.GroupLayout.PREFERRED_SIZE, 1287,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(45, Short.MAX_VALUE)
								.addComponent(cash8, javax.swing.GroupLayout.PREFERRED_SIZE, 1287,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(45, Short.MAX_VALUE)
								.addComponent(cash9, javax.swing.GroupLayout.PREFERRED_SIZE, 1287,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(45, Short.MAX_VALUE)
								.addComponent(cash10, javax.swing.GroupLayout.PREFERRED_SIZE, 1287,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(45, Short.MAX_VALUE)
								.addComponent(cash11, javax.swing.GroupLayout.PREFERRED_SIZE, 1287,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(45, Short.MAX_VALUE)
								.addComponent(cash12, javax.swing.GroupLayout.PREFERRED_SIZE, 1287,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(45, Short.MAX_VALUE)
								.addComponent(cash13, javax.swing.GroupLayout.PREFERRED_SIZE, 1287,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(45, Short.MAX_VALUE)
								.addComponent(cash14, javax.swing.GroupLayout.PREFERRED_SIZE, 1287,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(45, Short.MAX_VALUE)
								.addComponent(cash15, javax.swing.GroupLayout.PREFERRED_SIZE, 1287,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(226, 226, 226).addComponent(cash)
						.addContainerGap(1085, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(
						jPanel1Layout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(22, 22, 22).addComponent(cash)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(cash0)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cash1)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cash2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cash3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cash4)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cash5)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cash6)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cash7)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cash8)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cash9)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cash10)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cash11)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cash12)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cash13)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cash14)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cash15).addContainerGap(397, Short.MAX_VALUE)));

		jScrollPane1.setViewportView(jPanel1);

		jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		R00.setText("R00");

		R3.setText("R11");

		R2.setText("R10");

		R1.setText("R01");

		GPR.setText("GPR");

		GPR4.setText("GPR");

		changeGPR4.setText("CHANGE");
		changeGPR4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				changeGPR4ActionPerformed(evt);
			}
		});

		GPR1.setText("GPR");

		changeGPR1.setText("CHANGE");
		changeGPR1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				changeGPR1ActionPerformed(evt);
			}
		});

		GPR2.setText("GPR");

		changeGPR2.setText("CHANGE");
		changeGPR2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				changeGPR2ActionPerformed(evt);
			}
		});

		GPR3.setText("GPR");

		changeGPR3.setText("CHANGE");
		changeGPR3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				changeGPR3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addGap(31)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
							.addComponent(R2)
							.addComponent(R1))
						.addComponent(R3)
						.addComponent(R00))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(GPR)
						.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
							.addGroup(jPanel3Layout.createSequentialGroup()
								.addComponent(GPR4, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(changeGPR4))
							.addGroup(jPanel3Layout.createSequentialGroup()
								.addComponent(GPR1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(changeGPR1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(jPanel3Layout.createSequentialGroup()
								.addComponent(GPR2, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(changeGPR2))
							.addGroup(jPanel3Layout.createSequentialGroup()
								.addComponent(GPR3, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(changeGPR3))))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addGap(15)
					.addComponent(GPR)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(GPR1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(changeGPR1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(R00))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(GPR2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(changeGPR2)
						.addComponent(R1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(GPR3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(changeGPR3)
						.addComponent(R2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(changeGPR4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(GPR4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(R3))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel3.setLayout(jPanel3Layout);

		jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel3.setText("IX");

		IX01.setText("IX01");

		IX4.setText("IX10");

		IX5.setText("IX11");

		IX3.setText("IX");

		IX2.setText("IX");

		IX1.setText("IX");

		changeIX1.setText("CHANGE");
		changeIX1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				changeIX1ActionPerformed(evt);
			}
		});

		changeIX2.setText("CHANGE");
		changeIX2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				changeIX2ActionPerformed(evt);
			}
		});

		changeIX3.setText("CHANGE");
		changeIX3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				changeIX3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4Layout.setHorizontalGroup(
			jPanel4Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
					.addGap(29)
					.addGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
							.addComponent(IX01, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(IX4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addComponent(IX5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel3)
						.addGroup(jPanel4Layout.createSequentialGroup()
							.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(IX2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
									.addComponent(IX1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
								.addComponent(IX3, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
									.addComponent(changeIX2)
									.addComponent(changeIX1))
								.addComponent(changeIX3))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel4Layout.setVerticalGroup(
			jPanel4Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
					.addComponent(jLabel3)
					.addGap(16)
					.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(changeIX1)
						.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(IX1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(IX01)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(IX2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(changeIX2)
						.addComponent(IX4))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(IX5)
						.addComponent(IX3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(changeIX3))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		jPanel4.setLayout(jPanel4Layout);

		Instruction.setText("Instruction");

		keyboard.setText("Keyboard");

		InsturctionText.setText("InstructionText");

		keyboardfield.setText("type number here");
		keyboardfield.addInputMethodListener(new java.awt.event.InputMethodListener() {
			public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
			}

			public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
				keyboardfieldInputMethodTextChanged(evt);
			}
		});
		keyboardfield.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				keyboardfieldKeyReleased(evt);
			}

			public void keyTyped(java.awt.event.KeyEvent evt) {
				keyboardfieldKeyTyped(evt);
			}
		});

		LOAD.setText("STEP");
		LOAD.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LOADActionPerformed(evt);
			}
		});

		GO.setText("EXE INS");
		GO.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				GOActionPerformed(evt);
			}
		});

		steps.setText("SEVERAL STEPS");
		steps.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				stepsActionPerformed(evt);
			}
		});

		input.setText("INPUT");
		input.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				inputActionPerformed(evt);
			}
		});

		init.setText("INITIALIZE");
		init.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				initActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5Layout.setHorizontalGroup(
			jPanel5Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
					.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(Instruction)
						.addGroup(jPanel5Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(keyboard, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(keyboardfield, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addComponent(InsturctionText, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(jPanel5Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(init, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
						.addComponent(input, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
						.addComponent(GO, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
					.addGap(14)
					.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(LOAD, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(steps, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
					.addGap(38))
		);
		jPanel5Layout.setVerticalGroup(
			jPanel5Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup()
					.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(GO)
							.addComponent(InsturctionText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(LOAD))
						.addComponent(Instruction))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(steps)
						.addComponent(keyboardfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(input)
						.addComponent(keyboard))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(init)
					.addContainerGap())
		);
		jPanel5.setLayout(jPanel5Layout);

		jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		cc.setText("CC");

		MAR.setText("MAR");

		MBR.setText("MBR");

		PC.setText("PC");

		MBR1.setText(" ");

		MAR1.setBackground(new java.awt.Color(255, 255, 255));
		MAR1.setText("    ");

		PC1.setText(" ");

		ccvalue.setText(" ");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6Layout.setHorizontalGroup(
			jPanel6Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(MBR1, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel6Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(MAR1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel6Layout.createSequentialGroup()
					.addGap(64)
					.addComponent(MAR))
				.addGroup(jPanel6Layout.createSequentialGroup()
					.addGap(65)
					.addComponent(MBR))
				.addGroup(jPanel6Layout.createSequentialGroup()
					.addGap(72)
					.addComponent(cc))
				.addGroup(jPanel6Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(ccvalue, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel6Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(PC1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel6Layout.createSequentialGroup()
					.addGap(69)
					.addComponent(PC))
		);
		jPanel6Layout.setVerticalGroup(
			jPanel6Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(MAR)
					.addGap(6)
					.addComponent(MAR1)
					.addGap(12)
					.addComponent(MBR)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(MBR1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(PC)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(PC1)
					.addGap(14)
					.addComponent(cc)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(ccvalue)
					.addContainerGap())
		);
		jPanel6.setLayout(jPanel6Layout);

		MEM.setText("MEM");

		IR.setText("IR");

		IR1.setText("irvalue");

		changeIR.setText("change");
		changeIR.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				changeIRActionPerformed(evt);
			}
		});

		MEMfield.setText("MEMfield");

		lookMEM.setText("look");
		lookMEM.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				lookMEMActionPerformed(evt);
			}
		});

		MEM1.setText("jTextField1");

		changeMEM1.setText("change");
		changeMEM1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				changeMEM1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7Layout.setHorizontalGroup(
			jPanel7Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
					.addGroup(jPanel7Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel7Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(IR1, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(changeIR))
						.addGroup(jPanel7Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(MEM1, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
								.addComponent(MEMfield, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
							.addGap(20)
							.addGroup(jPanel7Layout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lookMEM, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(changeMEM1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(21))
				.addGroup(jPanel7Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(IR)
					.addContainerGap(241, Short.MAX_VALUE))
				.addGroup(jPanel7Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(MEM)
					.addContainerGap(235, Short.MAX_VALUE))
		);
		jPanel7Layout.setVerticalGroup(
			jPanel7Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup()
					.addComponent(MEM)
					.addGap(1)
					.addGroup(jPanel7Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel7Layout.createSequentialGroup()
							.addComponent(MEM1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(MEMfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel7Layout.createSequentialGroup()
							.addComponent(changeMEM1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lookMEM)))
					.addGap(18)
					.addComponent(IR)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel7Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(IR1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(changeIR))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel7.setLayout(jPanel7Layout);

		number.setText("number");
		jScrollPane2.setViewportView(number);

		monitor.setColumns(20);
		monitor.setEditable(false);
		monitor.setRows(5);
		jScrollPane4.setViewportView(monitor);

		screen.setText("screen");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(87, 87, 87).addComponent(screen))
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jScrollPane4,
								javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(24, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(screen)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)));

		initialize.setText("PROGRAM 1");
		initialize.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				initializeActionPerformed(evt);
			}
		});

		initialize2.setText("PROGRAM 2");
		initialize2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				initialize2ActionPerformed(evt);
			}
		});

		FR0.setText("FR0");

		FR00.setText("IX");

		changeFR0.setText("CHANGE");
		changeFR0.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				changeFR0ActionPerformed(evt);
			}
		});

		changeFR1.setText("CHANGE");
		changeFR1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				changeFR1ActionPerformed(evt);
			}
		});

		FR01.setText("IX");

		FR1.setText("FR1");

		FR.setText("FR");

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8Layout.setHorizontalGroup(
			jPanel8Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup()
					.addGap(67)
					.addComponent(FR)
					.addContainerGap())
				.addGroup(jPanel8Layout.createSequentialGroup()
					.addGap(28)
					.addGroup(jPanel8Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(FR1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(FR0, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(FR01)
						.addComponent(FR00, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(changeFR0)
						.addComponent(changeFR1))
					.addGap(36))
		);
		jPanel8Layout.setVerticalGroup(
			jPanel8Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup()
					.addComponent(FR)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(jPanel8Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(FR00, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(changeFR0)
						.addComponent(FR0))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel8Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(FR01, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(changeFR1)
						.addComponent(FR1))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		jPanel8.setLayout(jPanel8Layout);
		
		initialize3 = new JButton("TEST PROGRAM");
		initialize3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				program_flag = 3;
				frame.initialization3();
				IR1.setText(SwitchMethod.shortToString(frame.ir));
				GPR1.setText(SwitchMethod.shortToString((frame.GPRs)[0]));
				GPR2.setText(SwitchMethod.shortToString((frame.GPRs)[1]));
				GPR3.setText(SwitchMethod.shortToString((frame.GPRs)[2]));
				GPR4.setText(SwitchMethod.shortToString((frame.GPRs)[3]));
				IX1.setText(SwitchMethod.shortToString((frame.IXRs)[1]));
				IX2.setText(SwitchMethod.shortToString((frame.IXRs)[2]));
				IX3.setText(SwitchMethod.shortToString((frame.IXRs)[3]));
				MAR1.setText(SwitchMethod.shortToString(frame.mar));
				MBR1.setText(SwitchMethod.shortToString(frame.mbr));
				PC1.setText(SwitchMethod.shortToString(frame.pc));
				IR1.setText(SwitchMethod.shortToString(frame.ir));
				ccvalue.setText(SwitchMethod.shortToString(frame.cc).substring(12, 16));
				keyboardfield.setText("");
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 1254, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(layout.createSequentialGroup()
							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 522, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(jPanel8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(Alignment.LEADING, layout.createParallelGroup(Alignment.LEADING, false)
											.addComponent(jPanel3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(initialize2, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
										.addComponent(initialize, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
										.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(initialize3, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
								.addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(449))))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
									.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
									.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(initialize)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(initialize2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(initialize3)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		getContentPane().setLayout(layout);
		
		pack();
	}// </editor-fold>
		//GEN-END:initComponents

	private void changeMEM1ActionPerformed(java.awt.event.ActionEvent evt) {
		String MEM = this.MEMfield.getText();

		short element = SwitchMethod.stringToShort(MEM1.getText());
		frame.memory.set(Integer.valueOf(MEM), element);
	}

	//GEN-END:initComponents

	private void changeFR1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void changeFR0ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void initActionPerformed(java.awt.event.ActionEvent evt) {
		frame.ir = 0;
		(frame.GPRs)[0] = 0;
		(frame.GPRs)[1] = 0;
		(frame.GPRs)[2] = 0;
		(frame.GPRs)[3] = 0;
		(frame.IXRs)[1] = 0;
		(frame.IXRs)[2] = 0;
		(frame.IXRs)[3] = 0;
		frame.mar = 0;
		frame.mbr = 0;
		frame.pc = 0;
		frame.ir = 0;
		frame.cc = 0;
		frame.keyboard = "0";
		this.IR1.setText("0000000000000000");
		this.GPR1.setText("0000000000000000");
		this.GPR2.setText("0000000000000000");
		this.GPR3.setText("0000000000000000");
		this.GPR4.setText("0000000000000000");
		this.IX1.setText("0000000000000000");
		this.IX2.setText("0000000000000000");
		this.IX3.setText("0000000000000000");
		this.MAR1.setText("0000000000000000");
		this.MBR1.setText("0000000000000000");
		this.PC1.setText("0000000000000000");
		this.IR1.setText("0000000000000000");
		this.FR00.setText("0000000000000000");
		this.FR01.setText("0000000000000000");
		this.MEM1.setText("0000000000000000");
		this.ccvalue.setText("0000");
		keyboardfield.setText("");
		InsturctionText.setText("");
		MEMfield.setText("");
	}

	private void inputActionPerformed(java.awt.event.ActionEvent evt) {
		System.out.println("in keyboard field, program_flag = " + program_flag);
		String key = keyboardfield.getText();
		if (program_flag == 1) {
			int inputValue = 0;
			try {
				inputValue = Integer.parseInt(key);// if the input isn't an integer, give the users an alert.
			} catch (Exception e) {
				// TODO: handle exception
				if (key.equals("")) {
					frame.keyboard = "";
					return;
				}
				JOptionPane.showMessageDialog(null, "Please inupt an Integer", "Alert", JOptionPane.ERROR_MESSAGE);
				frame.keyboard = "";
				return;
			}

			if (inputValue > Short.MAX_VALUE || inputValue < Short.MIN_VALUE) {
				//if the integer is outside the range of integers that short can represent, give users an alert.
				JOptionPane.showMessageDialog(null, "Please inupt an Integer between 0 and 32767. ", "Alert",
						JOptionPane.ERROR_MESSAGE);
				frame.keyboard = "";
				return;
			}

			frame.keyboard = key;
			this.LOAD.setEnabled(true);
			this.GO.setEnabled(true);
			this.steps.setEnabled(true);
			this.input.setEnabled(false);
			System.out.println(frame.keyboard);
		} else if (program_flag == 2) {
			boolean isWord = key.matches("[a-zA-Z]+");
			if (isWord) {
				frame.keyboard = key;
				this.steps.setEnabled(true);
				this.LOAD.setEnabled(true);
				this.GO.setEnabled(true);
				this.input.setEnabled(false);
			} else {
				JOptionPane.showMessageDialog(null, "Please inupt a word ", "Alert", JOptionPane.ERROR_MESSAGE);
				frame.keyboard = "";
			}
		}
	}

	private void initialize2ActionPerformed(java.awt.event.ActionEvent evt) {
		program_flag = 2;
		frame.initialization2();
		this.IR1.setText(SwitchMethod.shortToString(frame.ir));
		this.GPR1.setText(SwitchMethod.shortToString((frame.GPRs)[0]));
		this.GPR2.setText(SwitchMethod.shortToString((frame.GPRs)[1]));
		this.GPR3.setText(SwitchMethod.shortToString((frame.GPRs)[2]));
		this.GPR4.setText(SwitchMethod.shortToString((frame.GPRs)[3]));
		this.IX1.setText(SwitchMethod.shortToString((frame.IXRs)[1]));
		this.IX2.setText(SwitchMethod.shortToString((frame.IXRs)[2]));
		this.IX3.setText(SwitchMethod.shortToString((frame.IXRs)[3]));
		this.MAR1.setText(SwitchMethod.shortToString(frame.mar));
		this.MBR1.setText(SwitchMethod.shortToString(frame.mbr));
		this.PC1.setText(SwitchMethod.shortToString(frame.pc));
		this.IR1.setText(SwitchMethod.shortToString(frame.ir));
		this.ccvalue.setText(SwitchMethod.shortToString(frame.cc).substring(12, 16));
		keyboardfield.setText("");
	}

	//Button "Initialize" callback function
	private void initializeActionPerformed(java.awt.event.ActionEvent evt) {
		program_flag = 1;
		frame.initialization();
		this.IR1.setText(SwitchMethod.shortToString(frame.ir));
		this.GPR1.setText(SwitchMethod.shortToString((frame.GPRs)[0]));
		this.GPR2.setText(SwitchMethod.shortToString((frame.GPRs)[1]));
		this.GPR3.setText(SwitchMethod.shortToString((frame.GPRs)[2]));
		this.GPR4.setText(SwitchMethod.shortToString((frame.GPRs)[3]));
		this.IX1.setText(SwitchMethod.shortToString((frame.IXRs)[1]));
		this.IX2.setText(SwitchMethod.shortToString((frame.IXRs)[2]));
		this.IX3.setText(SwitchMethod.shortToString((frame.IXRs)[3]));
		this.MAR1.setText(SwitchMethod.shortToString(frame.mar));
		this.MBR1.setText(SwitchMethod.shortToString(frame.mbr));
		this.PC1.setText(SwitchMethod.shortToString(frame.pc));
		this.IR1.setText(SwitchMethod.shortToString(frame.ir));
		this.ccvalue.setText(SwitchMethod.shortToString(frame.cc).substring(12, 16));
		counter = 1;
		memcounter = 0;
		numberinmemory = 512;
		numbertext = "";
		number.setText(numbertext);
		keyboardfield.setText("");
	}

	private void initializeProgram2() {

	}

	//Callback function of "Change" Button of IR 
	private void changeIRActionPerformed(java.awt.event.ActionEvent evt) {
		frame.ir = SwitchMethod.stringToShort(this.IR1.getText());
		System.out.println(frame.ir);
	}

	int memcounter = 0, counter = 1, numberinmemory = 512;
	String numbertext = "";

	//Callback function of "Several Steps" Button
	private void stepsActionPerformed(java.awt.event.ActionEvent evt) {
		this.IR1.setText(SwitchMethod.shortToString(frame.ir));// set the text of IR
		String ir2 = "", value = "";
		ir2 = SwitchMethod.shortToString(frame.ir);
		ir2 = ir2.substring(0, 6);

		while (true) {

			frame.execute();

			//do the execute action
			//set the text of every element

			this.GPR1.setText(SwitchMethod.shortToString((frame.GPRs)[0]));
			this.GPR2.setText(SwitchMethod.shortToString((frame.GPRs)[1]));
			this.GPR3.setText(SwitchMethod.shortToString((frame.GPRs)[2]));
			this.GPR4.setText(SwitchMethod.shortToString((frame.GPRs)[3]));
			this.IX1.setText(SwitchMethod.shortToString((frame.IXRs)[1]));
			this.IX2.setText(SwitchMethod.shortToString((frame.IXRs)[2]));
			this.IX3.setText(SwitchMethod.shortToString((frame.IXRs)[3]));
			this.MAR1.setText(SwitchMethod.shortToString(frame.mar));
			this.MBR1.setText(SwitchMethod.shortToString(frame.mbr));
			this.PC1.setText(SwitchMethod.shortToString(frame.pc));
			this.IR1.setText(SwitchMethod.shortToString(frame.ir));
			this.FR00.setText(SwitchMethod.shortToString(frame.fr[0]));
			this.FR01.setText(SwitchMethod.shortToString(frame.fr[1]));
			this.ccvalue.setText(SwitchMethod.shortToString(frame.cc).substring(12, 16));
			//	System.out.println(frame.memory.cache.toString());
			int i = 0;
			String s1 = "";
			s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(0).tag);
			s1 += ":  ";
			while (i < 8) {

				s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(0).words[i]);
				s1 += " ";
				i++;

			}

			this.cash0.setText(s1);

			s1 = "";
			s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(1).tag);
			s1 += ":  ";
			i = 0;
			while (i < 8) {
				s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(1).words[i]);
				s1 += " ";
				i++;
				//System.out.println(s1);
			}

			this.cash1.setText(s1);

			s1 = "";
			s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(2).tag);
			s1 += ":  ";
			i = 0;
			while (i < 8) {
				s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(2).words[i]);
				s1 += " ";
				i++;

			}

			this.cash2.setText(s1);

			s1 = "";
			s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(3).tag);
			s1 += ":  ";
			i = 0;
			while (i < 8) {
				s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(3).words[i]);
				s1 += " ";
				i++;

			}

			this.cash3.setText(s1);

			s1 = "";
			s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(4).tag);
			s1 += ":  ";
			i = 0;
			while (i < 8) {
				s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(4).words[i]);
				s1 += " ";
				i++;

			}

			this.cash4.setText(s1);

			s1 = "";
			s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(5).tag);
			s1 += ":  ";
			i = 0;
			while (i < 8) {
				s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(5).words[i]);
				s1 += " ";
				i++;

			}

			this.cash5.setText(s1);

			s1 = "";
			s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(6).tag);
			s1 += ":  ";
			i = 0;
			while (i < 8) {
				s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(6).words[i]);
				s1 += " ";
				i++;

			}

			this.cash6.setText(s1);

			s1 = "";
			s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(7).tag);
			s1 += ":  ";
			i = 0;
			while (i < 8) {
				s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(7).words[i]);
				s1 += " ";
				i++;

			}

			this.cash7.setText(s1);

			s1 = "";
			s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(8).tag);
			s1 += ":  ";
			i = 0;
			while (i < 8) {
				s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(8).words[i]);
				s1 += " ";
				i++;

			}

			this.cash8.setText(s1);

			s1 = "";
			s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(9).tag);
			s1 += ":  ";
			i = 0;
			while (i < 8) {
				s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(9).words[i]);
				s1 += " ";
				i++;

			}

			this.cash9.setText(s1);
			s1 = "";
			s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(10).tag);
			s1 += ":  ";
			i = 0;
			while (i < 8) {
				s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(10).words[i]);
				s1 += " ";
				i++;

			}

			this.cash10.setText(s1);
			s1 = "";
			s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(11).tag);
			s1 += ":  ";
			i = 0;
			while (i < 8) {
				s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(11).words[i]);
				s1 += " ";
				i++;

			}

			this.cash11.setText(s1);
			s1 = "";
			s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(12).tag);
			s1 += ":  ";
			i = 0;
			while (i < 8) {
				s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(12).words[i]);
				s1 += " ";
				i++;

			}

			this.cash12.setText(s1);
			s1 = "";
			s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(13).tag);
			s1 += ":  ";
			i = 0;
			while (i < 8) {
				s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(13).words[i]);
				s1 += " ";
				i++;

			}

			this.cash13.setText(s1);
			s1 = "";
			s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(14).tag);
			s1 += ":  ";
			i = 0;
			while (i < 8) {
				s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(14).words[i]);
				s1 += " ";
				i++;

			}

			this.cash14.setText(s1);
			s1 = "";
			s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(15).tag);
			s1 += ":  ";
			i = 0;
			while (i < 8) {
				s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(15).words[i]);
				s1 += " ";
				i++;

			}
			this.cash15.setText(s1);

			ir2 = SwitchMethod.shortToString(frame.ir);
			ir2 = ir2.substring(0, 6);

			frame.fetch();

			ir2 = SwitchMethod.shortToString(frame.ir);
			ir2 = ir2.substring(0, 6);
			int i1 = 0;
			if (ir2.equals("110001")) {
				JOptionPane.showMessageDialog(null, "Please input.", "VALUE", JOptionPane.ERROR_MESSAGE);
				//keyboardfield.setText(String.valueOf(i1));
				//frame.keyboard=(short)i1;
				//i1++;
				this.input.setEnabled(true);
				keyboardfield.setText("");
				this.LOAD.setEnabled(false);
				this.GO.setEnabled(false);
				this.steps.setEnabled(false);
				break;
			}
			if (ir2.equals("000000")) {

				break;
			}
		}

		if (frame.memory.memory[numberinmemory] != 0) {
			numbertext += "number";

			numbertext += String.valueOf(counter);

			counter++;
			numbertext += ":";
			numbertext += " ";

			numbertext += String.valueOf(frame.memory.memory[numberinmemory + memcounter]);
			numbertext += "    ";
			this.number.setText(numbertext);
			memcounter++;
		}

	}

	//keyboardField keyReleased function
	private void keyboardfieldKeyReleased(java.awt.event.KeyEvent evt) {

	}

	private void keyboardfieldKeyTyped(java.awt.event.KeyEvent evt) {
		// TODO add your handling code here:
	}

	private void keyboardfieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
		String key = keyboardfield.getText();
		frame.keyboard = key;
		System.out.println(frame.keyboard);
	}

	private void changeIX3ActionPerformed(java.awt.event.ActionEvent evt) {
		String IXGet3 = this.IX3.getText();
		short IXGet3S = SwitchMethod.stringToShort(IXGet3);
		frame.IXRs[3] = IXGet3S;
	}

	private void GOActionPerformed(java.awt.event.ActionEvent evt) {
		String GOin = this.InsturctionText.getText();
		String opGOin = GOin.substring(0, 6);
		int vGOin = Integer.valueOf(GOin.substring(6, 8));
		if (GOin.length() != 16) {
			JOptionPane.showMessageDialog(null, "VALUE SHOULD BE 16 bit", "VALUE", JOptionPane.ERROR_MESSAGE);
		} else if ((opGOin.equals("011011") || opGOin.equals("011100") || opGOin.equals("011101")
				|| opGOin.equals("101011") || opGOin.equals("101100") || opGOin.equals("101000")
				|| opGOin.equals("101010")) && vGOin > 1) {
			JOptionPane.showMessageDialog(null, "INVALID INSTRUCTION\n FR SHOULD BE 0 OR 1!", "VALUE",
					JOptionPane.ERROR_MESSAGE);

		} else {
			for (int i = 0; GOin.charAt(i) == '1' && GOin.charAt(i) == '0'; i++) {
				JOptionPane.showMessageDialog(null, "VALUE SHOULD BE 0 or 1", "VALUE", JOptionPane.ERROR_MESSAGE);
			}
			//check the value of GOin, it should be the number of 16 bits and formed with 0 and 1
		}
		short GOsh = SwitchMethod.stringToShort(GOin);// change the string into short
		frame.memory.set(frame.pc, GOsh);//set the value in the memory where the pc points
		frame.fetch();//do the fetch action
		//System.out.println("1" + SwitchMethod.shortToString(frame.mar));
		this.IR1.setText(SwitchMethod.shortToString(frame.ir));// set the text of IR
		frame.execute();//do the execute action
		//set the text of every element
		this.GPR1.setText(SwitchMethod.shortToString((frame.GPRs)[0]));
		this.GPR2.setText(SwitchMethod.shortToString((frame.GPRs)[1]));
		this.GPR3.setText(SwitchMethod.shortToString((frame.GPRs)[2]));
		this.GPR4.setText(SwitchMethod.shortToString((frame.GPRs)[3]));
		this.IX1.setText(SwitchMethod.shortToString((frame.IXRs)[1]));
		this.IX2.setText(SwitchMethod.shortToString((frame.IXRs)[2]));
		this.IX3.setText(SwitchMethod.shortToString((frame.IXRs)[3]));
		this.MAR1.setText(SwitchMethod.shortToString(frame.mar));
		this.MBR1.setText(SwitchMethod.shortToString(frame.mbr));
		this.PC1.setText(SwitchMethod.shortToString(frame.pc));
		this.IR1.setText(SwitchMethod.shortToString(frame.ir));
		this.ccvalue.setText(SwitchMethod.shortToString(frame.cc).substring(12, 16));

	}

	private void lookMEMActionPerformed(java.awt.event.ActionEvent evt) {
		String MEM = this.MEMfield.getText();

		int iMEM = Integer.parseInt(MEM);
		if (iMEM > 4096) {
			JOptionPane.showMessageDialog(null, "TOO BIG", "VALUE", JOptionPane.ERROR_MESSAGE);
		} else if (iMEM < 0) {
			JOptionPane.showMessageDialog(null, "TOO BIG", "VALUE", JOptionPane.ERROR_MESSAGE);
			//check the value of iMEM, see if it is too big or small
		} else {
			String MEMval = SwitchMethod.shortToString(frame.memory.fetch(iMEM));
			//System.out.println(MEMval);
			this.MEM1.setText(MEMval);
			//if it is good, find the value in the memory
		}
		;
	}

	private void changeIX1ActionPerformed(java.awt.event.ActionEvent evt) {
		String IXGet1 = this.IX1.getText();

		short IXGet1S = SwitchMethod.stringToShort(IXGet1);
		frame.IXRs[1] = IXGet1S;
	}

	private void changeIX2ActionPerformed(java.awt.event.ActionEvent evt) {
		String IXGet2 = this.IX2.getText();

		short IXGet2S = SwitchMethod.stringToShort(IXGet2);
		frame.IXRs[2] = IXGet2S;
	}

	private void LOADActionPerformed(java.awt.event.ActionEvent evt) {
		this.IR1.setText(SwitchMethod.shortToString(frame.ir));// set the text of IR
		String ir2 = "";
		ir2 = IR1.getText();
		ir2 = ir2.substring(0, 6);

		System.out.println("before execute, opcode is " + ir2 + "\tkeyboard is" + frame.keyboard);
		frame.execute();//do the execute action
		//set the text of every element

		this.GPR1.setText(SwitchMethod.shortToString((frame.GPRs)[0]));
		this.GPR2.setText(SwitchMethod.shortToString((frame.GPRs)[1]));
		this.GPR3.setText(SwitchMethod.shortToString((frame.GPRs)[2]));
		this.GPR4.setText(SwitchMethod.shortToString((frame.GPRs)[3]));
		this.IX1.setText(SwitchMethod.shortToString((frame.IXRs)[1]));
		this.IX2.setText(SwitchMethod.shortToString((frame.IXRs)[2]));
		this.IX3.setText(SwitchMethod.shortToString((frame.IXRs)[3]));
		this.MAR1.setText(SwitchMethod.shortToString(frame.mar));
		this.MBR1.setText(SwitchMethod.shortToString(frame.mbr));
		this.PC1.setText(SwitchMethod.shortToString(frame.pc));
		this.IR1.setText(SwitchMethod.shortToString(frame.ir));
		this.FR00.setText(SwitchMethod.shortToString(frame.fr[0]));
		this.FR01.setText(SwitchMethod.shortToString(frame.fr[1]));
		this.ccvalue.setText(SwitchMethod.shortToString(frame.cc).substring(12, 16));
		//	System.out.println(frame.memory.cache.toString());
		int i = 0;
		String s1 = "";
		s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(0).tag);
		s1 += ":  ";
		ir2 = SwitchMethod.shortToString(frame.ir);
		if (frame.memory.memory[numberinmemory] != 0 && ir2.equals("0000100000101111")) {
			numbertext += "number";

			numbertext += String.valueOf(counter);

			counter++;
			numbertext += ":";
			numbertext += " ";

			numbertext += String.valueOf(frame.memory.memory[numberinmemory + memcounter]);
			numbertext += "    ";
			this.number.setText(numbertext);
			memcounter++;
		}
		while (i < 8) {

			s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(0).words[i]);
			s1 += " ";
			i++;

		}

		this.cash0.setText(s1);

		s1 = "";
		s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(1).tag);
		s1 += ":  ";
		i = 0;
		while (i < 8) {
			s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(1).words[i]);
			s1 += " ";
			i++;
			//System.out.println(s1);
		}

		this.cash1.setText(s1);

		s1 = "";
		s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(2).tag);
		s1 += ":  ";
		i = 0;
		while (i < 8) {
			s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(2).words[i]);
			s1 += " ";
			i++;

		}

		this.cash2.setText(s1);

		s1 = "";
		s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(3).tag);
		s1 += ":  ";
		i = 0;
		while (i < 8) {
			s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(3).words[i]);
			s1 += " ";
			i++;

		}

		this.cash3.setText(s1);

		s1 = "";
		s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(4).tag);
		s1 += ":  ";
		i = 0;
		while (i < 8) {
			s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(4).words[i]);
			s1 += " ";
			i++;

		}

		this.cash4.setText(s1);

		s1 = "";
		s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(5).tag);
		s1 += ":  ";
		i = 0;
		while (i < 8) {
			s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(5).words[i]);
			s1 += " ";
			i++;

		}

		this.cash5.setText(s1);

		s1 = "";
		s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(6).tag);
		s1 += ":  ";
		i = 0;
		while (i < 8) {
			s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(6).words[i]);
			s1 += " ";
			i++;

		}

		this.cash6.setText(s1);

		s1 = "";
		s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(7).tag);
		s1 += ":  ";
		i = 0;
		while (i < 8) {
			s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(7).words[i]);
			s1 += " ";
			i++;

		}

		this.cash7.setText(s1);

		s1 = "";
		s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(8).tag);
		s1 += ":  ";
		i = 0;
		while (i < 8) {
			s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(8).words[i]);
			s1 += " ";
			i++;

		}

		this.cash8.setText(s1);

		s1 = "";
		s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(9).tag);
		s1 += ":  ";
		i = 0;
		while (i < 8) {
			s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(9).words[i]);
			s1 += " ";
			i++;

		}

		this.cash9.setText(s1);
		s1 = "";
		s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(10).tag);
		s1 += ":  ";
		i = 0;
		while (i < 8) {
			s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(10).words[i]);
			s1 += " ";
			i++;

		}

		this.cash10.setText(s1);
		s1 = "";
		s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(11).tag);
		s1 += ":  ";
		i = 0;
		while (i < 8) {
			s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(11).words[i]);
			s1 += " ";
			i++;

		}

		this.cash11.setText(s1);
		s1 = "";
		s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(12).tag);
		s1 += ":  ";
		i = 0;
		while (i < 8) {
			s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(12).words[i]);
			s1 += " ";
			i++;

		}

		this.cash12.setText(s1);
		s1 = "";
		s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(13).tag);
		s1 += ":  ";
		i = 0;
		while (i < 8) {
			s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(13).words[i]);
			s1 += " ";
			i++;

		}

		this.cash13.setText(s1);
		s1 = "";
		s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(14).tag);
		s1 += ":  ";
		i = 0;
		while (i < 8) {
			s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(14).words[i]);
			s1 += " ";
			i++;

		}

		this.cash14.setText(s1);
		s1 = "";
		s1 = s1 + String.valueOf(frame.memory.cache.cacheList.get(15).tag);
		s1 += ":  ";
		i = 0;
		while (i < 8) {
			s1 = s1 + SwitchMethod.shortToString(frame.memory.cache.cacheList.get(15).words[i]);
			s1 += " ";
			i++;

		}
		this.cash15.setText(s1);
		s1 += "   ";

		ir2 = SwitchMethod.shortToString(frame.ir);
		ir2 = ir2.substring(0, 6);
		if (ir2.equals("110010")) {
			//	monitor.setText(frame.screen);
			;
		}
		frame.fetch();
		ir2 = SwitchMethod.shortToString(frame.ir);

		ir2 = ir2.substring(0, 6);
		System.out.println("Next instruction op code:" + ir2);
		if (ir2.equals("110001")) {
			this.LOAD.setEnabled(false);
			this.GO.setEnabled(false);
			this.input.setEnabled(true);
			this.steps.setEnabled(false);
			JOptionPane.showMessageDialog(null, "Please input.", "VALUE", JOptionPane.ERROR_MESSAGE);
		}
		//this.cash1.setText(s1);

		//JOptionPane.showMessageDialog(null, "accomplish", "LOAD", JOptionPane.INFORMATION_MESSAGE);
	}

	private void changeGPR3ActionPerformed(java.awt.event.ActionEvent evt) {
		String GPRGet3 = this.GPR3.getText();
		short GPRGet3S = SwitchMethod.stringToShort(GPRGet3);
		frame.GPRs[2] = GPRGet3S;
	}

	private void changeGPR2ActionPerformed(java.awt.event.ActionEvent evt) {
		String GPRGet2 = this.GPR2.getText();
		short GPRGet2S = SwitchMethod.stringToShort(GPRGet2);
		frame.GPRs[1] = GPRGet2S;
	}

	private void changeGPR1ActionPerformed(java.awt.event.ActionEvent evt) {
		String GPRGet1 = this.GPR1.getText();
		short GPRGet1S = SwitchMethod.stringToShort(GPRGet1);
		frame.GPRs[0] = GPRGet1S;
	}

	private void changeGPR4ActionPerformed(java.awt.event.ActionEvent evt) {
		String GPRGet4 = this.GPR4.getText();
		short GPRGet4S = SwitchMethod.stringToShort(GPRGet4);
		frame.GPRs[3] = GPRGet4S;
	}

	/**
	* @param args the command line arguments
	*/
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new newwindow().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel FR;
	private javax.swing.JLabel FR0;
	private javax.swing.JTextField FR00;
	private javax.swing.JTextField FR01;
	private javax.swing.JLabel FR1;
	private javax.swing.JButton GO;
	private javax.swing.JLabel GPR;
	private javax.swing.JTextField GPR1;
	private javax.swing.JTextField GPR2;
	private javax.swing.JTextField GPR3;
	private javax.swing.JTextField GPR4;
	private javax.swing.JLabel IR;
	private javax.swing.JTextField IR1;
	private javax.swing.JLabel IX01;
	private javax.swing.JTextField IX1;
	private javax.swing.JTextField IX2;
	private javax.swing.JTextField IX3;
	private javax.swing.JLabel IX4;
	private javax.swing.JLabel IX5;
	private javax.swing.JLabel Instruction;
	private javax.swing.JTextField InsturctionText;
	private javax.swing.JButton LOAD;
	private javax.swing.JLabel MAR;
	private javax.swing.JLabel MAR1;
	private javax.swing.JLabel MBR;
	private javax.swing.JLabel MBR1;
	private javax.swing.JLabel MEM;
	private javax.swing.JTextField MEM1;
	private javax.swing.JTextField MEMfield;
	private javax.swing.JLabel PC;
	private javax.swing.JLabel PC1;
	private javax.swing.JLabel R00;
	private javax.swing.JLabel R1;
	private javax.swing.JLabel R2;
	private javax.swing.JLabel R3;
	private javax.swing.JLabel cash;
	private javax.swing.JLabel cash0;
	private javax.swing.JLabel cash1;
	private javax.swing.JLabel cash10;
	private javax.swing.JLabel cash11;
	private javax.swing.JLabel cash12;
	private javax.swing.JLabel cash13;
	private javax.swing.JLabel cash14;
	private javax.swing.JLabel cash15;
	private javax.swing.JLabel cash2;
	private javax.swing.JLabel cash3;
	private javax.swing.JLabel cash4;
	private javax.swing.JLabel cash5;
	private javax.swing.JLabel cash6;
	private javax.swing.JLabel cash7;
	private javax.swing.JLabel cash8;
	private javax.swing.JLabel cash9;
	private javax.swing.JLabel cc;
	private javax.swing.JLabel ccvalue;
	private javax.swing.JButton changeFR0;
	private javax.swing.JButton changeFR1;
	private javax.swing.JButton changeGPR1;
	private javax.swing.JButton changeGPR2;
	private javax.swing.JButton changeGPR3;
	private javax.swing.JButton changeGPR4;
	private javax.swing.JButton changeIR;
	private javax.swing.JButton changeIX1;
	private javax.swing.JButton changeIX2;
	private javax.swing.JButton changeIX3;
	private javax.swing.JButton changeMEM1;
	private javax.swing.JButton init;
	private javax.swing.JButton initialize;
	private javax.swing.JButton initialize2;
	private javax.swing.JButton input;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JLabel keyboard;
	public static javax.swing.JTextField keyboardfield;
	private javax.swing.JButton lookMEM;
	public static javax.swing.JTextArea monitor;
	private javax.swing.JLabel number;
	private javax.swing.JLabel screen;
	private javax.swing.JButton steps;
	private JButton initialize3;
}