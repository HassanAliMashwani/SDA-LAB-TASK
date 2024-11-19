<div align= "center">

 # SDA-LAB-TASK

</div>

# MIDS LAB TASK
# Hostel System Management

This project implements a hostel management system using design patterns such as **Pipe & Filter** and **Observer**. The system processes a list of students based on certain criteria like eligibility, payment, and service preferences, and sends notifications to students about their hostel allotment status.

## Features

- **Eligibility Filter**: Filters students based on age (18-25) and special needs.
- **Payment Filter**: Ensures the student has paid or has outstanding fees below a threshold.
- **Service Availability Filter**: Checks if students are eligible for their preferred services (e.g., AC, Single Room).
- **Observer Pattern**: Sends notifications to students once they pass all filters and are allotted a hostel room.
- **Student Processing**: Each student is processed through the filters, and their allotment status is displayed.

## Architecture

This project is built using the following design patterns:

- **Pipe and Filter Pattern**: 
  - The filters (`EligibilityFilter`, `PaymentFilter`, `ServicesAvailabilityFilter`) process data in sequence.
  
- **Observer Pattern**: 
  - The `EmailNotifier` class notifies students after the hostel processing.

### Class Diagram

The above class diagram represents the relationships between the key components of the system:




