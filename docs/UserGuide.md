---
layout: page
title: User Guide
---

Contact nUS is a **desktop app that NUS computing students can use to track their modules and schedules.**
It is optimized for use via typing with a Command Line Interface (CLI) rather than clicking which is 
usually associated with a Graphical User Interface (GUI). However, it provides benefits of both interfaces.
NUS computing students can be considered tech-savvy individuals who are also generally fast typists. As such, 
they stand to gain from the productivity boost that Contact nUS has to offer. 

This guide serves to help NUS computing students familiarise themselves with the use of Contact nUS. 

--------------------------------------------------------------------------------------------------------------------

## Table of Contents

* [**Before you read**](#before-you-read)
* [**How to use this user guide**](#how-to-use-the-user-guide)
* [**Quick start**](#quick-start)
* [**User interface**](#user-interface)
* [**Definitions**](#definitions)
* [**Features**](#features)
  * [Modules](#modules)
    * [Adding a module: `add`](#adding-a-module--add)
    * [Editing a module: `edit`](#editing-a-module--edit)
    * [Listing all modules: `list`](#listing-all-modules--list)
    * [Finding a module: `find`](#finding-a-module--find)
    * [Deleting a module: `delete`](#deleting-a-module--delete)
  * [Schedules](#schedules)
    * [Reminder for modules](#reminder-for-items)
    * [Sorting modules by time: `sort`](#sorting-the-modules--sort)
  * [Miscellaneous](#miscellaneous)
    * [Viewing help: `help`](#viewing-help--help)
    * [Clearing all modules: `clear`](#clearing-all-modules--clear)
    * [Exiting Contact nUS: `exit`](#exits-the-module-tracker--exit)
* [**Valid and invalid data**](#valid-and-invalid-data)
* [**Data storage**](#data-storage)
  * [**Saving the data**](#saving-the-data)
  * [**Editing the data file**](#editing-the-data-file)
* [**Glossary**](#glossary)
* [**FAQ**](#faq)
* [**Command summary**](#command-summary)
--------------------------------------------------------------------------------------------------------------------
## Before you read

This user guide aims to provide a brief overview of what `Contact nUS` is and the features it has. 
This user guide is mainly targeted for first-time users who are new to `Contact nUS` for their daily usage, but 
experienced users are welcome to use this for reference.
<br>

In the user guide, you can find instructions for [setting up your very own Contact nUS](#quick-start), 
[a guide to use a particular feature](#features). You may also refer to some sample valid and invalid data to see 
what type of data you can key into the software. 
<br>

Alternatively, you may use this user guide as a [quick reference](#command-summary) for all the commands 
the software has. 
<br>

Are you new to `Contact nUS`, or is this your first time reading the user guide? You are encouraged to read further 
to find out how to use this user guide!

--------------------------------------------------------------------------------------------------------------------
## How to use the user guide

Some text here

--------------------------------------------------------------------------------------------------------------------
## Quick start

1. Ensure you have Java `11` or above installed in your Computer. To check if you have Java `11`,
open up the `terminal` application (for both Windows and macOS users) and type in the command `java -version` and 
press enter. You should see `java version 11` with additional numbers at the back. 

2. Download the latest `Contact nUS.jar` from [here](https://github.com/AY2223S2-CS2103T-W10-1/tp/releases). 

3. Copy the file to the folder you want to use as the _home folder_ for your module tracker. 
This can be `Desktop` for example.

4. Again, open up the `terminal` application. You should be in a directory. If you are not in the folder
that you have `Contact nUS.jar` downloaded to, you can use the command `cd` to move into that folder.
An example would be `cd Desktop`.

5. Now that you are in the same folder as `Contact nUS.jar`, type in the command `java -jar Contact nUS.jar` to run 
the application.

<br> A screen similar to the one below should appear in a few seconds. Note how there are 
already some sample data included.<br>

![Ui](images/Ui.png)

6. You should see a command box. You can now type commands into it and start using Contact nUS! 

   A brief introduction of the commands List of commands available:
   
   * `list` : Shows all the modules. 
   
   * `add` : Adds a new module. 

   * `delete` : Deletes a module.

   * `edit` : Edits a module. 

   * `find` : Finds a module based on its description. 

   * `sort` : Sorts the modules based on the timeslot or deadline of the module.

   * `clear` : Clears all the modules in the list. Do this only if you are sure!

   * `exit` : Exits the application.


7. Refer to the [Features](#features) below for further details of each command.

8. To understand the interface of Contact nUS, read the [next section](#user-interface).

--------------------------------------------------------------------------------------------------------------------
## User interface

When starting the module tracker for the first time, you will be greeted with a screen similar to the one below.

![Ui](images/User_Interface.png)
--------------------------------------------------------------------------------------------------------------------

## Definitions

<div markdown="block" class="alert alert-info">

**:information_source: Notes about the command format:**<br>

* Words in `UPPER_CASE` are the parameters to be supplied by the user.<br>
    * e.g. in `add n/MODULE_NAME`, `MODULE_NAME` is a parameter which can be used as `add n/CS1231S`.

* Words in `UPPER_CASE` are usually in *string* format, except for `TIMESLOT` and `DEADLINE`, which are both in 
DateTime format, **ddMMyyyy HH:mm**.

* Items in square brackets are optional.<br>
    * e.g `n/MODULE_NAME [t/TAG]` can be used as `n/CS1010S t/Can attend online :)` or as `n/CS1010S`.

* Items with `…`​ after them can be used multiple times including zero times.<br>
  * e.g. `[t/TAG]…​` can be used as ` ` (i.e. 0 times), `t/Lecture`, `t/Lecture t/Lab` etc.

* Parameters can be in any order.<br>
* e.g. if the command specifies `n/MODULE_NAME t/TAG`, `t/TAG n/MODULE_NAME` is also acceptable.

* If a parameter is expected only once in the command, but you specified it multiple times, only the last occurrence 
of the parameter will be taken.<br>
  * e.g. if you specify `e/280323 10:00 e/290323 12:00`, only `e/290323 12:00` will be taken.

<!-- * Extraneous parameters for commands that do not take in parameters (such as `help`, `list`, `exit` and `clear`)
will be ignored.<br>
  * e.g. if the command specifies `help 123`, it will be interpreted as `help`. -->

* **MODULE_NAME** is the name of the module to be added into the module tracker.

* **TAG** represents the type of event associated to the module you want to track.
  * For example, it can be Lecture, Tutorial, Lab, Quiz, Oral Presentation, Exam, etc.

* **TIMESLOT** represents when the event takes place.

* **VENUE** is the location of the classroom or auditorium the class is held.

* **TEACHER** is the name of the lecturer or TA conducting the class.

* **DEADLINE** contain the details of a task with deadline.

* **REMARK** are additional details about the class you want to add.

* **RESOURCE** can be the module website on Canvas, or any other external links.

--------------------------------------------------------------------------------------------------------------------
</div>

## Features

## Modules

The following commands deal with handling the details of a module in Contact nUS. You can use them to:
* [Add a module](#adding-a-module--add)
* [Edit a module](#editing-a-module--edit)
* [List all modules](#listing-all-modules--list)
* [Find a specific module](#finding-a-module--find)
* [Delete a module](#deleting-a-module--delete)
<br>

### Adding a module: `add`

Adds a new module to the module tracker.

Format: `add n/MODULE_NAME t/TAG [e/TIMESLOT] [a/VENUE] [s/TEACHER] [d/DEADLINE] [r/REMARK] [c/RESOURCE]`

<div markdown="span" class="alert alert-primary">:bulb: **Tip:**
A module can have any number of tags (including 0)
</div>

Examples:
* `add n/CS2103T t/Lecture`
* `add n/CS1101S t/Tutorial e/Monday 10:00 12:00 a/COM1-0217 s/Sam Wan`
* `add n/CS2030S t/Lab a/COM1-B112 d/04042023 23:59 r/Attendance not compulsory :)`


### Editing a module: `edit`

Edits the details of an existing module in the module tracker.

Format: `edit INDEX [n/MODULE_NAME] [t/TAG] [e/TIMESLOT] [a/VENUE] [s/TEACHER] [d/DEADLINE] [r/REMARK] [c/RESOURCE]`

* Edits the items at the specified INDEX. The index refers to the index number shown in the displayed module list.
  The index must be a positive integer 1, 2, 3, …​
* At least one of the optional fields must be provided.
* Existing values will be updated to the input values.
* When editing the fields, the existing fields of the module will be removed i.e adding of fields is not cumulative.

Examples:
* `edit 1 n/CS2101 t/Tutorial` Edits the module name, item type and date of the 1st item to be `CS2101` and `Tutorial`
  respectively.
* `edit 2 a/COM3-B110 s/Professor Franklin Stein r/Funny lecturer haha` Edits the venue, teacher and remark of the 2nd
  item to be `COM3-B110`, `Professor Franklin Stein` and `Funny lecturer haha` respectively.
* `edit 5 n/CS1231S d/02042023 23:59` Edits the module name and deadline of the 5th item to be `CS1231S`
  and `02042023 23:59` respectively.

### Listing all modules: `list`

Displays a list of all the modules you have added into the module tracker.

Format: `list`

### Finding a module: `find`

Finds module(s) from the existing modules you have added, whose names match any of the given keywords.

Format: `find KEYWORD`

* The KEYWORD refers to the `MODULE_NAME` or `TAG` name such as CS2103T or tutorial.
* The search is case-insensitive. e.g `CS` will match `cs`
* Only the `MODULE_NAME` and `TAG` are searched.
* Modules matching at least one keyword will be returned (i.e. `OR` search).
  e.g. `CS2103T tutorial` will return the CS2103T module and tutorials in the module tracker

Examples:
* `find CS2103T` finds all instances where there is a module named CS2103T in the list.
* `find tutorial` finds all instances of tutorials in the list.
* `find CS` finds all instances where there is a module name that contains CS in the list.
* `find t` finds all instances where there is the letter t in the `MODULE_NAME` or `TAG`.

### Deleting a module: `delete`

Deletes the module you specified from the module tracker.

Format: `delete INDEX`

* Deletes the module at the specified `INDEX`.
* The index refers to the index number shown in the displayed module list.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
*  `delete 2` deletes the 2nd module in the module tracker.
<br>

## Schedules
The following features deal with the time slot and/or deadline of a module in the module tracker. You can use them to: 
* [View reminders for items you have today](#reminder-for-items)
* [Sort the modules by time slot or deadline](#sorting-the-modules--sort)

### Reminder for items

Shows all the deadlines and timeslots you have today

* You don't have to type anything, whenever the application launches it will tell you this information.
* it will only look at time slots and deadlines.

![image](https://user-images.githubusercontent.com/82088609/227960147-f26fae28-c2e7-44bf-bea1-a3d68a3539b5.png)

### Sorting the modules: `sort`

Sorts the existing modules by either time slot or deadline.

Format: `sort timeslot` or `sort deadline`
<br>

## Miscellaneous 

The following commands are additional quality-of-life features that you may be interested to use in `Contact nUS`. 
They are able to:
* [View help on using the software](#viewing-help--help)
* [Clear all existing modules from the software](#clearing-all-modules--clear)
* [Exit the module tracker](#exits-the-module-tracker--exit)

### Viewing help : `help`

Shows a message explaining how to access the help page.

Format: `help`

![help message](images/helpMessage.png)

### Clearing all modules: `clear`

Clears all existing modules from the software.

Format: `clear`

<!--Include warning-->

### Exits the module tracker: `exit`

Exits the software.

Format: `exit`
<br>

--------------------------------------------------------------------------------------------------------------------


## Valid and invalid data

Some sample data here.


--------------------------------------------------------------------------------------------------------------------


## Data Storage

This section describes [how the data in the module tracker is saved](#saving-the-data), as well as 
[how to edit the data from the data file itself](#editing-the-data-file).

### Saving the data

Contact nUS data are saved in the hard disk automatically after any command that changes the data. There is no need to 
save manually.

### Editing the data file

ModuleTracker data are saved as a JSON file `[JAR file location]/data/moduletracker.json`. Advanced users are welcome to 
update data directly by editing that data file.

<div markdown="span" class="alert alert-warning">:exclamation: **Caution:**
If your changes to the data file makes its format invalid, Contact nUS will discard all data and start with an empty 
data file at the next run.
</div> 

 --------------------------------------------------------------------------------------------------------------------
## Glossary

Some text here

--------------------------------------------------------------------------------------------------------------------

## FAQ

**Q**: How do I transfer my data to another computer? <br>
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains 
the data of your previous Contact nUS home folder.

--------------------------------------------------------------------------------------------------------------------
 
## Command summary

| Action     | Format, Examples                                                                                                                                                                                                                                                             |
|------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **add**    | `n/MODULE_NAME t/TAG… [e/TIMESLOT] [a/VENUE] [s/TEACHER] [d/DEADLINE] [r/REMARK] [c/RESOURCE]​` <br> e.g., `add n/CS2103T t/Lecture e/Friday 12:00 14:00 a/i3-AUD s/Professor Damith d/07042023 13:59 r/Can attend online! c/https://nus-cs2103-ay2223s2.github.io/website/` |
| **delete** | `delete INDEX`<br> e.g., `delete 3`                                                                                                                                                                                                                                          |
| **edit**   | `edit INDEX [n/MODULE_NAME] [t/TAG]… [e/TIMESLOT] [a/VENUE] [s/TEACHER] [d/DEADLINE] [r/REMARK] [c/RESOURCE] ​`<br> e.g.,`edit 2 s/Low Mai Khye r/Funny TA`                                                                                                                  |
| **sort**   | `sort timeslot` or `sort deadline​`                                                                                                                                                                                                                                          |
| **list**   | `list`                                                                                                                                                                                                                                                                       |
| **find**   | `find KEYWORD`<br> e.g., `find CS`                                                                                                                                                                                                                                           |
| **clear**  | `clear`                                                                                                                                                                                                                                                                      |
| **help**   | `help`                                                                                                                                                                                                                                                                       |
| **exit**   | `exit`                                                                                                                                                                                                                                                                       |


