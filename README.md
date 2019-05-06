# Assignment Introduction
A Hospital patient management authority has contacted you outlining that they currently do not have<br>
an automated method of processing patients, who is next in line to be seen by a consultant doctor in a 
hospital. As the hospital is very busy, sometimes people take a ticket, leave and then come back later
to see if it is their time to be seen by the doctor. Other times emergency cases also appear, that need
to jump into the middle of the list of patients to be seen, as they are in a more critical position. <br>
Design and implement a command line application that allows the receptionist of the hospital to add
new patents to a list, check the position of a current person by name in the list, and add or remove
people from the list at different positions. <br>
Must use a Linked List data structure to store the data of patients. <br>

# Specific Requirements
+ This assignment is focused upon the application of a Linked List data storage solution. <br>
+ A simple command line interface should be created, which will allow a staff member to add a new
patent into the list. When a new patient is added into the system, they will be required to add their
pps number, first name, last name, mobile number, email_id and city. When the patient is added,
after their information is collected, they should be added as a new object to the end of the Linked
List. <br>
+ At any time, the staff member/ nurse should have the ability to see what position in the linked list
a patient is, by typing in a unique PID number (Patient identification number) that is given to the
patient when they register in the system. <br>
+ A function should exist to select a position in the linked list, e.g., position 4, and put a new patient
into that position. The patient who was at position 4, should then be pushed to position 5 and so
on for each different patient. <br>
+ If a patient comes into the hospital who is very sick, they should be given the very first position in
the linked list. The patient who was originally number 1, should then be moved to position 2. <br>
+ At any time, the staff member should have the ability to delete a patient from the system by
entering in their unique PID number. If the patient is removed from the linked it, their object should
be removed and whoever was in front of them should be jointed to the person who was behind
them. <br>
+ For each of the operations which are being performed on the list, individual methods should be
created to encapsulate the functionality.
+ A method should exist to cut off the last N number of records from the linked list. If the staff
member types in 3. Then the last 3 objects on the linked list should be removed. <br>
+ Given a patient PID number, the staff member should be able to update the information for that
person, without impacting where they currently are in the list. <br>

