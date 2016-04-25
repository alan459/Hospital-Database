import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/*****************************************************************************************************
* A menu displayed to the user to insert a new patient into the database. 
*****************************************************************************************************/
public class Insert_Patient_Menu_Panel extends JPanel 
{
	/* Pointer to the main java window to access its get() methods for other panels */
	private Hospital_Frame main_frame;

	/* Button to return the screen to the main menu */
	private JButton mainMenuButton;	

	/* Text fields for the user to enter intput data */
	private JTextField ssn_field, first_name_field, last_name_field, m_initial_field, dob_field, age_field, location_field;
	// fields that might need to be drop down - dob, gender, location

	private JComboBox gender_selection;


	/*********************************************************************************
	* Main constructor used for setting up the Insert_Patient_Menu_Panel.
	*********************************************************************************/
	public Insert_Patient_Menu_Panel(Hospital_Frame frame) 
	{
		this.main_frame = frame;

		setLayout(new GridLayout(10, 2));

		//setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		initializeButtons();
		addActionListeners();

		initializeTextFields();
		initializeComboBoxes();

		add(new Centered_Text_Panel("Enter information of patient to be added: "));
		add(new JLabel(""));

		add(new Centered_Text_Panel(" SSN:"));
		add(ssn_field);

		add(new Centered_Text_Panel(" First Name:"));
		add(first_name_field);

		add(new Centered_Text_Panel(" Middle Initial:"));
		add(m_initial_field);

		add(new Centered_Text_Panel(" Last Name:"));
		add(last_name_field);

		add(new Centered_Text_Panel(" Date of Birth:"));
		add(dob_field);

		add(new Centered_Text_Panel(" Age:"));
		add(age_field);

		add(new Centered_Text_Panel(" Gender:"));
		add(gender_selection);

		add(new Centered_Text_Panel(" Location:"));
		add(location_field);

		add(mainMenuButton);
		add(new JButton("submit"));


	}

	/*********************************************************************************
	* Initializes the text fields for Insert_Patient_Menu_Panel.
	*********************************************************************************/
	private void initializeTextFields()
	{
		ssn_field = new JTextField(6);

		first_name_field  = new JTextField(6);
		m_initial_field = new JTextField(1);
		last_name_field = new JTextField(6);

		dob_field = new JTextField(6);
		age_field = new JTextField(2);

		location_field = new JTextField(6);
	}

	/*********************************************************************************
	* Initializes the combo boxes for Insert_Patient_Menu_Panel.
	*********************************************************************************/
	private void initializeComboBoxes()
	{
		gender_selection = new JComboBox(new String[]{"Male", "Female"});
	}


	/*********************************************************************************
	* Initializes the buttons for Insert_Patient_Menu_Panel.
	*********************************************************************************/
	private void initializeButtons()
	{
		mainMenuButton = new JButton("Main Menu");
	}



	/*********************************************************************************
	* Adds the action listeners for Insert_Patient_Menu_Panel.
	*********************************************************************************/
	private void addActionListeners()
	{
		/* Add functionality - Return user to main menu */
		mainMenuButton.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		  	main_frame.getMainMenu();
		  }
		});

	} // end addActionListeners()





} // end patient menu class