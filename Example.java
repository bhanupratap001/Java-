import java.awt.*;//Import the awt Class
import javax.swing.*;
import java.awt.event.*;//Import the InterFace of Event 
class Example extends Frame implements ActionListener//Inherit the Frame Class and Implement the ActionListener
{
	String b;
Label l1,l2,l3,l4,l5,l6;//Declairation of Label
Font f;//Declairation of font 
Button b1,b2,b3,b4;//Declairation of button
List li1,li2;//Declairation of list
TextField tf1,tf2,tf3,tf4;//Declairation of TextField
Frame f1,f2;//Declairation of Frame

Scrollbar hrznl;
Example()//Constrcucter of Example Class
           {
			   setTitle("Example");//SET the Title Of Frame
			   setSize(1000,1000);//Declaire the Size of Frame
			   setVisible(true);//Visibility of Frame
			   
			   
			   setLayout(null);//Frame LayoutComparator
			   
			   l1=new Label("DAV College");//inliazed the Label of DAV College
                //l1.setBackground(Color.GREEN);
				f = new Font("", Font.BOLD, 18);
				hrznl=new Scrollbar(Scrollbar.VERTICAL,600,400,210,610);
				add(hrznl);
				
				l1.setFont(f);
				
	           l1.setBounds(50,30,200,20);//declairing the size and position of Label
			   
			   add(l1);//add Label on the Frame 
			   
			    
			  
			    
				
				l3=new Label("Student Name");//intialezed the Label for Dav College
				l3.setBounds(50,60,80,20);//declairing the size and position on Frame
				add(l3);//add Label on the Frame
				 
				 
				 tf1=new TextField();//intialize the textField to receving the item for Dav college
				 tf1.setBounds(145,60,150,20);//declairing the size and position of textfield
				 add(tf1);//add TextField on Frame

    
	
	                b1=new Button("ADD");//intialize the Button for Add item in List of Dav College
				    b1.setBounds(295,60,35,30);//declairing the size and position on the Frame
			        add(b1);//add the Button on the Frame
					
					
	                     li1=new List();//intialize the List to contain the item for Dav College
			              li1.setBounds(145,85,145,200);//declairing the size and position of List on the Frame 
			             add(li1);//add the List on the Frame
						 
						 
						 
						 l4=new Label("Student Name");//intialize the Label For Remove Button
				         l4.setBounds(50,290,80,20);//declairing the size and position on the frame
				          add(l4);//add Label  on frame for Dav collge 
	

	              tf3=new TextField();//inliazed the textfield for Dav college
				 tf3.setBounds(145,290,150,20);//declairing the size and position of textfiled on the Frame
				 add(tf3);//add a textField for receving the value to remove an item from List of dav 
	
	
	
	
	
			          b3=new Button("REMOVE");//inliazed the button on the Frame for Dave College
				       b3.setBounds(300,290,50,30);//declairing the size and position of button
			           add(b3);//add button on the Frame to Remove the Item from List of Dav College

					   
						 
	              l2=new Label("Shri Ram College");//inliazed the Label for Shri Ram College
			   l2.setBounds(490,30,200,20);//declairing the size and position of Label
			   //l2.setBackground(Color.GREEN);
			   l2.setFont(f);
			   add(l2);//add Label on the Frame
				 
				 l4=new Label("Student Name");//inliazed the Label for Shri Ram College
				l4.setBounds(490,60,80,20);//declairing the size and position of Label
				add(l4);//add the Label on Frame
			      
				  
				  
				 tf2=new TextField();//intilaized the TextField for receving the Value for inserting value in List 
				 tf2.setBounds(585,60,150,20);//Declaire the size and position of Text Field
				 add(tf2);//add the TextField on The Frame
				 
				 
			 b2=new Button("ADD");//intialized the Button to Adding the Value in the List of Shari Ram Collge
				 b2.setBounds(735,60,25,30);//Declaire the size and position of the Button
			 add(b2);//Add the Button on Frame
			   
			   
			   
			    
			   li2=new List();//Intlaized the List of shri Ram College 
			   li2.setBounds(590,85,145,200);//Declare the position and size of List 
			   add(li2);//Add the List on The Frame 
			   
			   
			    l6=new Label("Student Name");//Intialzed the Label to Remove Button
				l6.setBounds(490,290,80,20);//Declairing the Position and size of Label
				add(l6);//Add the Label on the Fame
                    

                tf4=new TextField();//intialized of TextField of Shri Ram College to Remove Button
				 tf4.setBounds(585,290,150,20);//declairing the position of TextField
				 add(tf4);//Add the TextField on the Frame					
	
	
	b4=new Button("REMOVE");//intialize the button remove of Shri Ram College
				 b4.setBounds(735,290,50,30);//Declairing the Posstion of Button
			 add(b4);//Add the Button on the Frame
	
	
	          b1.addActionListener(this);//Register the Event
			  b2.addActionListener(this);
			  b3.addActionListener(this);
			  b4.addActionListener(this);
	
	
            }

			
			
