package com.hospitalpatientmanagementlist;

import java.util.LinkedList;
import java.util.Scanner;

import com.hospitalpatientmanagementlist.entity.Patient;
import com.hospitalpatientmanagementlist.exception.ResultNotFound;

/**
 * Classe principal do sistema
 * 
 * @author Lauro.ribeiro
 *
 */
public class Main {
	private static LinkedList<Patient> patients = new LinkedList<Patient>();

	/**
	 * Method main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		clear();
		System.out.println("\n===WELCOME TO THE PROGRAM HOSPITAL PATIENT MANAGEMENT LIST===\n");
		readMenuOption();
	}

	/**
	 * Method to read menu options
	 */
	private static void readMenuOption() {
		while (true) {

			try {
				System.out.println("Please select an option below:\n\n\n");
				System.out.println("1 - Add a new patient");
				System.out.println("2 - View all patients in the list");
				System.out.println("3 - View patient position in the list");
				System.out.println("4 - Update patient  information");
				System.out.println("5 - Add patient to the top of the list");
				System.out.println("6 - Add patient in especific position into the list");
				System.out.println("7 - Delete patient");
				System.out.println("0 - Exit");
				Scanner scanner = getScanner();
				int option = scanner.nextInt();
				scanner.nextLine();
				switch (option) {
				case 1: {
					addNewPatient();
					break;
				}
				case 2: {
					viewAllPatientsList();
					break;
				}
				case 3: {
					viewPatientPositionList();
					break;
				}
				case 4: {
					updatePatientInformation();
					break;
				}
				case 5: {
					addNewPatientToTopList();
					break;
				}
				case 6: {
					addNewPatientToEspecificPositionList();
					break;
				}

				case 7: {
					deletePatient();
					break;
				}
				case 0: {
					System.exit(0);
				}

				default: {
					showMessageInvalideOption();
					break;
				}

				}
				System.out.println("\n\n\nPress enter to continue...");
				scanner.nextLine();
				clear();
			} catch (Exception e) {
				showMessageInvalideOption();
			}
		}
	}

	/**
	 * Method to show message Invalide option
	 */
	private static void showMessageInvalideOption() {
		System.out.println("\n\n\nInvalide option, try again!\n\n\n");
	}

