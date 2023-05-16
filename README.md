# E-BookingTheaterSeats
  E-RezervareTeatru is a Java desktop application designed to simulate in a simple way a ticket office of a theater. Swing and Awt were used for designing the GUI of the application. All data from user is stored in files.
  
  The application shows initially a list of all available spectacles that can be attended.
  
![image](https://github.com/cristinazaharia/e-rezervare-teatru/assets/78911746/5fc6779f-afdd-4917-8d29-4e74cf3cccf1)

  The user chooses a spectacle and then another window is open where details about the chosen spectacle are being shown: the name of the spectacle, the schedule of the spectacle(date and time): here the user is asked to choose a certain date(or more) and also to introduce the numer of reservations that they want, they are then asked to choose a seat(or more in case the number of reservations is greater than one). After the user filled in with all the required data, they can view the price of the ticket by clicking the button "Calculeaza cost". If they are satisfied with their options and the price, they can move on by clicking the button 'Confirma".
 
 ![image](https://github.com/cristinazaharia/e-rezervare-teatru/assets/78911746/655bebac-a61e-4a86-a909-4a920ef6880c)

Depending on the number of reservations that were made, the system will show a message to notify the user that a subscription was made(this only happens if the user chose to attend more than one spectacles). In our case, the user chose to attend two spectacles, hence they will be notified:
 
 ![image](https://github.com/cristinazaharia/e-rezervare-teatru/assets/78911746/13e1123d-f17c-4569-a52b-9a1f2670aa2d)
 
 Then the user is asked to confirm the reservation and introduce their first name and last name, phone number and the value of the money they want to pay after the system showed the price of the ticket. If the value they introduced is less than the price of the ticket then they will be asked again to introduce a correct value or to cancel. In case the value they introduced is greater than the price of the ticket, they will receive a rest.
 
 ![image](https://github.com/cristinazaharia/e-rezervare-teatru/assets/78911746/2faddda5-aeb8-4ad1-8dc2-6fe7f4637066)
 
 After the user confirms, a ticket is generated with all details of the spectacles:

![image](https://github.com/cristinazaharia/e-rezervare-teatru/assets/78911746/625922a0-62fe-4299-b572-b8be28d62bcc)

The user can choose to print or not the ticket. In case they choose to print the ticket, a new window that contains the printing informations is shown as follows:
 
 ![image](https://github.com/cristinazaharia/e-rezervare-teatru/assets/78911746/52179df5-07f3-4c58-9703-6c3d822be56a)
 
 Otherwise, the system will open a window where the rest of the money is shown(if it exists) and a button that will redirect the user to the list of spectacles in case they want to make a new reservation.
 
 ![image](https://github.com/cristinazaharia/e-rezervare-teatru/assets/78911746/864133c9-9e7e-4efd-8544-5779c871c0cf)