			public void actionPerformed(ActionEvent a)
			{
				if(a.getSource()==b1)//Add Button Funtion(dav college)
				{
					
					Informationform n=new Informationform();
			      //b=tf1.getText();// r is stored textfiled value
				 
				li1.addItem(b);//value r is placed in list 1
				
				}
				if(a.getSource()==b3)//Remove dav college button
				{
			      b=tf3.getText(); 
				li1.remove(b);//remove the item from list of dav college
				}
				if(a.getSource()==b2)//Add Button of Shri Ram College
				{
			     b=tf2.getText();//r is conatin the value from textfiled of shri Ram College
				li2.addItem(b);//value is insert in List of Shri Ram College List
				
				}
				
					if(a.getSource()==b4)//Remove Button of Shri Ram College
				{
			         b=tf4.getText();
				     li2.remove(b);//remove the item from List of Shri Ram College
				}
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
public static void main(String arg[])//Main Funtion started 
                            {
						      Example E=new Example();//Object and Call of constrcuter of Example Class
										   
							}


}




class Informationform extends JFrame //extend jframe into Mframe class
{
	
	Scrollbar vertSB;	
	JLabel labelimage1,labelimage2,formlabel;	//labelimage is used to take a image
	Font f;
	JPanel banner,menupanel,formpanel;//banner panel is used to take labelimage
	ImageIcon img1,img2;//img1 is used to recive to a iamge
	JScrollBar horizontal,vertical;


Informationform()
{	
	
		setTitle("INFORMATION SYSTEM");//set Frame Title
	setSize(2000,1000);//Frame Size
	setVisible(true);//frame visiblety on
	setLayout(null);//set Layout
    vertSB = new Scrollbar(Scrollbar.VERTICAL,2001, 1000, 90, 800);
	 add(vertSB);
	 
	 
	banner =new JPanel();//create a banner panel
	banner.setBounds(0,1,1500,200);//set position of panel
	banner.setBackground(Color.GRAY);
	add(banner);//add panel into frame
   

		  
		   img1=new ImageIcon("C:/Users/BHANU PRATAP/Desktop/2.jpg");//recive a image in img1
		   labelimage1=new JLabel(img1);//set  image into labelimage
		   
		   labelimage1.setBounds(-20,1,1000,100);// set position of labelimage
		  
		   banner.add(labelimage1);//labelimage add into panel banner

		   menupanel=new JPanel();//creat a new panel for menu or button
		   menupanel.setBounds(0,230,1400,90);//set a position of menu panel
		   menupanel.setBackground(Color.BLUE);//set a color for menu panel
		   
		   
		   formlabel=new JLabel("ENTER YOUR INFORMATION IN FIELDS");
		   f=new Font("",Font.BOLD,30);
		   formlabel.setFont(f);
		  // formlabel.setForground(Color.WHITE);
		   menupanel.add(formlabel);
           add(menupanel);//add a new label to menubar
		   
		        formpanel=new JPanel();
				formpanel.setBounds(50,450,600,700);
				formpanel.setBackground(Color.BLUE);
				formpanel.setForeground(Color.WHITE);
				add(formpanel);
				
			   JLabel nlabel=new JLabel("Enter your Name");
			   JTextField namefield=new JTextField();
			  Font f2= new Font("Arial",Font.BOLD,20);
			  nlabel.setFont(f2);
			  nlabel.setForeground(Color.WHITE);
			  nlabel.setBounds(20,450,500,100);
			  namefield.setBounds(230,450,100,70); 
			  formpanel.add(nlabel);
			  formpanel.add(namefield);
			  
			   
			   
		   
		   
	
	
}
}















