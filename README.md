# Vehicle Management System (VMS) User Manual
# Table of Contents
1.	Introduction
2.	System Requirements
3.	Installation
4.	Usage 
     o	User Roles
     o	Admin Functions
     o	Customer Functions
     o	Owner Functions
5.	Code Structure
6.	Troubleshooting
# 1. Introduction
The Vehicle Management System (VMS) is designed to streamline the buying and selling of vehicles, including cars and bikes. It provides distinct functionalities for administrators, customers, and vehicle owners, making vehicle transactions efficient and user-friendly.
# 2. System Requirements
•	Java Development Kit (JDK): Version 8 or higher
•	NetBeans IDE: Version 12 or higher
•	Operating System: Compatible with Windows, macOS, and Linux
# 3. Installation
# 1.	Download the Repository:
o	Clone the repository using git clone <repository-url> or download it as a ZIP file.
# 2.	Open NetBeans:
o	Launch NetBeans IDE.
# 3.	Import the Project:
o	Go to File > Open Project and select the project directory.
# 4.	Build the Project:
o	Right-click on the project name in the "Projects" window and select Build.
# 5.	Run the Project:
o	Right-click on the project name and select Run.
# 4. Usage
User Roles
# 1.	Admin:
o	Manages vehicle listings and user interactions.
# 2.	Customer:
o	Purchases vehicles and views available listings.
# 3.	Owner:
o	Registers vehicles for sale.
# Admin Functions
# •	Add Vehicle: 
o	Input vehicle details (make, model, type, price).
# •	Remove Vehicle: 
o	Select a vehicle from the list to remove.
# •	View Vehicles: 
o	List all vehicles currently available in the system.
# Customer Functions
# •	View Available Vehicles: 
o	Browse through the list of vehicles for sale.
# •	Purchase Vehicle: 
o	Select a vehicle and confirm the purchase.
# Owner Functions
# •	Register Vehicle: 
o	Input details to add a vehicle for sale.
# 5. Code Structure
•	Admin Class: Handles administrative tasks.
•	Customer Class: Manages customer interactions.
•	Owner Class: Manages vehicle registrations.
•	Vehicle Class: Abstract representation of a vehicle.
•	Car and Bike Classes: Specific implementations of the Vehicle class.
•	VehicleRegistry Class: Manages the collection of vehicles.
•	VehicleFactory Class: Creates instances of vehicles.
# 6. Troubleshooting
•	Issue: Application won't run.
o	Solution: Ensure JDK is installed and properly set up in NetBeans.
•	Issue: Error while adding a vehicle.
o	Solution: Check that all required fields are filled correctly.
•	Issue: Invalid input messages.
o	Solution: Follow the prompts carefully and ensure correct data types are used.

