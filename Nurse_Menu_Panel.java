//package hos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/*****************************************************************************************************
* A nurse menu to display to the user 2 panels, 1 for looking up a nurse on the left side of the 
* window, and a 2nd on the right side which is selected from x options from buttons.
*****************************************************************************************************/
public class Nurse_Menu_Panel extends JPanel 
{

	/* Pointer to the main java window to access its get() methods for other panels */
	private Hospital_Frame hospital_frame;

	/* BUTTON to return the screen to the MAIN MENU */
	private JButton main_menu_button;	

	/* Main LABELS for displaying the options on this panel - largest text blocks, above
	*  each inner panel */
	private JLabel nurse_lookup_label, record_lookup_label;

	/* LEFT SIDE interface displayed to the user to lookup a nurse */
	private JPanel left_side_panel;

	/* RIGHT SIDE interface displayed to the user, displaying either button options or
	*  an interface based on button pressed */
	private JPanel right_side_panel;




	/*********************************************************************************
	* Main constructor used for setting up the Nurse_Menu_Panel.
	*********************************************************************************/
	public Nurse_Menu_Panel ( Hospital_Frame  frame ) 
	{
		this.hospital_frame = frame;

		setLayout(new GridBagLayout());
		initializeButtons();
		initializeLabels();
		addActionListeners();
		add(main_menu_button);
		//JPanel pan = new JPanel();
		//pan.setLayout(new BoxLayout(pan, BoxLayout.PAGE_AXIS));
		//add(nurse_lookup_label);
		add(left_side_panel = new Nurse_Lookup_Panel());
		//setLayout(new FlowLayout());
		//addButtonOptions();
		//add(pan);


		//add(record_lookup_label);
		add(right_side_panel = new Nurse_Button_Options(this)); 
		//setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		


	}



	/*********************************************************************************
	* Initializes the buttons for Nurse_Menu_Panel.
	*********************************************************************************/
	private void initializeButtons()
	{
		main_menu_button = new JButton("Main Menu");
	}



	/*********************************************************************************
	* Initializes the buttons for Nurse_Menu_Panel.
	*********************************************************************************/
	private void initializeLabels()
	{
		nurse_lookup_label = new JLabel("Nurse Lookup");
		record_lookup_label = new JLabel("Record Lookup");
	}



	/*********************************************************************************
	* Adds the action listeners for Nurse_Menu_Panel.
	*********************************************************************************/
	private void addActionListeners()
	{
		/* Add functionality - Return user to main menu */
		main_menu_button.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		  	hospital_frame.getMainMenu();
		  }
		});

	} // end addActionListeners()



	/*********************************************************************************
	* Removes any panel displayed on the right side of the nurse menu window and
	* adds 2 buttons options:
	*
	* ['NURSE RECORD LOOKUP','MODIFY NURSE INFO']
	*
	* Switches right_side_panel to an instance of Interface_Option_Buttons.
	*********************************************************************************/
	public void addNurseButtonOptions()
	{
		//if(right_side_panel != null)
		{
			remove(right_side_panel);
		}

		add(right_side_panel = new Nurse_Button_Options(this));
		revalidate();
		repaint();
	}



	/*********************************************************************************
	* Replaces the button interface with a nurse lookup interface when the 
	* 'NURSE RECORD LOOKUP' button is pressed in the button interface. 
	*
	* Switches right_side_panel from Interface_Option_Buttons to Nurse_Lookup_Panel.
	*********************************************************************************/
	public void addNurseRecordLookup()
	{
		remove(right_side_panel);
		add(right_side_panel = new Nurse_Record_Lookup(this));
		revalidate();
		repaint();
	}



	/*********************************************************************************
	* Replaces the button interface with a nurse lookup interface when the 
	* 'MODIFY NURSE INFO' button is pressed in the button interface. 
	*
	* Switches right_side_panel from Interface_Option_Buttons to Modify_Nurse_Info_Panel.
	*********************************************************************************/
	public void addModifyNurseInfo()
	{
		remove(right_side_panel);
		add(right_side_panel = new Modify_Nurse_Info_Panel(this));
		revalidate();
		repaint();
	}




} // end nurse menu class