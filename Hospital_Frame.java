import javax.swing.*;
import java.awt.*;

public class Hospital_Frame extends JFrame 
{
	public static final int WIDTH = 300;
	public static final int HEIGHT = 300;

	public Hospital_Frame() 
	{
		setTitle("Hospital");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		createMainWindow();
	}


	/**
	* Creates a jpanel with the frames displaying the main window options/menu.
	**/
	public void createMainWindow()
	{
		add(new Main_Menu_Panel());
	}


	/**
	* Fetches the data in the data fields and returns them in a tab-delimited string.
	* (and checks for correct formatting?)
	**/
	public String getDataFields() 
	{
		return "";
	}


	/**
	* Gets and returns the selected relation in the drop down menu
	**/
	public String getDataType() 
	{
		return "";
	}


	private class Main_Menu_Panel extends JPanel 
	{

		private JButton patientButton, doctorButton, nurseButton;
		private JLabel recordSearchLabel;

		public Main_Menu_Panel() 
		{
			recordSearchLabel = new JLabel("RECORD Search");
			patientButton = new JButton("Patient");
			doctorButton = new JButton("Doctor");
			nurseButton = new JButton("Nurse");

			add(recordSearchLabel);
			add(patientButton);
			add(doctorButton);
			add(nurseButton);

		}
	}


	public static void main(String[] args)
	{
		Hospital_Frame frame = new Hospital_Frame();
	}


}