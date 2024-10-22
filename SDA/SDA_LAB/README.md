<div align="center">

# SDA-LAB-TASK

</div>

## LAB TASK 

### Observer Pattern Project

## Overview

This project implements the Observer design pattern in two parts:

1. **Basic Observer Pattern**: An implementation based on a tutorial from tutorialpoint.com, which allows observers to be notified of changes in the subject's state.
2. **Event Management System**: An extension of the Observer pattern from refactoring.guru, including an SMS notification feature that checks the length of messages before sending.

## Project Structure
├── sda_lab/<br>
│   ├── Subject.java<br>
│   ├── Observer.java<br>
│   ├── BinaryObserver.java<br>
│   ├── OctalObserver.java<br>
│   ├── HexaObserver.java<br>
│   └── ObserverPatternDemo.java<br>
│<br>
└── observer.eventsmanagement/<br>
    ├── EventManager.java<br>
    ├── Editor.java<br>
    ├── EventListener.java<br>
    ├── EmailNotificationListener.java<br>
    ├── LogOpenListener.java<br>
    ├── SMSSupportListener.java<br>
    └── Demo.java
## Part 1: Basic Observer Pattern

### Description

This part of the project demonstrates the Observer Pattern where a `Subject` maintains a list of observers. Observers can attach and detach themselves from the subject, and only active observers are notified when the subject's state changes.

### Key Classes

- **Subject**: Maintains a list of observers and notifies them of state changes.
- **Observer**: Abstract class defining the update method.
- **BinaryObserver, OctalObserver, HexaObserver**: Concrete observers that display the state in different numeral systems.
- **ObserverPatternDemo**: Demonstrates the functionality of the observer pattern.

### Usage

To see the pattern in action, run the `ObserverPatternDemo` class. It will create a `Subject`, attach several observers, change the state, and demonstrate that only the attached observers are notified.

## Part 2: Event Management System

### Description

This part of the project incorporates an event management system that allows for the notification of various events such as file operations. It also includes the `SMSSupportListener`, which checks the length of the SMS message before sending it.

### Key Classes

- **EventManager**: Manages event subscriptions and notifications.
- **Editor**: Represents a subject that notifies listeners about file operations.
- **EventListener**: Interface for listeners to implement their update method.
- **EmailNotificationListener**: Sends email notifications for file operations.
- **LogOpenListener**: Logs file operations to a specified file.
- **SMSSupportListener**: Sends SMS notifications and checks for message length.

### Usage

Run the `Demo` class in the `observer.eventsmanagement` package. It demonstrates opening and saving a file while notifying the subscribed listeners.

## Adding New Features

To add more event types or listeners, simply create new classes that implement the `EventListener` interface and subscribe them through the `EventManager`.

