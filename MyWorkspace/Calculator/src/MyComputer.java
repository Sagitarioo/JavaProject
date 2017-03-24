import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
public class MyComputer extends JFrame implements ActionListener {
	private JPanel Panel1=new JPanel();
	private JPanel Panel2=new JPanel();
	private JTextField tfResult=new JTextField();
	private GridLayout gridLayout1=new GridLayout();
	private GridBagLayout gridBagLayout1=new GridBagLayout();
	private GridBagLayout gridBagLayout2=new GridBagLayout();
	private String recentOperation=null;
	private String recentNum=null;
	private boolean isNew=true;
	public void addButton(Container c,String s){
		JButton b=new JButton(s);
		b.setFont(new java.awt.Font("SansSerif",0,12));
		b.setForeground(Color.black);
		b.setBorder(BorderFactory.createRaisedBevelBorder());
		c.add(b);
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		if(s.charAt(0)>='0'&&s.charAt(0)<='9'){
			if(!isNew)
				tfResult.setText(tfResult.getText()+s);
			else
				tfResult.setText(s);
			isNew=false;
		}
		else if(s.equals(".")){
			if(tfResult.getText().indexOf(".")!=-1)return;
			if(!isNew && tfResult.getText()!="")
				tfResult.setText(tfResult.getText()+".");
			else
				tfResult.setText("0.");
				isNew=false;
		}
		else if(s.equals("=")){
			equalaction(e);
		}
		else if(s.equals("C")){
			tfResult.setText(null);
		}
		else{
			if((tfResult.getText()).equals(""))return;
			if(recentOperation !=null)equalaction(e);
			recentOperation=s;
			recentNum=tfResult.getText();
			isNew=true;
		}
	}
	
	void equalaction(ActionEvent e){
		if(recentOperation==null||recentNum==null||tfResult.getText().equals(""))return;
		double last=0,now=0;
		
		try{
			last=Double.parseDouble(recentNum);
			now=Double.parseDouble(tfResult.getText());
		}catch(NumberFormatException ne){
			recentOperation=null;
			recentNum=null;
			tfResult.setText("数据输入不合法");
			System.out.println("数据输入不合法");
			isNew=true;
			return;
		}
		
		if(recentOperation.equals("+")){
			last+=now;
		}
		if(recentOperation.equals("-")){
			last-=now;
		}
		if(recentOperation.equals("*")){
			last*=now;
		}
		if(recentOperation.equals("/")){
			last/=now;
		}
		tfResult.setText(""+last);
		
		recentNum=tfResult.getText();
		recentOperation=null;
		isNew=true;
	}
	
	public MyComputer(){
		tfResult.setBorder(BorderFactory.createLoweredBevelBorder());
		tfResult.setDisabledTextColor(Color.white);
		tfResult.setEditable(false);
		tfResult.setText("0");
		tfResult.setHorizontalAlignment(SwingConstants.RIGHT);
		
		Panel1.setLayout(gridBagLayout1);
		Panel1.setPreferredSize(new Dimension(333,30));
		Panel1.add(tfResult,new GridBagConstraints(1,0,1,1,0.0,0.0,
				GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,
				new Insets(0,0,0,0),200,0));
		
		Panel2.setBorder(BorderFactory.createRaisedBevelBorder());
		gridLayout1.setColumns(6);
		gridLayout1.setHgap(2);
		gridLayout1.setRows(5);
		gridLayout1.setVgap(2);
		Panel2.setLayout(gridLayout1);
		String buttons="789/456*123-0.=+C";
		for(int i=0;i<buttons.length();i++){
			addButton(Panel2,buttons.substring(i,i+1));
		}
		
		this.getContentPane().setLayout(gridBagLayout2);
		this.getContentPane().add(Panel2,
				new GridBagConstraints(0,1,1,1,1.0,1.0,
						GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,
						new Insets(1,0,1,4),190,15));
		this.getContentPane().add(Panel1,
				new GridBagConstraints(0,0,1,1,1.0,1.0,
						GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,
						new Insets(0,0,1,4),23,0));
		
		this.setResizable(false);
		this.setTitle("Calculator");
		this.addWindowListener(new java.awt.event.WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyComputer mf=new MyComputer();
		mf.setBounds(300,200,240,210);
		mf.show();
	}

}
