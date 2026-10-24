
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.PrintStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import net.codejava.swing.CustomOutputStream;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.TitledBorder;

public class OrderManagement extends JFrame implements ItemListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	boolean done = false;
	int x,y,z,k,o,j,r,m,q,w,ak,g,v,b,n,u,f,i,h,s = 0;
	boolean next = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderManagement frame = new OrderManagement();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Queue orders = new Queue(100);

	
	JComboBox<String> combo, lcombo,comboBox1;
	/**
	 * Create the frame.
	 */
	public OrderManagement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Main Window
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new TitledBorder(null, "Order Management", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 //Background
		String imagePath = "background.jpg";
        JLabel background = new JLabel(new ImageIcon(imagePath));
        background.setLayout(new BorderLayout());

		
		
		
		
		//Menu Print Button
		JTextArea textArea = new JTextArea(50, 10);
        PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
        textArea.setBounds(240, 138, 296, 430);
        contentPane.add(textArea);
        System.setOut(printStream);
        System.setErr(printStream);
		JButton btnNewButton = new JButton("Show Menu");
		btnNewButton.setToolTipText("");
		btnNewButton.addActionListener(new ActionListener() {
			
		//Menu Console Printer
			public void actionPerformed(ActionEvent e) {
					Main.main(null);
				
			}
		});
		
		btnNewButton.setBounds(10, 138, 133, 62);
		contentPane.add(btnNewButton);
		
		//First Option
		String a[] = { "Select", "Appetizers", "Main Course", "Desserts", "Beverages"};
		combo = new JComboBox<String>(a);
		combo.setBounds(658, 199, 182, 20);
		getContentPane().add(combo);
		combo.addItemListener(this);
		
		//Second Meal Option
		lcombo = new JComboBox<String>();
		lcombo.setEnabled(false);
		getContentPane().add(lcombo);
		lcombo.setBounds(658, 230, 182, 20);
		lcombo.addItemListener(this);
		
		//Order Add Button
		JButton btnNewButton_1 = new JButton("Add Order");
		btnNewButton_1.setBounds(704, 261, 133, 23);
		contentPane.add(btnNewButton_1);
		
		//Table Options
		String c[] = {"Select", "Table 1", "Table 2", "Table 3", "Table 4", "Table 5"};
		comboBox1 = new JComboBox<String>(c);
		comboBox1.setBounds(659, 168, 181, 20);
		getContentPane().add(comboBox1);
		comboBox1.addItemListener(this);
		
		JTextArea table_2 = new JTextArea();
		table_2.setBounds(959, 251, 778, 90);
        contentPane.add(table_2);

        JTextArea table_3 = new JTextArea();
        table_3.setBounds(959, 362, 778, 90);
        contentPane.add(table_3);

        JTextArea table_4 = new JTextArea();
        table_4.setBounds(959, 478, 778, 90);
        contentPane.add(table_4);

        JTextArea table_5 = new JTextArea();
        table_5.setBounds(959, 595, 778, 90);
        contentPane.add(table_5);

        JTextArea table_1 = new JTextArea();
        table_1.setBounds(959, 138, 778, 90);
        contentPane.add(table_1);
        
        JTextArea txtrTable = new JTextArea();
        txtrTable.setFont(new Font("Tahoma", Font.PLAIN, 9));
        txtrTable.setText("Table 1");
        txtrTable.setBounds(959, 122, 64, 16);
        contentPane.add(txtrTable);
        
        JTextArea txtrTable_5 = new JTextArea();
        txtrTable_5.setFont(new Font("Tahoma", Font.PLAIN, 9));
        txtrTable_5.setText("Table 2");
        txtrTable_5.setBounds(959, 234, 64, 16);
        contentPane.add(txtrTable_5);
        
        JTextArea txtrTable_1 = new JTextArea();
        txtrTable_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
        txtrTable_1.setText("Table 3");
        txtrTable_1.setBounds(959, 349, 64, 16);
        contentPane.add(txtrTable_1);
        
        JTextArea txtrTable_2 = new JTextArea();
        txtrTable_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
        txtrTable_2.setText("Table 4");
        txtrTable_2.setBounds(959, 463, 64, 16);
        contentPane.add(txtrTable_2);
        
        JTextArea txtrTable_3 = new JTextArea();
        txtrTable_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
        txtrTable_3.setText("Table 5");
        txtrTable_3.setBounds(959, 581, 64, 16);
        contentPane.add(txtrTable_3);
        
        JButton btnNewButton_t1 = new JButton("...");
        btnNewButton_t1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		table_1.setText("");
        		x = 0;
        		y = 0;
        		z = 0;
        		k = 0;
        	}
        });
        btnNewButton_t1.setBounds(1698, 118, 40, 20);
        contentPane.add(btnNewButton_t1);
        
        JButton btnNewButton_t2 = new JButton("...");
        btnNewButton_t2.setBounds(1698, 230, 40, 20);
        contentPane.add(btnNewButton_t2);
        btnNewButton_t2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		table_2.setText("");
        		o = 0;
        		j = 0;
        		r = 0;
        		m = 0;
        	}
        });
        
        JButton btnNewButton_t3 = new JButton("...");
        btnNewButton_t3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		table_3.setText("");
        		q = 0;
        		w = 0;
        		ak = 0;
        		g = 0;
        	}
        });
        btnNewButton_t3.setBounds(1698, 343, 40, 20);
        contentPane.add(btnNewButton_t3);
        

        
        JButton btnNewButton_t4 = new JButton("...");
        btnNewButton_t4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		table_4.setText("");
        		v = 0;
        		b = 0;
        		n = 0;
        		u = 0;
        	}
        });
        btnNewButton_t4.setBounds(1698, 458, 40, 20);
        contentPane.add(btnNewButton_t4);
        
        JButton btnNewButton_t5 = new JButton("...");
        btnNewButton_t5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		table_5.setText("");
        		f = 0;
        		i = 0;
        		h = 0;
        		s = 0;
        	}
        });
        btnNewButton_t5.setBounds(1698, 575, 40, 20);
        contentPane.add(btnNewButton_t5);

		
		//Orders Adds to the Queue 
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent t) {
				if(comboBox1.getSelectedItem().equals("Table 1")) {
        		if(comboBox1.getSelectedItem().equals("Table 1") && x<=6 && combo.getSelectedItem().equals("Appetizers")) {
        			if(x== 0) {
        				table_1.append("\n");
        				table_1.append(" Appetizers: ");
        				x++;
        			}
        			if (x<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_1.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			x++;}
        			else if(x == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_1.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				x ++;
        			}
        		}
        		else if(comboBox1.getSelectedItem().equals("Table 1") && y<=6 && combo.getSelectedItem().equals("Main Course")) {
        			if(y==0) {
        				table_1.append("\n");
        				table_1.append(" Main Course: ");
        				y++;
        			}
        			if (y<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_1.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			y++;}
        			else if(y == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_1.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				y ++;
        			}
        		}
        		else if(comboBox1.getSelectedItem().equals("Table 1") && z<=6 && combo.getSelectedItem().equals("Desserts")) {
        			if(z==0) {
        				table_1.append("\n");
        				table_1.append(" Desserts: ");
        				z++;
        			}
        			if (z<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_1.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			z++;}
        			else if(z == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_1.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				z ++;
        			}
        		}
        		else if(comboBox1.getSelectedItem().equals("Table 1") && k<=6 && combo.getSelectedItem().equals("Beverages")) {
        			if(k==0) {
        				table_1.append("\n");
        				table_1.append(" Beverages: ");
        				k++;
        			}
        			if (k<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_1.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			k++;}
        			else if(k == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_1.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				k ++;
        			}
        		}
			}	
			if(comboBox1.getSelectedItem().equals("Table 2")) {
        		if(comboBox1.getSelectedItem().equals("Table 2") && o<=6 && combo.getSelectedItem().equals("Appetizers")) {
        			if(o== 0) {
        				table_2.append("\n");
        				table_2.append(" Appetizers: ");
        				o++;
        			}
        			if(o<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_2.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			o++;}
        			else if(o == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_2.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				o ++;
        			}
        		}
        		if(comboBox1.getSelectedItem().equals("Table 2") && j<=6 && combo.getSelectedItem().equals("Main Course")) {
        			if(j==0) {
        				table_2.append("\n");
        				table_2.append(" Main Course: ");
        				j++;
        			}
        			if(j<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_2.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			j++;}
        			else if(j == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_2.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				j ++;
        			}
        		}
        		if(comboBox1.getSelectedItem().equals("Table 2") && r<=6 && combo.getSelectedItem().equals("Desserts")) {
        			if(r==0) {
        				table_2.append("\n");
        				table_2.append(" Desserts: ");
        				r++;
        			}
        			if(r<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_2.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			r++;}
        			else if(r == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_2.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				r ++;
        			}
        		}
        		if(comboBox1.getSelectedItem().equals("Table 2") && m<=6 && combo.getSelectedItem().equals("Beverages")) {
        			if(m==0) {
        				table_2.append("\n");
        				table_2.append(" Beverages: ");
        				m++;
        			}
        			if(m<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_2.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			m++;}
        			else if(m == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_2.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				m ++;
        			}
        		}
			}
			if(comboBox1.getSelectedItem().equals("Table 3")) {
        		if(comboBox1.getSelectedItem().equals("Table 3") && q<=6 && combo.getSelectedItem().equals("Appetizers")) {
        			if(q== 0) {
        				table_3.append("\n");
        				table_3.append(" Appetizers: ");
        				q++;
        			}
        			if(q<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_3.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			q++;}
        			else if(q == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_3.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				q ++;
        			}
        		}
        		if(comboBox1.getSelectedItem().equals("Table 3") && w<=6 && combo.getSelectedItem().equals("Main Course")) {
        			if(w==0) {
        				table_3.append("\n");
        				table_3.append(" Main Course: ");
        				w++;
        			}
        			if(w<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_3.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			w++;}
        			else if(w == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_3.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				 w++;
        			}
        		}
        		if(comboBox1.getSelectedItem().equals("Table 3") && ak<=6 && combo.getSelectedItem().equals("Desserts")) {
        			if(ak==0) {
        				table_3.append("\n");
        				table_3.append(" Desserts: ");
        				ak++;
        			}
        			if(ak<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_3.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			ak++;}
        			else if(ak == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_3.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				ak ++;
        			}
        		}
        		if(comboBox1.getSelectedItem().equals("Table 3") && g<=6 && combo.getSelectedItem().equals("Beverages")) {
        			if(g==0) {
        				table_3.append("\n");
        				table_3.append(" Beverages: ");
        				g++;
        			}
        			if(g<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_3.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			g++;}
        			else if(g == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_3.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				g ++;
        			}
        		}
			}
			if(comboBox1.getSelectedItem().equals("Table 4")) {
        		if(comboBox1.getSelectedItem().equals("Table 4") && v<=6 && combo.getSelectedItem().equals("Appetizers")) {
        			if(v== 0) {
        				table_4.append("\n");
        				table_4.append(" Appetizers: ");
        				v++;
        			}
        			if(v<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_4.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			v++;}
        			else if(v == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_4.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				v ++;
        			}
        		}
        		if(comboBox1.getSelectedItem().equals("Table 4") && b<=6 && combo.getSelectedItem().equals("Main Course")) {
        			if(b==0) {
        				table_4.append("\n");
        				table_4.append(" Main Course: ");
        				b++;
        			}
        			if(b<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_4.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			b++;}
        			else if(b == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_4.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				b ++;
        			}
        		}
        		if(comboBox1.getSelectedItem().equals("Table 4") && n<=6 && combo.getSelectedItem().equals("Desserts")) {
        			if(n==0) {
        				table_4.append("\n");
        				table_4.append(" Desserts: ");
        				n++;
        			}
        			if(n<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_4.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			n++;}
        			else if(n == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_4.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				n ++;
        			}
        		}
        		if(comboBox1.getSelectedItem().equals("Table 4") && u <=6 && combo.getSelectedItem().equals("Beverages")) {
        			if(u==0) {
        				table_4.append("\n");
        				table_4.append(" Beverages: ");
        				u++;
        			}
        			if(u<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_4.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			u++;}
        			else if(u == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_4.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				u ++;
        			}
        		}
			}
			if(comboBox1.getSelectedItem().equals("Table 5")) {
        		if(comboBox1.getSelectedItem().equals("Table 5") && f<=6 && combo.getSelectedItem().equals("Appetizers")) {
        			if(f== 0) {
        				table_5.append("\n");
        				table_5.append(" Appetizers: ");
        				f++;
        			}
        			if(f<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_5.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			f++;}
        			else if(f == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_5.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				f ++;
        			}
        		}
        		if(comboBox1.getSelectedItem().equals("Table 5") && i<=6 && combo.getSelectedItem().equals("Main Course")) {
        			if(i==0) {
        				table_5.append("\n");
        				table_5.append(" Main Course: ");
        				i++;
        			}
        			if(i<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_5.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			i++;}
        			else if(i == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_5.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				i ++;
        			}
        		}
        		if(comboBox1.getSelectedItem().equals("Table 5") && h<=6 && combo.getSelectedItem().equals("Desserts")) {
        			if(h==0) {
        				table_5.append("\n");
        				table_5.append(" Desserts: ");
        				h++;
        			}
        			if(h<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_5.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			h++;}
        			else if(h == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_5.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				h ++;
        			}
        		}
        		if(comboBox1.getSelectedItem().equals("Table 5") && s<=6 && combo.getSelectedItem().equals("Beverages")) {
        			if(s==0) {
        				table_5.append("\n");
        				table_5.append(" Beverages: ");
        				s++;
        			}
        			if(s<6) {
        			orders.enqueue((String)lcombo.getSelectedItem());
        			table_5.append((String)lcombo.getSelectedItem() + " - " );
        			orders.dequeue();
        			s++;}
        			else if(s == 6) {
        				orders.enqueue((String)lcombo.getSelectedItem());
        				table_5.append((String)lcombo.getSelectedItem());
        				orders.dequeue();
        				s ++;
        			}
        		}
			}
		}		
		});
	}
	
		//Combo Method Item State Recorder
    	public void itemStateChanged(ItemEvent e) {
    		String b[] = { "Caesar Salad", "Garlic Bread","Buffalo Wings",
        				"Breadsticks", "Onion Rings", "Nachos","Soup Dumplings" };
        
    		String c[] = { "Cheeseburger", "Grilled Pizza","Chicken Alfredo", "Fajita","Risotto", 
        		"Beef Stew", "Roast Chicken", "Margherita Pizza" };
        
    		String d[] = { "Chocolate Cake" , "Apple Pie", "Cheesecake", "Peach Pie", "Fruit Salad", 
        		"Cheesecake", "Red Velvet"};
    		String f[] = { "Coca Cola" , "Sprite", "Fanta", "Apple Juice", "Lemonade", 
                    "Beer", "Wine"};
    		
    		if (e.getSource() == combo) {
        	
    			if (combo.getSelectedItem().equals("Select")) {
    				lcombo.setEnabled(false);
    				lcombo.removeAllItems();
    			} else if (combo.getSelectedItem().equals("Appetizers")) {
    				lcombo.setEnabled(true);
    				lcombo.removeAllItems();
    				for (int i = 0; i < b.length; i++) {
                    lcombo.addItem(b[i]);
    				}
    			} else if (combo.getSelectedItem().equals("Main Course")) {
    				lcombo.setEnabled(true);
    				lcombo.removeAllItems();
    					for (int i = 0; i < c.length; i++) {
    						lcombo.addItem(c[i]);
                	}
    			}
    			else if (combo.getSelectedItem().equals("Desserts")) {
    				lcombo.setEnabled(true);
    				lcombo.removeAllItems();
    				for (int i = 0; i < d.length; i++) {
    					lcombo.addItem(d[i]);}
                 }
            
            	else if (combo.getSelectedItem().equals("Beverages")) {
            		lcombo.setEnabled(true);
            		lcombo.removeAllItems();
            		for (int i = 0; i < f.length; i++) {
            			lcombo.addItem(f[i]);
                }
            }
            	else;
       } 
    		
    }   	
    	
}

	



