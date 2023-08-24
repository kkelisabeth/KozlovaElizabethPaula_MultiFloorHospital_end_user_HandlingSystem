import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HospitalDemo extends JFrame{

	static Hospital hospital = new Hospital("Hospital X", "Nocisia", 12, 30, 100); 
	Patient patient = new Patient(); 
	
	static HospitalFinancial_Accounts fAccount = new HospitalFinancial_Accounts("a0001", 10000.000);
	
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel topLabel = new JLabel("Welcome to the Simple Menu");
        topLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel bottomLabel = new JLabel("Please select an option:");
        bottomLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel option1Label = new JLabel("Hospital Details");
        JButton option1Button = new JButton("Open Hospital Details");
        JLabel option2Label = new JLabel("Patient Details");
        JButton option2Button = new JButton("Open Patient Details");
        JLabel option3Label = new JLabel("Pharmacy Details");
        JButton option3Button = new JButton("Open Pharmacy Details");

        JButton exitButton = new JButton("Exit");

        // add action listeners for the buttons
        option1Button.addActionListener(e -> {
        	JFrame mainFrame = new JFrame("Hospital Details");
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            
            // create the "Hospital Staff Details" label and button
            JLabel labelHospitalStaff = new JLabel("Hospital Staff Details");
            JButton buttonHospitalStaff = new JButton("Open");

          
            // create the action listener for the "Hospital Staff" button
            buttonHospitalStaff.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // code to open the "Hospital Staff" window
                    JFrame frame = new JFrame("Hospital Staff");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    // add a label "Hospital Staff" to the top of the window
                    JLabel label = new JLabel("Hospital Staff");
                    frame.add(label, BorderLayout.NORTH);

                    // add buttons "Show All Info" and "Add New Staff Member"
                    JButton buttonShowAllInfo = new JButton("Show All Info");
                    JButton buttonAddNewStaff = new JButton("Add New Staff Member");
                    
                    buttonShowAllInfo.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            JFrame showAllInfoFrame = new JFrame("Show All Info");
                            showAllInfoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                            // create a label with the information you want to show
                            JLabel labelShowAllInfo = new JLabel("Hospital Staff Information: ");
                            labelShowAllInfo.setText(hospital.getStaff());
                            showAllInfoFrame.add(labelShowAllInfo);

                            showAllInfoFrame.setSize(300, 150);
                            showAllInfoFrame.setVisible(true);
                        }
                    });
                    
                    buttonAddNewStaff.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            JFrame addNewStaffFrame = new JFrame("Add New Staff Member");
                            addNewStaffFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            addNewStaffFrame.setLayout(new GridLayout(3, 2));
                            
                            // create labels and text fields for Name, ID, Position
                            JLabel labelName = new JLabel("Name: ");
                            JTextField textFieldName = new JTextField();
                            JLabel labelID = new JLabel("ID: ");
                            JTextField textFieldID = new JTextField();
                            JLabel labelPosition = new JLabel("Position: ");
                            JTextField textFieldPosition = new JTextField();
                            //String name = textFieldName.getText(); 
                           // String id_s = textFieldID.getText(); 
                           // int id = Integer.parseInt(id_s); 
                            //String position = textFieldPosition.getText(); 
                            //HospitalStaff staff = new HospitalStaff(name, id, position); 
                            //hospital.addStaff(staff);
                            
                            // add labels and text fields to the frame
                            addNewStaffFrame.add(labelName);
                            addNewStaffFrame.add(textFieldName);
                            addNewStaffFrame.add(labelID);
                            addNewStaffFrame.add(textFieldID);
                            addNewStaffFrame.add(labelPosition);
                            addNewStaffFrame.add(textFieldPosition);
                            
                            // create a submit button
                            JButton submitButton = new JButton("Submit");
                            addNewStaffFrame.add(submitButton);
                            submitButton.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    // code to handle the submission of the new staff member's information
                                    // for example, you can store the information in a database
                                    String name = textFieldName.getText();
                                    String id = textFieldID.getText();
                                    String position = textFieldPosition.getText();
                                    System.out.println("Name: " + name + " ID: " + id + " Position: " + position);
                                }
                            });
                            
                            addNewStaffFrame.pack();
                            addNewStaffFrame.setVisible(true);
                        }
                    });
                    frame.add(buttonShowAllInfo, BorderLayout.WEST);
                    frame.add(buttonAddNewStaff, BorderLayout.EAST);

                    frame.pack();
                    frame.setVisible(true);
                }
            });

            mainFrame.pack();
            mainFrame.setVisible(true);
	        mainFrame.setSize(300, 300);

            
         // create the "Financial Details" label and button
            JLabel labelFinancialDetails = new JLabel("Financial Details");
            JButton buttonFinancialDetails = new JButton("Open");

            // create the action listener for the "Financial Details" button
            buttonFinancialDetails.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // code to open the "Financial Details" window
                    JFrame frame = new JFrame("Financial Details");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    // add a label "Financial Details" to the top of the window
                    JLabel label = new JLabel("Financial Details");
                    frame.add(label, BorderLayout.NORTH);

                    // add a label with current financial details
                    JLabel labelFinancialDetails = new JLabel("Current Financial Details:");
                    JLabel labelFinancialDetails1 = new JLabel("Account Number:" + fAccount.getAccountNumber());
                    JLabel labelFinancialDetails2 = new JLabel("Account Balance:" + fAccount.getAccountBalance());
                    frame.add(labelFinancialDetails, BorderLayout.CENTER);
                    frame.add(labelFinancialDetails1, BorderLayout.CENTER);
                    frame.add(labelFinancialDetails2, BorderLayout.CENTER);

                    // add a button "Change Financial Information"
                    JButton buttonChangeFinancialInfo = new JButton("Change Financial Information");
                    frame.add(buttonChangeFinancialInfo, BorderLayout.SOUTH);
                    
                    buttonChangeFinancialInfo.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            JFrame changeFinancialInfoFrame = new JFrame("Change Financial Information");
                            changeFinancialInfoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            changeFinancialInfoFrame.setLayout(new GridLayout(3, 2));
                            
                            // create labels and text fields for Account Number, Account Balance, Transactions
                            JLabel labelAccountNumber = new JLabel("Account Number: ");
                            JTextField textFieldAccountNumber = new JTextField();
                            JLabel labelAccountBalance = new JLabel("Account Balance: ");
                            JTextField textFieldAccountBalance = new JTextField();
                            JLabel labelTransactions = new JLabel("Transactions: ");
                            JTextField textFieldTransactions = new JTextField();
                            
                            // add labels and text fields to the frame
                            changeFinancialInfoFrame.add(labelAccountNumber);
                            changeFinancialInfoFrame.add(textFieldAccountNumber);
                            changeFinancialInfoFrame.add(labelAccountBalance);
                            changeFinancialInfoFrame.add(textFieldAccountBalance);
                            changeFinancialInfoFrame.add(labelTransactions);
                            changeFinancialInfoFrame.add(textFieldTransactions);
                            
                            // create a submit button
                            JButton submitButton = new JButton("Submit");
                            changeFinancialInfoFrame.add(submitButton);
                            submitButton.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    // code to handle the submission of the new financial information
                                    // for example, you can store the information in a database
                                    String accountNumber = textFieldAccountNumber.getText();
                                    String accountBalance = textFieldAccountBalance.getText();
                                    String transactions = textFieldTransactions.getText();
                                    System.out.println("Account Number: " + accountNumber + " Account Balance: " + accountBalance + " Transactions: " + transactions);
                                }
                            });
                            changeFinancialInfoFrame.pack();
                            changeFinancialInfoFrame.setVisible(true);
                        }
                    });

                    frame.pack();
                    frame.setVisible(true);
                }
            });

            // create the "Equipment Inventory" label and button
            JLabel labelEquipmentInventory = new JLabel("Equipment Inventory");
            JButton buttonEquipmentInventory = new JButton("Open");

            // create the action listener for the "Equipment Inventory" button
            buttonEquipmentInventory.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // code to open the "Equipment Inventory" window
                    JFrame frame = new JFrame("Equipment Inventory");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    // add a label "Equipment Inventory" to the top of the window
                    JLabel label = new JLabel("Equipment Inventory");
                    frame.add(label, BorderLayout.NORTH);

                    // add a label with current equipment details
                    JLabel labelEquipmentDetails = new JLabel("Current Equipment Details:");
                    frame.add(labelEquipmentDetails, BorderLayout.CENTER);
                    
                    // add a button "Add Equipment"
                    JButton buttonAddEquipment = new JButton("Add Equipment");
                    frame.add(buttonAddEquipment, BorderLayout.SOUTH);

                    buttonAddEquipment.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            JFrame addEquipmentFrame = new JFrame("Add Equipment");
                            addEquipmentFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            addEquipmentFrame.setLayout(new GridLayout(4, 2));
                            
                            // create labels and text fields for Equipment Name, Equipment Serial Number, Equipment Status, Equipment Use
                            JLabel labelEquipmentName = new JLabel("Equipment Name: ");
                            JTextField textFieldEquipmentName = new JTextField();
                            JLabel labelEquipmentSerialNumber = new JLabel("Equipment Serial Number: ");
                            JTextField textFieldEquipmentSerialNumber = new JTextField();
                            JLabel labelEquipmentStatus = new JLabel("Equipment Status: ");
                            JTextField textFieldEquipmentStatus = new JTextField();
                            JLabel labelEquipmentUse = new JLabel("Equipment Use: ");
                            JTextField textFieldEquipmentUse = new JTextField();
                            
                            // add labels and text fields to the frame
                            addEquipmentFrame.add(labelEquipmentName);
                            addEquipmentFrame.add(textFieldEquipmentName);
                            addEquipmentFrame.add(labelEquipmentSerialNumber);
                            addEquipmentFrame.add(textFieldEquipmentSerialNumber);
                            addEquipmentFrame.add(labelEquipmentStatus);
                            addEquipmentFrame.add(textFieldEquipmentStatus);
                            addEquipmentFrame.add(labelEquipmentUse);
                            addEquipmentFrame.add(textFieldEquipmentUse);
                            
                            // create a submit button
                            JButton submitButton = new JButton("Submit");
                            addEquipmentFrame.add(submitButton);
                            submitButton.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    // code to handle the submission of the new equipment information
                                    // for example, you can store the information in a database
                                    String equipmentName = textFieldEquipmentName.getText();
                                    String equipmentSerialNumber = textFieldEquipmentSerialNumber.getText();
                                    String equipmentStatus = textFieldEquipmentStatus.getText();
                                    String equipmentUse = textFieldEquipmentUse.getText();
                                    System.out.println("Equipment Name: " + equipmentName + " Equipment Serial Number: " + equipmentSerialNumber + " Equipment Status: " + equipmentStatus + " Equipment Use: " + equipmentUse);
                                }
                            });
                            
                            addEquipmentFrame.pack();
                            addEquipmentFrame.setVisible(true);
                        }
                    });
                            
                    frame.pack();
                    frame.setVisible(true);
                }
            });

            // create the "Hospital Configuration" label and button
            JLabel labelHospitalConfiguration = new JLabel("Hospital Configuration");
            JButton buttonHospitalConfiguration = new JButton("Open");

            // create the action listener for the "Hospital Configuration" button
            buttonHospitalConfiguration.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // code to open the "Hospital Configuration" window
                    JFrame frame = new JFrame("Hospital Configuration");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    // add a label "Hospital Configuration" to the top of the window
                    JLabel label = new JLabel("Hospital Configuration");
                    frame.add(label, BorderLayout.NORTH);

                    // add a label with current configuration
                    JLabel labelCurrentConfig = new JLabel("Current Configuration:");
                    frame.add(labelCurrentConfig, BorderLayout.CENTER);
                    
                    // add a button "Change Hospital Configuration"
                    JButton buttonChangeConfig = new JButton("Change Hospital Configuration");
                    frame.add(buttonChangeConfig, BorderLayout.SOUTH);

                    buttonChangeConfig.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            // code to open the "Hospital Configuration" window
                            JFrame frame = new JFrame("Hospital Configuration");
                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frame.setLayout(new GridLayout(8, 2));

                            // create the "Current Configuration" label
                            JLabel labelCurrentConfiguration = new JLabel("Current Configuration");
                            frame.add(labelCurrentConfiguration);

                            // create the "Floor Number" label and text field
                            JLabel labelFloorNumber = new JLabel("Floor Number:");
                            JTextField textFloorNumber = new JTextField();
                            frame.add(labelFloorNumber);
                            frame.add(textFloorNumber);

                            // create the "Floor Capacity" label and text field
                            JLabel labelFloorCapacity = new JLabel("Floor Capacity:");
                            JTextField textFloorCapacity = new JTextField();
                            frame.add(labelFloorCapacity);
                            frame.add(textFloorCapacity);

                            // create the "Number of Rooms" label and text field
                            JLabel labelNumberOfRooms = new JLabel("Number of Rooms:");
                            JTextField textNumberOfRooms = new JTextField();
                            frame.add(labelNumberOfRooms);
                            frame.add(textNumberOfRooms);

                            // create the "Room Number" label and text field
                            JLabel labelRoomNumber = new JLabel("Room Number:");
                            JTextField textRoomNumber = new JTextField();
                            frame.add(labelRoomNumber);
                            frame.add(textRoomNumber);

                            // create the "Room Type" label and text field
                            JLabel labelRoomType = new JLabel("Room Type:");
                            JTextField textRoomType = new JTextField();
                            frame.add(labelRoomType);
                            frame.add(textRoomType);

                            // create the "Room Capacity" label and text field
                            JLabel labelRoomCapacity = new JLabel("Room Capacity:");
                            JTextField textRoomCapacity = new JTextField();
                            frame.add(labelRoomCapacity);
                            frame.add(textRoomCapacity);

                            // create the "Number of Patients in the room" label and text field
                            JLabel labelNumberOfPatients = new JLabel("Number of Patients in the room:");
                            JTextField textNumberOfPatients = new JTextField();
                            frame.add(labelNumberOfPatients);
                            frame.add(textNumberOfPatients);

                            // create the "Change" button
                            JButton buttonChange = new JButton("Change");
                            frame.add(buttonChange);
                        }
                    });
                    frame.setSize(300, 300);
                    frame.setVisible(true);
                
                    frame.pack();
                    frame.setVisible(true);
                }
            });
            
         // create the "Hospital Information" label and button
            JLabel labelHospitalInformation = new JLabel("Hospital Information");
            JButton buttonHospitalInformation = new JButton("Open");

            // create the action listener for the "Hospital Information" button
            buttonHospitalInformation.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // code to open the "Hospital Information" window
                    JFrame frame = new JFrame("Hospital Information");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setLayout(new GridLayout(6, 2));

                    // add labels with hospital information
                    frame.add(new JLabel("Hospital Name: "));
                    frame.add(new JTextField());
                    frame.add(new JLabel("Hospital Location: "));
                    frame.add(new JTextField());
                    frame.add(new JLabel("Hospital Capacity: "));
                    frame.add(new JTextField());
                    frame.add(new JLabel("Hospital Equipment Number: "));
                    frame.add(new JTextField());
                    frame.add(new JLabel("Hospital Number of Patients: "));
                    frame.add(new JTextField());
                    frame.add(new JLabel("Hospital Number of Staff Members: "));
                    frame.add(new JTextField());

                    frame.pack();
                    frame.setVisible(true);
                }
            });
            
            mainFrame.setLayout(new GridLayout(5, 2));
            mainFrame.add(labelHospitalStaff);
            mainFrame.add(buttonHospitalStaff);
            mainFrame.add(labelFinancialDetails);
            mainFrame.add(buttonFinancialDetails);
            mainFrame.add(labelEquipmentInventory);
            mainFrame.add(buttonEquipmentInventory);
            mainFrame.add(labelHospitalConfiguration);
            mainFrame.add(buttonHospitalConfiguration);
            mainFrame.add(labelHospitalInformation);
            mainFrame.add(buttonHospitalInformation);
        });
        option2Button.addActionListener(e -> {
        	// create the main window
            JFrame mainFrame = new JFrame("Main Window");
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setLayout(new FlowLayout());

        	// create the "Patient Details" label and button
        	JLabel labelPatientDetails = new JLabel("Patient Details");
        	JButton buttonPatientDetails = new JButton("Open");

			// add the label and button to the main window
        	mainFrame.add(labelPatientDetails);
        	mainFrame.add(buttonPatientDetails);

        	// create the action listener for the "Patient Details" button
        	buttonPatientDetails.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        // code to open the "Patient Details" window
        	        JFrame frame = new JFrame("Patient Details");
        	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	        frame.setLayout(new GridLayout(5, 2));

        	        // create the "Patient's Medical Record" label and button
        	        JLabel labelMedicalRecord = new JLabel("Patient's Medical Record");
        	        JButton buttonMedicalRecord = new JButton("Open");
        	        frame.add(labelMedicalRecord);
        	        frame.add(buttonMedicalRecord);

        	        // create the "Patient Admission" label and button
        	        JLabel labelPatientAdmission = new JLabel("Patient Admission");
        	        JButton buttonPatientAdmission = new JButton("Open");
        	        frame.add(labelPatientAdmission);
        	        frame.add(buttonPatientAdmission);

        	        // create the "Patient Discharge" label and button
        	        JLabel labelPatientDischarge = new JLabel("Patient Discharge");
        	        JButton buttonPatientDischarge = new JButton("Open");
        	        frame.add(labelPatientDischarge);
        	        frame.add(buttonPatientDischarge);

        	        // create the "Patient Monitoring" label and button
        	        JLabel labelPatientMonitoring = new JLabel("Patient Monitoring");
        	        JButton buttonPatientMonitoring = new JButton("Open");
        	        frame.add(labelPatientMonitoring);
        	        frame.add(buttonPatientMonitoring);

        	        // create the "Patient Details" label and button
        	        JLabel labelPatientInfo = new JLabel("Patient Details");
        	        JButton buttonPatientInfo = new JButton("Open");
        	        frame.add(labelPatientInfo);
        	        frame.add(buttonPatientInfo);

        	        // add the action listeners for the buttons in the "Patient Details" window
        	        buttonMedicalRecord.addActionListener(new ActionListener() {
        	            public void actionPerformed(ActionEvent e) {
        	            	 // code to open the "Patient's Medical Record" window
	            	       	JFrame frameMedicalRecord = new JFrame("Patient's Medical Record");
	            	        frameMedicalRecord.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            	        frameMedicalRecord.setLayout(new GridLayout(3, 2));
	            	        
	            	        JLabel labelMedicalHistory = new JLabel("Medical History:");
	            	        JTextField textFieldMedicalHistory = new JTextField();
	            	        frameMedicalRecord.add(labelMedicalHistory);
	            	        frameMedicalRecord.add(textFieldMedicalHistory);
	            	        
	            	        JLabel labelTreatmentPlan = new JLabel("Treatment Plan:");
	            	        JTextField textFieldTreatmentPlan = new JTextField();
	            	        frameMedicalRecord.add(labelTreatmentPlan);
	            	        frameMedicalRecord.add(textFieldTreatmentPlan);
	            	        
	            	        JLabel labelMedicationPlan = new JLabel("Medication Plan:");
	            	        JTextField textFieldMedicationPlan = new JTextField();
	            	        frameMedicalRecord.add(labelMedicationPlan);
	            	        frameMedicalRecord.add(textFieldMedicationPlan);
	            	        
	            	        frameMedicalRecord.setSize(300, 300);
	            	        frameMedicalRecord.setVisible(true);
	            	    }

        	        });

        	        buttonPatientAdmission.addActionListener(new ActionListener() {
        	            public void actionPerformed(ActionEvent e) {
        	            	// code to open the "Patient Admission" window
        	                JFrame framePatientAdmission = new JFrame("Patient Admission Information");
        	                framePatientAdmission.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	                framePatientAdmission.setLayout(new GridLayout(3, 2));
        	                
        	                JLabel labelAdmissionDate = new JLabel("Admission Date (YYYY-MM-DD):");
        	                JTextField textFieldAdmissionDate = new JTextField();
        	                framePatientAdmission.add(labelAdmissionDate);
        	                framePatientAdmission.add(textFieldAdmissionDate);
        	                
        	                JLabel labelAdmissionReason = new JLabel("Admission Reason:");
        	                JTextField textFieldAdmissionReason = new JTextField();
        	                framePatientAdmission.add(labelAdmissionReason);
        	                framePatientAdmission.add(textFieldAdmissionReason);
        	                
        	                JLabel labelAdmissionInstructions = new JLabel("Admission Instructions:");
        	                JTextField textFieldAdmissionInstructions = new JTextField();
        	                framePatientAdmission.add(labelAdmissionInstructions);
        	                framePatientAdmission.add(textFieldAdmissionInstructions);
        	                
        	                framePatientAdmission.setSize(300, 300);
        	                framePatientAdmission.setVisible(true);
        	            }
        	        });

        	        buttonPatientDischarge.addActionListener(new ActionListener() {
        	            public void actionPerformed(ActionEvent e) {
        	            	// code to open the "Patient Discharge" window
        	                JFrame dischargeFrame = new JFrame("Patient Discharge");
        	                dischargeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	                dischargeFrame.setLayout(new GridLayout(3, 2));

        	                JLabel labelDischargeDate = new JLabel("Discharge Date (YYYY-MM-DD): ");
        	                JTextField dischargeDateField = new JTextField();
        	                dischargeFrame.add(labelDischargeDate);
        	                dischargeFrame.add(dischargeDateField);

        	                JLabel labelInstructions = new JLabel("Instructions: ");
        	                JTextField instructionsField = new JTextField();
        	                dischargeFrame.add(labelInstructions);
        	                dischargeFrame.add(instructionsField);

        	                dischargeFrame.pack();
        	                dischargeFrame.setVisible(true);	
        	            }
        	        });

        	        buttonPatientMonitoring.addActionListener(new ActionListener() {
        	            public void actionPerformed(ActionEvent e) {
        	            	 // code to open the "Patient Monitoring" window
        	                JFrame monitoringFrame = new JFrame("Patient Monitoring");
        	                monitoringFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	                monitoringFrame.setLayout(new GridLayout(3, 2));

        	                JLabel labelMedicationPlan = new JLabel("Medication Plan: ");
        	                JTextField medicationPlanField = new JTextField();
        	                monitoringFrame.add(labelMedicationPlan);
        	                monitoringFrame.add(medicationPlanField);

        	                JLabel labelTreatmentPlan = new JLabel("Treatment Plan: ");
        	                JTextField treatmentPlanField = new JTextField();
        	                monitoringFrame.add(labelTreatmentPlan);
        	                monitoringFrame.add(treatmentPlanField);

        	                monitoringFrame.pack();
        	                monitoringFrame.setVisible(true);	
        	            }
        	        });

        	        buttonPatientInfo.addActionListener(new ActionListener() {
        	            public void actionPerformed(ActionEvent e) {
        	            	// code to open the "Patient Info" window
        	                JFrame frame = new JFrame("Patient Info");
        	                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        	                frame.setLayout(new GridLayout(4, 2));
        	                
        	                // create the labels and text fields for the "Patient Info" window
        	                JLabel labelPatientName = new JLabel("Patient Name: ");
        	                JTextField textPatientName = new JTextField();
        	                frame.add(labelPatientName);
        	                frame.add(textPatientName);

        	                JLabel labelPatientID = new JLabel("Patient ID: ");
        	                JTextField textPatientID = new JTextField();
        	                frame.add(labelPatientID);
        	                frame.add(textPatientID);

        	                JLabel labelPatientAge = new JLabel("Patient Age: ");
        	                JTextField textPatientAge = new JTextField();
        	                frame.add(labelPatientAge);
        	                frame.add(textPatientAge);

        	                JLabel labelPatientGender = new JLabel("Patient Gender: ");
        	                JTextField textPatientGender = new JTextField();
        	                frame.add(labelPatientGender);
        	                frame.add(textPatientGender);

        	                frame.pack();
        	                frame.setVisible(true);
        	            }
        	        });
        	        frame.pack();
        	        frame.setVisible(true);
        	    }
        	});
        	
        	mainFrame.pack();
 	        mainFrame.setVisible(true);
        });
        option3Button.addActionListener(e -> {
        	 // create the main window
            JFrame mainFrame = new JFrame("Main Window");
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setLayout(new FlowLayout());

            // create the "Pharmacy Details" label and button
            JLabel labelPharmacyDetails = new JLabel("Pharmacy Details");
            JButton buttonPharmacyDetails = new JButton("Open");

            // add the label and button to the main window
            mainFrame.add(labelPharmacyDetails);
            mainFrame.add(buttonPharmacyDetails);

            buttonPharmacyDetails.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // code to open the "Pharmacy Details" window
                    JFrame frame = new JFrame("Pharmacy Details");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setLayout(new GridLayout(4, 2));

                    // create the "Working Hours" dropdown list
                    String[] workingHours = {"Monday - Friday 08:00 - 18:00", "Saturday, Sunday 10:00 - 17:00"};
                    JComboBox workingHoursList = new JComboBox(workingHours);
                    workingHoursList.setSelectedIndex(0);
                    frame.add(workingHoursList);
                    
                    workingHoursList.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            JComboBox cb = (JComboBox) e.getSource();
                            String workingHours = (String) cb.getSelectedItem();
                            // do something with the selected working hours
                        }
                    });
                    
                    //create the "Pharmacy Name" label and button
                    JLabel labelPharmacyName = new JLabel("Pharmacy Name");
                    JButton buttonPharmacyName = new JButton("Change");
                    frame.add(labelPharmacyName);
                    frame.add(buttonPharmacyName);

                    //create the "Pharmacy Location" label and button
                    JLabel labelPharmacyLocation = new JLabel("Pharmacy Location");
                    JButton buttonPharmacyLocation = new JButton("Change");
                    frame.add(labelPharmacyLocation);
                    frame.add(buttonPharmacyLocation);

                    //create the "Pharmacy Inventory" label and button
                    JLabel labelPharmacyInventory = new JLabel("Pharmacy Inventory");
                    JButton buttonPharmacyInventory = new JButton("Change");
                    frame.add(labelPharmacyInventory);
                    frame.add(buttonPharmacyInventory);

                    // add the action listeners for the buttons in the "Pharmacy Details" window
                    buttonPharmacyName.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            // code to open the "Change Pharmacy Name" window
                            JFrame changePharmacyNameFrame = new JFrame("Change Pharmacy Name");
                            changePharmacyNameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            changePharmacyNameFrame.setLayout(new GridLayout(1, 2));

                            JLabel labelChangePharmacyName = new JLabel("Change Pharmacy Name: ");
                            JTextField textChangePharmacyName = new JTextField();
                            changePharmacyNameFrame.add(labelChangePharmacyName);
                            changePharmacyNameFrame.add(textChangePharmacyName);
                            changePharmacyNameFrame.setSize(300, 100);
                            changePharmacyNameFrame.setVisible(true);
                        }
                    });

                    buttonPharmacyLocation.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            // code to open the "Change Pharmacy Location" window
                            JFrame changePharmacyLocationFrame = new JFrame("Change Pharmacy Location");
                            changePharmacyLocationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            changePharmacyLocationFrame.setLayout(new GridLayout(1, 2));

                            JLabel labelChangePharmacyLocation = new JLabel("Change Pharmacy Location: ");
                            JTextField textChangePharmacyLocation = new JTextField();
                            changePharmacyLocationFrame.add(labelChangePharmacyLocation);
                            changePharmacyLocationFrame.add(textChangePharmacyLocation);
                            changePharmacyLocationFrame.setSize(300, 100);
                            changePharmacyLocationFrame.setVisible(true);
                        }
                    });

                    buttonPharmacyInventory.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            // code to open the "Add to Inventory" window
                            JFrame addToInventoryFrame = new JFrame("Add to Inventory");
                            addToInventoryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            addToInventoryFrame.setLayout(new GridLayout(1, 2));

                            JLabel labelAddToInventory = new JLabel("Add to Inventory: ");
                            JTextField textAddToInventory = new JTextField();
                            addToInventoryFrame.add(labelAddToInventory);
                            addToInventoryFrame.add(textAddToInventory);
                            addToInventoryFrame.setSize(300, 100);
                            addToInventoryFrame.setVisible(true);
                        }
                    });
                    frame.setSize(500, 250);
                    frame.setVisible(true);
                }
            });
            mainFrame.setSize(300, 75);
            mainFrame.setVisible(true);
        });
        exitButton.addActionListener(e -> {
            System.exit(0);
        });

        frame.add(topLabel, BorderLayout.PAGE_START);
        frame.add(bottomLabel, BorderLayout.CENTER);

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.Y_AXIS));
        JPanel option1Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        option1Panel.add(option1Label);
        option1Panel.add(option1Button);
        optionsPanel.add(option1Panel);
        JPanel option2Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        option2Panel.add(option2Label);
        option2Panel.add(option2Button);
        optionsPanel.add(option2Panel);
        JPanel option3Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        option3Panel.add(option3Label);
        option3Panel.add(option3Button);
        optionsPanel.add(option3Panel);
        JPanel exitPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        exitPanel.add(exitButton);
        optionsPanel.add(exitPanel);
        frame.add(optionsPanel, BorderLayout.PAGE_END);

        frame.pack();
        frame.setVisible(true);
    }
    
 

}