	/**
	 * Delete patient
	 */
	private static void deletePatient() {
		try {
			Patient patient = getPatientById();
			patients.remove(patient);
			System.out.println("\n\n\nThe patient has been deleted with sucess!\n\n\n");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Method read PID Number
	 * 
	 * @return pIDNumber
	 */
	private static Integer readPatientPIDNumber() {
		while (true) {
			try {
				System.out.println("Informe the PID Number:");
				Scanner scanner = getScanner();
				Integer pIDNumber = scanner.nextInt();
				scanner.nextLine();
				return pIDNumber;
			} catch (Exception e) {
				System.out.println("Invalide PID Number! Please, try again.");
			}
		}

	}

	/**
	 * Add patient in especific position into the list
	 */
	private static void addNewPatientToEspecificPositionList() {

		try {
			Integer position = readPositionList();
			Integer pIDNumber = readPatientPIDNumber();

			Patient patient = readPatientInformation(new Patient(pIDNumber));

			patients.add(position, patient);

			ShowMessageCreateSucess();
		} catch (Exception e) {
			System.out.println("Invalide position! Please, try again.");
		}

	}

	/**
	 * Method to read list position
	 * 
	 * @return position
	 */
	private static Integer readPositionList() {
		while (true) {
			try {
				System.out.println("Informe the position:");
				Scanner scanner = getScanner();
				Integer position = scanner.nextInt();
				scanner.nextLine();
				Integer indexPosition = position - 1;
				if (indexPosition < 0 || indexPosition > patients.size()) {
					throw new IllegalArgumentException("Invalide position!");
				}
				return indexPosition;
			} catch (Exception e) {
				System.out.println("Invalide position! Please, try again.");
			}
		}
	}

	/**
	 * Method to show message created with sucess
	 */
	private static void ShowMessageCreateSucess() {
		System.out.println("\n\n\nThe patient has been created with sucess!\n\n\n");
	}

	/**
	 * Method to add patient to the top of the list
	 */
	private static void addNewPatientToTopList() {
		Integer pIDNumber = readPatientPIDNumber();

		Patient patient = readPatientInformation(new Patient(pIDNumber));

		patients.addFirst(patient);

		ShowMessageCreateSucess();
	}

	/**
	 * Method to update patient information
	 */
	private static void updatePatientInformation() {

		try {
			Patient patient = getPatientById();
			readPatientInformation(patient);
			System.out.println("\n\n\nThe patient has been updated with sucess!\n\n\n");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Method to view patient position in the list
	 */
	private static void viewPatientPositionList() {
		try {
			clear();
			Patient patient = getPatientById();
			printPatient(patient);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Method to Get patient information by Id
	 * 
	 * @return patient
	 * @throws Exception
	 */
	private static Patient getPatientById() throws Exception {
		Integer pIDNumber = readPatientPIDNumber();
		return getPatientById(pIDNumber);
	}

	/**
	 * Get patient by Id
	 * 
	 * @param pIDNumber
	 * @return patient
	 * @throws ResultNotFound
	 */
	private static Patient getPatientById(Integer pIDNumber) throws ResultNotFound {
		return patients.stream().filter(p -> p.getPIDNumber().equals(pIDNumber)).findFirst()
				.orElseThrow(() -> new ResultNotFound("Patient PID Number:" + pIDNumber + " not found"));
	}

	/**
	 * Method to view all patients in the list
	 */
	private static void viewAllPatientsList() {
		if (patients.isEmpty()) {
			System.out.println("The list is empty");
			return;
		}
		clear();
		patients.forEach(p -> {
			printPatient(p);
		});

	}

	/**
	 * Method to print patient information
	 * 
	 * @param patient
	 */
	private static void printPatient(Patient patient) {
		int index = patients.indexOf(patient);
		int position = index + 1;
		System.out.println("Position:" + position);
		System.out.println(patient);
	}

	/**
	 * Method to add new patient
	 */
	private static void addNewPatient() {
		Integer pIDNumber = readPatientPIDNumber();
		if (!existPatient(pIDNumber)) {
			Patient patient = readPatientInformation(new Patient(pIDNumber));

			patients.add(patient);

			ShowMessageCreateSucess();
		} else {
			System.out.println("The PID Number " + pIDNumber + " already exist in the list");
		}

	}

	/**
	 * Method to verify if PID Number already exist int the list
	 * 
	 * @param pIDNumber
	 * @return boolean
	 */
	private static boolean existPatient(Integer pIDNumber) {
		try {
			getPatientById(pIDNumber);
			return true;
		} catch (ResultNotFound e) {
			return false;
		}
	}

	/**
	 * Method to read patient information(firstName, lastName, mobileNumber,
	 * email, city)
	 * 
	 * @param patient
	 * @return patient
	 */
	private static Patient readPatientInformation(Patient patient) {

		System.out.println("Informe the first name:");
		Scanner scanner = getScanner();
		String firstName = scanner.nextLine();
		patient.setFirstName(firstName);

		System.out.println("Informe the last name:");
		String lastName = scanner.nextLine();
		patient.setLastName(lastName);

		System.out.println("Informe the mobile number");
		String mobileNumber = scanner.nextLine();
		patient.setMobileNumber(mobileNumber);

		System.out.println("Informe the email:");
		String email = scanner.nextLine();
		patient.setEmail(email);

		System.out.println("Informe the city:");
		String city = scanner.nextLine();
		patient.setCity(city);

		return patient;

	}

	/**
	 * Method to clear screen
	 */
	public static void clear() {
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	/**
	 * Method return new instance of Scanner
	 * 
	 * @return scanner
	 */
	private static Scanner getScanner() {
		return new Scanner(System.in);
	}

}
