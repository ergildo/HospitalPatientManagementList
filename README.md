# HospitalPatientManagementList

## Assignment Introduction
A Hospital patient management authority has contacted you outlining that they currently do not have
an automated method of processing patients, who is next in line to be seen by a consultant doctor in a
hospital. As the hospital is very busy, sometimes people take a ticket, leave and then come back later
to see if it is their time to be seen by the doctor. Other times emergency cases also appear, that need
to jump into the middle of the list of patients to be seen, as they are in a more critical position.
Design and implement a command line application that allows the receptionist of the hospital to add
new patents to a list, check the position of a current person by name in the list, and add or remove
people from the list at different positions.
Must use a Linked List data structure to store the data of patients.
Specific Requirements
• This assignment is focused upon the application of a Linked List data storage solution.
• A simple command line interface should be created, which will allow a staff member to add a new
patent into the list. When a new patient is added into the system, they will be required to add their
pps number, first name, last name, mobile number, email_id and city. When the patient is added,
after their information is collected, they should be added as a new object to the end of the Linked
List.
• At any time, the staff member/ nurse should have the ability to see what position in the linked list
a patient is, by typing in a unique PID number (Patient identification number) that is given to the
patient when they register in the system.
• A function should exist to select a position in the linked list, e.g., position 4, and put a new patient
into that position. The patient who was at position 4, should then be pushed to position 5 and so
on for each different patient.
Module Name Here Page 2 of 3
• If a patient comes into the hospital who is very sick, they should be given the very first position in
the linked list. The patient who was originally number 1, should then be moved to position 2.
• At any time, the staff member should have the ability to delete a patient from the system by
entering in their unique PID number. If the patient is removed from the linked it, their object should
be removed and whoever was in front of them should be jointed to the person who was behind
them.
• For each of the operations which are being performed on the list, individual methods should be
created to encapsulate the functionality.
• A method should exist to cut off the last N number of records from the linked list. If the staff
member types in 3. Then the last 3 objects on the linked list should be removed.
• Given a patient PID number, the staff member should be able to update the information for that
person, without impacting where they currently are in the list.
Notes
• All code must be your own, and not taken off the internet or from a friend.
• All code should be documented, outlining what each function is doing.
Deliverables
• Source code for your application, upload it on the Moodle
Module Name Here Page 3 of 3
Marking Scheme Summary
Description Weighting
1- Can check to see what number in a linked list a patient currently
is.
10
2- Can add a new patient to end the of the linked list 10
3- A method should exist to insert a position into a specific position
into the linked list.
10
4- A patient can be deleted from the linked list, connecting the
person who was in front of them to the person who was behind
them.
10
5- A patient can be added to the top of the linked list, moving the
first person who was there to the second position in the list.
10
6- Individual methods exist for each of the functionality available to
the linked list, encapsulating the process.
10
7- Ability to delete N number of records from the end of the linked
list.
10
8- Can update information for a single patient, without impacting
their position in the list.

