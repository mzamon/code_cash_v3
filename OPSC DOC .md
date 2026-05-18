IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Programming 3C / Open Source Coding (Introduction) 

PROG7313/w / OPSC6311/w / OPSC7311 

Module Outline 2026 

(First Edition: 2025) 

This document enjoys copyright under the Berne Convention. In terms of the Copyright Act, no 

98 of 1978, no part of this document may be reproduced or transmitted in any form or by any 

means, electronic or mechanical, including photocopying, recording or by any other 

information storage and retrieval system without permission in writing from the proprietor. 

The Independent Institute of Education (Pty) Ltd is registered with the 

Department of Higher Education and Training as a private higher education 

institution under the Higher Education Act, 1997 (reg. no. 2007/HE07/002). 

Company registration number: 1987/004754/07. 

© The Independent Institute of Education (Pty) Ltd 2026  

Page 1 of 24 

IIE Module Outline       OPSC6311/w/PROG7313/w/OPSC7311 

© The Independent Institute of Education (Pty) Ltd 2026  Page 2 of 24 

Table of Contents 

&#x20;

Introduction ............................................................................................................................... 3 

Using this Module Outline .......................................................................................................... 4 

Module Resources ...................................................................................................................... 5 

This Module on Arc .................................................................................................................... 6 

Module Purpose ......................................................................................................................... 7 

Module Outcomes ...................................................................................................................... 7 

Assessments - PROG7313 / OPSC7311 / OPSC6311 ................................................................... 8 

Module Pacer ........................................................................................................................... 10 

Glossary of Key Terms for this Module .................................................................................... 24 

&#x20;

&#x20; 

IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Introduction 

Welcome to Programming 3C. In this module, we will be focusing on developing native apps 

for the Android Operating System (OS). We will make use of the Kotlin programming language. 

In 2024, the Android OS will have a market share of 71.69% of mobile devices (GlobalStats., 

2024). This means that the apps that we learn to develop, will be able to run on most mobile 

devices out there right now. 

In your previous programming modules, you would have already learned object-oriented 

programming in Java or C#. Although the syntax of Kotlin is slightly different, you will find the 

concepts quite familiar. 

Throughout this module, you will create several apps to master all the basic skills needed to 

build an Android app. It is important to get hands-on experience in any programming module, 

so it is essential that you complete all the activities provided on Arc. 

We hope you will enjoy the module and take the opportunity to use the knowledge and 

experience gained in both future modules, and in your career. 

Reference 

GlobalStats, 2024. Mobile Operating System Market Share Worldwide July 2023 - July 2024. 

\[online] 

Available 

at: 

\[Accessed 08 August 2024]. 

https://gs.statcounter.com/os-market-share/mobile/worldwide/  

© The Independent Institute of Education (Pty) Ltd 2026  

Page 3 of 24 

IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Using this Module Outline 

A Module Outline is a summary of the module and is given to you to support your learning.  

The content of this module is on Arc as well as in the prescribed material. You will not 

succeed in this module if you focus on this document alone. 

To succeed in this module, you will need to: - - - 

Attend lectures/ online sessions;  

Go through the material and activities on Arc;  

Read the prescribed material. 

Your lecturer will decide when activities are available/open for submission and when these 

submissions or contributions are due. Ensure that you take note of announcements made 

during lectures and/or posted in the Student Portal and within Arc in this regard. - 

Your campus will provide you with details about when your assessments are due. 

© The Independent Institute of Education (Pty) Ltd 2026  

Page 4 of 24 

IIE Module Outline       OPSC6311/w/PROG7313/w/OPSC7311 

© The Independent Institute of Education (Pty) Ltd 2026  Page 5 of 24 

Module Resources 

Prescribed Material (PM) for 

this Module 

Programming 3C Module Manual \[PM1] 

GitHub source code repository for the module \[PM2] 

https://github.com/iie-PROG7313 

\[Accessed 25 September 2024]. 

Kotlin Documentation \[PM3] 

https://kotlinlang.org/docs/home.html 

\[Accessed 25 September 2024]. 

Recommended Readings, 

Digital, and Web Resources 

(RM) 

Please note that several additional resources and links to 

resources are provided throughout this module on the Arc 

platform. You are encouraged to engage with these as they 

will assist you in mastering the various objectives of this 

module. They may also be useful resources for completing 

assessments. 

&#x20;

RM1: Karanpuria, R. and Roy, A.S. (2018) Kotlin 

Programming Cookbook: Explore More Than 100 Recipes 

That Show How to Build Robust Mobile and Web 

Applications with Kotlin, Spring Boot, and Android. 

Birmingham, UK: Packt Publishing. Available at: 

https://search-ebscohost

com.ezproxy.iielearn.ac.za/login.aspx?direct=true\& 

db=e000xww\&AN=1699229\&site=ehost-live\&scope=site 

\[Accessed 20 August 2024]. 

Software required  Latest Version of Android Studio (with the Android 14 SDK 

installed)  

Software Licence 

requirements 

Open Source – Download the latest version of Android 

Studio from: h ps://developer.android.com/studio 

\[Accessed 20 August 2024].  

System Requirements • Microsoft Windows 10 (64-bit)  

• 8 GB RAM recommended (plus 1 GB for the Android 

Emulator)  

• 8 GB of available disk space minimum  

• 1280 x 800 minimum screen resolution  

Lab minimum requirements Same as above.  

Lab configuration settings Same as above. 

Module Overview You will find an overview of this module on Arc under the 

Module Information link. 

Assessments  Find more information on this module’s assessments in this 

document and on the Student Portal. 

IIE Module Outline       OPSC6311/w/PROG7313/w/OPSC7311 

© The Independent Institute of Education (Pty) Ltd 2026  Page 6 of 24 

&#x20;

This Module on Arc 

&#x20;

Arc is an online space designed to support and maximise your learning in an active manner. Its 

main purpose is to guide and pace you through the module. In addition to the information 

provided in this document, you will find the following when you access Arc: 

&#x20;

 A module overview; 

 A list of prescribed material; 

 Critical questions to guide you through the module’s objectives; 

 A variety of additional online resources (articles, videos, audio, interactive graphics, etc.) 

in each learning unit that will further help to explain theoretical concepts; 

 Collaborative and individual activities with time-on-task estimates to assist you in 

managing your time around these; 

 Revision questions, or references to revision questions, after each learning unit. 

&#x20;

Kindly note: 

&#x20;

 Unless you are completing this as a distance module, Arc does not replace your 

contact time with your lecturers and/or tutors. 

 This module is an Arc module, and as such, you are required to engage extensively 

with the content on the Arc platform. Effective use of this tool will provide you with 

opportunities to discuss, debate, and consolidate your understanding of the content 

presented in this module. 

 You are expected to work through the learning units on Arc in your own time – 

especially before class. Any contact sessions will therefore be used to raise and 

address any questions or interesting points with your lecturer, and not to cover every 

aspect of this module. 

 Your lecturer will communicate submission dates for specific activities in class and/or 

on Arc. 

&#x20;

REMEMBER: 

You need to log onto Arc to: 

 Access the learning material and online resources such as articles, interactive graphics, 

explanations, video clips, etc. which will assist you in mastering the content; 

 View instructions and submit or post your contributions to individual or group activities 

which are managed and tracked on Arc; and 

 Submit assessment documents. 

&#x20;

&#x20; 

IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Module Purpose 

The purpose of this module is to introduce students to open source software development 

for mobile devices. 

Module Outcomes 

MO1  Demonstrate knowledge and understanding of principles, key concepts and 

practices in open source software development for mobile devices. 

MO2  Apply various open source development techniques to develop software for 

mobile devices. 

MO3  Solve given problems by developing open source applications for mobile devices. 

© The Independent Institute of Education (Pty) Ltd 2026  

Page 7 of 24 

IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Assessments - PROG7313 / OPSC7311 / OPSC6311 

Integrated Curriculum Engagement (ICE) 

Minimum number of ICE activities to complete 

4 

Weighting towards the final module mark 

10% 

Formatives 

Part 1  

Part 2 

Weighting 

Write/Submit after 

25% 

30% 

LU2 

Learning Units covered 

LU4 

LU1 - 2 

Resources required 

LU1 - 4 

Android Studio 

Additional research  

Android Studio 

Additional research 

Summative 

POE Part 3 

Weighting 

35% 

Total marks 

100 

Open/Closed book 

Closed book 

Resources required 

Android Studio 

Additional research 

Learning Units covered 

All  

© The Independent Institute of Education (Pty) Ltd 2026  

Page 8 of 24 

IIE Module Outline       OPSC6311/w/PROG7313/w/OPSC7311 

© The Independent Institute of Education (Pty) Ltd 2026  Page 9 of 24 

Assessment Preparation Guidelines 

Format of the Assessment Preparation Hints 

Part 1 

This assessment will assess 

your understanding of 

Learning Units 1 to 3 of this 

module and will consist of 

one application for a simple 

mobile application. You will 

be working in a team and 

expected to create an 

application as per your 

objectives for these learning 

units. 

 Ensure you work through all the relevant activities, 

exercises and revision questions on Arc and in your 

textbook.  

 Brainstorm possible gaming programs based on the 

learning outcomes and objectives provided.  

 Pay attention to the instructions and to the mark 

allocations of each question to ensure that you are able to 

meet the requirements.  

 Make sure that you have mastered the objectives in 

Learning Units 1 to 2.  

&#x20;

&#x20;

Part 2 

The task will assess you and 

your team’s ability to 

integrate and apply the 

content in Learning Units 1 

to 4 of this module to build 

on the app you created in 

Task 1. 

 Read through the prescribed chapters and content for 

Learning Units 1 to 4 and ensure that you have engaged 

before you proceed with your coding.  

 Remember to analyse all elements required and ensure 

that your task meets the requirements.  

 Improve the quality of your task by using the provided 

rubric and addressing any areas.  

&#x20; 

Portfolio of Evidence (PoE) 

The PoE will consist of Part 

1, Part 2 and further 

activities to complete the 

PoE. All learning units will be 

assessed in the PoE, and 

reflection on your learning 

will be included. 

 Ensure that you work through all the activities, exercises 

and revision questions on Arc and consult your textbook.  

 Include the tasks as submitted, together with your 

lecturer’s feedback and your corrected tasks based on the 

feedback received.  

 Include the reflection of your learning (each member to 

submit this).  

 Complete other activities included in the PoE.  

&#x20;

&#x20;

&#x20; 

IIE Module Outline       OPSC6311/w/PROG7313/w/OPSC7311 

© The Independent Institute of Education (Pty) Ltd 2026  Page 10 of 24 

Module Pacer 

Module Code Programme Contact Sessions Credits and notional 

time 

PROG7313, 

OPSC7311, 

OPSC6311 

BCA3, BCI3, BIS2, 

DIS3  

72 Contact 15 (150 notional 

hours) 

PROG7313w,  

OPSC6311w 

BCA3w, DIS3w 12 Contact 15 (150 notional 

hours) 

&#x20;

Learning Unit 1 Introduction to Android Development 

&#x20;

This introductory learning unit focuses on the Android Operating System (OS) ecosystem, 

helping you understand the popularity of Android development. It also introduces essential 

tools like source control using GitHub and the Android Studio Integrated Development 

Environment (IDE). 

&#x20;

Please work through Themes 1 to 5 on Arc, along with the relevant sections of your 

prescribed sources. To ensure you master the objectives of this learning unit, make sure to 

complete all the activities on Arc. 

&#x20;

You might encounter challenges in this unit, such as setting up Android Studio and using the 

Layout Editor. To overcome these, consult the official Android Studio documentation and 

refer to the prescribed materials. This learning unit will guide you through the Android 

Ecosystem, Android Studio, and using GitHub. 

&#x20; 

IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Learning Unit 1: Theme Breakdown 

Sessions:  

1-6  

Distance 

Sessions: 

1-2 

Theme 1: The Android Eco System  

Prescribed Material (PM)  

LO1: Identify the tools used in Android 

development. 

LO2: Provide an overview of the history of 

the Android Operating System. 

PM1: Learning Unit 1 

PM2: Learning Unit1 

folder 

Related Module 

Outcomes: 

MO001  

MO002  

Theme 2: GitHub 

LO3: Explain the purpose of Git. 

LO4: Differentiate between Git and GitHub. 

LO5: Create a working copy of a repository 

hosted on GitHub and push the app to 

GitHub. 

© The Independent Institute of Education (Pty) Ltd 2026  

Page 11 of 24 

IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Learning Unit 2 

Creating a Basic Application 

In this learning unit, you will be using Android Studio to build the user interface of an app. 

Please work through Themes 1 to 5 on Arc, along with the relevant sections of your 

prescribed sources. To ensure you master the objectives of this learning unit, make sure to 

complete all the activities on Arc. 

You might encounter challenges in this unit, such as setting up using Android Studio, setting 

up your project, or gradle syncs. To overcome these, consult the official Android Studio 

documentation and refer to the prescribed materials.  

This learning unit will guide you through creating a new app, working with the Layout Editor, 

and using controls like TextView and ImageView. It will also cover internationalising your app 

and running it for the first time. 

© The Independent Institute of Education (Pty) Ltd 2026  

Page 12 of 24 

IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Learning Unit 2: Theme Breakdown 

Sessions:  

7-16 

Distance 

Sessions: 

3-4 

Theme 1: Creating an App 

LO1: Create a new app. 

Prescribed Material (PM)  

PM1: Learning Unit 2 

PM2: Learning Unit2 

folder 

Related Module 

Outcomes: 

MO001  

MO002 

Theme 2: Running an App 

LO2: Run a newly created app using the 

Android emulator. 

Theme 3: Building a User Interface 

LO3: Explain the purpose of the windows in 

Android Studio. 

LO4: Explain the use of the layout editor. 

LO5: Use images in an app. 

LO6: Apply layouts to the user interface of 

an app. 

LO7: Use the TextView and ImageView 

controls in an app. 

© The Independent Institute of Education (Pty) Ltd 2026  

Page 13 of 24 

IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Learning Unit 3 

Introduction to Kotlin 

This learning unit introduces the programming language used in this module: Kotlin. You will 

be introduced to the basic syntax of Kotlin, and then move on to object-oriented 

programming in Kotlin. 

Please work through Themes 1 and 2 on Arc, together with the relevant sections of your 

prescribed source(s). To ensure that you are working towards mastering the objectives for 

this learning unit, please also ensure that you complete all the activities on Arc.  

One aspect that you may find challenging in this Learning Unit is getting used to Kotlin syntax. 

Complete the activities on Arc to get some hands-on practice with the language. 

© The Independent Institute of Education (Pty) Ltd 2026  

Page 14 of 24 

IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Learning Unit 3: Theme Breakdown 

Sessions: 

17-27 

Distance 

Sessions: 

5-6 

Theme 1: Kotlin Basics 

LO1: Differentiate between Kotlin and Java 

or C#. 

LO2: Use Kotlin to write a basic program 

with variables and calculations. 

Prescribed Material (PM)  

PM1: Learning Unit 3 

PM2: Learning Unit 3 folder 

Related 

Outcomes: 

MO001 

MO002 

Theme 2: Object-Oriented Programming in 

Kotlin  

LO3: Explain the following object-oriented 

programming concepts: 

 Inheritance. 

 encapsulation. 

 polymorphism. 

LO4: Explain object-oriented programming 

in Kotlin. 

© The Independent Institute of Education (Pty) Ltd 2026  

Page 15 of 24 

IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Learning Unit 4 

More Advanced Android Techniques 

This learning unit introduces several new features and techniques of Android Studio through 

the creation of an updated app. These features and techniques include LinearLayout, 

EditText, SeekerBar, EventHandling, NumberFormat and Intents. This learning unit will also 

discuss how to adjust custom theme colours, as well as apply the logic of the app by 

overriding methods in the Main Activity using anonymous inner classes. 

Please work through Themes 1 to 4 on Arc, together with the relevant sections of your 

prescribed source(s). To ensure that you are working towards mastering the objectives for 

this learning unit, please also ensure that you complete all the activities on Arc. 

One aspect that you may find challenging in this Learning Unit is where and how to add code 

to an Android app. Ensure that you refer to the Prescribed Material’s sections on adding 

logic to the app. 

© The Independent Institute of Education (Pty) Ltd 2026  

Page 16 of 24 

IIE Module Outline       OPSC6311/w/PROG7313/w/OPSC7311 

© The Independent Institute of Education (Pty) Ltd 2026  Page 17 of 24 

Learning Unit 4: Theme Breakdown 

Sessions: 

28-41 

Distance 

Sessions: 

7-8 

Theme 1: Layouts and Controls Prescribed Material (PM)  

Related 

Outcomes: 

MO002 

MO003  

LO1: Apply layouts in an app. 

LO2: Use the EditText, NumberFormat and 

SeekBar in an app. 

LO3: Use a navigation drawer in an app. 

LO4: Apply colours to an app. 

LO5: Create a launcher icon for an app. 

PM1: Learning Unit 4 

PM2: Learning Unit 4 

folder 

Theme 2: Event Handling 

LO6: Apply event handling in an app. 

Theme 3: Activity Life Cycle 

LO7: Explain the activity life cycle in an 

Android app. 

LO8: Create an activity. 

LO9: Use overridden methods. 

Theme 4: Using Intents 

LO10: Explain the purpose of an intent. 

LO11: Apply an intent in an application. 

&#x20;

&#x20;

&#x20; 

IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Learning Unit 5 

Local Databases and JSON 

In this learning unit, you will create apps that store data in different databases. We will start 

by looking at RoomDB, an embedded database that makes use of Structured Query Language 

(SQL). Then we will explore the use of JSON files and JSON objects. 

The challenge you may experience in this learning unit relates to using RoomDB and 

understanding how JSON is structured. Refer to the module manual and repository for 

guidance. 

© The Independent Institute of Education (Pty) Ltd 2026  

Page 18 of 24 

IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Learning Unit 5: Theme Breakdown 

Sessions: 

42-50 

Distance 

Sessions: 

9 

Theme 1: Local Databases 

LO1: Create a RoomDB Database. 

LO2: Use a RoomDB Database to store data. 

LO3: Use a RoomDB database to read data. 

Prescribed Material (PM)  

PM1: Learning Unit 5 

PM2: Learning Unit 5 

folder 

Related 

Outcomes: 

MO002 

MO003 

Theme 2: JSON Files and JSON Objects 

LO4: Explain the purpose of JSON files. 

LO5: Use JSON objects to read data. 

LO6: Use JSON objects to write data. 

LO7: Use a library to work with JSON data. 

© The Independent Institute of Education (Pty) Ltd 2026  

Page 19 of 24 

IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Learning Unit 6 

Modern Data Management Techniques 

This learning unit works through the process of adding an online database connection to 

your app. The learning unit will be focusing on the use of the Firebase database, 

authentication, and file storage. 

Please work through Themes 1 to 5 on Arc, together with the relevant sections of your 

prescribed source(s). To ensure that you are working towards mastering the objectives for 

this learning unit, please also ensure that you complete all the activities on Arc. 

One aspect that you may find challenging in this Learning Unit is connecting your app to the 

different Firebase services. Make sure you understand how JSON is structured before you 

integrate any Firebase services. 

© The Independent Institute of Education (Pty) Ltd 2026  

Page 20 of 24 

IIE Module Outline       OPSC6311/w/PROG7313/w/OPSC7311 

© The Independent Institute of Education (Pty) Ltd 2026  Page 21 of 24 

Learning Unit 6: Theme Breakdown 

Sessions: 

51-66 

Distance 

Sessions: 

10-11 

Theme 1: Introduction to Firebase  Prescribed Material (PM)  

LO1: Explain the difference between 

Firebase and a traditional SQL 

database. 

LO2: Describe the advantages of using 

Firebase. 

PM1: Learning Unit 6 

PM2: Learning Unit 6 

folder 

Related 

Outcomes: 

MO002 

MO003  

&#x20;

Theme 2: Connect an App to Firebase 

LO3: Explain why an application would need 

to be authorised to access a Firebase 

database. 

LO4: Create a connection between an   

application Firebase. 

Theme 3: Firebase Authentication 

LO5: Use an authentication service.  

Theme 4: Firebase Database 

LO6: Create a Firebase database.  

LO7: Create code to read data from the 

Firebase database.  

LO8: Create code to write data to the 

Firebase database. 

Theme 5: Firebase File Storage 

LO9: Use firebase file storage. 

&#x20; 

IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Learning Unit 7 

Developing a Graphical Game 

This learning unit works through the process of developing a small graphical game using 

Android. The learning unit will also discuss Views, Drawing Images and using Canvas as well 

as the use of various methods to perform the logic of the app. 

Please work through Themes 1 and 2 on Arc, together with the relevant sections of your 

prescribed source(s). To ensure that you are working towards mastering the objectives for 

this learning unit, please also ensure that you complete all the activities on Arc. 

One aspect that you may find challenging in this Learning Unit is using positioning graphics. 

Ensure that you refer to the Prescribed Material’s sections on drawing graphics on the 

canvas. 

© The Independent Institute of Education (Pty) Ltd 2026  

Page 22 of 24 

IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Learning Unit 7: Theme Breakdown 

Sessions: 

67-72 

Distance 

Sessions: 

12 

Theme 1: Working with Resources 

Prescribed Material (PM)  

LO1: Explain the purpose of defining XML 

resource files. 

LO2: Apply animations to controls in an app. 

PM1: Learning Unit 7 

PM2: Learning Unit 7 

folder 

Related 

Outcomes: 

MO002 

MO003 

Theme 2: Building a Game in Android Studio  

LO3: Explain the use of touch events. 

LO4: Explain how to draw on a canvas. 

LO5: Use a Timer object in Android. 

© The Independent Institute of Education (Pty) Ltd 2026  

Page 23 of 24 

IIE Module Outline       

OPSC6311/w/PROG7313/w/OPSC7311 

Glossary of Key Terms for this Module 

Term 

Definition 

© The Independent Institute of Education (Pty) Ltd 2026  

Page 24 of 24 

//



IIE Module Manual        

PROG7313 

PROGRAMMING 3C/ Open Source Coding 

(Introduction) 

PROG7313/w / OPSC6311/w / OPSC7311 

MODULE MANUAL 2026 

(First Edition: 2020) 

This manual enjoys copyright under the Berne Convention. In terms of the Copyright Act, no 

98 of 1978, no part of this manual may be reproduced or transmitted in any form or by any 

means, electronic or mechanical, including photocopying, recording or by any other 

information storage and retrieval system without permission in writing from the proprietor. 

The Independent Institute of Education (Pty) Ltd is registered with 

the Department of Higher Education and Training as a private 

higher education institution under the Higher Education Act, 1997 

(reg. no. 2007/HE07/002). Company registration number:  1987/004754/07. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 1 of 222 

IIE Module Manual        

PROG7313 

DID YOU KNOW? 

Student Portal 

The full-service Student Portal provides you with access to your academic administrative 

information, including: 

 

 

 

 

 

an online calendar, 

timetable, 

academic results, 

module content, 

financial account, and so much more! 

Module Guides or Module Manuals 

When you log into the Student Portal, the ‘Module Information’ page displays the ‘Module 

Purpose’ and ‘Textbook Information’ including the online ‘Module Guides or ‘Module Manuals’ 

and assignments for each module for which you are registered. 

Supplementary Materials 

For certain modules, electronic supplementary material is available to you via the 

‘Supplementary Module Material’ link. 

Module Discussion Forum 

The ‘Module Discussion Forum’ may be used by your lecturer to discuss any topics with you 

related to any supplementary materials and activities such as ICE, etc. 

To view, print and annotate these related PDF documents, download Adobe Reader at 

following link below: 

www.adobe.com/products/reader.html 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 2 of 222 

IIE Module Manual        

PROG7313 

IIE Library Online Databases  

The following Library Online Databases are available. These links will prompt you for a 

username and password. Use the same username and password as for student portal. 

Please contact your librarian if you are unable to access any of these. Here are links to 

some of the databases: 

Library Website 

LibraryConnect 

(OPAC) 

EBSCOhost  

EBSCO eBook 

Collection 

SABINET 

DOAJ 

DOAB 

IIESPACE 

Emerald 

HeinOnline 

JutaStat 

This library website gives access to various online 

resources and study support guides  

\[Link] 

The Online Public Access Catalogue. Here you will be 

able to search for books that are available in all the IIE 

campus libraries.  

\[Link] 

This database contains full text online articles.  

\[Link] 

This database contains full text online eBooks. 

\[Link] 

This database will provide you with books available in 

other libraries across South Africa.  

\[Link] 

DOAJ is an online directory that indexes and provides 

access to high quality, open access, peer-reviewed 

journals.  

\[Link] 

Directory of open access books. 

\[Link] 

The IIE open access research repository 

\[Link] 

Emerald Insight 

\[Link] 

Law database  

\[Link] 

Law database 

\[Link] 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 3 of 222 

IIE Module Manual        PROG7313 

© The Independent Institute of Education (Pty) Ltd 2026    Page 4 of 222 

Table of Contents 

&#x20;

Introduction ........................................................................................................................... 5 

Learning Unit 1: Introduction to Android Development .......................................................... 6 

Learning Unit 2: Creating a Basic Application ..................................................................... 15 

Learning Unit 3: Introduction to Kotlin ................................................................................. 71 

Learning Unit 4: More Advanced Techniques ...................................................................... 81 

Learning Unit 5: Local Databases and JSON .................................................................... 145 

Learning Unit 6: Modern Data Management Techniques .................................................. 161 

Learning Unit 7: Developing a Graphical Game ................................................................ 184 

Bibliography ...................................................................................................................... 212 

Intellectual Property .......................................................................................................... 218 

&#x20;

&#x20;

&#x20; 

IIE Module Manual        

PROG7313 

Introduction 

Welcome to Open Source Coding (Introduction). In this module, we will be 

focussing on developing native apps for the Android Operating System (OS). We 

will make use of the Kotlin programming language. 

In 2022, the Android OS has a market share of 70.97% of mobile devices (G., 

2022). This means that the apps that we learn to develop here, will be able to run 

on most mobile devices out there right now. 

In your previous programming modules, you have already learned object-oriented 

programming in Java or C#. Although the syntax of Kotlin is slightly different, you 

will find the concepts quite familiar. 

Throughout this module, you will create several apps to master all the basic skills 

needed to build an Android app. It is important to get hands-on experience in any 

programming module, so it is essential that you complete all the activities provided 

on Learn. 

We hope you will enjoy the module and take the opportunity to use the knowledge 

and experience gained in both future modules, and in your career. 

Figure 1. Module Structure 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 5 of 222 

IIE Module Manual        

PROG7313 

Learning Unit 1: Introduction to Android Development 

Learning Objectives: 











Identify the tools used in Android development. 

Provide an overview of the history of the Android 

Operating System. 

Explain the purpose of Git. 

My notes 

Contrast Git and GitHub. 

Create a working copy of a repository hosted on GitHub. 

Material used for this learning unit: 



GitHub repository: LearningUnit1 

How to prepare for this learning unit: 



Install Android Studio. 

1\. Introduction 

In this module, we will learn how to create apps for Android phones. We will 

start by creating a user interface that just uses hard coded data, and later in 

the module we will also look at how to read data from and write data to a 

database. In the last learning unit, we will do something different – creating 

a game from scratch using the APIs provided by Android. 

This introductory learning unit provides an overview the Android Operating 

System (OS) and its features. We will also discuss Android software 

development and all the parts of the system that are involved in creating 

and building a native Android app. 

And finally, this learning unit will introduce the sample source code from the 

GitHub repository for this module. 

Note: All the sample source code in the GitHub repository, and in this Module 

Manual, is written in Kotlin. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 6 of 222 

IIE Module Manual        

PROG7313 

2\. Android Eco System 

2.1. Android Operating System 

The Android OS, created by Google, has been around for many years now – the first official public release happened in 2008. The next year Android 

1.5 was released, and it was called Cupcake. That started the naming 

convention where releases were named after desserts, like Nougat, Oreo, 

and Pie. Android 10, released in 2019, was the first release to break the 

dessert-themed tradition. (Raphael, 2020) By August 2022, Android 13 

Beta 4 was available for download. (Android Open Source Project, 2022) 

Each new version of the operating system introduced new features. And 

these are not only features of the operating system apps that the user sees, 

but also features that app developers can make use of. 

The source code for Android is open source. Most of the code is licensed 

under the Apache License, Version 2.0. There are exceptions though, like 

some kernel code that is licensed under GPLv2. (Android Open Source 

Project, 2020b) When manufacturers release devices running the Android 

OS, proprietary software is usually included too. (Chen, 2020) 

The licensing sounds like it is getting complicated. But, for our purposes as 

app developers, working with Android means working with open-source 

software. So, for example we can view the code that displays images on the 

screen. And we can make use of tools that are completely free to develop 

our apps. 

2.2. Building and Running an Android App 

We will be developing our Android apps on a computer running a desktop 

operating system like Microsoft Windows. And yet we are creating software 

that is not meant to run on Windows at all. So, there are more pieces of 

software involved with developing for Android than there is for the desktop 

apps that you have developed before. Figure 2 shows all the important parts 

of the system. 

The first important component is Android Studio. It is an Integrated 

Development Environment (IDE) that allows us to do everything we need 

to develop our apps. Android Studio supports both Java and Kotlin 

development. 

Installed together with Android Studio is the Android Software Development 

Kit (SDK). The SDK is a bundle of the tools that are needed for Android 

development, such as the emulator. Although you could use the SDK tools 

directly, Android Studio actually integrates all of these things into a single 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 7 of 222 

IIE Module Manual        

PROG7313 

user-friendly app. So, there is little need for anybody to use those tools 

directly anymore. (Sinicki, 2019) 

The Gradle build system is used to manage the libraries that are used to build 

software, and to do the building and running of our apps. 

Figure 2. Android Eco System (created using images from (nevoski, n.d.), (Google, 

2014), (JetBrains, 2020), (HowToDoInjava.com, n.d.), (Anon., 2018)) 

When you run an Android app during development, you need something 

running the Android OS to run it on. The first possibility is running the app 

directly on your phone, using USB debugging. Read more about how to do 

that in (Android Open Source Project, 2019). Of course, that means that 

you need an Android phone. And it also means that you are limited to 

running the version of the operating system that is currently installed on 

your phone. 

Another way to run an app, is to make use of the emulator (also called 

Android Virtual Device). When using the emulator, an instance of the 

Android OS of your choice is run in a virtual device on your computer. The 

benefit of doing that is that you could create a virtual device that emulates 

hardware that you don’t own, running any Android OS version. For phones 

and tablets, you can choose the screen resolution supported by the 

emulator. So, it allows for much greater flexibility when testing your 

software. 

The emulator does have limitations though, for example not being able to 

emulate Bluetooth and device-attached headphones. (Android Open 

Source Project, 2020c) The emulator also doesn’t support a step counter. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 8 of 222 

IIE Module Manual        

PROG7313 

Whether you run the app on the emulator or on a phone, the Android 

Runtime (ART) is the software that runs the app on the target OS. It fulfils 

similar functions to the Java Virtual Machine (JVM) when you run a Java 

app on your computer. (Sinhal, 2017) Earlier versions of the Android OS had 

a different runtime called Dalvik. (Android Open Source Project, 2020d) 

3\. Git and GitHub 

Git is a distributed source control program used to keep track of 

changes and updates to software during development. This allows software 

developers to revert to previous versions of software they have developed 

if any part of the code is lost, or if bugs are introduced into the code. 

Git also allows developers to work together in teams and share code, while 

keeping track of the work done by each team member. 

Figure 3. Distributed Version Control (Ernst, 2018) 

Figure 3 shows how a distributed version control system such as Git works. 

Each developer has a clone of the repository on their computer, and 

changes are pushed to and pulled from a central repository that needs to 

be stored somewhere on a server. 

GitHub (https://github.com/) is a service owned by Microsoft that provides 

Git repositories that are hosted online. The free tier of GitHub provides 

more than enough features for us to use. 

GitHub is not the only option for hosted Git repositories. Other services 

include Microsoft Azure DevOps Services (https://azure.microsoft.com/en- 

us/services/devops/) and Bitbucket (https://bitbucket.org/product), both of 

which also have free tiers. But for our purposes in this module, we will be 

making use of GitHub. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 9 of 222 

IIE Module Manual        

PROG7313 

3.1. Getting the Sample Code 

The sample code for this module can be found in the following GitHub 

repository: https://github.com/iie-PROG7313/Prog7313 \[Accessed 17 

November 2022]. 

As with most things in programming, there are multiple ways to clone the 

repository to your local computer. 

3.2. Using GitHub Desktop 

To clone the code using GitHub Desktop: 

1\. 

Download 

the 

free 

GitHub 

Desktop 

app 

https://desktop.github.com/ \[Accessed 30 December 2024]. 

Figure 4. Clone Repository 

2\. 

from 

In the GitHub Desktop app, click the File menu and then 

click Clone Repository. 

Figure 5. Repository Details 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 10 of 222 

IIE Module Manual        

PROG7313 

3\. 

4\. 

5\. 

6\. 

Click the URL tab. 

Enter the following URL: iie-PROG7313/Prog7313 

Choose a Local path (folder) to clone the repository to. 

Click Clone. 

Now you can open the various projects in Android Studio. 

3.3. Using Command Line Tools 

To clone the repository with the Git command line tools: 

1\. 

2\. 

On the command line, go to the folder where you want to clone the source code. 

Execute the following command: 

git clone https://github.com/iie-PROG7313/Prog7313 

3.4. Using Android Studio 

To clone the repository using Android Studio: 

Figure 6. Android Studio Welcome Screen 

1\. 

On the Welcome to Android Studio screen, click Get from VCS. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 11 of 222 

IIE Module Manual        

PROG7313 

Figure 7. Enter the URL 

2\. 

3\. 

4\. 

Enter the URL for the repository: https://github.com/iie-PROG7313/Prog7313 

Choose a Directory to store the code in. 

Click Clone. 

Now you can open any of the projects in the local working folder in Android Studio. 

3.5. Our First Sample Project 

Open the project in the LearningUnit1\\WelcomeToAndroid2 folder in 

Android Studio. 

Open the file res\\layout\\activity\_main.xml. In the Design view, the 

main activity should appear as shown in Figure 8. If you see this, then you 

have successfully opened the first sample program for this module. And that 

means that you are ready to jump into creating your first app in Learning 

Unit 2! 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 12 of 222 

IIE Module Manual        

PROG7313 

Figure 8. WelcomeToMobile Main Activity in Android Studio (Android picture from 

https://pxhere.com/en/photo/1085439) 

4\. Recommended Digital Engagement and Activities 

The Guru PROG7313 playlist on YouTube has a lot of useful videos 

created for this module. The full playlist can be found here:  

https://www.youtube.com/playlist?list=PL480DYS

b\_kfySounaa52kuNkhsGK-LpZ  \[Accessed 03 December 2024]. 

For this learning unit, watch the following videos from that playlist: 

\[YouTube] Connect Android Project to Github 

https://youtu.be/Kz1B0UwHQSU 

\[Accessed 

December 2024]. 

30 

\[YouTube] Commit and Push a change to GitHub 

https://youtu.be/q\_j923SIZGI \[Accessed 30 December 

2024]. 

\[YouTube] 

Clone 

Project 

https://youtu.be/ag78QWpSVqw 

December 2024]. 

5\. Activities 

Do the activities that appear on Learn. 

6\. Revision Exercises 

from 

\[Accessed 

GitHub 

30 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 13 of 222 

IIE Module Manual        

PROG7313 

Create your own GitHub account and upload one of your own applications 

done in class to the repository. 

7\. Solutions to Revision Exercises 

Share your GitHub repository link with one of your classmates. Ensure that 

they can clone your application and get it working. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 14 of 222 

IIE Module Manual        

PROG7313 

Learning Unit 2: Creating a Basic Application 

Learning Objectives: 















Create a new app. 

Explain the purpose of the windows in Android Studio. 

Explain the use of the layout editor. 

Use images in an app. 

My notes 

Apply layouts to the user interface of an app. 

Use the TextView and ImageView controls in an app. 

Run a newly created app using the Android emulator. 



Explain how to internationalize an app. 

Material used for this learning unit: 



GitHub repository: LearningUnit2 

How to prepare for this learning unit: 



Make sure that you have the GitHub source code 

available and that your Android Studio is up to date. 

1\. Introduction 

In the first learning unit, we explored the Android eco system. This includes 

Android Studio, which is the Integrated Development Environment (IDE) 

that we are using in the module. We encountered Android Studio for the 

first time when we opened a sample project from the GitHub repository. 

In this learning unit, we will be using Android Studio to build the user 

interface of an app. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 15 of 222 

IIE Module Manual        

PROG7313 

2\. The Android Studio User Interface 

The main Android Studio user interface is visible to you when you have 

project open, that has been built. Figure 9 shows what the user interface 

looks like with the sample project from learning unit 1 opened. You will get 

to know all the elements in this screen well over time. But before we jump in, 

let’s look at the main areas of the user interface. 

These are the areas of the main window as shown in Figure 9 (Android 

Open Source Project, 2022b): 

1\. 

2\. 

3\. 

4\. 

5\. 

6\. 

7\. 

8\. 

The menu bar lets you access all the actions that Android Studio can do. 

The toolbar contains the most frequently used actions such as 

running the app. This is context sensitive, so for example in Figure 9 

the Git actions appear on this toolbar since the project was created in 

a Git repository. 

Figure 9. Main Window Areas 

The navigation bar shows you a compact view of where the currently 

open is in the project. 

The tool window bar allows you to expand or collapse tool windows. 

The editor window allows you to edit code and layouts. Depending 

on which kind of file is currently open, this area will change. 

The emulator window shows the app when it is running in the emulator. 

The output windows display information about the compiling and 

running of an app. 

The status bar displays status messages about the project and builds, 

including warnings and messages. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 16 of 222 

IIE Module Manual        

PROG7313 

2.1. Creating an App 

Now that we have seen the major areas of the Android Studio user 

interface, it is time to create our very first new project. 

In the next three learning units, we are going to work on an app called 

StarSucks. It is an app for a coffee shop, and in each learning unit we will 

improve on the functionality. In this learning unit, we are going to create the 

basic user interface that displays the products sold by the coffee shop. 

To create a new app using Android Studio: 

Figure 10. Creating a New Project from the Welcome Screen 

1\. 

2\. 

If you are on the Welcome to Android Studio window (see Figure 10), click New 

Project. 

If you are already in the main user interface of Android Studio, click the File 

menu, then New and then New Project. 

Figure 11. Creating a Project from the Main Menu 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 17 of 222 

IIE Module Manual        

PROG7313 

Figure 12. Select a Project Template 

3\. 

4\. 

On the Select a Project Template page of the wizard, make sure that 

the Phone and Tablet category is selected. 

Then select Empty Views Activity and click Next. 

Selecting Empty Views Activity will start the project off with only a very basic, single 

screen. This is ideal for what we want to do here. The other activities create more 

advanced starting points for your app that you may want to explore later. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 18 of 222 

IIE Module Manual        

PROG7313 

Figure 13. Configuring the Project 

Tip: If you ever want to publish your app on the Google Play Store, the package 

name that you choose when creating the app needs to be unique. The default 

com.example suggested by Android Studio will NOT be allowed by the Play Store. 

So, you must choose something that is going to be unique. 

The Kotlin naming convention for packages is to use your organisation’s website 

since that is already guaranteed to be unique. You could use for example: 

com.iie.<ST-Number>.weatherapp 

Note how the top-level domain is first in the package name. It starts with com or za – the opposite of the website address. 

5\. 

On the New Project wizard, we need to specify the following values: 

a. 

b. 

c. 

d. 

Name of the application. This is not easy to change, so choose well. 

Package name. The package that uniquely identifies your 

application. It needs to be a valid Kotlin package name. 

Save location. The folder where the app will be created. 

Language. For our purposes here we are using Kotlin. So, to 

follow along with this example make sure you select Kotlin. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 19 of 222 

IIE Module Manual        

PROG7313 

e. 

Finally, you need to decide on your Minimum API Level. This 

affects which devices can “see” your app on the Play Store – 

only devices with Orea (8.0) and upwards will be able to “see” 

this app. You also need all the relevant API’s installed to use the 

min API. You should have Marshmallow, Nougat and Oreo 

installed. Android will set your Max API to the latest API that you 

have installed. In our case it is Oreo – these change quickly so 

you might even have several newer versions too. 

Figure 14. Gradle sync in progress 

6\. 

Click Finish 

The project will now be displayed in the main Android Studio user interface. 

Click the Build tab (bottom of the user interface) to see what is happening 

in the background when the project is created. You will see a Gradle sync 

process that will be started. This may take a while when you first create the 

project, since it retrieves all the libraries that you need for this project from 

central artifact repositories online. 

Once the initial build is complete, the files in the project will be displayed as 

shown in Figure 15. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 20 of 222 

IIE Module Manual        

PROG7313 

Figure 15. Project in the Main Android Studio Window 

We selected the empty activity template when we created the app, to keep 

things simple. But there are several other activity templates that are 

available out of the box in Android Studio. Read more about all the 

templates in (Rout, 2022). 

2.2. Running the App 

We will look in more detail at what happens when you run an app later in 

this learning unit, but let’s run the app on the emulator in the meantime. 

Just as with any other programming work, it is important to run the app early 

and often, to make sure it works as expected. If you write a ton of code and 

then it doesn’t compile, or doesn’t work, it is much harder to debug than 

fixing a small piece of code. 

Before you can run the app for the first time, you need to set up a Virtual 

Device. This is where you can choose what device to emulate. 

To set up a new virtual device: 

Figure 16. Accessing Device Manager 

1\. 

From the main menu, select Tools > Device Manager 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 21 of 222 

IIE Module Manual        

PROG7313 

Figure 17. Device Manager 

2\. 

3\. 

4\. 

5\. 

6\. 

On the Device Manager window, on the Virtual tab, click Create device. 

Figure 18. Selecting the Hardware 

Select the Phone category since our app is meant to run on a phone. 

Select the device that you want to emulate. Let’s use the Pixel 8 Pro device. 

Tip: The Play Store icon indicates whether the operating system will have the Play 

Store pre-installed. If it is installed, you can log in with your Google login and 

download apps on the emulator, just like you would for your phone. 

Click Next. 

Next, we select the operating system (see Figure 19) that we are 

going to use. Click the Download link next to any of the system 

images to download it. Once it is downloaded, it can be selected. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 22 of 222 

IIE Module Manual        PROG7313 

© The Independent Institute of Education (Pty) Ltd 2026    Page 23 of 222 

7\. Select Oreo or newer. 

8\. Click Next. 

&#x20;

&#x20;

&#x20;

Figure 19. Selecting the Operating System 

&#x20;

9\. Lastly, we can name the virtual device (see Figure 21). This will be 

useful if you have multiple devices with different configurations. For 

now, the default will be fine. 

10\. Click Finish. 

&#x20;

Figure 20. Virtual device appearing in Android Studio 

Tip: The system images are quite large. Make sure that you are connected to wi-fi 

and not a metered network before you start the download! 

IIE Module Manual        

PROG7313 

Figure 21. Name and Verify Configuration 

Now that the virtual device has been set up, you can run the app for the first time. 

To run the app, click the Run app button on the toolbar (  ) or click Run and 

then Run App on the main menu bar. 

Tip: Minimise the Device Manager window to make more space for the Emulator 

window. 

When the Virtual Device is started up for the very first time, it will take some 

time to start up. Eventually, you should see the app running in the emulator 

window in Android Studio as shown in Figure 22. 

Tip: Starting the emulator up takes a while, even if it is not the very first run. But 

running the app on the emulator after that is quite fast. So, start the emulator early 

and leave it running. Then you can quickly run the app as you make changes. 

Tip: If the emulator screen switching off annoys you, you can change the timeout in 

the Android operating system running in the emulator. It is under settings > Display 

> Advanced > Sleep. The maximum timeout is 30 minutes, which is much better for 

this use than the default 1 minute. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 24 of 222 

IIE Module Manual        

PROG7313 

Figure 22. App Running on the Emulator 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 25 of 222 

IIE Module Manual        

PROG7313 

3\. Building a User Interface 

3.1. Android Studio Tools 

Our app is currently still quite empty and not yet very exciting. So, let us 

start adding User Interface (UI) components to it. 

There are two ways in which you can create a UI in Android Studio: you can 

code your UI in Extensible Markup Language (XML), or you can design it 

by using the Layout Editor. If you use the Layout Editor, it will update the 

XML file for you. 

Figure 23. Layout Editor Components 

The areas of the Layout Editor in Figure 23 are as follows (Android Open 

Source Project, 2020): 

1\. 

2\. 

3\. 

4\. 

5\. 

6\. 

The Palette contains the components that you can drag onto your layout. 

The Component Tree shows all the components that are already on the layout. 

The toolbar contains tools to change the layout appearance and 

attributes. For example, you could change the app’s theme to see 

how it would look. 

The design editor shows the layout in design view and blueprint view. 

The attributes window shows the attributes of the currently selected component. 

The view mode buttons allow you to switch between the Code (XML) view, 

Design view or a Split view showing both. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 26 of 222 

IIE Module Manual        

PROG7313 

Let’s switch now to the Code view to see what that looks like. 

Figure 24. Code View 

In Figure 24, we see the XML representation of our design. The XML editor 

does provide auto-complete functionality (by pressing Ctrl+Space in 

editor). 

Some developers prefer using the Layout Editor to drag and drop and then 

customise UI controls in Android. Other developers prefer to code up the 

UI in XML. 

3.2. Android Layouts 

Android has different layouts which follow a hierarchical structure. You can 

use a Constraint, Linear, or Relative Layout to design your application UI. 

Each of these layouts have features that are useful in different UIs. 

If we look at the structure below, we see the root element as a ViewGroup, 

we really need to understand what a View is before we can understand a 

ViewGroup. Android defines as a View as a UI element that draws 

something the user sees. For example, a button is view, an ImageView is 

a view, a scrollbar is a view. 

A ViewGroup is a layout that contains multiple Views. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 27 of 222 

IIE Module Manual        

PROG7313 

We create a hierarchical structure when we design our layouts, like what is 

shown in Figure 25. We will compare this diagram to the image of the XML 

layout below that. 

Root: LinearLayout 

ImageView 

TextView 

Figure 25. Hierarchy of Views (Android Open Source Project, 2020g) 

Figure 26. XML Layout 

In Figure 26, we have our root view LinearLayout which contains two 

views: an ImageView and a TextView. Below that is a ScrollView. In 

Figure 27, we see that ScrollView expanded to show its contents: a 

LinearLayout with multiple ImageViews. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 28 of 222 

IIE Module Manual        

PROG7313 

If 

we 

ScrollView 

expand 

the 

from 

the 

previous image we see that it 

contains a LinearLayout 

which contains ImageViews. 

Figure 27. Expanded Scroll View 

This ViewGroup that makes up our UI looks like the image below. 

Figure 28. Hierarchy of Views 

You cannot see the LinearLayouts (they are invisible) nor the ScrollView – but you can see the ImageViews and TextViews and how they fit into the 

hierarchical structure discussed above. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 29 of 222 

IIE Module Manual        

PROG7313 

Tip: It is incredibly important to consider good UI and UX when you develop Android 

apps. Users are likely to abandon even the best developed app if it does not look 

good and flow well. First impressions matter! 

Let us have a look at the different layouts that we have available in an Android App. 

3.2.1. 

LinearLayout 

LinearLayout is a root view that will stack all its children either horizontally 

next to each other or vertically on top of each other. 

Figure 29. Horizontal and Vertical LinearLayouts (Ayub, 2017) 

You can learn more about Linear Layouts (Ayub, 2017). 

3.2.2. 

RelativeLayout 

RelativeLayout aligns UI components relative to each other on the screen 

and does not need nested layouts. 

Figure 30. Relative Layout (Ayub, 2017b) 

You can learn more about relative layouts in (Ayub, 2017b). 

3.2.3. 

ConstraintLayout 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 30 of 222 

IIE Module Manual        

PROG7313 

ConstraintLayout is like RelativeLayout but a lot more flexible. 

Figure 31. Constraint Layout (Android Open Source Project, 2020i) 

You can learn more about ConstraintLayout in (Android Open Source 

Project, 2020i). 

You can learn more about these layouts and how they function in (Lake, 

2016\) and (Android Open Source Project, 2020g). 

3.3. About Resources 

Figure 32. Two Main Activity Files 

Each activity has two files that get created by Android 

Studio: a Kotlin source file, and a layout XML file. The 

Kotlin file contains the behaviour of the activity, and the 

XML file the layout. The XML file is a kind of resource 

file. So, to understand that we need to take a closer 

look at resources. 

Definition 

“Resources are the additional files and static content that your code uses, such as bitmaps, 

layout definitions, user interface strings, animation instructions, and more.” (Android Open 

Source Project, 2020h) 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 31 of 222 

IIE Module Manual        

PROG7313 

3.3.1. 

The res Folder 

Figure 33. Resources Folder 

Your Android resources are contained in the res folder, which correlates to 

the R class in Kotlin. You can think of the R class as the glue to combines 

your Kotlin code and any resource stored in the res folder. We will store our 

XML files as well as our images, colours, strings, and app icons in here. The 

res folder is broken down into the following folders: 









drawable will contain all our images, shapes, bitmaps, and vectors etc. 

layout contains the layouts for all our activities, fragments etc. 

mipmap will house our app icon and various place holders. 

values folder holds our String values, Colours, Themes etc. 

We need to store all the images we want to use in our app in the drawable 

folder. We can store this using Windows Explorer, or we can just copy our 

images straight into the drawable folder. 

The StarSucks images can be found in the GitHub repo, in the 

LearningUnit2/assets folder. While holding Ctrl, draw the files into the 

drawable folder in Android Studio. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 32 of 222 

IIE Module Manual        

PROG7313 

Figure 34. Copying Images 

Make sure that the dialog title says Copy as shown in Figure 34. Otherwise, 

it will move the files, which might not be what you intended. The files should 

appear in your res\\drawable folder once you have copied them over. 

Figure 35. Images in the drawable folder 

We are now ready to start building our first app that will display our images. 

There are just some rules that we need to discuss. Your app will crash if you 

use characters that are not allowed when naming your images. 

Image naming convention: You can use small letters from a-z, numbers, and 

underscores. 

No special characters are allowed because the image in the drawable folder 

is written into your R class when your Gradle builds. Characters that are 

used in Kotlin will then cause problems. For example, we use \& in Kotlin to 

AND and || to OR etc. 

3.3.2. 

The R Class 

The R class is auto generated by the Android Asset Packaging Tool 

(AAPT) and contains all the resource ids to your resources in the res folder. 

The R class is automatically updated as you add UI elements in XML files, 

images in the drawable folder and strings in the strings.xml file. The R 

class is rebuilt every time you build or run your Android project. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 33 of 222 

IIE Module Manual        

PROG7313 

Let’s look at what the R class does. 

Figure 36. Using the R Class 

In Figure 36, we see how the R class is used in the MainActivity.kt file. We 

are calling a method called setContentView here, which will of course set 

our view. This method is available because we are inheriting form the 

AppCompatActivity class. (We will look at Kotlin code in more detail in 

the next learning unit.) 

We are also passing an argument into this method. We are telling Android 

where to find the view that we would like to display to the user when the 

app opens. We are passing in R.layout.activity\_main. This means in 

the R class, there is nested class called layout and it contains a variable 

that holds the ID for the activity that we would like to load. 

We don’t need to know that numerical value for the ID, because the 

compiler takes care of it for us. What is useful to know, is that this is the line 

of code that links the XML file to the source code that specifies the related 

behaviour. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 34 of 222 

IIE Module Manual        

PROG7313 

3.4. Creating the User Interface 

All of this may seem quite overwhelming by now – so many layouts, so 

many components and so many moving parts just to display a UI. But you 

will see it is not that bad when we use it. So, let’s jump into creating the UI. 

The 

Constraint 

Widget that allows 

you to constrain 

your UI elements to 

the edges of your 

screen or other 

element 

ConstraintLayout as 

the default 

The default 

Hello world 

TextView 

Figure 37. Empty Activity in the Layout Editor 

3.4.1. 

Changing the Layout 

Android Studio will have ConstraintLayout as its default layout when you 

create a new empty activity. We are going to design our first UI using 

LinearLayout because we want our elements vertically aligned. When you 

open your Layout Editor you will see the view shown in Figure 37. 

We are going to change our layout to LinearLayout for now. There are 

two ways of doing this: using the Layout Editor or doing it in the XML file. 

To change the layout using the Layout Editor: 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 35 of 222 

IIE Module Manual        

PROG7313 

Figure 38. Converting the View 

1\. 

1\. 

Right-click on the ConstraintLayout in the Component Tree 

and click Convert view. 

Figure 39. Selecting Linear Layout 

Select LinearLayout and click Apply. 

To change it by using the Code (XML) view: 

1\. 

Click Code (top-right corner of the Layout Editor). 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 36 of 222 

IIE Module Manual        

PROG7313 

Figure 40. Select the Current Layout 

2\. 

Select the current layout’s text as shown in Figure 40. 

Figure 41. Autocomplete Pop-Up 

3\. 

4\. 

Start typing a capital letter L. You should see a pop-up menu that lists 

LinearLayout near the top of the list. 

Double click on LinearLayout. 

Now the layout is changed to LinearLayout, and it is ready to use. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 37 of 222 

IIE Module Manual        

PROG7313 

Figure 42. Changed to LinearLayout 

Now we need to decide if we want to stack our UI elements (Views) 

vertically or horizontally. This is easily done in either the Layout Editor or 

XML. 

You can simply select the correct orientation from the attributes for your 

layout in the Layout Editor. We are selecting Vertical for this example. 

Figure 43. Selecting Vertical Orientation 

You can also just add the following attribute to your XML by typing in the 

following attribute. (There will be IntelliSense – IDE pop-ups – to help you.) 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 38 of 222 

IIE Module Manual        

PROG7313 

Figure 44. Adding the Orientation Attribute 

Figure 45. The Completed Orientation Attribute in the XML File 

We will now have all our UI elements vertically stacked on top of each other 

in the order that we add them to XML file or Layout Editor. 

3.4.2. 

Adding an ImageView 

Now that we have our layout ready, we can start adding in our UI 

components (Views). For our first app we are only adding a TextView and 

an ImageView. We will start with the ImageView. Once again, this is 

possible through the Layout Editor or XML. 

To add the ImageView using the Layout Editor: 

1\. 

Look for the Palette which contains the Views that can be added to the Layout. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 39 of 222 

IIE Module Manual        

PROG7313 

2\. 

3\. 

4\. 

Click the Common category to find the most used views. You should see 

ImageView listed there. 

Figure 46. ImageView on the Palette 

Drag and drop the ImageView onto your design preview. 

Figure 47. Dropping the ImageView 

You will see the little guy shown in Figure 47 as you drag the 

ImageView onto the preview. Drop this image anywhere on the 

preview, we are going to move it where we like it while we design this 

UI. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 40 of 222 

IIE Module Manual        

PROG7313 

Figure 48. Picking an Image 

5\. 

6\. 

Scroll down to the fakebook\_logo under the Fakebook.app.main category. 

Select the image and click OK. 

Tip: Do you see the checkered background for these images? That means that the 

images have a transparent background. It is important to design good UIs so 

please use images with transparent backgrounds! 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 41 of 222 

IIE Module Manual        

PROG7313 

Figure 49. ImageView in the Preview 

Now the ImageView will appear on your preview. There are a couple of 

things we should note here: 





layout\_width and layout\_height: The width and height attributes 

need to be set for every UI element (View) you add in Android. Your 

IDE will display an error if these are absent (only in XML – the Layout 

Editor will add defaults). 

srcCompat: Tells us where the image is stored. 

This is image is currently too big. We can resize this image by dragging the 

blue borders until we get the size that we want. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 42 of 222 

IIE Module Manual        

PROG7313 

Figure 50. Resizing the ImageView 

Figure 51. ImageView after the Resizing 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 43 of 222 

IIE Module Manual        

PROG7313 

That is much better, but now our image is stuck to the left of our screen, 

and we would like it right smack in the middle. We need to set some 

attributes for this. 

Android has a lot of attributes for Views. You need to expand the drop

down arrow next to All Attributes and scroll quite a bit down to find the 

layout\_gravity attribute. 

Tip: We are looking for layout\_gravity and not gravity. 

Figure 52. Expanding All Attributes 

Figure 53. Setting the layout\_gravity 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 44 of 222 

IIE Module Manual        

PROG7313 

Click the flag next to layout\_gravity. 

Figure 54. Setting center\_horizontal 

Check the center\_horizontal check box and click Apply.  

Now the image is where we wanted it to be (see Figure 55). 

Figure 55. ImageView Position 

Delete the TextView – we won’t be using it. 

To add the ImageView using the Code (XML) view: 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 45 of 222 

IIE Module Manual        

PROG7313 

Figure 56. Inserting an ImageView 

1\. 

2\. 

Open an XML tag by typing < and then start typing ImageView. 

IntelliSense should pop-up and you can simply press Enter on your 

keyboard to accept the suggestion. 

Figure 57. Adding layout\_width and layout\_height 

Your ImageView will be inserted and Android Studio will prompt you 

to add the layout\_width and layout\_height as discussed above. 

You can click on wrap\_content for now. wrap\_content means the 

ImageView will wrap itself around the actual size of the image. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 46 of 222 

IIE Module Manual        

PROG7313 

Figure 58. Syntax Error 

3\. 

You will notice that the IDE is displaying a small error by showing a 

red squiggly line behind the wrap\_content entry for the layout height. 

That is because we need to close the XML tag. 

Figure 59. Closing the Tag 

4\. 

5\. 

6\. 

Just enter a forward slash (/) and Android will autocomplete the 

closing of the ImageView tag for you. 

We next need to tell Android Studio where to find our image. We 

do this with the src attribute. The full attribute is: 

android:src="@drawable/fakebook\_logo" 

Figure 60. Adding the src Attribute 

There should be IntelliSense popups that will assist you in adding in 

this entry quite easily. Add the src attribute. 

Figure 61. Choosing the Image 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 47 of 222 

IIE Module Manual        

PROG7313 

7\. 

8\. 

9\. 

Choose the correct image from the correct resources folder (drawable). 

Next, we need to centre our ImageView. The full XML attribute is: 

android:layout\_gravity="center\_horizontal" 

Figure 62. Adding the Height and Width 

We lastly need to change the height and width so that our image is 

the correct size compared to the screen. (See Figure 62.) 

Let’s have a look if the ImageView displays correctly. Run the app in the 

emulator. If you look to the bottom of your screen you will see the Layout 

Inspector window in its minimised state. Click on it to display a window that 

shows what our layout looks like right now, with details as in the running 

app. 

Figure 63. Layout Inspector Displayed 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 48 of 222 

IIE Module Manual        

PROG7313 

Everything is looking good so far. So, let’s move on. 

3.4.3. 

Adding a TextView 

A TextView holds text. The text in your TextView can be set 

programmatically and using the Layout Editor or XML. Developers need to 

reuse as much as they can as well as change the look feel and information 

of applications quite quickly to remain competitive. There are shortcuts and 

easier ways to work String values and Colours in Android Studio. These 

however come with a cost later in time. It is worth our while to store our 

Strings and Colours in places where we can easily change them when 

necessary. We will cover adding a TextView as well as how to store our 

Strings and Colours in the values folder under the res folder. We will add 

our TextView and then we will add a String value in the correct colour. 

You can follow the exact same process we followed to add a UI element 

(View) as we did for the ImageView. You can drag and drop it onto your 

preview in your Layout Editor or you can add the button using XML. The 

choice is yours. The truth is that you will probably jump between the Layout 

Editor and XML as you go along. I will focus on XML for the remainder of 

this module and jump to the Layout Editor where it is just easier to do. You 

can follow any pattern that works for you. Every attribute that is available in 

XML will also be available in the Layout Editor. 

Let’s start with the Layout Editor. You can find the TextView in the Palette, 

just as we did with the ImageView. You can now drag and drop this onto 

your preview. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 49 of 222 

IIE Module Manual        

PROG7313 

Figure 64. Drag and Drop TextView 

Remember the Layout Editor will apply a default layout\_width and 

layout\_height attribute. In this case it chose match\_parent for the width 

and wrap\_content for the height. Which makes a rather ugly TextView. 

Figure 65. Alignment of the TextView 

We can off course just change this with the attributes, as shown in Figure 66. 

Remember to set 

descriptive IDs for 

your UI elements 

Declared 

attributes 

that 

are already set: 

they are the 

same in XML 

The 

most 

commonly used 

attributes – you 

can 

define 

these here or in 

Figure 66. TextView Attributes 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 50 of 222 

IIE Module Manual        

PROG7313 

Which brings us to an important point – the id. Remember we spoke about 

the R class earlier and we discussed how the R class is the glue between 

our XML UI and our Kotlin code? That it stores a memory location usually 

as an int variable? We can only find our XML UI elements in our Kotlin code 

if we know the id. We need to set this value to a value that we will recognise – you will see why when we add some logic to this application. 

The Layout Editor will set a default value as the ID, you are not that lucky in 

XML, you need to define your own. It is best practice to give your UI elements 

easy to understand descriptive names. 

Here the exact same TextView in XML with the ID set correctly and the 

attributes we want to use defined. 

Figure 67. TextView in XML 

If we run the app window, we see that the TextView is where we want it 

and the text is the correct size. 

Figure 68. App with TextView 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 51 of 222 

IIE Module Manual        

PROG7313 

It is bad practice to hardcode the text that is displayed in the TextView in 

the XML file. What if you have used this value 10 000 times, and then the 

customer decides it needs to change? A better way is to define the value in 

strings.xml and reuse that everywhere. Then you can make the change in 

one place. The same is true for defining colours in color.xml too. 

3.4.4. 

Strings.xml (Setting String values to easily maintain or modify them) 

There is a folder called values under your res (resources) folder. If you 

expand it, you will see that it has three .xml files as shown in Figure 69. 

Figure 69. Files in the values folder 

These are used to store the colours, string values and styles of your app in 

one central place. We can define our values here and then make a single 

change that could take effect in multiple places in our application. 

For example, if we used the string “StarSucks originator of the mochaccino” 

on every single activity of our app. Let’s say we end up being sued by Luigi 

who is the originator of the mochaccino, and we need to chance it to 

“StarSucks originator of the chocciechino” if we ever want to sell coffee 

again. We could change this value instantly if we stored in strings.xml. Not 

so much if we hard coded it into every TextView… 

Open the strings.xml file. The first string was created by Android. It is your 

apps name and used in your Manifest file (more on this later). Add the 

second entry to use as the string value for our TextView 

Figure 70. Adding a New String Resource 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 52 of 222 

IIE Module Manual        

PROG7313 

We can now use this value in our XML. Instead of the literal value TextView, 

start typing an @ (see Figure 71). From the autocomplete pop-up, select 

our new string resource. 

Figure 71. Using the String Resource 

Figure 72. String Resource Now Used 

Whenever we now need these same “Order Now” words in the app, we can 

make use again of this same string. 

3.4.5. 

Colors.xml (Setting and easily maintaining of modifying app colours) 

Customers change the look and feel of their brands and products to stay 

relevant. You as a developer will often have to update your application’s 

look and feel to keep up with logo and slogan changes etc. from your 

customers. Figure 73 shows how dramatically different some well-known 

brands looked before their rebranding. 

Rebranding often involves entire new colour palettes too. It would be wise 

to have our colours stored so that they are easy to change. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 53 of 222 

IIE Module Manual        

PROG7313 

Figure 73. Branding Changes (TFPP Writer, 2018) 

3.4.5.1. 

Design and Colour Palettes 

Applications need good user interfaces that are easy to use and provide a 

good user experience. It does not matter how brilliant the code behind is. If 

the interface is not intuitive, lovely to look at and pleasing to use – chances 

are that the application will fail. It is important to carefully consider the 

colours and placement of UI elements. Let’s start with colour palettes. For 

those of us that are not trained designers, there are beautiful free colour 

palettes online that we can use. 

Have a look at https://colorhunt.co/palettes. You can find predefined colour 

palettes on this site to use. \[Accessed 17 November 2022]. 

Figure 74. Palettes from https://www.color-hex.com/color-palette/8208 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 54 of 222 

IIE Module Manual        

PROG7313 

Hovering over any of the colours will provide a hex value that you 

can use in colours resource file. 

Figure 75. Hex Value for a Colour 

3.4.5.2. 

Mobile Design Principles and Google Materials Design 

Colours and the correct use of colours go a long way to assist with 

designing applications that are both pretty to look at and possibly 

easy to use. Let’s start with Materials Design. Google provides the 

Materials Design website (available at https://material.io/design) that 

deals with everything from icons to colours to navigation. The good 

part about this is that Google has hired experts to provide 

developers with the know how so that we can create good 

applications. 

For example – if we look at the following colour palette for the 

Google site, we see the colour palette as well as how to apply it to 

an application. 

Figure 76. Applying Colours (Google, n.d.) 

You will also find best practices as to how one should code up the 

navigation through your application. Please take the time to refer to 

this website. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 55 of 222 

IIE Module Manual        

PROG7313 

Lastly, we need to carefully consider the placement of our UI 

elements so that our app is comfortable and easy to use. Look at 

the image below: 

Figure 77. Hand Positions for Controls (Abu Experience, 2017) 

UI and UX design have become an incredibly important part of 

software engineering and can no longer be ignored. The websites 

below discuss fantastic design principles that any app developer 

should try to adhere to: 

Abu Experience, 2017. 10 Mobile UX Design Principles You Should 

Know. \[Online] Available at: http://uxbert.com/10-mobile-ux-design

principles/ \[Accessed 30 December 2024]. 

Creative Bloq, 2012. The 10 principles of mobile interface design. 

\[Online] Available at: https://www.creativebloq.com/ mobile/10

principles-mobile-interface-design- 

4122910 \[Accessed 30 

December 2024]. 

3.4.5.3. 

Adding Colours to the color.xml File 

Now that we have looked at good use of colours and design 

principles, we can finally add some colours to our colors.xml file and 

use them. 

We can “borrow” the Starbucks colours which you can find on the 

following 

website: 

https://usbrandcolors.com/starbucks-colors/ 

\[Accessed 30 December 2024]. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 56 of 222 

IIE Module Manual        

PROG7313 

Figure 78. Starbucks Colours (U.S. Brand Colours, n.d.) 

For easy access, the hex colour is #29487d 

Open your colors.xml file and add the hex value to this file. You will 

notice that there are some default android colours available already. 

Figure 79. Colours Already in colors.xml 

Add the starsucksGreen colour as illustrated 

Figure 80. Adding the New Colour 

You will note that the colour appears in the margin. You can edit the 

colour here by clicking on the block and using the slider as shown 

in Figure 81. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 57 of 222 

IIE Module Manual        

PROG7313 

Figure 81. Editing the Colours 

This makes it quite easy to add your own colours – just copy over a 

colour, change the name, and edit it using the colour mixer. 

You can now apply the colour to the text in the edit text as shown in Figure 82. 

Figure 82. Adding the textColor Attribute 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 58 of 222 

IIE Module Manual        

PROG7313 

Figure 83. Text Colour Now Applied to the TextView 

Our text is now Fakebook green but still fairly simple. We will 

change that next by adding a font. 

3.4.6. 

Adding Fonts to your Project 

We will be using the Layout Editor to add our fonts. It is easier and 

quicker to do it here and not in XML. Click on the TextView and 

search for the fontFamily attribute. 

Figure 84. Choosing a Font 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 59 of 222 

IIE Module Manual        

PROG7313 

Click More Fonts to get access to the Google fonts. (Scroll down to see that option.) 

These fonts are open source and easy to use. 

Figure 85. Choosing a Google Fonts Font 

Select any font you like from the list. You will notice that there are 

two options when you select a font, these are: 





Create downloadable font 

Add font to project 

The downloadable font might not work if there is no internet 

connection as the font needs to be downloaded. If you add the font 

to the project it will always be available, but this creates large apk 

(Android install) files. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 60 of 222 

IIE Module Manual        

PROG7313 

Figure 86. Selecting a Downloadable Font 

Android Studio will automatically create the font files in the res folder. 

Figure 87. Fonts Added 

You 

can 

learn 

more 

about 

fonts 

here: 

https://developer.android.com/guide/topics/ui/look-and-feel/fonts

in-xml \[Accessed 30 December 2024]. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 61 of 222 

IIE Module Manual        

PROG7313 

The XML for our TextView is shown in Figure 88. 

Figure 88. TextView XML with Font 

And the app is shown in Figure 89. 

Figure 89. App running with font 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 62 of 222 

IIE Module Manual        

PROG7313 

3.5. Running an App 

Now we can run the app in the emulator again to see what it looks 

like. And so far, it looks good, even though it doesn’t do much yet. 

Figure 90. Our App Running in the Emulator 

Let’s look at what happens behind the scenes when the app is built and executed. 

Gradle is the build system that creates your Android Package Kit 

(APK). The APK is what is installed on your emulator or phone when 

you run your app. Gradle takes all your XML files in the res folder 

as well as all your Java files in the src folder as well as any 

dependencies that you have added to your project (you will see later 

in Firebase) and runs a script to build your APK. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 63 of 222 

IIE Module Manual        

PROG7313 

A script is a coding file that automates processes – in this case 

creating the APK. It is completely possible to create your own build 

script. You could use a language such as Groovy or bash scripting 

to do so. For now, we will rely on Gradle. 

The Gradle configuration is made up of several files which can be 

divided into two categories: 





Top level build.gradle 

Module level build.gradle. 

Figure 91. Gradle Files 

The top level Gradle script contains the settings for your entire 

project and the module layer Gradle script contains the settings for 

just this application. 

Figure 92. Top-level Gradle Script 

You will notice that Android uses Maven for libraries. Maven is 

repository that automates a lot of the build process for us. Including 

creating the folder structure below. You should be familiar with it by 

now. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 64 of 222 

IIE Module Manual        

PROG7313 

Figure 93. Maven Folder Structure 

The module Gradle file contains information specific to our 

application from the compiled SDK version, the min SDK version, the 

version code of our app to the external libraries (dependencies) that 

we import. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 65 of 222 

IIE Module Manual        

PROG7313 

Figure 94. Module Level Gradle Script 

Gradle can break spectacularly – don’t worry too much if this 

happens. You should easily find a solution if you Google the error 

that Gradle throws. 

3.5.1. 

Running on your phone 

Besides running the app in the emulator, you can also run the app 

on your phone if you have an Android device. You can connect using 

USB or even wi-fi (Android 11 or later). Read more about the setup 

process in (Android Open Source Project, 2022c) 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 66 of 222 

IIE Module Manual        

PROG7313 

When the app is just being run on the emulator, or on your phone, you 

can successfully use an APK file. But when we get to publishing the 

app (more about that in PROG7314), apps are built as a bundle 

instead. It is a different format that allows the Play Store to do smart 

things like deliver game assets. Read more in (Android Open 

Source Project, 2022d). 

3.6. Internationalizing an App 

We next want to make translations available to our users. Android 

displays applications in information based on the language settings 

of the device it runs on. We would like to translate the values in our 

app for different language settings. You start by setting the string 

values that you are willing to translate to translatable="true" for 

the 

values that you want to translate and then 

translatable="false" for the values you wish to not translate. 

See 

https://developer.android.com/guide/topics/resources/loca

lization?hl=en \[Accessed 17 November 2022]. 

Figure 95. Marking Strings as Translatable 

Click Open editor (top-right corner of the editor window). This can 

also be accessed by right-clicking on the strings.xml file and 

choosing Open Translations Editor. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 67 of 222 

IIE Module Manual        

PROG7313 

Figure 96. Adding a Locale 

Click Add Locale (  ) and then select the language you would like 

to translate your values to. 

Enter the translation in the column for the new locale. 

Figure 97. Enter the Translation 

And that is all we need to do. The label already uses the string 

resource, and Android will take care of loading the resources for the 

right language when the app runs. 

Tip: You can change the language of the Android operating system running on the 

emulator to see the translation in action. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 68 of 222 

IIE Module Manual        

PROG7313 

4\. Recommended Additional Reading 

Abu Experience, 2017. 10 Mobile UX Design Principles You Should 

Know. \[Online] Available at: http://uxbert.com/10-mobile-ux-design

principles/ \[Accessed 30 December 2024]. 

Android Open Source Project, 2020g. Layouts. \[Online] Available at: 

https://developer.android.com/guide/topics/ui/declaring-layout   

\[Accessed 30 December 2024]. 

Creative Bloq, 2012. The 10 principles of mobile interface design. 

\[Online] Available at: https://www.creativebloq.com/ mobile/10

principles-mobile-interface-design- 

4122910 \[Accessed 30 

December 2024]. 

Lake, I., 2016. Layouts, Attributes, and you. \[Online] Available at: 

https://medium.com/androiddevelopers/layouts-attributes-and-you

9e5a4b4fe32c \[Accessed 30 December 2024]. 

5\. Recommended Digital Engagement and Activities 

The Guru PROG7313 playlist on YouTube has a lot of useful 

videos created for this module. The full playlist can be found here:  

https://www.youtube.com/playlist?list=PL480DYS

b\_kfySounaa52kuNkhsGK-LpZ \[Accessed 30 December 2024]. 

For this learning unit, watch the following videos from that playlist: 

\[YouTube] 

Create 

an 

Android 

Project 

https://youtu.be/WwIpOwgR6aI \[Accessed 30 December 2024]. 

Studio 

\[YouTube] Android Studio Features https://youtu.be/YtjRZhKFYvY 

\[Accessed 30 December 2024]. 

\[YouTube] 

Additional 

Android 

Studio 

Features 

https://youtu.be/Ibqkzv9Vp7g \[Accessed 30 December 2024]. 

\[YouTube] Introduction to UI layouts and adding an image to the 

drawable folder https://youtu.be/7xy2\_qVK5b0 \[Accessed 30 

December 2024]. 

\[YouTube] Understanding Code and Design view as well as 

ViewGroups https://youtu.be/FKADfBdNLns \[Accessed 30 

December 2024]. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 69 of 222 

IIE Module Manual        

PROG7313 

\[YouTube] Add Image to Constraint and Linear Layout 

https://youtu.be/Qy5ZZyiyjRI \[Accessed 30 December 2024]. 

\[YouTube] Add a Textview and work with Strings Colors and Fonts 

https://youtu.be/zJU0UmOeTck \[Accessed 30 December 2024]. 

\[YouTube] Add Emulator and Run App 

https://youtu.be/UcGjgeE-l2k 

\[Accessed 

30 December 2024]. 

\[YouTube] Running app and working with colours and thumb reach 

https://youtu.be/rspEeRZ6wqA \[Accessed 30 December 2024]. 

6\. Activities 

Do the activities that appear on Arc. 

7\. Revision Exercises 

Create your own application that displays a list of funny cat pictures 

(or any kind of meme that you enjoy). Make sure you include a 

caption (using a TextView) for each image. 

8\. Solutions to Revision Exercises 

Compare your solution to the example StarSucks application on 

GitHub. Also check if all your images and TextViews are displaying 

properly. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 70 of 222 

IIE Module Manual        

PROG7313 

Learning Unit 3: Introduction to Kotlin 

Learning Objectives: 









Differentiate between Kotlin and Java or C#. 

Use Kotlin to write a basic program with variables and 

calculations. 

Explain the following object-oriented programming 

concepts: 

o

o

o

Inheritance; 

encapsulation; 

My notes 

polymorphism. 

Explain object-oriented programming in Kotlin. 

Material used for this learning unit: 



GitHub repository: LearningUnit3 

How to prepare for this learning unit: 



Make sure that you have the GitHub source code 

available and that your Android Studio is up to date. 

1\. Introduction 

In the first two learning units, we have only really looked at using 

Android Studio to build the user interface of our app. This is of 

course a very important part of an app, since the user interface 

affects very directly the user experience of the app. But a user 

interface without code behind it that handles the logic can only go 

so far. 

In this module, we are using the Kotlin programming language. 

Unless you have done Android development before, you are not 

likely to have used this language before. The purpose of this learning 

unit is to introduce you to the basic features of the language. 

Whether you consider your main programming language to be Java 

or C#, you will see lots of familiar concepts in Kotlin. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 71 of 222 

IIE Module Manual        

PROG7313 

2\. Kotlin Basics 

2.1.1. 

What is Kotlin? 

Definition 

“Kotlin is a general purpose, free, open source, statically typed ‘pragmatic’ 

programming language initially designed for the JVM (Java Virtual Machine) and 

Android, and combines object-oriented and functional programming features.” 

(Heller, 2022) 

Looking at this definition, we see that Kotlin was designed with 

Android development in mind. That is good news for use, since it 

means that it is particularly well suited to what we want to achieve 

in this module. 

Another point is that the language is statically typed. This means 

that the types of variables are known at compile time, and the 

compiler will be able to catch a lot of errors before you even run the 

program for the first time. (Bhatnagar, 2018). 

The last point that is important is that it has features from object

oriented programming as well as functional programming. You have 

done a lot of object-oriented programming already, so the concepts 

will be familiar even if the syntax is slightly different. 

Kotlin has great documentation that describes all the features of the 

language. If you want to dive straight into the docs, start here: 

https://kotlinlang.org/docs/basic- 

syntax.html 

December 2024]. 

\[Accessed 30 

There is also quite a useful tool for learning Kotlin - the Kotlin 

Playground. It is an online environment where you can write and run 

basic Kotlin programs without having install anything. We will do 

most of our coding for this module in Android Studio, of course. But 

for the purpose of writing simple Hello World kind of programs, the 

Kotlin Playground is useful. You can access it here: 

https://play.kotlinlang.org/ \[Accessed 30 December 2024]. 

2.2. Basic Syntax 

All programming languages have their quirks that developers don’t 

appreciate. You have probably had your fair share of compiler errors 

complaining about semicolons (;) before in Java and/or C#, for 

example. One of the obvious ways to spot Kotlin code is the absence 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 72 of 222 

IIE Module Manual        

PROG7313 

of semicolons. If you space the code in an unambiguous way, you 

can leave out almost all semicolons! 

Figure 98. Hello World in Kotlin (kotlinlang, n.d.) 

The code will compile with semi-colons too, but that isn’t considered 

good style in Kotlin. 

Just like Java, Kotlin has the concept of a package that contains 

related classes (called a namespace in C#). And just like Java it 

uses the import keyword to make use of a package (like using in 

C#). (Kotlin Foundation, 2022) 

The starting point for a Kotlin program is a function called main. An 

example of that is shown in Figure 98. This is the first place where 

we encounter a functional aspect of the language. You can have a 

function that exists outside of a class. 

2.3. Declaring Variables 

Two keywords are used in Kotlin to declare variables: val (can 

assign a value only once), and var (a normal variable). (Kotlin 

Foundation, 2022) 

You will recall that we said that Kotlin is statically typed. So, the 

types of the variables are known at compile time. However, that 

doesn’t mean that you need to specify the type – the compiler can 

infer the type if you assign a value. 

Figure 99. Declaring and printing a variable 

In Figure 99, we have a very small Kotlin program. It declares a 

variable called favouriteNumber and sets the value to 14. Because 

the value is assigned, the compiler infers that the variable must be 

an integer. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 73 of 222 

IIE Module Manual        

PROG7313 

Figure 100. Adding an explicit type 

If we wanted to, we could also specify the type of the variable 

explicitly when it is declared, like the example in Figure 100. 

Figure 101. Trying to change the value of a val 

Recall that if a variable is declared with the val keyword, the value can 

only be assigned once. If we try to change the value later, we get an 

error at runtime indicate that we cannot do this. So, let us change 

the declaration to var instead. 

Figure 102. Incrementing a var 

Yep, that works as expected. All the normal arithmetic operators like 

+, -, \*, / work just like they would in Java and C#. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 74 of 222 

IIE Module Manual        

PROG7313 

2.4. Conditional Statements 

A normal if statement in Kotlin works pretty much like you would 

expect from Java and C#. Let us look at an example. 

Figure 103. If statement 

No surprises there. We see the curly brackets around the if and else 

blocks just like in Java and C#. 

There is no ternary operator (?:) in Kotlin, because you can use an 

if instead. (Kotlin Foundation, 2022b) The syntax look like this: 

Figure 104. Using if as an expression 

The when statement in Kotlin works a lot like switch in Java and C#. 

(Kotlin Foundation, 2022b) It is ideal when you have a variable that 

can have different values, and you need to do something different 

for each value. 

Figure 105. When statement 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 75 of 222 

IIE Module Manual        

PROG7313 

The interesting thing here is the syntax. The first line matches both 

0 and 1. This illustrates the conciseness of the language. 

2.5. Loops 

For-loops in Kotlin can only be used for looping over something that 

provides an iterator (like a collection or a range). These behave a lot 

like a foreach loop in C# or a for-loop in Java that loops over a 

collection. Let us look at two simple examples. 

Figure 106. For-loop adding up five first five integers 

Figure 107. While-loop adding up five first five integers 

The difference between the loops is that the for-loop example uses a 

range expression to create something the loop can iterate over. And 

the while-loop example has a more traditional control variable that 

we control ourselves. 

Kotlin supports the break and continue keywords just like Java and C#. 

For more details about the other language features of Kotlin not 

described here, do read through the official documentation. It is a 

concise description of the language, building on existing 

programming knowledge of the reader. Perfect for you with your 

Java and/or C# skills. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 76 of 222 

IIE Module Manual        

PROG7313 

Table 1. Quick comparison of Java, Kotlin and C# 

Java 

Kotlin 

Semicolons mandatory 

C# 

Semicolons optional 

package 

Semicolons mandatory 

package 

import 

namespace 

import 

using 

void method() {} 

fun function() {} 

System.out.println("Java"); 

void Method() {} 

println("Kotlin") 

int j = 0; 

Console.WriteLine("C#"); 

var j = 0 

var j = 0; 

final c = 9; 

val c = 9 // or 

val c: Int = 9 

int a = b > 0 ? b : 0; 

var a = if (b>0) b else 0 

const int c = 9; 

switch 

int a = b > 0 ? b : 0; 

when 

switch 

for can loop over anything 

for loops over iterable 

for can loop over anything 

Now is a good time for you to write a few small programs in Kotlin, just so 

you can get used to the differences in syntax. 

3\. Object-Oriented Programming in Kotlin 

Before we jump into object-oriented programming (OOP) in Kotlin, let us 

revise some essential concepts. 

3.1. Object-oriented Concepts 

Encapsulation 

Encapsulation is about hiding “the internal state of one object from the 

others”. (Shaukat, 2016) The idea is to separate the parts of the program 

from one another, which helps to make our programs easier to debug and 

maintain. 

Inheritance 

“Inheritance is an “is-a” relation, which inherits the attributes and behaviors 

from its parent class.” (Shaukat, 2016) For example, we could have a 

vehicle class that specifies behaviour which can be inherited by the car and 

truck classes. 

Polymorphism 

“Polymorphism is the ability of one object to be treated and used like 

another object.” (Shaukat, 2016) In our vehicle example, all vehicles could 

have a turn method. And we can call the method in the same way for any 

vehicle. But what the vehicle does in its turn method would be quite different 

between a motorcycle and a big rig truck, for example. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 77 of 222 

IIE Module Manual        

PROG7313 

3.2. Object-oriented Programming in Kotlin 

3.2.1. 

Classes and Inheritance 

Let us look again at the code from learning unit 2. We very briefly just 

mentioned that we have Kotlin code that specified behaviour. Let us look at 

the generated MainActivity class in Figure 108. 

Figure 108. Generated MainActivity class 

A class is declared using the class keyword, just like you would expect in 

Java or C#. Inheritance is specified using : just like in C#. But there is a 

difference though. You will see that there are round brackets () after the 

parent class name, in this case AppCompatActivity. That means that the 

default constructor of the parent class is called then this MainActivity class 

is instantiated. 

Android Studio makes it easy to navigate between different classes. If you 

hold Ctrl and click on the name of the AppCompatActivity class in the above 

code, Android Studio will take you to the code for that class. Recall that the 

Android code is open source, so we have access to all the code that our 

program is calling. 

Figure 109. AppCompatActivity code in Android Studio 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 78 of 222 

IIE Module Manual        

PROG7313 

3.2.2. 

Declaring a Method 

In our example in Figure 108, we have a method that is declared. It happens 

to also be an override of a method in AppCompatActivity. But here we do 

see the syntax for declaring a method. The fun keyword is used to declare 

a function. It can be either a top-level function (outside a class), or a method 

(inside a class). 

The syntax for parameters follows the format name: type, which is unlike 

Java and C#. But you will recognise the format from when we declared 

variables with explicit types. 

3.2.3. 

Properties 

Properties in Kotlin work a lot like properties in C#. A property is a member 

variable of a class that allows access to a field by means of a getter and 

setter. Auto-implemented properties in C# automatically create a backing 

variable without you having to specify it. (Wagner, et al., 2022) Properties 

in Kotlin work like that too. 

Figure 110. Property with a setter 

For the property greeting, we defined a custom setter, that checks if the value 

is empty, and only sets the value of the backing field if it is in fact not empty. 

We don’t want to end up with an empty greeting message in our app, after 

all. 

Remember, for more details about the Kotlin language, read the official 

documentation. Now we are ready to use Kotlin code in our apps in the next 

learning unit. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 79 of 222 

IIE Module Manual        

PROG7313 

4\. Recommended Additional Reading 

Kotlin 

Foundation, 2022. Basic syntax. \[Online] Available at: 

https://kotlinlang.org/docs/basic-syntax.html \[Accessed 30 December 

2024]. 

Maurya, A. 2022. Object-Oriented Programming in Kotlin \[OOP in Kotlin — 

2022] \[Online] Available at: https://blog. devgenius.io/object-oriented

programming-in-kotlin- oop-in-kotlin-2022-90dea0f5776c \[Accessed 30 

December 2024]. 

5\. Recommended Digital Engagement and Activities 

Learn Kotlin by Example is a collection of example programs that you can 

explore to get more familiar with the language. Start here: 

https://play.kotlinlang.org/byExample/overview \[Accessed 30 December 

2024]. 

Work through the Introduction to Kotlin training material on the android.com 

website at: https://developer.android.com/ courses/pathways/android

basics-kotlin-one \[Accessed 30 December 2024]. 

6\. Activities 

Do the activities that appear on Learn. 

7\. Revision Exercises 

Write a small Kotlin program that prints out the following text pattern: 

8\. Solutions to Revision Exercises 

Read section 2.5 about loops above. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 80 of 222 

IIE Module Manual        PROG7313 

© The Independent Institute of Education (Pty) Ltd 2026    Page 81 of 222 

Learning Unit 4: More Advanced Techniques 

Learning Objectives: 

 Apply layouts in an app. 

 Use the EditText, NumberFormat and SeekBar in an 

 app. 

 Use a navigation drawer in an app. 

 Apply colours to an app. 

 Create a launcher icon for an app. 

 Apply event handling in an app. 

 Explain the activity life cycle in an Android App. 

 Create an activity. 

 Use overridden methods. 

 Explain the purpose of an intent. 

 Apply an intent in an application. 

My notes 

Material used for this learning unit: 

 GitHub repository: LearningUnit4 

&#x20;

How to prepare for this learning unit: 

 Make sure that you have the GitHub source code available 

and that your Android Studio is up to date. 

&#x20;

&#x20;

1\. Introduction 

&#x20;

Now that we can design a UI and run an application, and we know some 

Kotlin too, the time has come to add logic to our app. We are going to slowly 

build up to an application that has two activities and that can pass data 

between the two activities. We are also going to delve deeper into the linear 

layout and create a nested hierarchy. We will use toasts and intents on our 

second activity. 

&#x20;

And finally, we are going to add a navigation drawer to the app to improve 

the user experience. 

&#x20;

2\. Layouts and Controls 

&#x20;

2.1. Removing the Action Bar 

&#x20;

Let’s start by updating our UI. We are currently only displaying an 

ImageView and a TextView. We want our application to resemble the UIs 

shown in Figure 111. We want to display a scrollable list of all the products 

that our coffee shop sells. 

&#x20;

IIE Module Manual        

PROG7313 

Figure 111. Updated User Interface – Our Goal 

The first thing we need to do, is to remove the action bar. The action bar is 

the ugly looking bar on the top of your app that shows your application 

name. 

Figure 112. Action bar in the StarSucks App 

You could have actions appearing there in your app. But we are not going 

to do that. So, the action bar needs to go. 

The easiest way to remove the action bar is to access the themes.xml file 

from the 

values\\themes folder and to edit the style entry. Change the parent 

attribute to: Theme.Material3.DayNight.NoActionBar 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 82 of 222 

IIE Module Manual        

PROG7313 

Figure 113. Changing the style parent 

Make a similar change to the themes.xml (night) file too, setting the parent 

of the style to: 

Theme.Material3.DayNight.NoActionBar 

Now when we run the app again, the action bar no longer appears. 

Figure 114. App without the Action Bar 

2.2. Adding More UI Components 

We previously spoke about the fact that you can nest different views inside 

each other. To recreate what we see in Figure 111, we need to first add a 

ScrollView. That is the component that will allow the list to scroll if it is 

longer than can be displayed on the screen at the same time. 

You can find the ScrollView component under the Common category on 

the Palette. 

Inside the ScrollView, we want to display a couple of ImageViews, 

vertically below one another. That is probably feeling familiar by now – we 

can use a LinearLayout (with vertical orientation) to do that. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 83 of 222 

IIE Module Manual        

PROG7313 

Next, we add six ImageViews – one for each of the image assets sb1, sb2, 

sb3, sb4, sb5 and sb6. 

Tip: If you are using the Layout Editor, drag the ImageView onto the LinearLayout 

in the Component Tree. If you drag it onto the visual representation, it will not add 

it. 

Go ahead and create the UI (either using the Layout Editor or the XML view – it is your choice). The completed UI should look like the one shown in 

Figure 115. Look specifically at the hierarchy of components shown in the 

Component Tree. We have a LinearLayout that contains a ScrollView 

that contains a LinearLayout that contains the six ImageViews. 

Figure 115. Completed UI in the Layout Editor 

Note that the order that the components appear in the Component Tree 

will be the order that they will appear in the LinearLayout at runtime too. 

Another important thing to note here is the naming convention that is used 

for the various components. There is no standard naming convention that 

is specified by the Android Open Source Project for components in the XML 

file. But it is important to stick to a naming convention throughout the app. 

And if you name your components well, it will be easy to spot mistakes when 

you access these from the code a little later.  

© The Independent Institute of Education (Pty) Ltd 2026    

Page 84 of 222 

IIE Module Manual        

PROG7313 

For this module manual, we will make use of the convention of adding a 

prefix followed by an underscore followed by an easy-to-understand name. 

The prefixes that we use are as follows (inspired by (Jethro, 2018)): 











ImageView: img 

TextView: tv 

Button: btn 

EditText: et 

FloatingActionButton: fab 

Here is the complete layout in XML. Pay careful attention to how the 

elements are nested. 

Figure 116. Completed XML part 1 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 85 of 222 

IIE Module Manual        

PROG7313 

Figure 117. Completed XML part 2 

3\. Event Handling 

We now have plenty UI elements (Views) and it is time to add some logic 

and event handling to our application. We have previously discussed how 

the R class and the resource (res) folders work. We will now put this 

information to work. 

Android developers use either activities or fragments to design their 

applications UI and code up the logic. We will work with fragments in 

PROG7314, intermediate mobile app development. We will focus on 

activities for now. You can think of an activity as a single screen in your 

application. Your application might have multiples screens, similarly to how 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 86 of 222 

IIE Module Manual        

PROG7313 

the one we are about the develop will have. Each screen (activity) is made 

up of two parts. The Java file and the XML file. 

The MainActivity is created by default when you create your application 

and the corresponding two files that make up the activity is immediately 

available for use. 

These two files are: 





MainActivity.kt which is a Kotlin class that allows us to code up the 

logic of our application. 

activity\_main.xml: Which you by now know is the XML file where we 

create the UI for the activity. 

Figure 118. Two Files that Make Up the MainActivity 

3.1. Declaring and Initializing UI Elements 

We want to add logic to our program now, so we are going to be working in 

the Kotlin code. When working in the Kotlin code, we don’t automatically 

have access to the UI components. But there are two different ways of 

getting access to these components. 

3.1.1. 

Old-fashioned manual way 

To get the variables in the old-fashioned way, we need to declare fields for 

them and then initialise them too. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 87 of 222 

IIE Module Manual        

PROG7313 

Open the MainActivity.kt file and add the following properties to it: 

Figure 119. Properties in the MainActivity 

We don’t have a value for these properties when we declare them, so 

we add the 

lateinit keyword to indicate that we will initialise these later. 

You will notice that we use the UI elements (Views) much like data types 

such as String, int, float and double. You should also notice that the “data 

types” (class names) start with a capital letter. If you think back to the 

naming conventions that you have learned, you will remember that class 

names start with capital letters in Kotlin. The ImageView “data type” is 

named in Pascal case (starts with a capital letter) because it is a class. If 

you have the sources installed, and you press Ctrl on your keyboard and 

click on the ImageView “data type”, the ImageView class will open as shown 

in Figure 118. 

Figure 120. ImageView Class from the Android Code 

If you look at this code, you will notice that it is written in Java, not Kotlin. 

This class contains almost 2000 of lines of code which defines constructors, 

and all the methods and properties that we can programmatically use for 

an ImageView. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 88 of 222 

IIE Module Manual        

PROG7313 

One of the methods of ImageView that we will be using often in 

setImageResource() – the method shown in Figure 119. 

Luckily, the Android UI classes abstracts away the complexities of drawing 

user interfaces in the Android Operating System. It is sometimes useful to 

be able to read the code when something is not working, but we don’t need 

to understand all the details to be able to make good use of an ImageView. 

Figure 121. setImageResource() Method 

When you declare the ImageView fields shown in Figure 117, you may run 

into the issue shown in Figure 120. 

Figure 122. Unresolved reference error 

This error happens when the import is missing and is most likely to happen 

if you copy and paste code rather than typing it out. As the blue tooltip 

suggests, press Alt + Enter. This will add the import as shown in Figure 

121\. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 89 of 222 

IIE Module Manual        

PROG7313 

Figure 123. Import Added 

Right now, all the variables are still uninitialized. So, we now need to 

initialise our variables. We do this by pointing our Kotlin class to the correct 

XML ID which is stored in our R class. We do this in the onCreate() 

method, which is one of the activity life cycle methods that we will discuss 

in more detail in section 4. We will use the findViewById() method to link 

our XML and Kotlin. 

Figure 124. Finding the ImageView by its ID 

The 

findViewById()

inherits from 

method (which our MainActivity  

AppCompatActivity) expects an int value as a parameter. 

We access that int value by accessing our R class. Inside the R class we 

will find the nested (inner) class called id, and inside that we find the IDs for 

all our components in the app. 

Note that component IDs need to be unique in the whole app, not just on 

the specific layout where it is used. 

All the initialisation code in the onCreate() method is shown in Figure 123. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 90 of 222 

IIE Module Manual        

PROG7313 

Figure 125. All the Fields Initialized 

Note: It is very important that the initialization must be after the setContentView() 

method is called. Before setContentView() completes, findViewById() will just 

return null for all the elements. 

3.1.2. 

Using View Binding 

I am sure you will agree that this is quite tedious. We have already 

created the ImageViews in the XML – why do we need to create a property 

for each one? Well, the good news is there is a more modern and easier 

way, using View Binding. (Leiva, 2020) 

The first step is to change something in a gradle.build file. Open the 

gradle.build file for the Module: StarSucks.app. In this file, there are a whole 

bunch of properties used by Gradle during the build process. Add the below 

highlighted row to the file, save it, and rebuild the project. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 91 of 222 

IIE Module Manual        

PROG7313 

Figure 126. Enabling View Binding 

Now we can change the code to use View Binding. You can delete the 

properties and delete all the rows to find the views. Instead, replace the 

setContentView line with the two lines shown Figure 125. 

Figure 127. Using View Binding 

Much less code to write. And we don’t need to add code to get components 

if we add more of those to the view later. 

3.2. Adding Event Handlers 

Event handlers allow us to provide the logic that we would like our 

application to perform when our users interact with the UI elements of our 

application. There are many event handlers such as onTouch, 

onSelectionChanged, onClick etc. available in Java for Android. You will 

learn most of them as you start working of different UI elements. We are 

going to start with a simple OnClickListener. 

An OnClickListener reacts when the user clicks or taps on one of our UI 

elements. We are going to set an OnClickListener on each of our 

ImageViews and pop up a Toast message when a user taps on the 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 92 of 222 

IIE Module Manual        

PROG7313 

ImageView. We will optimise this code later. We are going to practice for 

now. 

It is easy to add an OnClickListener. In the onCreate method, we can 

now use the binding to access our controls. Simply type binding. followed 

by the name we gave the ImageView and start typing 

.setOnClickListener. 

Auto complete will pop up with the list of possible methods that can be 

called (see Figure 126). With the setOnClickListener method selected 

on the autocomplete pop-up, press Enter. 

Figure 128. Start Typing setOnClickListener Shows Autocomplete Pop-Up 

You should have the following code now: 

binding.imgSb1.setOnClickListener()  

Add {} so we have a space to put the code that gets executed when the 

image is tapped. 

Figure 128. Adding the {} 

So, what exactly is going on in the generated code? If we Ctrl+click on the 

setOnClickListener, we see that the method is expecting a class 

implementing the interface View.OnClickListener. And if we click 

through to that, we see that it has a single method – onClick(). 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 93 of 222 

IIE Module Manual        

PROG7313 

Figure 130. setOnClickListener 

Figure 131. Declaration of View.OnClickListener 

This syntax makes use of a Lambda in Kotlin. (al3c, 2022) so, we can avoid 

having to use anonymous inner classes. 

3.2.1. 

Adding Toast Messages 

Toast messages are handy little messages that pop up to give your user 

information and status updates about your app. They appear for a short 

period of time and then disappear. We are going to use Toast messages 

to display the name of the selected product when we click on it. Add the 

following code inside the OnClick() method. 

Start typing Toast and select the second option from the IntelliSense pop-up. 

Figure 132. Starting with the Toast 

A Toast message needs the following arguments: 



A context (telling Android which activity the toast should appear in) 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 94 of 222 

IIE Module Manual        

PROG7313 





The text that you would like to display 

The duration of the Toast (you have two options: LENGTH\_SHORT and 

LENGTH\_LONG) 

Figure 133. Displaying the Toast 

The Toast message will appear on the MainActivity, for a short duration. 

Also note the show() method. Without this our Toast will never appear! 

Note: Kotlin, like C#, does have the concept of named arguments. But the context: 

label here is just something that is displayed by the IDE for convenience, not 

something that you should type! Named arguments in Kotlin use an = not a colon. 

Now when we run the app and we tap the first ImageView we will see our message. 

Figure 134. Toast Message in the Running App 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 95 of 222 

IIE Module Manual        

PROG7313 

Go ahead and add the Toast message for all the other images too. The 

messages should be as follows: 

sb2: Chocco Frapp 











sb3: Bottled Americano 

sb4: Rainbow Frapp 

sb5: Rainbow Frapp 

sb6: Black Forest Frapp 

Compare your code to the code in the sample repository if you struggle to 

make it work. 

You might be thinking right now that having so many copies of these 

anonymous inner classes can’t possibly be the best way to do this. And you 

would be right. We will improve this implementation in section 5.1. 

3.3. Activity Life Cycle 

Each Android activity has a lifecycle. This consists of methods we use to 

provide logic for when users click off the activity, click back on the activity, 

start the activity, or close the activity. The life cycle is shown in Figure 133. 

Figure 135. Simplified Activity Life Cycle (Android Open Source Project, 2020j) 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 96 of 222 

IIE Module Manual        

PROG7313 

Any activity has four essential states and are essentially stacked in the 

memory. When you click off one app and onto another the activity you left is 

placed “behind” the activity you are currently on. These states can be 

explained as: 









Active/ Running: This occurs when the activity is on the top of the 

stack and currently being used. 

Lost Focus: This activity is still visible to user but not currently being 

used. 

Stopped: This activity is completely taken over by another activity and 

no longer visible to the user. The window is hidden until the user 

recalls it. 

Destroyed: The activity is dropped from the memory (killed) 

As previously mentioned, the activity life cycles are methods that we use to 

provide logic for user actions when using, pausing, and stopping the 

application. These methods are listed in Figure 134. 

Figure 136. Life Cycle Methods (Android Open Source Project, 2020j) 

These methods are described below. From (Android Open Source Project, 2020j). 

Method 

Function 

onCreate() 

Called when the activity is first created. This is where you should do 

all of your normal static set up: create views, bind data to lists, etc. 

This method also provides you with a Bundle containing the activity's 

previously frozen state, if there was one. 

Always followed by onStart() 

onRestart() 

Called after your activity has been stopped, prior to it being started 

again. 

Always followed by onStart() 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 97 of 222 

IIE Module Manual        PROG7313 

© The Independent Institute of Education (Pty) Ltd 2026    Page 98 of 222 

onStart() Called when the activity is becoming visible to the user. 

Followed by onResume() if the activity comes to the foreground, or 

onStop() if it becomes hidden. 

onResume() Called when the activity will start interacting with the user. At this 

point your activity is at the top of its activity stack, with user input 

going to it. 

Always followed by onPause(). 

onPause() Called when the activity loses foreground state, is no longer 

focusable or before transition to stopped/hidden or destroyed state. 

The activity is still visible to user, so it's recommended to keep it 

visually active and continue updating the UI. Implementations of this 

method must be very quick because the next activity will not be 

resumed until this method returns. 

Followed by either onResume() if the activity returns back to the 

front, or onStop() if it becomes invisible to the user. 

onStop() Called when the activity is no longer visible to the user. This may 

happen either because a new activity is being started on top, an 

existing one is being brought in front of this one, or this one is being 

destroyed. This is typically used to stop animations and refreshing 

the UI, etc. 

Followed by either onRestart() if this activity is coming back to 

interact with the user, or onDestroy() if this activity is going away. 

onDestroy() The final call you receive before your activity is destroyed. This can 

happen either because the activity is finishing (someone called 

Activity#finish on it), or because the system is temporarily destroying 

this instance of the activity to save space. You can distinguish   

between   these   two   scenarios   with 

the Activity#isFinishing method. 

&#x20;

3.3.1. Adding a New Activity 

Now that we have added some logic to our app, it is time to add an extra 

activity and some more sophisticated functionality. We will start by adding 

a second activity and creating a UI for this activity. 

&#x20;

Adding a new activity is very easy to do. To create a new empty activity: 

&#x20;

1\. Right-click on your package in the project folder where you want to create it. 

2\. Click New, then Activity and then Empty Activity (see Figure 135). 

The New Android Activity dialog will be displayed. 

3\. On the New Android Activity dialog (see Figure 136), give the new activity a 

name – call it OrderDetailsActivity. 

4\. Make sure that the Generate a Layout File checkbox is selected. 

5\. Double check that the package name is the one where you want to 

create it. Click Finish. 

IIE Module Manual        

PROG7313 

Figure 137. Creating a New Activity 

Figure 138. Configuring the New Activity 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 99 of 222 

IIE Module Manual        

PROG7313 

The new Kotlin file and XML file will be added to the project, as shown in 

139\. 

Figure 139. New Files added to the App Project 

3.3.2. 

Adding the UI for the New Activity 

We are going to create the UI as shown in Figure 138. 

Figure 140. Order Details UI 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 100 of 222 

IIE Module Manual        

PROG7313 

This UI will display the Image of the product we selected, the name of the 

product and allow us to enter our name and nell phone number for delivery. 

Figure 141. The New User Interface in the Designer 

The new UI elements that you will encounter is an EditText and a 

FloatingActionButton (FAB). EditTexts allows users to enter 

information into the application and can have predefined formats such as 

Text, Number, E-mail, Phone number etc. 

You will design this UI in the same as we did for the first activity. We will have 

a nested layout that contains our UI elements, as shown in 1. 

For now, we are just using @mipmap/ic\_launcher for the image. It is just a 

place holder – we will set it programmatically after the user choses their 

beverage. 

Notice the hints that are set for the two EditTexts. The hint will only be 

displayed when nothing has been entered yet. 

The FloatingActionButton makes use of the smallheart.png image, the 

you will find in the LearningUnit4\\assets folder in the repository. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 101 of 222 

IIE Module Manual        

PROG7313 

Figure 142. New User Interface in the Layout Editor 

Add the FloatingActionButton by using the Layout Editor. If it prompts 

you to add a dependency, accept it. This will add the library to your project 

that you need for the FloatingActionButton to work. Wait for the Gradle 

sync to complete, then the button will appear. 

The colour for the button is starsucksRed, which is #F0154C. The Layout 

looks like this in XML: 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 102 of 222 

IIE Module Manual        

PROG7313 

Figure 143. New UI XML layout 

For guidelines about using floating action buttons in your user interfaces, 

read 

https://material.io/components/buttons-floating-action-button 

\[Accessed 30 December 2024]. 

3.4. Using Intents 

Now that we have our UI ready, we can add the necessary logic to our 

application. We want to click on one of our products in the MainActivity 

and use an Intent to open the new activity and to pass the name of the 

product over to the OrderDetailsActivity. We are also going to start 

by optimising our code on the MainActivity. We currently have 6 event 

handlers on this activity. This introduces quite a bit of redundant code that 

can be done more efficiently. 

3.4.1. 

Optimising the Event Handlers 

The previous app functioned just fine - it popped up a toast message every 

time we clicked on one of our products. But there is code and then there is 

efficient code. Your compiler basically compiled the same method with 

slight variations six times. That is not very efficient, and not very easy to 

maintain. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 103 of 222 

IIE Module Manual        

PROG7313 

We previously discussed the OnClickListener and the fact that it is an 

interface that lives in the View class. Android enables use a lambda created 

from that interface into the setOnClickListener(). That is one way of 

using an onClickListener. It works perfectly – most of the time. 

But we have multiple ImageViews and we only want one OnClickListener 

to fire when we click the any of the ImageViews. We would also like to avoid 

redundant and repeated code. 

We can do this implementing the OnClickListener interface on the 

MainActivity, and then passing the MainActivity to the 

setOnClickListener() method. (Engel, 2017) (See Figure 141.) 

When the MainActivity implements View.OnClickListener, you will 

need to override the onClick() method from that interface. 

Figure 144. Implementing View.OnClickListener 

Figure 145. Generated onClick method 

We can then set the onClickListener to each ImageView with the 

setOnClickListener method as shown below. We pass through this, 

which is the reference to the current class (i.e. the MainActivity instance). 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 104 of 222 

IIE Module Manual        

PROG7313 

Figure 146. Using this as the Listener 

Now our onClick() method needs to be implemented to do the same 

work that the individual onClick() methods did before. For that, we need 

to be able to determine which View was clicked. Luckily, the method 

takes a parameter which is the View, so we can use the id of that view to 

determine what to do. This is the perfect opportunity to use the when 

statement. 

The code is shown in Figure 147. 

Figure 147. Implemented onClick Method 

This might not feel like much of a win right now, but when the event handlers 

get more complex later, you will appreciate this improvement! 

3.4.2. 

Creating the Order Class 

We are going to optimise our code to include an Order class which we will 

use to store our productName for now. We also use this class later when 

we push our data to a Firebase database. You can create the order Class 

shown in Figure 145. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 105 of 222 

IIE Module Manual        

PROG7313 

Figure 148. Order Class 

The four properties declared here are public, even though that is not 

explicitly stated here. But we don’t need to make these private to maintain 

encapsulation. The getters and setters are automatically created, just like 

in C#. So, there is no need for get and set methods. (Agrawal, n.d.) 

We do still want a few different constructors that we can use, depending on 

what data we have available when we create the instance. The syntax for 

constructors is probably the strangest thing if you are used to Java or C#. 

Each Kotlin class has a primary constructor and (potentially) secondary 

constructors. The primary constructor forms part of the header of the class. 

(Programiz, 2022) 

Figure 149. Order Class with Constructors 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 106 of 222 

IIE Module Manual        

PROG7313 

3.4.3. 

Understanding Intents 

We are writing this application to allow users to order beverages from 

Starsucks. This means that we would like to gather data on one activity and 

then send this data to another activity where we would like to do something 

with it. In our case we want to pass the product that we selected on our first 

activity to the second activity to gather all the order details that we need. 

We need to know: 











What the customer ordered 

Who the customer is (so that we can spell it wrong ●

) 

When the customer wants it delivered (functionality that will be added later) 

The customer’s cell number 

The price of the product (functionality that will be added later) 

Our app currently gets the product name from our first activity 

(MainActivity). Here is what we would like to happen: 

Figure 150. Flow of Activities 

The process above is completed with Intents. Our first Intent will simply 

open a new activity and pass a single value over to the new activity. 

Our second Intent will open the share hub and use a bundle to pass 

multiple values to which ever app choose to use to share our order. 

We can use Intents and extras to share information quickly and easily 

between activities and applications. 

You 

can 

read 

more 

about 

https://developer.android.com/training/sharing/send 

this 

\[Accessed 

December 2024]. 

here: 

30 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 107 of 222 

IIE Module Manual        

PROG7313 

Intents are not only used to share information, they are also used to open 

new activities, send broadcasts and to start services. You can read up more 

about this here: https://developer.android.com/guide/components/intents

filters \[ Accessed 30 December 2024]. 

There are two types of Intents namely explicit and implicit Intents. We will 

be using both. They can be described as: 

Explicit Intents: Specify which application or activity they will open. We will 

be using an explicit Intent to open our Order Details activity and to pass our 

product to this Activity using an Explicit Intent. Explicit Intents are often 

used within your own application since you will know the class name of the 

Activity that you would like to open. 

Implicit Intents: These Intents do not specify a specific application or 

Activity. They declare a general action instead. For example, we will create 

an Implicit Intent that will allow us to open the Android share sheet and 

share the product name the customer has selected as well as other 

information via any of the installed applications that we choose. 

https://vogella.com/tutorials/AndroidIntent/article.html 

\[Accessed 

December 2024]. 

3.4.4. 

Adding the IntentHelper class 

30 

We will be using Intents a lot, and across all our activities. We have the option 

of writing the same line of code every time we need an intent, which if you 

think about it is a bit of a waste of time and it introduces unnecessary 

redundancy in our code. Good practice is to create a helper class. 

GeeksforGeeks.com provides the simplest description of a helper class: 

Definition 

“Helper classes contains functions that help in assisting the program. This Class 

intends to give quick implementation of basic functions such that programmers do 

not have to implement again and again.” (sahilkhoslaa, 2018) 

We are going to create a helper class that will help our application with Intents. 

3.4.4.1. 

Creating an Explicit Intent 

The first thing we need to accomplish is opening the Order Details activity 

using an explicit intent. You can go ahead and add a new Kotlin Class and 

call it IntentHelper. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 108 of 222 

IIE Module Manual        

PROG7313 

Figure 151. openIntent() Helper Function 

We will add our first function called openIntent(). This method accepts the 

Context, a String value and the Class to open (the activity class) as 

parameters. 

Notice that the function isn’t inside a class. Kotlin supports having functions 

that are visible in the package where they are declared. (Doan, 2020) And 

that is what we are doing here. 

Figure 152. Intent constructor 

Looking at the code of the intent class shown in Figure 148, we see that the 

second parameter is the class that we want to open. Kotlin makes use of 

generics here. But we don’t know which class we will be passing to our 

function yet. So, the Class<\*> indicates that it can be any class. 

(Foundation, 2022c) 

3.4.4.2. 

What exactly is a Context and why do we need it? 

You will see Context everywhere in Android development. There are lots 

of explanations on the internet as to what a Context really is. These can 

be incredibly confusing. The Android documentation defines a Context as: 

Context: “Interface to global information about an application environment. This is an 

abstract class whose implementation is provided by the Android system. It allows 

access to application-specific resources and classes, as well as up-calls for 

application-level operations such as launching activities, broadcasting and receiving 

intents, etc.” (Android Open Source Project, 2022e) 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 109 of 222 

IIE Module Manual        

PROG7313 

A Context is often called a God object. A God object is an object that 

knows too much and does too much. That is because Contexts are so 

integral to Android Development. You can read more about Context 

here: https://www.freecodecamp.org/ news/mastering-android-context

7055c8478a22/ \[Accessed 30 December 2024]. 

A very simple explanation is that a Context provides context to the newly 

added components of an Android application. It allows us to tell an activity 

where it is originating form or to tell a Toast message in which activity it 

should pop up. Don’t let this break your head for now. 

3.4.4.3. 

Creating an Implicit Intent (method) 

We next need to create an Implicit Intent to share our order. We will use 

polymorphism to create two methods that will provide the functionality to 

use implicit Intents to our application. This is because we can send a single 

value with an Intent and an Extra (putExtra) or we can send multiple values 

with a Bundle. We will start by sending just a single value to any application 

the user selects form the Android share sheet. We will later optimise this 

code to send a bundle of data to the android app that we call with the Implicit 

Intent. 

An Implicit Intent is created much the same as an Explicit Intent. 

Figure 153. Creating the Implicit Intent 

The MIME type defines the format of our Data – plain Text in our case. You 

can read more about MIME types here: https://developer.mozilla.org/en- 

US/docs/Web/HTTP/Basics\_of\_HTTP/MIME\_types  

Finally we will create the overloaded shareIntent() method. This method 

accepts all the same parameters as the original shareIntent() method, 

but adds the customerName and customerCell as further data that we 

would like to share. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 110 of 222 

IIE Module Manual        

PROG7313 

Figure 154. Overloaded shareIntent Method 

3.4.5. 

Using the Intents 

Now we can make use of the IntentHelper and Order classes. Declare 

a property of type Order in the MainActivity class. 

Figure 155. Declaring an order 

We can now update the onClick() method to make use of the order 

and the 

IntentHelper. 

Figure 156. Using the Order and IntentHelper 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 111 of 222 

IIE Module Manual        

PROG7313 

If you run the app now, our new activity will be opened when you tap on 

one of the products. But it won’t do anything with the data yet. 

3.4.6. 

Adding Logic to OrderDetailsActivity 

We are now ready to code up our next activity. We will make use of View 

Binding again to get access to all the user interface elements on this activity. 

Figure 157. Using View Binding to access the controls 

Have a close look at the last two lines of code in Figure 154. We can get the 

value that we passed through from the intent, by calling the 

getStringExtra() method. 

The last thing we need to do, at the end of the onCreate method, is to 

change the image based on what the customer picked. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 112 of 222 

IIE Module Manual        

PROG7313 

Figure 158. Changing the Image 

If we run the app now, and click on one of the products, the order 

details will be displayed correctly including the picture for the product. 

Figure 159. Order Details in the App 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 113 of 222 

IIE Module Manual        

PROG7313 

3.4.7. 

Sharing the Order 

The last part of the user interface that we haven’t implemented yet, is the 

floating action button’s action. We will use it to share our order using 

external apps installed on the phone. To do that, we will make use of the 

implicit intent methods in the IntentHelper. 

We can add an OnClickListener to it just like any button. 

Figure 160. Adding the OnClickListener 

Now when we tap the FloatingActionButton, the Android share sheet 

is show, where the user can choose which app to use for sharing 

Figure 161. Android Share Sheet 

4\. Navigation Drawer 

A navigation drawer is a menu that pops in from the side of the app, that 

can be used to access various areas of our app. Right now, we only have 

the MainActivity, and from that the OrderDetailsActivity is opened. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 114 of 222 

IIE Module Manual        

PROG7313 

But we want to add another activity where the user can take a photo of their 

drink. And when we get there, we are going to need some way to navigate 

between these different activities. 

When a new app is created, there is an option for creating a Navigation 

Drawer Activity as the starting point for the app. But the code generated 

for that is fairly complex, so let’s see how to implement this from scratch. 

Create Menu 

Resource 

Directory

Create Menu 

(with icons

Create 

Navigation 

Drawer Header

Add Navigation 

View to Main 

Activity

Add Code to 

Enable 

Navigation View

Add Logic to 

Handle Menu 

Items

Figure 162. Steps for Adding a Navigation Drawer 

The six steps above are described in the following subsections. 

4.1. Create Menu Resource Directory 

To create the menu resource directory: 

Figure 163. Adding the Resource Directory 

1\. 

Right-click on the res folder in your app project and click New 

followed by Android Resource Directory. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 115 of 222 

IIE Module Manual        

PROG7313 

Figure 164. Selecting the Resource Type 

2\. 

3\. 

On the New Resource Directory dialog, select the Resource Type menu. 

Click OK. 

Figure 165. Menu Folder Created 

This will create the menu folder under res, as shown in Figure 162. 

4.2. Create Menu (With Icons) 

Next, we need to create the menu. It is the XML file that tells the navigation 

drawer which items need to be displayed on the menu. 

To create the menu: 

1\. 

Right-click on the menu folder that we just created. Click New and 

then Menu Resource File (see 165). 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 116 of 222 

IIE Module Manual        

PROG7313 

Figure 166. Entering the File Name 

2\. 

3\. 

On the New Resource File dialog, enter the File name 

navigation\_menu. 

Click OK. 

Figure 167. Empty Menu File 

You will see the design view for the menu, and the XML file with only the 

top-level menu tag created can be viewed using the Code view. Next, we 

will create the icons. And then we will return here to add the menu items. 

We are going to need two icons: one for the main page where we are 

placing our order, and one for the photo activity that we will add later. 

To create an icon: 

Figure 168. Creating a vector asset 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 117 of 222 

IIE Module Manual        

PROG7313 

1\. 

2\. 

3\. 

4\. 

5\. 

Right-click on the drawable folder, click New and then Vector Asset. 

Figure 169. Editing the Vector Asset 

Enter the name ic\_menu\_main for the icon name. 

Pic an icon by clicking on the image next to Clip Art. 

Choose a colour for the icon. 

Click Next. 

Figure 170. Confirm the Location 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 118 of 222 

IIE Module Manual        

PROG7313 

6\. 

Check the directory where the resource will get created – it should be 

in drawable. Then click Finish. 

Create another vector asset for the photo activity and call it ic\_menu\_photo. 

Now we can get back to creating the menu structure. This can be done 

either in the XML or the Design view. Here we will describe how to do this 

using the Design view. So, open the navigation\_menu.xml file, and switch 

to the Design view (top-right corner). 

To create the menu structure: 

1\. 

2\. 

Drag a Group from the Pallet into the Component Tree (see Figure 

169). 

Set the checkableBehaviour attribute of the group to single. This 

is to ensure that only one page at a time will be highlighted in the 

menu. 

Figure 171. Adding the Group 

Figure 172. Adding Menu Items 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 119 of 222 

IIE Module Manual        

PROG7313 

3\. 

4\. 

Add two menu items to the group – one for the main activity and one 

for the pending photo activity. 

Set the id, title and icon for each of the items. 

4.3. Create the Navigation Drawer Header 

At the top of a navigation drawer, there is an area where you display 

something graphical to make the menu look good. We are going to display 

the StarSucks logo there. 

We are going to create a layout resource file, that works just like the layouts 

that we have used for activities so far. 

To create the navigation drawer header: 

Figure 173. Adding a Layout Resource File 

1\. 

Right-click on the layout folder, click New and then click Layout 

Resource File. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 120 of 222 

IIE Module Manual        

PROG7313 

Figure 174. Setting the Resource File Properties 

2\. 

3\. 

4\. 

5\. 

Enter the File name nav\_header\_layout. 

Change the Root element to LinearLayout. 

Click OK. A layout file will be created where you can add all the 

components like usual. 

Add an ImageView that displays the Starsucks logo. 

4.4. Add Navigation View to Main Activity Layout 

Now we have all the components created, and we can use these now to 

add the Navigation View to the MainActivity. 

DrawerLayout

Top level layout for the activity

Main ViewCopy 

of our original 

controls

Add at the top a toolbar

Navigation 

ViewHeader

Menu \& Header

Figure 175. Components We Need on the MainActivity 

Figure 175 shows all the components that we need eventually on the 

MainActivity. 

We are going to implement the changes using the Layout Editor. The safest 

way to do that, is to create a new layout and copy the existing controls into 

that. At the end you can then delete the original layout. 

Create a new layout now, following the same steps that we did for the 

navigation drawer header, and call it activity\_main\_with\_nav\_drawer. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 121 of 222 

IIE Module Manual        

PROG7313 

To build the navigation view: 

1\. 

2\. 

Convert the top level component from ConstraintLayout to 

androidx.drawerlayout.widget.DrawerLayout. 

Figure 176. Setting the ID 

Set the id for the top-level component to drawer\_layout. 

Figure 177. Copy and Paste Previous Layout’s Components 

3\. 

Copy and paste the components, starting from the top-level 

element, into the new layout. The component tree should look like 

Figure 177. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 122 of 222 

IIE Module Manual        

PROG7313 

Figure 178. After the Copy 

4\. 

5\. 

6\. 

7\. 

8\. 

Drag and drop a NavigationView above the Main (see Figure 

178). Hint: use the search function on the palette. 

Set the id for the NavigationView to nav\_view. 

Set the fitsSystemWindows attribute to true. 

Choose the headerLayout that we created earlier. 

Choose the menu that we created earlier. 

Figure 179. Adding the Navigation View 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 123 of 222 

IIE Module Manual        

PROG7313 

Figure 180. Layout Gravity 

Tip: If you don’t see the content of the LinearLayout after this, check that the 

layout\_gravity isn’t set for the LinearLayout. It should not be. 

9\. 

10\. 

Set the layout\_gravity attribute as shown in Figure 180. 

Add a Toolbar above the logo and change its ID to nav\_toolbar. 

Figure 181. Adding the Toolbar 

Figure 182. Updating the Main Activity 

11\. 

Open the MainActivity Kotlin class and change the code that 

creates the binding as shown in Figure 182. 

If you run the app now, you will see the toolbar but not yet the menu or the 

navigation drawer. We still need to add a little code for that. If you see your 

layout and it works, you can now safely delete the original layout file. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 124 of 222 

IIE Module Manual        

PROG7313 

4.5. Add Code to Enable the Navigation Drawer 

To add the code that will enable the Navigation Drawer to work: 

Figure 183. New String Resources 

1\. 

2\. 

In strings.xml, add the two new strings shown in Figure 183. 

To the MainActivity Kotlin class, add the code highlighted in Figure 185. 

If you run the app now, you will see that the navigation drawer can appear 

and be hidden again. 

Figure 184. Navigation Drawer in the App 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 125 of 222 

IIE Module Manual        

PROG7313 

Figure 185. Code to Enable the Navigation Drawer 

The menu now appears. But if the back button is pressed, the menu is not 

closed as you would expect. Instead, the app is exited. Let’s see how we 

can fix that. 

In the MainActivity Kotlin class, we need to override the onBackPressed 

method. But now we will need to access the binding there too. So, let’s 

create a property for that. 

Figure 186. Creating a property for binding 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 126 of 222 

IIE Module Manual        

PROG7313 

Figure 187. Overriding onBackPressed() 

4.6. Add Logic to Handle Menu Items 

The menu looks lovely now, but it does not do anything yet. Now the time 

has come to handle the menu actions. We need to implement another 

listener for that. 

To implement the menu navigation: 

Figure 188. Implementing NavigationView.OnNavigationItemSelectedListener 

1\. 

Change MainActivity to also implement the interface 

NavigationView.OnNavigationItemSelectedListener 

Figure 189. Implementing the Selection Listener 

2\. 

3\. 

Override the onNavigationItemSelected method as shown in Figure 187. 

Now we need to set the listener on the NavigationView. Add the 

code shown in Figure 188. 

The menu item doesn’t have anything to do yet – the photo activity will be created next. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 127 of 222 

IIE Module Manual        

PROG7313 

Figure 190. Setting the Listener 

5\. Working with Camera Intents and Permissions 

We are now going to add an activity that allows us to open the camera from 

within our application. We will take a photo and store display the photo in 

our app. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 128 of 222 

IIE Module Manual        

PROG7313 

5.1. Creating the User Interface 

Create a new Empty activity and call it CoffeeSnapsActivity.  Add the following layout to 

your new activity

Figure 191. activity\_coffee\_snaps.xml code pt 1 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 129 of 222 

IIE Module Manual        

PROG7313 

Figure 192. activity\_coffee\_snaps.xml code pt 2 

Now we can update the navigation code in the MainActivity to open our new activity: 

Figure 193. Opening the Activity 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 130 of 222 

IIE Module Manual        

PROG7313 

5.2. Taking a Photo using an Intent 

We can now add the code to CoffeeSnapsActivity that takes a photo 

and displays it using the ImageView. 

There are two ways of taking a photo in Android: using an intent or making 

use of a camera API such as CameraX. Since we are working with Intents 

right now, we will stick to that for a start. But if you want more control, use 

the CameraX API instead. (Ndonga, 2021) 

Figure 194. Access components using View Binding 

Use View Binding to get hold of the components. Now we can add an 

OnClickListener for the FloatingActionButton that will make use of an 

Intent to take the photo. 

Many examples that you will find online will make use of the method 

startActivityForResult. But if you look closely at the code, you will 

notice that Android Studio will warn that the method is deprecated. Read 

more about the new way of calling an intent in (Sharma, 2021) 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 131 of 222 

IIE Module Manual        

PROG7313 

Figure 195. Adding the OnClickListener and result launcher 

Taking a photo is an asynchronous request. We start an activity, that will 

be handled by something outside our app, and we will be notified later when 

the process is complete. The activity result launcher (here called 

getResult) is responsible for handling the response that is returned to us. 

If we use the ACTION\_IMAGE\_CAPTURE intent, we don’t need to ask for 

any permissions. (Murphy, 2020) 

Note that there are some issues with Android 11 (API level 30 or later) with 

using this method. If the user disabled the built-in camera, this would not 

work as expected. Read more in (Murphy, 2020) So, let us change our 

implementation to use CameraX instead. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 132 of 222 

IIE Module Manual        

PROG7313 

5.3. Asking for Permissions 

If we used a Camera API instead, we would need to request the CAMERA 

permission. Let’s have a quick look at that. 

Figure 196. Dangerous Permissions 

Android has a built-in permission system that deals with Normal and 

Dangerous permissions (there are other types of permissions which are 

beyond the scope of this module manual). Normal permissions should not 

affect the user’s privacy and are granted without requesting the user’s 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 133 of 222 

IIE Module Manual        

PROG7313 

explicit permission. Dangerous permissions can affect a user’s privacy and 

needs the user to allow the functionality the permission protects before it 

can be used. 

You 

can 

read 

more 

about 

Android 

Permissions 

here: 

https://developer.android.com/guide/topics/permissions/overview/ \[Accessed 30 December 

2024]. 

It is important to know which the dangerous permissions are, so you can 

ask the user if you need to access those features. Android considers the 

permissions in Figure 192 as dangerous. 

For 

an 

example 

of 

requesting 

permissions, 

https://www.simplifiedcoding.net/android-request-permission-at

runtime-example/ \[Accessed 30 December 2024]. 

5.4. Taking a Photo using CameraX 

This section is based on information from (Ndonga, 2021). 

read 

The first thing we need to do is add dependencies to the project. We are 

going to make use of a library that is not included by default in an Android 

app. The latest versions of the CameraX libraries are list in (Android Open 

Source Project, 2022f). We are going to use the latest stable release, which 

is 1.1.0 at the time of writing of this manual. Note that we are copying the 

dependencies from the Groovy tab. 

Open the build.gradle file (the one for the Module, in our case 

Fakebook.app). The first thing we need to check is the minimum API 

version. Find the property under android > defcaultConfig > minSdkVersion 

and change it to 32 if it is less than that. 

Figure 197. Changing the minSdkVersion to 32 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 134 of 222 

IIE Module Manual        

PROG7313 

Find the dependencies section – should be at the bottom 

of the file. 

Figure 198. CameraX dependencies 

Add the dependencies shown in Figure 198 (the last 2 lines). And then click 

Sync Now at the top of the file so Gradle can download the necessary files. 

Figure 199. Run the Gradle Sync 

The next thing we need to do, is to ask for permission to use the camera. 

Now we will no longer be able to get away without that. 

Figure 200. Permissions in the AndroidManifest.xml file 

Under the manifests folder, open the AndroidManifest.xml file, and add the 

two lines <uses-feature> and <uses-permission> shown in Figure 200. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 135 of 222 

IIE Module Manual        

PROG7313 

Now we are ready to implement the new camera features. First, remove all 

the intent code that we added before. Then, we change the ImageView 

where we displayed the photo we took before, with a PreviewView as 

shown in Figure 201. 

Run the app at this point. When you go to the coffee snaps activity, you 

should see a black square where the image was before. 

Figure 201. Changing to PreviewView 

Now we can add the code to start up the camera and display the preview of 

the image on the activity. First, add two new properties: 

Figure 202. Adding new properties 

Then add the below function to start the camera. Note that the example 

code from (Ndonga, 2021) needs to be updated to reflect our names of our 

controls. So, carefully include the function as shown here in Figure 203. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 136 of 222 

IIE Module Manual        

PROG7313 

Figure 203. Function to start the camera 

And finally, we can add the code to ask for camera permissions and start 

the camera preview. 

Figure 204. Ask for permissions and start the preview 

Now run the app again. You will see that you are prompted to allow the app 

to take pictures when you open the coffee snaps activity. And if you allow it, 

the preview of the camera’s view will be displayed. Go ahead, try it out! 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 137 of 222 

IIE Module Manual        

PROG7313 

Figure 205. App now asks for photo permission 

We don’t have to leave the app to take the photo, which is very convenient. 

But what we are currently seeing is just the preview. Let’s add code to take 

the photo and save it to a file. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 138 of 222 

IIE Module Manual        

PROG7313 

Figure 206. Add two more properties 

Figure 207. Initialise the executor 

Figure 208. Update the startCamera function 

Figure 209. Add code to the button to take the photo 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 139 of 222 

IIE Module Manual        

PROG7313 

When we click the button, the location of the photo that was taken is logged. 

Not super exciting. Let us add an ImageView where we can display the 

captured photo. 

Figure 210. Add an ImageView where we can display the photo 

Now we can add a line of code to display the image that we already have 

the Uri for. 

Figure 211. Add code to display the photo 

However, if we do this, the app unceremoniously crashes. If we look at the 

Run window in Android Studio, we see this exception:  

Figure 212. Exception when trying to display the image 

If you look closely at the code that we used to capture the photo, you will see 

that there is an executor involved. That starts the capture process on a 

different thread. And with Android, just like with most user interface 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 140 of 222 

IIE Module Manual        

PROG7313 

frameworks, you cannot modify the user interface from a different thread. 

The method runOnUiThread will work in this instance. (TutorialKart, 2021) 

Figure 213. Running the code on the user interface thread 

And that is it. Now the photo will get displayed on the ImageView. Go ahead 

and try it out! 

6\. Adding a Launcher Icon 

There is one last thing to be done for the app’s user interface to be polished – adding a launcher icon for the app. If you look in the list of apps installed 

in the emulator (see Figure 214), you will see that our app still has the default 

icon. While that is functional, it certainly doesn’t look professional.  

Figure 214. Default Launcher Icon 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 141 of 222 

IIE Module Manual        

PROG7313 

To add a launcher icon for the app: 

Figure 215. Creating a New Image Asset 

1\. 

2\. 

3\. 

4\. 

Right-click the res folder, click New and then Image Asset. 

Figure 216. Foreground configuration with the icon 

On the Foreground Layer tab, choose a Clip Art image. 

Chose a colour for the foreground. 

Switch to the Background Layer tab. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 142 of 222 

IIE Module Manual        

PROG7313 

5\. 

6\. 

7\. 

Choose a colour for the background. 

Click Next. 

Click Finish. 

Tip: If your colour is correct when you run the app, but the icon is wrong, delete the 

file highlighted in Figure 217 in the Project view. Then recreate follow the steps again 

to create the launcher icon. 

Figure 217. File structure 

Now the app has its brand-new icon.  

Figure 218. App with the New Icon 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 143 of 222 

IIE Module Manual        

PROG7313 

7\. Recommended Additional Reading 

Engel, C., 2017. 4 Ways To Implement OnClickListener On Android. \[Online] 

Available at: https://medium.com/ @CodyEngel/4-ways-to-implement

onclicklistener-on- android-9b956cbd2928 \[Accessed 30 December 2024]. 

8\. Activities 

Do the activities that appear on Learn. 

9\. Revision Exercises 

Create a small quiz application where the user is asked a series of 

questions about famous landmarks (use an ImageView to display these) 

and they must correctly identify them using EditTexts. Once the user has 

answered all the questions, they should be taken to a second activity that 

displays their score 

10\. Solutions to Revision Exercises 

Compare your code to the example StarSucks code from the GitHub 

repository. You can also check to see if your application is displaying the 

images correctly and calculating the scores correctly. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 144 of 222 

IIE Module Manual        

PROG7313 

Learning Unit 5: Local Databases and JSON 

Learning Objectives: 

My notes 





Create a RoomDB database.  

Use a RoomDB database to store data.  

 Use a RoomDB database to read data.  



Explain the purpose of JSON files  



Use JSON objects to read data.  



Use JSON objects to write data  





Material used for this learning unit:  

GitHub repository: LearningUnit4  



How to prepare for this learning unit:  



Make sure that you have the GitHub source code  



available and that your Android Studio is up to date.  

1\. Introduction 

Now that we have our app functioning, we can now start working with some 

basic techniques surrounding databases on mobile. 

We will start by adding a lightweight local sql database to our app called 

RoomDB and adding functionality to our app to utilize RoomDB. 

Next, we will work with Javascript Object notation (JSON), which helps 

when handling data objects. 

2\. Local Database  

2.1. RoomDB 

Room Database (RoomDB) is a persistence library provided by Google as 

part of the Android Jetpack components. It simplifies the process of working 

with SQLite databases in Android applications by abstracting the underlying 

complexity and providing a more efficient and structured way to manage 

local data storage. RoomDB allows developers to define entities, which 

represent tables in the database, and to create Data Access Objects 

(DAOs) that contain methods for interacting with the database, such as 

queries, inserts, updates, and deletions. Room ensures compile-time 

verification of SQL queries and helps prevent common errors related to 

database operations. It also supports LiveData and RxJava, making it easy 

to observe changes in data. Furthermore, Room is designed to work 

seamlessly with other Android components and can be easily integrated 

into apps to store and retrieve data efficiently. 

To create a RoomDB, you first need to define an entity, which represents a 

table in the database. An entity is a simple class annotated with @Entity 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 145 of 222 

IIE Module Manual        

PROG7313 

and its fields define the columns of the table. After defining the entity, you 

create a @Dao (Data Access Object) interface. This interface contains the 

methods used to interact with the database, such as insert, delete, update, 

and query operations. Finally, the RoomDatabase class is an abstract class 

that connects everything. This class is annotated with @Database and lists 

all the entities and DAOs to be used within the database. The RoomDB 

instance is typically accessed using the Room.databaseBuilder() method. 

When using a RoomDB to store data, you interact with the DAO to define 

methods for inserting or updating the database. For example, if you have 

an entity representing a "User," you can define an insertUser() method in 

the DAO that takes a User object and inserts it into the database using 

Room's transaction-safe mechanisms. This insertion method is then called 

from your repository or ViewModel in the Android architecture, making it 

simple to save data locally without manually handling SQL queries or 

connection details. 

To read data from RoomDB, you create query methods within the DAO. 

These methods can return specific data types or observables like LiveData, 

which can be observed for changes in real time. For example, if you want 

to retrieve all users from the database, you define a method like 

getAllUsers() with a query annotation (@Query("SELECT \* FROM users")). 

Room will handle the query execution and return the data. When combined 

with LiveData, the UI can automatically react to any changes in the 

database, keeping the app's data consistent and up to date. 

2.2. Connect an App to RoomDB 

Before attempting this code please push your code to Github and either Fork or 

Create a new branch as it will make it easier to receive a snapshot of your code 

in its current state, which we will make use of later 

Adding RoomDB is incredibly easy.  

1\. Set up the dependencies 

First, you need to add the Room Database dependencies to your project. 

Open the build.gradle file (Module: app) and add the following lines under 

dependencies: 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 146 of 222 

IIE Module Manual        

PROG7313 

Figure 225. Set up RoomDB dependencies 

In a Kotlin project, replace annotationProcessor with kapt. Make sure you have kapt enabled 

by adding thisline at the top of your build.gradle: 

Figure 226. Kapt plugin 

KAPT stands for Kotlin Annotation Processing Tool. It is Kotlin's version of Java's 

Annotation Processing Tool (APT), which allows you to use annotation processors written in 

Java in Kotlin code. KAPT generates the necessary code (such as Room database code) 

based on annotations you place in your Kotlin source files. 

Why KAPT Is Needed 

Many libraries in Android (like Room, Dagger, and Retrofit) rely on annotations to generate 

additional code during compilation. These libraries often have annotation processors written 

in Java, which Kotlin doesn't handle directly. KAPT bridges this gap, making it possible to use 

these annotation processors in Kotlin projects. 

For example: 

 Room uses annotations like @Entity, @Dao, and @Query to generate database code. 

How KAPT Works 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 147 of 222 

IIE Module Manual        

PROG7313 

When you use KAPT in a Kotlin project, it: 

1\. 

Generates Java stubs for the Kotlin classes. 

2\. 

3\. 

Runs annotation processors on those stubs. 

Generates code based on the annotations (e.g., DAO implementation in Room). 

Step 2: Create the Entity 

Edit the Post class to create an entity, which will be stored in the database. This class should 

be annotated with @Entity, and you can define the fields you want to store: 

Figure 227. Create the Model 

Let's break down the components: 

@Entity(tableName = "orders") 

 This annotation marks the class as a Room entity. An entity represents a table within 

the SQLite database. 

 The tableName = "orders" specifies that this entity will be stored in a table named orders. 

data class OrderEntity(...) 

 

 

This is a Kotlin data class that holds the data for each record (row) in the orders table. 

Each instance of OrderEntity corresponds to a row in the orders table. 

Properties of OrderEntity 

Each property corresponds to a column in the orders table, an example of this table structure 

based on this entity, Room will generate an SQLite table orders with the following columns: 

id productName customerName customerCell orderDate 

1 Soy Latte 

2 Black Forest 

John Doe 

Jane Doe 

123-456-7890 

098-765-4321 

2024-10-21 

2024-10-21 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 148 of 222 

IIE Module Manual        

PROG7313 

 

What Room Does: 

Maps the class OrderEntity to the orders table. 

 

 

Automatically creates and manages the table structure in the SQLite database. 

Generates SQL queries to perform CRUD (Create, Read, Update, Delete) operations 

on the table based on this class. 

This class will be used with a DAO (Data Access Object) to interact with the database, like 

inserting or fetching orders. 

Step 3: Create the DAO 

Create a data-Access-Object (DAO) interface that defines the methods for accessing the 

database. This will include methods to insert and retrieve posts. 

Figure 228. Create the Model 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 149 of 222 

IIE Module Manual        

PROG7313 

Figure 229. Create the Model 

This code defines a Data Access Object (DAO) in Room, which is responsible for interacting 

with the SQLite database by providing methods to perform CRUD (Create, Read, Update, 

Delete) operations. 

@Dao 

 

 

The @Dao annotation marks this interface as a DAO. DAOs are used by Room to 

define database operations (like querying data). 

Room will automatically generate the implementation for this interface based on the 

methods and annotations you define here. 

interface OrderDAO 

 

This is a Kotlin interface named OrderDAO, which declares methods for database 

operations related to the OrderEntity class (the entity representing the "orders" table). 

@Insert 

 

 

The @Insert annotation indicates that this method will be used to insert data into the 

orders table in the SQLite database. 

Room will automatically generate the SQL for the insert operation. 

fun insert(orderEntity: OrderEntity): Long 

 

 

This method takes an instance of OrderEntity as a parameter, which represents the 

data to be inserted into the orders table. 

The method returns a Long, which is the row ID of the newly inserted order (this is 

typically the value of the auto-generated primary key). 

@Query("SELECT \* FROM orders") 

 

The @Query annotation is used to execute custom SQL queries. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 150 of 222 

IIE Module Manual        

PROG7313 

 

 

The query "SELECT \* FROM orders" fetches all rows from the orders table. Room 

converts the SQL query results into instances of OrderEntity. 

fun getAllOrders(): List<OrderEntity> 

This method retrieves all the orders from the orders table and returns a list of 

OrderEntity objects. 

 

The return type is a List<OrderEntity>, meaning the result is a collection of orders 

stored in the database. 

Step 4: Create the Database Class 

Next, create the Room database class that extends RoomDatabase. This class will provide 

the database instance and link the DAO. 

Figure 230. Create the Database Class 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 151 of 222 

IIE Module Manual        

PROG7313 

Figure 231. Add code to the Database Class 

Step 5: edit the Main Activity 

Now, edit the main activity to pull the list of products from  a database.  

Figure 232. Edit the Main Activity 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 152 of 222 

IIE Module Manual        

PROG7313 

Figure 233. Updated Main activity 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 153 of 222 

IIE Module Manual        

PROG7313 

3\. JSON Files and JSON Objects  

3.1. Understanding JSON 

JSON is an acronym for Java Script Object Notation. It is a text based, human 

readable data interchange format used to pass data between database and 

applications, between different applications etc. You will learn a lot more 

about JSON when you code up an application that uses a REST- API. An 

easy way to think about it is that JSON gives a structure to save our data 

in that is understood by a wide variety of technologies. This makes it very 

easy of us to send data in this format to other applications. Web API’s send 

large sets of data to all sorts of clients in JSON format. 

Let’s look at the example shown in Figure 219, from the OpenWeather API 

documentation. We are going to copy and paste the sample JSON into a 

JSON formatter to check if it is Valid JSON, but also to get a better 

understanding of what we are seeing in Figure 219. 

Navigate 

to 

the 

following 

website: 

https://jsonformatter.curiousconcept.com/ and copy the sample JSON from 

https://openweathermap.org/current into the JSON formatter and click on 

Process. 

Figure 219. OpenWeather API Response (OpenWeather, n.d.) 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 154 of 222 

IIE Module Manual        

PROG7313 

Figure 220. Processing the JSON Response 

You should get the following output. 

Figure 221. Processing Complete 

Let’s look at what we can learn from this. Collapse all the entries (click on 

the \[-]) and you should see the following data structure. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 155 of 222 

IIE Module Manual        

PROG7313 

JSON Array 

JSON Object 

JSON Key: Value Pair 

Figure 222. JSON Structure 

JSON Objects: A JSON Object is a collection of key:value pairs, objects can 

also hold other objects and JSON Arrays. I have expanded the main JSON 

object below and you can see it holds key value pairs for temperature, 

pressure, and humidity. 

JSON Object Name 

Figure 223. JSON  

Object JSON Array: JSON Arrays holds an ordered list of values.  

JSON Array name 

Object starts here 

Object ends here 

JSON Array starts here 

Ordered List of Values 

JSON Array ends here 

Figure 224. JSON Array 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 156 of 222 

IIE Module Manual        

PROG7313 

3.2. Working with JSON 

To implement the next steps of using JSON objects for reading and writing 

data and utilizing a library to handle JSON, you can follow the following 

outline in your Kotlin app. We'll cover how to: 

1\. 

Use JSON objects to read data. 

2\. 

3\. 

Use JSON objects to write data. 

Use a library to work with JSON data. 

1\. Use JSON Objects to Read Data 

Let's assume you are fetching posts stored in JSON format. You would first 

need to read the JSON data from a file, an API, or a local database, and 

convert it into Kotlin objects (like Post). 

Using Gson (a popular JSON parsing library) would simplify this. 

Here’s an example: 

Install Gson Library 

Add the following dependency to your build.gradle file: 

Model Class (Post) 

Make sure your OrderEntity class is compatible with JSON parsing. 

Here's an example: 

Figure 234. Create the Database Class 

Use a Library to Work with JSON Data 

As mentioned earlier, Gson is an excellent library for working with JSON data. It supports: 

 

 

Converting JSON to Kotlin objects (deserialization). 

Converting Kotlin objects to JSON (serialization). 

Example: Reading and Writing Posts with JSON 

Let’s integrate reading and writing posts with JSON into your app. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 157 of 222 

IIE Module Manual        

PROG7313 

1\. 

Reading JSON from a File: You can read JSON data from a file in the assets or from 

your local database. 

Create a JSON Utility Class 

Create a new Kotlin file named JsonUtils.kt in your com.fake.starsucks package: 

Figure 235. Create the Database Class 

Modify MainActivity 

In your MainActivity, after inserting an order or retrieving it, you can use the JsonUtils methods 

to save or retrieve the order data. 

For example, you can modify the getProductFromDB function to save the order in JSON 

format after retrieving it: 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 158 of 222 

IIE Module Manual        

PROG7313 

Figure 236. Create the Database Class 

Retrieve Order in OrderDetailsActivity 

You can retrieve the order data from SharedPreferences when you need it in 

OrderDetailsActivity: 

Figure 237. Create the Database Class 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 159 of 222 

IIE Module Manual        

PROG7313 

4\. Recommended Additional Reading 

https://medium.com/@prahaladsharma4u/how-to-use-a-local-json-file

with-retrofit-in-android-studio-part1-cc8591b7716f 

https://www.geeksforgeeks.org/kotlin/android-json-parsing-using-retrofit

library-with-kotlin/  

5\. Activities 

Do the activities that appear on Arc. 

6\. Revision Exercises 

Extend the small application from the previous learning unit to store 

questions and answers in JSON, and the marks in RoomDB. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 160 of 222 

IIE Module Manual        

PROG7313 

Learning Unit 6: Modern Data Management Techniques 

Learning Objectives: 















Explain the difference between Firebase and a 

traditional SQL database. 

Describe the advantages of using Firebase. 

Explain why an application would need to be authorized to 

access a Firebase database. 

Create a connection between an application Firebase. 

My notes 

Explain the purpose of JSON in a mobile development. 

Create a Firebase database. 



Create code to read data from the Firebase database. 

Create code to write data to the Firebase database. 

Material used for this learning unit: 



GitHub repository: LearningUnit5 

How to prepare for this learning unit: 



Make sure that you have the GitHub source code 

available and that your Android Studio is up to date. 

1\. Introduction 

In all the learning units so far, we have built apps that only store their data 

in memory. And while that can be quite enough, depending on the app, we 

usually need long term storage as well. In this learning unit we will explore 

writing data to a NoSQL database. 

2\. NoSQL Databases 

2.1. Firebase 

Firebase is a mobile application development platform owned by Google 

since 2014. The platform has a range of products which are very useful for 

mobile application development. You can find out more about the available 

products here: https://firebase.google.com/. You will probably find that you 

end up using most of them. 

There are two database products in Firebase: the Realtime Database and 

Cloud Firestore. We will look at both options. 

2.2. Firebase Real-Time Database 

The Firebase Realtime Database does exactly what one would expect. It 

stores and retrieves user data in real time (milliseconds). You can read 

more 

about 

the 

Realtime 

Database 

here: 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 161 of 222 

IIE Module Manual        

PROG7313 

https://firebase.google.com/products/realtime-database/ \[Accessed 17 

November 2022]. 

The Firebase Realtime Database is also a NoSQL database. That stores 

data in a JSON format. We will look a bit deeper into that next. 

2.2.1. 

Understanding NoSQL 

NoSQL stands for Not only SQL and is a different approach to database 

design. You would have used mostly Relational Database Management 

Systems (RDBMS) such SQL Express and MySQL until now. You have 

probably normalised and related a database and in turn cried a little. SQL 

relies on schemas and highly structured data. 

NoSQL accommodates a wide variety of data models and have only been 

around since the early 2000s. The introduction of cloud and mobile 

computing created scenario’s where the need for scalability and processing 

speed greatly outweighed the need for a structured carefully planned 

database. There are different types of NoSQL databases, which is beyond 

the scope of this course – you can read more about them here: 

https://searchdatamanagement.techtarget.com/definition/NoSQL-Not

Only-SQL \[Accessed 30 December 2024]. 

Firebase’s Realtime Database is a document database that stores JSON 

documents. Now we probably need to chat about what JSON is. 

2.2.2. 

Understanding JSON 

JSON is an acronym for Java Script Object Notation. It is a text based, human 

readable data interchange format used to pass data between database and 

applications, between different applications etc. You will learn a lot more 

about JSON when you code up an application that uses a REST- API. An 

easy way to think about it is that JSON gives a structure to save our data 

in that is understood by a wide variety of technologies. This makes it very 

easy of us to send data in this format to other applications. Web API’s send 

large sets of data to all sorts of clients in JSON format. 

Let’s look at the example shown in Figure 215, from the OpenWeather API 

documentation. We are going to copy and paste the sample JSON into a 

JSON formatter to check if it is Valid JSON, but also to get a better 

understanding of what we are seeing in Figure 215. 

Navigate 

to 

the 

following 

website: 

https://jsonformatter.curiousconcept.com/ and copy the sample JSON from 

https://openweathermap.org/current into the JSON formatter and click on 

Process. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 162 of 222 

IIE Module Manual        

PROG7313 

If we look at some of my previous data stored on a Firebase Realtime 

Database, we will see that it looks like the image below. 

Figure 238. Firebase Realtime Database Data 

We can export the data from Firebase into a JSON file by click 

Export JSON. 

Figure 239. Exporting JSON from Firebase 

We can then copy and paste the JSON in the downloaded .json file into a 

JSON formatter. We will see the following: 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 163 of 222 

IIE Module Manual        

PROG7313 

Json Formatter 

Firebase 

Each chat message from 

Firebase is stored as a JSON 

object in the JSON file 

Figure 240. Firebase Data in JSON Format 

You can learn more about JSON and the related syntax here: 

https://medium.com/omarelgabrys-blog/json-in-a-nutshell-7d638dfea7cc 

\[Accessed 30 December 2024]. 

2.3. Cloud Firestore 

Cloud Firestore is a newer NoSQL database. The data structure, based on 

documents, are more flexible than the one used by the Realtime Database. 

(Google, 2022) 

Choosing between the Realtime Database and Cloud Firestore for a real 

app is quite complex. There are lots of difference between the two, some 

quite 

subtle. 

But 

you will find good guidelines here: 

https://firebase.google.com/docs/database/ rtdb-vs-firestore \[Accessed 17 

November 2022]. 

Now that you have a better understanding of NoSQL and JSON and Firebase 

Realtime and Cloud Firestore, lets add Firebase to our Android Project. We 

will start with the Realtime Database. 

Note: You will need a GMAIL account for this – create one if you don’t have one. 

2.4. Connect an App to Firebase 

Adding Firebase is incredibly easy. Android Studio has all the tools to 

automate the process. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 164 of 222 

IIE Module Manual        

PROG7313 

Note: Follow steps 1 to 8 on the sample project in the StarsucksRealtime folder in 

the GitHub repository too, to configure the app to run against your account. Also 

remember to configure the database for public access, as described later in this 

section. 

To add Firebase to the project: 

1\. 

Click on Tools and select Firebase from the menu. 

Figure 241. Accessing Firebase from the Tools Menu 

2\. 

3\. 

This will open the Firebase assistant panel to the right of your screen. 

Here you will see all the available Firebase products. 

Find the Realtime Database and click on the arrow to expand it. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 165 of 222 

IIE Module Manual        

PROG7313 

Figure 242. Realtime Database 

Figure 243. Get started with Realtime Database 

4\. 

Click the Get started with Realtime Database link. This will change 

the panel to look like Figure 244. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 166 of 222 

IIE Module Manual        

PROG7313 

Figure 244. Get started with Realtime Database 

5\. 

6\. 

7\. 

8\. 

Click Connect to Firebase. 

You will be prompted to log in with your Gmail account in your 

browser at this point. Once you are logged in, you will see the 

Firebase Console web UI. 

Create a new project – call it StarSucks. 

When prompted, click Connect. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 167 of 222 

IIE Module Manual        

PROG7313 

You will see the following confirmation message appear in when you return to Android 

Studio. 

Figure 245. Firebase Successfully Connected 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 168 of 222 

IIE Module Manual        

PROG7313 

We now need to add the Firebase Realtime database dependencies to our 

app. These are class libraries that contains all the built-in logic that we 

would need to work with Firebase. 

Gradle can throw some scary errors at this stage – but don’t worry, it is usually just 

a version conflict. You can just Google for the correct version of Firebase to use with 

your Max API and change the entry in Gradle. It should work fine 99% of the time. 

Figure 246. Adding the Dependencies 

Click Add the Realtime Database to your app. 

Android Studio will ask you to confirm that you want to add the 

dependencies to the project. It will also list the dependencies that will be 

added to both your build.gradle and app/build.gradle files (project and app 

(module level)). Click Accept Changes to continue. 

Figure 247. Accepting Dependency Changes 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 169 of 222 

IIE Module Manual        

PROG7313 

Gradle will sync and download all the dependency files. 

Figure 248. Gradle Sync in Progress 

You will see the following confirmation message if your dependencies were 

set up without any errors. 

Figure 249. Dependencies Set Up Successfully 

You can however only breathe easily when you have a successful sync and 

Gradle build. 

Figure 250. Successful Gradle Build 

We can now go and open our Gradle files to inspect the changes made 

to them. Navigate to Gradle Scrips and click on build.gradle 

(Module:StarSucks.app) first. 

Figure 251. Gradle Files 

You will notice that the following entry was added to the Gradle 

script file. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 170 of 222 

IIE Module Manual        

PROG7313 

Figure 252. Google Services Plugin Added 

If you scroll down further, you will find that the dependency has also been added. 

Figure 252. Realtime Database Dependency 

This matches up perfectly with the dependencies asked for earlier (see 

Figure 230). You will find the remaining entry in the build.gradle (Project: 

StarSucks) script file: 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 171 of 222 

IIE Module Manual        

PROG7313 

Figure 253. Project Script File in module level 

Good, our dependencies are ready to go. We can now configure our 

database rules. The default security settings for the Realtime Database is to 

only allow read and writes to authenticated members (using Firebase 

Authentication). We want to change that while we test our app. Just 

remember to change it back once you are ready to deploy your application. 

This is fine for testing, but a bad idea for the security of your app once 

it enters the production environment. 

Go back to the Firebase panel. You will find the Configure Firebase Database Rules 

section there. Click on the link for configure your rules for public access. 

Figure 254. Configure for Public Access 

You need to log into your Firebase console to set your database settings. 

You can access the console here: https://console.firebase.google.com/u/0/ 

\[Accessed 17 November 2022]. 

Find the tile for your app and click on it. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 172 of 222 

IIE Module Manual        

PROG7313 

Figure 255. Select the Project 

Your project will open, you can go ahead and click on Realtime 

Database in the Project Overview panel to the left of the screen, under the 

Build category. 

Figure 256. Accessing Database Settings 

Click Create Database. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 173 of 222 

IIE Module Manual        

PROG7313 

Figure 257. Creating the Database 

The first option that appears asks you to choose a location for the database. 

South Africa is not available as an option, so choose europe-west1 as the 

next-best option and click Next. 

Figure 258. Database Location 

The security rules for Realtime Database window will appear. Click Start in 

test mode. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 174 of 222 

IIE Module Manual        

PROG7313 

Figure 259. Switching to Test Mode 

Click Enable. 

This will change your read and write rules to true – you can now write to 

this database without first authenticating. 

Your database will be created and ready for use: 

Figure 260. Database Created 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 175 of 222 

IIE Module Manual        

PROG7313 

We are now ready to start adding the logic to our application so that we can 

write to the Firebase Realtime Database from our application. Firebase 

provided a guided tutorial in the Firebase panel within Android Studio. We 

will now follow that tutorial. 

2.4.1. 

Firebase Data Storage 

We are now ready to add the logic to our application so that we can push 

data up to Firebase Realtime Database. We will be using our Data Transfer 

Object (DTO) that we create using the model we build. This is just the Order 

class. This class contains the properties and constructors that reflect the 

structure our data will stored in on the Realtime Database. It also allows us 

to pull down the JSON data and convert it into an object. 

Initialize firebase realtime database like the following:  

Figure 261. Initialize firebase realtime database 

First we can update our Inset products page to save our products to firebase. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 176 of 222 

IIE Module Manual        

PROG7313 

Figure 245. Updated Inset products 

Create a Function to Save Data 

You can create a function to save your OrderEntity to the Firebase Realtime Database. You 

can define this function in your MainActivity: 

Figure 262. Save Order Function 

Retrieve Data from Firebase 

If you want to retrieve data from Firebase and populate your UI, is a bit more complicated, we 

will be using a recyclerview. 

Create a RecyclerView Layout 

First, create a layout for individual items in the RecyclerView. Create a new XML file (e.g., 

item\_order.xml) in your res/layout directory: 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 177 of 222 

IIE Module Manual        

PROG7313 

Figure 263. Create the Database Class 

Create an Adapter for the RecyclerView 

Next, create a new Kotlin file (e.g., OrderAdapter.kt) to define your adapter. This adapter will 

handle the list of OrderEntity objects. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 178 of 222 

IIE Module Manual        

PROG7313 

Figure 264. Create the Order Adapter 

Set Up RecyclerView in Your Activity 

Now, you need to set up the RecyclerView in your MainActivity. Add a RecyclerView to your 

activity's layout (e.g., activity\_main.xml): 

Figure 265. Create the RecyclerView  

Next, modify your MainActivity to initialize the RecyclerView and its adapter: 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 179 of 222 

IIE Module Manual        

PROG7313 

Figure 266. Initialize the recycler view 

Figure 267. Create method to pull data from FireStore 

With this implementation, your app will now display the list of orders in a RecyclerView, 

automatically updating the UI when data is fetched from the Firebase Realtime Database! 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 180 of 222 

IIE Module Manual        

PROG7313 

2.4.2. 

Now

code,

Writing and Retrieving Data using Cloud Firestore 

we

in

are

working

in

the

the 

StarSucksFirestore folder. 

other

copy

of

the

sample

source

When connecting our app to Firebase, we choose Cloud Firestore this 

time. Follow the same process to connect and add the dependencies. 

In the Firebase console, under Build select Firestore Database, and click 

Create database. 

Figure 268. Creating a Cloud Firestore database 

Start the database in test mode and select a European region. Now we are 

ready to add the code to use Cloud Firestore. 

In the OrderDetailsActivity, we need an instance of the database. Then 

we can write to the database. 

Figure 269. Get a database instance 

Figure 270. Write to the database 

And if we look in the console, we can spot our very first entry in the Cloud Firestore. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 181 of 222 

IIE Module Manual        

PROG7313 

Figure 271. Entry in Cloud Firestore 

Figure 272. Reading the Data from Cloud Firestore 

Read more about accessing data from Cloud Firestore in (Google, 2022b) 

3\. Recommended Additional Reading 

Read about the best practices for setting up Firebase projects here: 

https://firebase.google.com/docs/projects/dev-workflows/ 

general-best

practices \[Accessed 30 December 2024]. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 182 of 222 

IIE Module Manual        

PROG7313 

4\. Activities 

Do the activities that appear on Learn. 

5\. Revision Exercises 

Create a similar application (to the example in this learning unit) that allows 

a user to order from a different fast-food brand. Extend the app to have a 

login and registration functionality. 

6\. Solutions to Revision Exercises 

Download and review all the Starsucks apps on the GitHub Repo. Make 

sure your order app can login and register using Firebase. Check that the 

registered users are displayed online in the Firebase database. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 183 of 222 

IIE Module Manual        

PROG7313 

Learning Unit 7: Developing a Graphical Game 

Learning Objectives: 

My notes 





Explain the purpose of defining XML resource files.  





Apply animations to controls in an app.  

Explain the use of touch events.  



Explain how to draw on a canvas.  

Use a Timer object in Android.  

Material used for this learning unit:  



GitHub repository: LearningUnit6  

How to prepare for this learning unit:  



Make sure that you have the GitHub source code  

available and that your Android Studio is up to date.  

1\. 

Introduction 

Now that we have created a fully functional app, it is time to do something 

different. In this learning unit, we are going to create a game from scratch. 

2\. Working with Resources 

2.1. Resources 

We have used lots of different resources already. So, the resources folder 

shown in Figure 261 should look quite familiar by now. 

Figure 273. Resources Folder 

But there are more types of resources that we haven’t yet encountered. 

The two rows highlighted in yellow in Figure 262 are the ones most 

familiar to us by now. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 184 of 222 

IIE Module Manual        

PROG7313 

Figure 262. Types of Resources 

Why should we make use of resources? Let’s see what the Android 

Open Source Project documentation says about it. 

“You should always externalize app resources such as images and strings from your 

code, so that you can maintain them independently. You should also provide 

alternative resources for specific device configurations, by grouping them in 

specially-named resource directories. At runtime, Android uses the appropriate 

resource based on the current configuration. For example, you might want to 

provide a different UI layout depending on the screen size or different strings 

depending on the language setting.” (Android Open Source Project, 2020h) 

3\. Animation 

In the Android world, there are several different ways to do animation. An 

overview of all of these is shown in Figure 263. We are going to focus on 

using a canvas and drawables. 

For 

more 

information 

about 

animation, 

https://developer.android.com/develop/ui/views/animations/overview   

\[Accessed 30 December 2024]. 

read 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 185 of 222 

IIE Module Manual        

PROG7313 

Figure 263. Ways of Animating 

4\. Building a Game in Android Studio 

This section has been adapted from the YouTube channel coding with 

Sarah. 

You can find the referenced resource here: 

https://www.youtube.com/channel/UCVnbJshpiREv65Z6QpTjHnQ 

\[Accessed 30 December 2024]. 

Note: the code has been translated from Java to Kotlin. 

4.1. Drawing your First Bitmap 

We are going to create a game in which the UI elements need to move 

when we interact with them on the screen or completely on their own. We 

have been using built in Views and view groups such as LinearLayout. 

Android reads the xml fine and draws all the UI elements where we have 

indicated that they should be. This changes when we are using animations. 

We cannot use the Layout.xml file for this – we need to create our own class 

that will inherit the necessary methods to draw our UI from the View class. 

You can go ahead and create a new Kotlin class that we will call the 

BirdieGameView class. 

We next extend our class to inherit from the View class. 

Figure 275. Inherit from View 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 186 of 222 

IIE Module Manual        

PROG7313 

You may get a red squiggly line because you need to import the class. Select 

the class name and press Alt+Enter on your keyboard, then select Import. 

Figure 276. Import Class 

The next error message will inform us that we cannot extend this class to the View 

class if we do not create a constructor that matches the super class. 

Figure 277. Creating the Constructor 

Click the red lightbulb, and choose to add the constructor parameters that 

take just a context. 

Figure 278. Choosing the Constructor 

Your primary constructor will now be implemented. 

Figure 279. Constructor Created 

You can go ahead and inspect the View class (Ctrl+click on the word 

View in the class definition). You will see that this class has all the methods 

we need to draw UI elements or to animate them. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 187 of 222 

IIE Module Manual        

PROG7313 

Figure 280. onDraw method in the View class 

4.2. Android Screen Coordinates 

Any Android device screen is divided into a grid with an X (horizontal) and 

Y (vertical) axes. The grid lines are 1 pixel apart (this is very small). In 

Figure 270, the blue rectangle is drawn at 3 pixels on the x axis (toward the 

right) and 2 pixels on the y axis (downwards). 

Figure 281. Coordinate System (Lee, 2017) 

We need to tell Android exactly where to draw our images, we do this with onDraw() 

method. There are also built-in methods that we can use to work with coordinates. 

4.3. Drawing the Bird Bitmap with the onDraw Method 

You will need two bitmap images to draw and animate the bird in our game. 

One bitmap with the bird’s wings up and one bitmap with the bird’s wings 

down. We are going to start by drawing our bird with its wings up at the 0,0 

position on the screen. We need to override the onDraw() method for this. 

You can do this by staring to type onDraw below your constructor in the 

BirdieGameView class. You will get a popup that allows you to override the 

method. 

Figure 282. Autocomplete for onDraw 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 188 of 222 

IIE Module Manual        

PROG7313 

Figure 283. Overriding onDraw 

Add all the images in the assets folder to res\\drawable. 

We next need to get access to our bird image from the res folder. We do 

this by declaring our bitmap and then by using the BitmapFactory to 

decode our resource and give us access to the images in the drawable 

folder through R class. 

Figure 284. Loading the Bitmap 

You will notice that this method accepts a canvas as an argument. We will 

use this canvas to draw our bitmap to the canvas. 

The Canvas.drawBitmap() method has many overloads, some of these 

are not nullable – this means that we must provide that particular argument, 

regardless of which overload we are using. There are also some arguments 

marked as nullable (? in Kotlin). This means that we can pass in null instead 

of an actual value. We will be making use of the overload highlighted below. 

We need to provide: a bitmap image, the x and y coordinates and we can 

pass in null as an argument for paint – since we are not filling our bitmap 

with a colour. 

Figure 285. Drawing a Bitmap 

We complete the method as indicated below, we pass in our bird bitmap – 

we pass in 0 for the x value and 0 for the y value (the hints in the method 

will say left (x) and top 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 189 of 222 

IIE Module Manual        

PROG7313 

(y). We finally pass in null for the paint colour. 

Figure 286. Drawing the Bird 

All that is left to do, is to inform our MainActivity Kotlin class that we are 

not going to be using the activity\_main.xml layout file since we are creating 

our own. We start this process by creating an instance of our 

BirdieGameView class. 

Figure 287. Field for the BirdieGameView 

We instantiate the birdieGameView object in the onCreate method (see 

Figure 277). We need to pass a Context in our constructor since we 

overloaded the constructor to ask for this in the BirdieGameView class. We 

can pass in this as we want to apply our changes to the Main Activity. We 

finally replace the layout file in the setContentView method with our 

birdieGameView object. 

You can now safely delete the activity\_main.xml layout file that we are 

no longer using. 

Figure 288. Replacing the Layout with the BirdieGameView 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 190 of 222 

IIE Module Manual        

PROG7313 

The layout.xml file will be replaced 

by 

our 

custom 

designed 

BirdieGameView class, and our 

bird will be drawn at 0,0 

Figure 289. The Game in Action 

The ActionBar on this app looks a bit out of place, open the themes.xml 

file and set the entire app to NoActionBar. 

Figure 290. Removing the Action Bar 

This should display much better. 

Figure 291. Game without the Action Bar 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 191 of 222 

IIE Module Manual        

PROG7313 

4.4. Complete BirdieGameView 

What we want do achieve is shown in Figure 281. We will need to draw all 

these UI elements before we can start animating them. Follow the 

instructions below to do so. 

Figure 292. Completed View 

We start by declaring the bitmaps and Paint objects that we will need. Paint 

objects can create Text or simple shapes such as circles, rectangles, and 

squares – we can also assign these shapes a colour. We will be using Paint 

to provide our score and level counters, and the text needed to display them 

properly. We will also declare a bitmap array that will hold our two values 

for lives (either alive or dead). 

Figure 293. Loading the bitmaps 

We then set up our Paint objects. We start by setting the colour we would 

like to use, we then set the text size, typeface and anti-alias. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 192 of 222 

IIE Module Manual        

PROG7313 

Figure 294. Setting Up Paint Objects 

Tip: You need to be careful of the order in which you draw bitmaps onto the canvas. 

The bitmaps are drawn in the order that they are coded. The background file we are 

using fills the entire screen. You need to draw that first and then draw the other 

bitmaps on top of it. Your bitmaps will be stuck behind it if you do not follow this rule. 

We first draw our background and then we draw our bird on top of the background. 

Figure 295. Draw Background and Bird 

You might get the following error if the background bitmap that you are 

trying to draw is too big for android studio and any device to handle – you 

can resize the image if this is the case. This takes some trial and error, but 

you will get there in the end. 

Figure 296. Bitmap too Large 

You should see the below screen if we managed to draw the background 

with the bird op top of it. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 193 of 222 

IIE Module Manual        

PROG7313 

Figure 297. Background and Bird 

We would like to display the lives remaining, score and level at the top of 

the screen. We are going to hard code the X and Y values for now – we will 

change that later so that we can manage our images better. 

Canvas.drawText() method expects a String value that contains the text 

that we would like to display as well as the x and y coordinates. You will 

note that the Paint object is required in this case – that is because we need 

to pass in the colour, textsize and fontFaceType that we set up earlier. 

Figure 298. Drawing Text 

We provide the String values, x and y coordinates and our paint objects here. 

Figure 299. Drawing Text 

We want the Level 1 text to appear in the middle of the screen. We do not 

currently know the ending x value of the screen. Luckily, we can make use of 

the canvas.width property. This will return and int value that contains the 

ending x value. We then divide that by 2 to find the middle of the screen. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 194 of 222 

IIE Module Manual        

PROG7313 

We finally need to draw our bitmaps. We draw our lives on the screen by 

providing the following x and y coordinates. 

Figure 300. Drawing Lives 

Our completed View should now look like this: 

Figure 301. Completed Game View 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 195 of 222 

IIE Module Manual        

PROG7313 

4.5. Move the Bird Bitmap with an onTouch Event 

We would now like our little bird to flap its wings and fly up and down our 

screen (on the Y axis) when we click on him / touch him. We must consider 

a few things for this: 

1\. 

2\. 

3\. 

We must set a flag that tells if the bird is touched so that we can 

animate the bird flapping its wings by drawing either the Bitmap with 

its wings up or down. 

We need to set bounds on our screen in the form of a MinY (top of 

screen) and MaxY (bottom of screen) values. Our bird will drop off the 

bottom or fly of the top of our screen if we do not do this. 

We simulate the bird flying by redrawing the bird at different Y values. 

We do this by changing the birdY value by 10 pixels every time the 

onDraw method is called. This is done every 30 milliseconds with a 

Timer Event. 

We start by setting initial birdX and birdY values, we also set the value by 

which we would like to alter the Y coordinates of the bird in a variable called 

birdSpeed. We start off by stating that the bird will not move because it was 

not clicked. We do this by setting a Boolean touch flag to false. We finally 

create a Bitmap array that will hold the two images that simulate our bird 

flying by drawing a bitmap image of the bird with its wings up and then down 

every time we click on the bird. 

Figure 302. Initial Position and Speed of the Bird 

We next start preparing the bounds of the screen to ensure that our bird 

does not fly off the screen. We need the screen’s overall coordinates to 

do this. 

Figure 303. Canvas Coordinates 

We

next

initialise

the

canvasWidth and

calling

the 

canvasHeight fields

canvas.height and canvas.width properties in the onDraw method. 

by

© The Independent Institute of Education (Pty) Ltd 2026    

Page 196 of 222 

IIE Module Manual        

PROG7313 

Figure 304. Getting canvas size 

We set the minBirdY (as high as the bird can go on the screen) value to 

one bird’s height from position 0.0. We finally set the maxBirdY value to 

three bird heights above the very bottom of the screen. We do this by getting 

the height of the screen and then subtracting the height of the bird \*3 from 

the canvas Height. We finally set our birdY to increase with our birdSpeed 

variable every time the onDraw method is called. 

Figure 305. Bird Limits 

Now that we have the bitmaps and the bounds of our screen ready, we can 

go ahead and draw our bird. We start by checking if the bird has been 

clicked. If the bird has not been clicked, we draw the bird with its wings up 

at the initial X and Y values that we have set. We set the touch field back 

to false after we have drawn the bird. We draw the bird with its wings down 

in the else clause. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 197 of 222 

IIE Module Manual        

PROG7313 

Figure 306. Animating the Bird 

We now need to code up our onTouchEvent. We can override the 

onTouchEvent. The onTouchEvent accepts and event as an argument. We 

use this event to determine if the bird has been clicked (event.action == 

MotionEvent.Action\_Down). We set the touch flag to true and we change 

the birdSpeed to -20, this means that our bird will move up the screen 

every time we click it. 

Figure 307. Touch Event 

Our bird should drop all the way down to the MaxY value when the game 

starts. That is because we increase the value of birdY by 10 pixels every 

time we call the onDraw method. 

We still have not added the logic that will call our onDraw method every 30 

milliseconds. We will do this now. This is done in the MainActivity.java 

class. 

There are different ways to call a piece of code after a delay in Kotlin. We 

are going to make use of an Executor. Read more in (Baeldung, 2022) 

Add the following logic to the MainActivity class. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 198 of 222 

IIE Module Manual        

PROG7313 

Figure 308. Using the Executor to run code 

Your birdie should move 

upwards and flap its wings 

every time you click on it 

now. 

Figure 309. Flapping Now Working 

4.6. Add Pugicorn and Detecting Collisions 

Our bird needs to catch Pugicorns for points. We will be adding a Pugicorn 

bitmap that will roll in from the right of our screen at random different 

heights. We need to then click on the bird to move it up and down and catch 

Pugicorn. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 199 of 222 

IIE Module Manual        

PROG7313 

Figure 310. Pugicorn 

We begin by declaring the X and Y properties that we will need for 

Pugicorn as well as his speed: 

Figure 311. Pugicorn Variables 

We first check if Pugicorn has moved off the left side of the screen, if he did, 

we redraw him 20 pixels off the screen (to the right) on the x axis. We use 

quite a complicated line of code to provide the pugiY axis. We start by 

converting whatever the line of code returns to int value, we then use 

Math.floor to round whatever value we receive up to the highest number. 

We pass Math.random to the Math.floor method. We use Math.random to 

generate any random Y value, BUT this value must be within the bounds 

we set for the bird, these are MinY and MaxY. 

We finally use the canvas to draw Pugicorn. 

Figure 312. Drawing the Pugicorn 

We need to determine if our bird and Pugicorn collided to increase our score 

by 10 points. We create a Boolean collisionCheck() method for this. This 

method accepts an int x and y value. We then check if our bird’s X value is 

smaller than x and if x is smaller than current X value of our bird + the bird 

bitmap’s width. We do the same for the bird’s Y values, except we use 

bird.height to get the height of the bird. This basically gives us the outline 

of our bird. If x is smaller than the outline – a collision as taken place as we 

will pass Pugicorn’s x and y values in as arguments. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 200 of 222 

IIE Module Manual        

PROG7313 

Figure 313. Checking for Collisions 

We call the collisionCheck() method in the onDraw method. You will 

notice that we do in fact pass Pugicorn’s X and Y values into this method. 

We increase our score, pop a Toast message and reset Pugicorn’s X value 

to -100 (off the screen) if a collision did occur. 

Create a property to store the score and change the display to make use of 

that property. 

… 

Figure 314. Storing and using the score 

And then check for a collision. 

Figure 315. Handling a Collision 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 201 of 222 

IIE Module Manual        

PROG7313 

Our 

Toast 

message appears, 

and our score is 

increased when a 

collision occurs 

Pugicorn 

appear 

now 

at 

random Y values 

Figure 316. Pugicorn in Action 

The BirdieGameView class now contains quite a bit of logic, here is the 

completed class so far: 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 202 of 222 

IIE Module Manual        

PROG7313 

package za.ac.iie.opsc7311.birdiegame 

import 

android.content.Co

ntext 

import 

android.graphics.\* 

import 

android.view.Motio

nEvent 

import 

android.view.View 

import android.widget.Toast 

class BirdieGameView(context: Context?) : View(context) { 

// bitmaps 

private var bird : Bitmap = BitmapFactory.decodeResource(resources, 

R.drawable.wingsup) 

private 

var 

BitmapFactory.decodeResource(resources, 

private 

var 

birdDown 

: 

Bitmap 

= 

R.drawable.wingsdown) 

greengrassbackground 

: 

Bitmap 

= 

BitmapFactory.decodeResource(resources, 

R.drawable.villagescreensize) 

private var pugicorn : Bitmap = BitmapFactory.decodeResource(resources, 

R.drawable.puggicorn) 

private 

var 

cuppicake 

: 

= 

BitmapFactory.decodeResource(resources, R.drawable.cuppicake) private var 

lifealive 

Bitmap 

: 

Bitmap 

R.drawable.smallalive) 

= 

private 

BitmapFactory.decodeResource(resources, 

var 

lifedead 

: 

BitmapFactory.decodeResource(resources, R.drawable.smalldead) 

// paint 

private 

scoreCounter 

var 

= 

Paint() private var 

levelCounter = Paint() 

// bird position 

and speed private 

var birdX = 10f 

private var birdY 

= 50f private var 

birdSpeed = 10 

private 

var 

touchFlag = false 

// screen size 

Bitmap 

= 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 203 of 222 

IIE Module Manual        

PROG7313 

private var canvasHeight = 

0 private var canvasWidth = 

0 

// pugicorn state 

private var pugiX = -1f private var 

pugiY = 0f 

private var pugiSpeed = 15 

// player state 

private var score 

= 0 

init { 

scoreCounter.color = Color.BLACK 

scoreCounter.textSize 

scoreCounter.typeface 

= 

Typeface.DEFAULT\_BOLD 

scoreCounter.isAntiAlias = true 

levelCounter.color 

= 

30f 

= 

Color.BLUE 

levelCounter.textSize 

levelCounter.typeface 

Typeface.DEFAULT\_BOLD 

levelCounter.textAlign 

= 

Paint.Align.CENTER 

levelCounter.isAntiAlias = true 

} 

30f 

= 

= 

override fun onDraw(canvas: Canvas?) { 

super.onDraw(canvas) 

// get screen 

size if (canvas 

!= null) { 

canvasHeight = canvas.height 

canvasWidth = canvas.width 

} 

// take careful note of the order here 

canvas?.drawBitmap(greengrassbackground, 0f, 

0f, null) 

// calculate the minimum Y value for the bird - one size below the 

top of the screen var minBirdY = bird.height 

// calculate the maximum Y value for the bird - one size above the 

bottom of the screen var maxBirdY = canvasHeight - bird.height 

// calculate the position of the 

bird birdY += birdSpeed 

if (birdY > maxBirdY) { 

birdY = maxBirdY.toFloat() 

} 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 204 of 222 

IIE Module Manual        

PROG7313 

// draw the bird, animating to flap 

the wings if (touchFlag) { 

canvas?.drawBitmap(bird, birdX, birdY, 

null) touchFlag = false 

} else { 

canvas?.drawBitmap(birdDown, birdX, birdY, null) 

} 

birdSpeed += 2 

// 

draw 

the 

pugicorn pugiX 

= pugiSpeed if 

(pugiX < 0) { 

pugiX = (canvasWidth + 20).toFloat() 

pugiY = (Math.floor(Math.random() \* (maxBirdY - minBirdY)) + minBirdY).toFloat() 

} 

canvas?.drawBitmap(pugicorn, pugiX, pugiY, null) 

// check for collision 

if 

(collisionCheck(pugiX, 

pugiY)) { score += 10 

Toast.makeText(this@BirdieGameView.context

, 

Toast.LENGTH\_SHORT).show() 

pugiX = -100f 

} 

"Pugicorn!", 

// draw the score and level 

canvas?.drawText("Score: ${score}", 20f, 60f, scoreCounter) 

canvas?.drawText("Level 

1", 

levelCounter) 

canvasWidth.toFloat()/2, 

// display the icons for the lives 

canvas?.drawBitmap(lifealive, canvasWidth.toFloat() - 

300, 

30f, 

null) 

canvasWidth.toFloat() 

canvas?.drawBitmap(lifealive, - 

200, 

30f, 

null) 

canvas?.drawBitmap(lifealive, canvasWidth.toFloat() - 

100, 30f, null) 

} 

override 

fun 

onTouchEvent(event: 

MotionEvent?): Boolean { if (event?.action 

== MotionEvent.ACTION\_DOWN) { 

touchFlag = true 

birdSpeed = -20 

} 

return true 

} 

// check for a collision 

private fun collisionCheck(x: Float, y: Float) 

: Boolean { if (birdX < x \&\& x < (birdX + 

bird.width) \&\& 

birdY < y \&\& y < (birdY + 

bird.height)) { return true 

} 

return false 

} 

} 

60f, 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 205 of 222 

IIE Module Manual        

PROG7313 

4.7. Adding Rainbowcuppicake, checking for collisions and 

changing the lives icons 

Now that we can accumulate scores, we need to add our bad guy that will 

decrease our lives. We will be adding Rainbowcuppicake to the mix. Our 

bird will lose a life it collides with a cupcake. We will then change on of our 

unicorns (which represent a life) into a ghost. 

Let’s start by declaring the variables that we will need for Rainbowcuppicake. 

Figure 317. Rainbow Cuppicake Variables 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 206 of 222 

IIE Module Manual        

PROG7313 

We change the value of your X axis so that our cuppicake can move across 

the screen, the same as we did for Pugicorn. 

Figure 318. Moving the Cuppicake 

We next check if our cupcakes X axes is less than 0, which means that that 

our cuppicake has veered off the screen on the left. We then redraw the 

cuppicake by setting the X value to +200 so that it will be redrawn off the 

right side of the screen. We once again set a Random Y value that is within 

the bounds we set earlier. 

Figure 319. Drawing the Cuppicake 

Your cuppicake should now appear on your screen. 

Figure 320. Cuppicake in Action 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 207 of 222 

IIE Module Manual        

PROG7313 

We next need to check for a collision and decrease our life count if a 

collision has occurred. We start by setting declaring our lifecount variable 

under our class definition and setting the variable within our constructor. 

Figure 321 Variable for Life Counter 

We next check if a collision has occurred by reusing our previous 

collisionCheck() method. The first thing we do when a collision is 

detected is to redraw our cuppicake off the screen. We then remove one 

life from our life count. We finally check if our lifecount had decreased to 

0\. We pop up a Toast message to indicated that it is game over. 

Figure 322. Check for cuppicake collusions 

We also want our unicorn life icons to change when we lose a life. We do 

this by implementing a for loop. 

Figure 323. Displaying Lives 

You can now run your app – your unicorn should turn into a ghost every 

time the bird is hit and a game over toast should pop up when we have run 

out of lives. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 208 of 222 

IIE Module Manual        

PROG7313 

Figure 324. Lives Displaying in the App 

We finally want to handle the Game Over event a bit better. We are going 

to draw the words GAME OVER, and stop all the animations from 

happening. 

We need another Paint property for this. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 209 of 222 

IIE Module Guide/Manual        

PROG7313 

Figure 325. Paint for game over display 

And then we can change the display 

if we reach 0 lives. 

Figure 326. Checking for remaining lives 

Figure 327. Game over 

The final code can be found in the GitHub repository. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 210 of 222 

IIE Module Guide/Manual        

PROG7313 

5\. Recommended Digital Engagement and Activities 

Have a look at the website Coding with Sara. There are a lot of 

interesting videos about Android development on that website. It is 

available 

here: 

https://www.youtube.com/channel/UCVnbJshpiREv65Z6QpTjHnQ 

\[Accessed 17 November 2022]. 

Also have a look at the videos on the clientuser.net channel on 

YouTube, 

available 

at 

https://www.youtube.com/channel/ 

UCWTzjwD6ps1GELhvubxLb2Q \[Accessed 30 December 2024]. 

6\. Activities 

Do the activities that appear on Learn. 

7\. Revision Exercises 

Add a second level to the game. The game needs to enter Level 2 

when the player reaches 100 points. Level two should have a 

different background, a bat that immediately kills your bird as well 

as a Taco that is worth 50 points. In fact, add as many levels as you 

like and push the final score up to 

Firebase.

8\. Solutions to Revision Exercises 

Download the BirdieGame from the GitHub repo. Make sure that 

your additional level to the game is working and running correctly. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 211 of 222 

IIE Module Guide/Manual        

PROG7313 

Bibliography 

Abu Experience, 2017. 10 Mobile UX Design Principles You Should 

Know. \[Online] Available at: http://uxbert.com/10-mobile-ux-design

principles/ \[Accessed 30 December 2024]. 

Agrawal, S., n.d.. Property, Getter and Setter : Kotlin. \[Online] 

Available at: https://agrawalsuneet.github.io/blogs/property-getter

and-setter-kotlin/ Accessed 30 December 2024 ]. 

al3c, 2022. Trying to understand OnClickListener. \[Online] Available 

at: 

https://discuss.kotlinlang.org/t/trying-to-understand

onclicklistener/24773/4 \[Accessed 30 December 2024]. 

Android Open Source Project, 2019. Run your app. \[Online] 

Available 

at: 

https://developer.android.com/training/basics/firstapp/running-app  

\[Accessed 30 December 2024]. 

Android Open Source Project, 2020b. Licenses. \[Online] Available 

at: https://source.android.com/setup/start/licenses \[Accessed 30 

December 2024]. 

Android Open Source Project, 2020c. Run apps on the Android 

Emulator. 

\[Online] 

Available 

at: 

https://developer.android.com/studio/run/emulator \[Accessed 30 

December 2024]. 

Android Open Source Project, 2020d. Android Runtime (ART) and 

Dalvik. 

\[Online] 

Available 

https://source.android.com/devices/tech/dalvik 

December 2024]. 

\[Accessed 

at: 

30 

Android Open Source Project, 2020f. Build a UI with Layout Editor. 

\[Online] 

Available 

at: 

https://developer.android.com/studio/write/layout-editor \[Accessed 

30 December 2024]. 

Android Open Source Project, 2020g. Layouts. \[Online] Available 

at: 

https://developer.android.com/guide/topics/ui/declaring-layout   

\[Accessed 30 December 2024]. 

Android Open Source Project, 2020h. App resources overview. 

\[Online] 

Available 

https://developer.android.com/guide/topics/resources/providing

resources \[Accessed 30 December 2024]. 

at: 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 212 of 222 

IIE Module Guide/Manual        

PROG7313 

Android Open Source Project, 2020i. Build a Responsive UI with 

ConstraintLayout. 

\[Online] 

Available 

at: 

https://developer.android.com/training/constraint-layout \[Accessed 

30 December 2024]. 

Android Open Source Project, 2020j. Activity. \[Online] Available at: 

https://developer.android.com/reference/android/app/Activity 

\[Accessed 30 December 2024]. 

at: 

Android Open Source Project, 2022. Android 13 Beta. \[Online] 

Available 

https://developer.android.com/about/versions/13 

\[Accessed 30 December 2024]. 

Android Open Source Project, 2022b. Meet Android Studio. \[Online] Available at: 

https://developer.android.com/studio/intro \[Accessed 30 December 2024]. 

Android Open Source Project, 2022c. Run apps on a hardware 

device. 

\[Online] 

Available 

https://developer.android.com/studio/run/device 

at: 

\[Accessed 30 

December 2024]. 

Android Open Source Project, 2022d. About Android App Bundles. 

\[Online] Available at: https://developer.android.com/guide/app

bundle \[Accessed 30 December 2024]. 

Android Open Source Project, 2022e. Context. \[Online] Available at: 

https://developer.android.com/reference/android/content/Context  

\[Accessed 30 December 2024]. 

Android Open Source Project, 2022f. CameraX. \[Online] Available 

at: 

https://developer.android.com/jetpack/androidx/releases/camera#g

roovy \[Accessed 30 December 2024]. 

Android 

Open 

Source 

DatePickerDialog.OnDateSetListener. 

Project, 

2022g. 

\[Online] 

Available 

at: 

https://developer.android.com/reference/android/app/DatePickerDial

og.OnDateSetLis tener\[Accessed 30 December 2024]. 

Anon., 2018. File:Java programming language logo.svg. \[Online] 

Available 

at: 

https://en.wikipedia.org/wiki/File:Java\_programming\_language\_log

o.svg \[Accessed 30 December 2024]. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 213 of 222 

IIE Module Guide/Manual        PROG7313 

© The Independent Institute of Education (Pty) Ltd 2026    Page 214 of 222 

Ayub, N., 2017. Android Linear Layout Example. \[Online] Available 

at: https://javatutorial.net/android-linear-layout-example \[Accessed 

30 December 2024]. 

&#x20;

Ayub, N., 2017b. Android Relative Layout Example. \[Online] 

Available at: https://javatutorial.net/android-relative-layout-example 

\[Accessed 30 December 2024]. 

&#x20;

Baeldung, 2022. Calling a Kotlin Function After a Delay. \[Online] 

Available at: https://www.baeldung.com/kotlin/call-function-after

delay \[Accessed 30 December 2024]. 

&#x20;

Bhatnagar, M., 2018. Magic lies here - Statically vs Dynamically 

Typed Languages. \[Online] Available at: 

https://medium.com/android-news/magic-lies-here-statically- typed

vs-dynamically-typed-languages-d151c7f95e2b \[Accessed 30 

December 2024]. 

&#x20;

Chen, J., 2020. Android Operating System. \[Online] Available at: 

https://www.investopedia.com/terms/a/android-operating

system.asp \[Accessed 30 December 2024]. 

&#x20;

Doan, T. H., 2020. Utils class in Kotlin. \[Online] Available at: 

https://proandroiddev.com/utils-class-in-kotlin-387a09b8d495   

\[Accessed 30 December 2024]. 

&#x20;

Engel, C., 2017. 4 Ways To Implement OnClickListener On Android. 

\[Online] Available at: https://medium.com/@CodyEngel/4-ways-to

implement-onclicklistener-on- android-9b956cbd2928 \[Accessed 30 

December 2024]. 

&#x20;

Ernst, M., 2018. Version control concepts and best practices. 

\[Online] Available at: 

https://homes.cs.washington.edu/\~mernst/advice/version

control.html \[Accessed 30 December 2024]. 

&#x20;

Foundation, K., 2022c. Generics: in, out, where. \[Online] Available at: 

https://kotlinlang.org/docs/generics.html \[Accessed 30 December 

2024]. 

&#x20;

G., N., 2022. Android: Market Share \& Other Stats for 2022. 

\[Online] Available at: https://techjury.net/blog/android-market

share/ \[Accessed 30 December 2024]. 

&#x20;

GeeksforGeeks, 2018. Anonymous Inner Class in Java. \[Online] 

Available at: https://www.geeksforgeeks.org/anonymous-inner

class-java/ \[Accessed 30 December 2024]. 

&#x20;

IIE Module Guide/Manual        

PROG7313 

Google, 2014. File:Android robot 2014.svg. \[Online] Available at: 

https://commons.wikimedia.org/wiki/File:Android\_robot\_2014.svg  

\[Accessed 30 December 2024]. 

Google, 2022b. Get data with Cloud Firestore. \[Online] Available at: 

https://firebase.google.com/docs/firestore/query-data/get-data   

\[Accessed 30 December 2024]. 

Google, 2022. Choose a Database: Cloud Firestore or Realtime 

Database. 

\[Online] 

Available 

at: 

https://firebase.google.com/docs/database/rtdb-vs- 

firestore#which\_database\_does\_firebase\_recommend \[Accessed 

30 December 2024]. 

Google, n.d.. Applying color to UI. \[Online] Available at: 

https://material.io/design/color/applying-color-to-ui.html#usage   

\[Accessed 30 December 2024]. 

Heller, M., 2022. What is Kotlin? The Java alternative explained. 

\[Online] 

Available 

https://www.infoworld.com/article/3224868/what-is-kotlin-the-java

alternative- explained.html \[Accessed 30 December 2024]. 

at: 

HowToDoInjava.com, n.d.. Gradle Tutorial – Installation and Hello 

World 

Example. 

\[Online] 

Available 

https://howtodoinjava.com/gradle/gradle-tutorial-installation-and- 

hello-world-example/ \[Accessed 30 December 2024]. 

at: 

JetBrains, 2020. File:Kotlin-logo.svg. \[Online] Available at: 

File:Kotlin-logo.svg \[Accessed 30 December 2024]. 

Jethro, 2018. Android naming convention. \[Online] Available at: 

https://stackoverflow.com/questions/12870537/android-naming

convention \[Accessed 30 December 2024]. 

Komatineni, S., 2014. Understanding R.java. \[Online] Available at: 

http://knowledgefolders.com/akc/display?url=displaynoteimpurl\&ow

nerUserId=satya\& reportId=2883 \[Accessed 30 December 2024]. 

Kotlin Foundation, 2022. Basic syntax. \[Online] Available at: 

https://kotlinlang.org/docs/basic-syntax.html 

\[Accessed 

December 2024]. 

30 

Kotlin Foundation, 2022b. Conditions and loops. \[Online] Available 

at: 

https://kotlinlang.org/docs/control-flow.html 

December 2024]. 

\[Accessed 30 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 215 of 222 

IIE Module Guide/Manual        

PROG7313 

kotlinlang, n.d.. Kotlin Playground. \[Online] Available at: 

https://play.kotlinlang.org/ \[Accessed 30 December 2024]. 

Lake, I., 2016. Layouts, Attributes, and you. \[Online] Available at: 

https://medium.com/androiddevelopers/layouts-attributes-and-you

9e5a4b4fe32c \[Accessed 30 December 2024]. 

Lee, G., 2017. Android View Measurement. \[Online] Available at: 

https://blog.takescoop.com/android-view-measurement

d1f2f5c98f75 \[Accessed 30 December 2024]. 

Leiva, A., 2020. View Binding: The Definitive way to access views on 

Android. \[Online] Available at: https://antonioleiva.com/view

binding-android/ \[Accessed 30 December 2024]. 

Murphy, M. L., 2020. Other Changes of Note. \[Online] Available at: 

https://commonsware.com/R/pages/chap-other-001.html 

\[Accessed 30 December 2024]. 

Ndonga, R., 2021. How to Implement CameraX API in Android 

Using 

Kotlin. 

\[Online] 

Available 

https://www.section.io/engineering-education/how-to-implement- 

camerax-api-in-android/ \[Accessed 30 December 2024]. 

at: 

nevoski, n.d.. Iphone Android Stencil. \[Online] Available at: 

https://pixabay.com/vectors/iphone-android-stencil-smartphone

1459087/ \[Accessed 30 December 2024]. 

OpenWeather, n.d.. Current weather data. \[Online] Available at: 

https://openweathermap.org/current \[Accessed 30 December 

2024]. 

Programiz, 2022. Kotlin Constructors. \[Online] Available at: 

https://www.programiz.com/kotlin-programming/constructors 

\[Accessed 30 December 2024]. 

Raphael, J., 2020. Android versions: A living history from 1.0 to 11. 

\[Online] 

Available 

at: 

https://www.computerworld.com/article/3235946/android-versions

a-living-history- from-1-0-to-today.html \[Accessed 30 December 

2024]. 

Rout, A. R., 2022. Different Types of Activities in Android Studio. 

\[Online] Available at: https://www.geeksforgeeks.org/different-types

of-activities-in-android-studio/ \[Accessed 30 December 2024]. 

sahilkhoslaa, 2018. Java | How to create your own Helper Class?. 

\[Online] 

Available 

at: 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 216 of 222 

IIE Module Guide/Manual        PROG7313 

© The Independent Institute of Education (Pty) Ltd 2026    Page 217 of 222 

https://auth.geeksforgeeks.org/user/sahilkhoslaa/articles 

\[Accessed 30 December 2024]. 

&#x20;

Sharma, M., 2021. StartActivityForResult is Deprecated!. 

\[Online] Available at: 

https://www.mongodb.com/developer/languages/kotlin/realm

startactivityforresult- registerforactivityresult-deprecated-android

kotlin/ \[Accessed 30 December 2024]. 

&#x20;

Shaukat, A., 2016. An Overview Of Polymorphism, Inheritance And 

Encapsulation In OOP. \[Online] Available at: https://www.c

sharpcorner.com/article/an-overview-of- polymorphism-inheritance

and-encapsulation-in-oop/ \[Accessed 30 December 2024]. 

&#x20;

Sinhal, A., 2017. Closer Look At Android Runtime: DVM vs ART. 

\[Online] Available at: https://android.jlelse.eu/closer-look-at-android

runtime-dvm-vs-art-1dc5240c3924 \[Accessed 30 December 2024]. 

&#x20;

Sinicki, A., 2019. How to install the Android SDK. \[Online] 

Available at: https://www.androidauthority.com/how-to-install

android-sdk-software-development- kit-21137/ \[Accessed 30 

December 2024]. 

&#x20;

TFPP Writer, 2018. 5 Examples Of Successful Rebranding That Will 

Blow Your Mind. \[Online] Available at: 

https://thefederalistpapers.org/us/5-examples-successful- 

rebranding-will-blow-mind \[Accessed 30 December 2024]. 

&#x20;

TutorialKart, 2021. Only the original thread that created a view 

hierarchy can touch its views. \[Online] Available at: 

https://www.tutorialkart.com/kotlin-android/original- thread-created

view-hierarchy-can-touch-views/ \[Accessed 30 December 2024]. 

&#x20;

U.S. Brand Colours, n.d.. Starbucks Colors. \[Online]. Available at: 

https://usbrandcolors.com/starbucks-colors/\[ Accessed 30 

December 2024]. 

&#x20;

Wagner, B., Lieben, G., Warren, G. E. \& Dykstra, T., 2022. 

Properties (C# Programming Guide). \[Online] Available at: 

https://learn.microsoft.com/en- us/dotnet/csharp/programming

guide/classes-and-structs/properties \[Accessed 30 December 

2024]. 

&#x20; 

IIE Module Guide/Manual        

PROG7313 

Intellectual Property 

Plagiarism occurs in a variety of forms. Ultimately though, it refers to the use of the 

words, ideas or images of another person without acknowledging the source using the 

required conventions. The IIE publishes a Quick Reference Guide that provides more 

detailed guidance, but a brief description of plagiarism and referencing is included 

below for your reference. It is vital that you are familiar with this information and the 

Intellectual Integrity Policy before attempting any assignments. 

Introduction to Referencing and Plagiarism 

What is ‘Plagiarism’? 

‘Plagiarism’ is the act of taking someone’s words or ideas and presenting them as your 

own.  

What is ‘Referencing’? 

‘Referencing’ is the act of citing or giving credit to the authors of any work that you 

have referred to or consulted. A ‘reference’ then refers to a citation (a credit) or the 

actual information from a publication that is referred to. 

Referencing is the acknowledgment of any work that is not your own, but is used by 

you in an academic document. It is simply a way of giving credit to and acknowledging 

the ideas and words of others. 

When writing assignments, students are required to acknowledge the work, words or 

ideas of others through the technique of referencing. Referencing occurs in the text at 

the place where the work of others is being cited, and at the end of the document, in 

the bibliography. 

The bibliography is a list of all the work (published and unpublished) that a writer has 

read in the course of preparing a piece of writing. This includes items that are not 

directly cited in the work. 

A reference is required when you: 

 

 

 

 

Quote directly: when you use the exact words as they appear in the source; 

Copy directly: when you copy data, figures, tables, images, music, videos or 

frameworks;  

Summarise: when you write a short account of what is in the source; 

Paraphrase: when you state the work, words and ideas of someone else in your 

own words. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 218 of 222 

IIE Module Guide/Manual        

PROG7313 

It is standard practice in the academic world to recognise and respect the ownership 

of ideas, known as intellectual property, through good referencing techniques. 

However, there are other reasons why referencing is useful. 

Good Reasons for Referencing 

It is good academic practice to reference because: 

 

 

 

 

 

It enhances the quality of your writing; 

It demonstrates the scope, depth and breadth of your research; 

It gives structure and strength to the aims of your article or paper; 

It endorses your arguments; 

It allows readers to access source documents relating to your work, quickly and 

easily. 

Sources 

The following would count as ‘sources’: 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

Books, 

Chapters from books, 

Encyclopaedias, 

Articles, 

Journals, 

Magazines, 

Periodicals, 

Newspaper articles, 

Items from the Internet (images, videos, etc.), 

Pictures, 

Unpublished notes, articles, papers, books, manuscripts, dissertations, theses, 

etc., 

Diagrams, 

Videos, 

Films, 

Music, 

Works of fiction (novels, short stories or poetry). 

What You Need to Document from the Hard Copy Source You 

are Using 

(Not every detail will be applicable in every case. However, the following lists provide 

a guide to what information is needed.) 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 219 of 222 

IIE Module Guide/Manual        

PROG7313 

You need to acknowledge: 

 

 

 

 

 

 

 

 

 

 

 

The words or work of the author(s), 

The author(s)’s or editor(s)’s full names, 

If your source is a group/ organisation/ body, you need all the details, 

Name of the journal, periodical, magazine, book, etc., 

Edition, 

Publisher’s name, 

Place of publication (i.e. the city of publication), 

Year of publication, 

Volume number, 

Issue number, 

Page numbers. 

What You Need to Document if you are Citing Electronic 

Sources 

 

 

 

 

 

 

 

Author(s)’s/ editor(s)’s name, 

Title of the page, 

Title of the site, 

Copyright date, or the date that the page was last updated, 

Full Internet address of page(s), 

Date you accessed/ viewed the source, 

Any other relevant information pertaining to the web page or website. 

Referencing Systems 

There are a number of referencing systems in use and each has its own consistent 

rules. While these may differ from system-to-system, the referencing system followed 

needs to be used consistently, throughout the text. Different referencing systems 

cannot be mixed in the same piece of work! 

A detailed guide to referencing, entitled Referencing and Plagiarism Guide is available 

from your library. Please refer to it if you require further assistance. 

When is Referencing Not Necessary? 

This is a difficult question to answer – usually when something is ‘common knowledge’. 

However, it is not always clear what ‘common knowledge’ is. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 220 of 222 

IIE Module Guide/Manual        

PROG7313 

Examples of ‘common knowledge’ are: 

 

 

 

 

 

 

Nelson Mandela was released from prison in 1990; 

The world’s largest diamond was found in South Africa; 

South Africa is divided into nine (9) provinces; 

The lion is also known as ‘The King of the Jungle’. 



&#x20;= 𝑚𝑐 

The sky is blue. 

Usually, all of the above examples would not be referenced. The equation 𝐸 = 𝑚𝑐   

is Einstein’s famous equation for calculations of total energy and has become so 

familiar that it is not referenced to Einstein. 

Sometimes what we think is ‘common knowledge’, is not.  For example, the above 

statement about the sky being blue is only partly true. The light from the sun looks 

white, but it is actually made up of all the colours of the rainbow. Sunlight reaches the 

Earth's atmosphere and is scattered in all directions by all the gases and particles in 

the air. The smallest particles are by coincidence the same length as the wavelength 

of blue light. Blue is scattered more than the other colours because it travels as shorter, 

smaller waves. It is not entirely accurate then to claim that the sky is blue. It is thus 

generally safer to always check your facts and try to find a reputable source for your 

claim. 

Important Plagiarism Reminders 

The IIE respects the intellectual property of other people and requires its students to 

be familiar with the necessary referencing conventions. Please ensure that you seek 

assistance in this regard before submitting work if you are uncertain. 

If you fail to acknowledge the work or ideas of others or do so inadequately this will be 

handled in terms of the Intellectual Integrity Policy (available in the library) and/ or the 

Student Code of Conduct – depending on whether or not plagiarism and/ or cheating 

(passing off the work of other people as your own by copying the work of other students 

or copying off the Internet or from another source) is suspected. 

Your campus offers individual and group training on referencing conventions – please 

speak to your librarian or ADC/ Campus Co-Navigator in this regard. 

Reiteration of the Declaration you have signed: 

1\. 

2\. 

3\. 

4\. 

I have been informed about the seriousness of acts of plagiarism. 

I understand what plagiarism is. 

I am aware that The Independent Institute of Education (IIE) has a policy 

regarding plagiarism and that it does not accept acts of plagiarism. 

I am aware that the Intellectual Integrity Policy and the Student Code of Conduct 

prescribe the consequences of plagiarism. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 221 of 222 

IIE Module Guide/Manual        

PROG7313 

5\. 

6\. 

7\. 

I am aware that referencing guides are available in my student handbook or 

equivalent and in the library and that following them is a requirement for 

successful completion of my programme. 

I am aware that should I require support or assistance in using referencing guides 

to avoid plagiarism I may speak to the lecturers, the librarian or the campus ADC/ 

Campus Co-Navigator. 

I am aware of the consequences of plagiarism. 

Please ask for assistance prior to submitting work if you are at all unsure. 

© The Independent Institute of Education (Pty) Ltd 2026    

Page 222 of 222 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 1 of 26 

&#x20;

&#x20;

MODULE NAME: MODULE CODE: 

OPEN-SOURCE CODING (INTRODUCTION) OPSC6311/w 

&#x20;

ASSESSMENT TYPE: POE (PAPER \& MARKING RUBRICS)  

&#x20;

TOTAL MARK ALLOCATION: 300 MARKS 

&#x20;

TOTAL HOURS: A minimum of 45 HOURS is suggested to complete this assessment 

&#x20;

By submitting this assignment, you acknowledge that you have read and understood all the rules 

as per the terms in the registration contract, in particular the assignment and assessment rules in 

The IIE Assessment Strategy and Policy (IIE009), the intellectual integrity and plagiarism rules in 

the Intellectual Integrity and Property Rights Policy (IIE023), as well as any rules and regulations 

published in the student portal. 

&#x20;

INSTRUCTIONS:  

&#x20;

1\. No material may be copied from original sources, even if referenced correctly, unless it is 

a direct quote indicated with quotation marks. No more than 10% of the assignment may 

consist of direct quotes. 

2\. Please ensure that you submit your assignment through Turnitin. Please make sure you 

attach a similarity report to your POE if you are required to submit a hard copy of your 

PoE. 

3\. Make a backup of your assignment before handing it in. 

4\. Follow all instructions on the PoE cover sheet. 

5\. This is a group assignment. 

&#x20; 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 2 of 26 

Referencing Rubric                                                                                                                                                      

Providing evidence based on valid and referenced academic sources is a 

fundamental educational principle and the cornerstone of high-quality 

academic work. Part of achieving this quality is referencing in a way that is 

consistent and congruent with the requirements of the referencing style 

being used.  

&#x20;

Therefore, inconsistent, and/or incongruent referencing will result in a 

penalty of a maximum of ten percent being deducted from the overall 

percentage awarded to your assessment submission. 

&#x20; 

Please note that evidence of plagiarism in the form of copied or unreferenced 

work, absent reference lists, or exceptionally poor referencing may result in 

action being taken in accordance with The IIE’s Intellectual Integrity and 

Property Rights Policy (IIE023). Similarly, evidence of excessive AI usage may 

result in action being taken in accordance with The IIE’s Student Conduct, 

Discipline and Safety Policy (IIE015). 

Markers are required to provide feedback to students by 

circling/underlining the information in the table below that best describes 

the student’s work and by adding constructive commentary where 

appropriate. The examples provided are not exhaustive but illustrate the 

errors. 

&#x20;

Deductions 

 Where the student’s work contains five or more errors aligned to the 

minor errors column below, deduct 5% from the overall percentage.  

&#x20;

 Where the student’s work contains five or more errors aligned to the 

major errors column below, deduct 10% from the overall percentage.  

&#x20;

 Where both minor and major errors (e.g. two minor and three major, 

etc.) are present, deduct 10% only (and not 5% or 15%) from the overall 

percentage.  

Required:  

Consistent and congruent 

referencing  

Minor errors  

Deduct 5% from overall percentage. 

Example: if the response receives 70%, deduct 5%. The 

final mark is 65%. 

Major errors  

Deduct 10% from the overall percentage. 

Example: if the response receives 70%, deduct 10%. 

The final mark is 60%. 

Consistency  

 The correct referencing style 

for the discipline – i.e., either 

Harvard, OR APA (for 

Psychology), OR Law, OR IEEE 

(for ICT/Engineering) – has 

been used consistently for all 

in-text references and in the 

bibliography/reference list. 

&#x20;

 Concepts and ideas that are 

quoted and/or paraphrased 

are referenced consistently 

throughout. 

&#x20;

 Position of the in-text 

reference: an in-text 

reference is positioned 

consistently where 

appropriate for every quote 

and paraphrase.  

&#x20;

Minor inconsistencies: 

 The referencing style used is generally consistent with 

what is required, but there are one or two 

changes/errors in the format of in-text referencing 

and/or in the bibliography/reference list.  

&#x20;

 For example, page numbers for direct quotes in-text 

have been provided for one source, but not in another. 

Or, two book chapters in the bibliography/reference 

list have been referenced in two different formats. Or, 

the publication year has been placed after the author 

name in one bibliography/reference list entry, and 

after the source title in another, etc.  

&#x20;

 Concepts and ideas in quotes and/or paraphrases are 

typically referenced, but a full in-text reference is 

missing or incomplete from one or two small sections 

of the work.  

&#x20;

 Position of the references: in-text references are only 

given at the beginning and/or end of every paragraph. 

Major inconsistencies: 

 Poor and wholly inconsistent referencing style used 

in-text and/or in the bibliography/reference list. 

&#x20;

 Multiple referencing styles for the same source 

types have been used. 

&#x20;

 For example, the format for direct quotes in-text 

and/or book chapters in the bibliography/reference 

list and/or year of publication in the 

bibliography/reference list is different across 

multiple instances.  

&#x20;

 Concepts and ideas in quotes and/or paraphrases 

are haphazardly referenced in-text.  

&#x20;

 Position of the references: in-text references are 

only given at the beginning or end of large sections 

of work.  

Feedback on referencing consistency: 

&#x20;

&#x20;

&#x20;

Congruency  

 Each source reflected within 

in-text references is included 

accurately in the 

bibliography/reference list. 

&#x20;

 All bibliography/reference list 

entries are in the required 

order for the referencing style 

used (e.g. alphabetical, 

alphabetical under 

subheadings, numerical). 

&#x20;

 All direct quotes and 

paraphrases have been 

integrated appropriately into 

the text using introductory 

phrases, accurate grammar, 

etc.  

&#x20;

Minor incongruences:  

 There is largely a match between the sources 

presented in-text and those in the 

bibliography/reference list, but one or two sources 

that appear in-text do not appear in the 

bibliography/reference list, or vice versa. Or key source 

information is missing from one or two in-text 

references or bibliography/reference list entries only 

(e.g. publication year, city of publication, URL date 

accessed, etc.). 

&#x20;

 There is a clear and largely accurate ordering of 

sources in the bibliography/reference list as required 

by the referencing style used, but with one or two 

references out of order.  

&#x20;

 An attempt has been made for source integration into 

the text using appropriate introductory phrases and 

grammar, but one or two quotes or paraphrases do not 

flow as clearly or logically within the sentence 

structure as they could. 

Major incongruences: 

 No relationship/several incongruencies between 

the in-text referencing and the 

bibliography/reference list.  

&#x20;

 For example, multiple sources are included in-text, 

but not in the bibliography, and/or vice versa. Key 

source information is missing from multiple in-text 

references and/or reference list entries. A URL link, 

rather than the actual reference, is provided in the 

bibliography. Sources are repeated in the reference 

list, etc.  

&#x20;

 Most sources are listed in a haphazard order 

throughout the bibliography/reference list. 

&#x20;

 Few to no appropriate introductory phrases or 

rules of grammar have been applied, and many 

direct quotes and/or paraphrases feel disconnected 

from the flow of the text.  

&#x20; 

Feedback on referencing congruency: 

&#x20;

&#x20;

&#x20;

Overall feedback on referencing, with suggested improvements: 

&#x20; 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 3 of 26 

Background 

&#x20;

This portfolio of evidence comprises two parts submitted during the semester and the finalisation 

of your POE, each of which takes you through conceptualising, designing, and building a mobile 

application. 

&#x20;

You need to create a user-friendly Personal Budget Tracker app. The app should help users track 

their spending habits and savings goals, and it should make budgeting fun and engaging through 

gamification. 

&#x20; 

Finally, the app code will need to be pushed to, as well as making use of unit testing and GitHub 

actions for running the necessary tests. 

&#x20;

To be able to create the app, you will need to use all the techniques you learned during this 

course, as well as do your research on how to complete some of the tasks required of you. 

It is also critical that you approach the project in a methodical and planned manner. 

For this reason, the project will follow a Research – Plan – Design – Build – Evaluate cycle:  

&#x20;

This POE will run for one full cycle. 

After one full cycle, you can always restart the process to refine your app further. 

The different phases of the cycle will be related to the different tasks as follows:  

• Part 1: Research, Planning and Design  

• Part 2: Build  

• Final POE: Build and Evaluate 

&#x20; 

Research 

Plan 

Design Build 

Evaluate 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 4 of 26 

Introduction  

&#x20;

Each of the tasks below builds on top of one another. Be sure to complete or update one part 

before moving on to the next task. 

Each task will be individually assessed by your lecturer, and feedback for each task will be 

provided. 

&#x20;

The exact features, design, and layout of your app are up to you. Remember that managing 

finances is often perceived as stressful or tedious. 

The app must be appealing, intuitive, and engaging to encourage consistent use. Consider 

gamification elements to make tracking finances more enjoyable and rewarding. 

&#x20;

In the final submission, the app must be able to perform at least the following tasks: 

 The user must be able to register and log in to the app using a username and password. 

 The user must be able to create categories for expenses (e.g., "Groceries," 

"Entertainment," "Transport"). 

 The user must be able to add an expense entry, specifying at least the amount, date, 

description, and category. 

 The user must be able to optionally attach a photo (e.g., a receipt) to each expense entry. 

 The user must be able to set a monthly total budget goal and specific limits for individual 

categories. 

 The user must be able to view a list of all expenses during a user-selectable period. 

If a receipt photo was stored for an entry, the user must be able to access it from this list. 

 The user must be able to view the total amount spent on each category during a user

selectable period. 

 All this data should be saved to a local DB. 

 The user must be able to view a graph showing daily spending over a user-selectable 

period. This graph must clearly display category spending and allow the user to identify 

trends (final POE only). 

 The app must display a progress dashboard that shows how well the user is staying within 

their budget goals for the current month. Overspending categories must be highlighted 

visually (final POE only). 

 The app must include gamification elements such as rewards or badges for meeting budget 

goals or consistent expense logging (final POE only). 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 5 of 26 

These features are the minimum that’s required for the final submission. Your app also needs to 

work logically and be easy to use. And you will add your own features for the final POE 

submission. 

&#x20;

The tasks will be evaluated according to the rubrics at the end of the document. 

Make sure that you understand what is expected by reading carefully through these rubrics! 

&#x20;

Part 1 — Research, Planning and Design                  (Marks: 100) 

&#x20;

Learning Units 1 to 3  

&#x20;

At the end of this specific part, students should be able to:  

• Create a new app;  

• Use images in an app;  

• Apply layouts to the user interface of an app;  

• Use the TextView and ImageView controls in an app. 

&#x20; 

This task is composed of two sections, weighted equally:  

• Research  

• Planning and design  

It is recommended that you create two (2) separate documents for the submission. 

Research                             (Marks: 50)  

You will research three (3) existing personal budgeting apps available for the Android operating 

system. Present your findings in a typed PDF document (1500 to 2000 words). Your research 

should include the following sections:  

1\. Introduction  

2\. Research on each of the apps, including:  

a. Overview of the app, including screenshots with descriptions  

b. Strengths and weaknesses of the app  

c. Innovative features of the app  

3\. A visual (infographic) comparison of all three apps  

4\. A list of the best features from all the apps that you want to include in your app  

5\. Conclusion  

6\. References  

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 6 of 26 

Make sure you reference correctly for this task. 

See the referencing rubric at the beginning of this document. You are required to reference 

multiple sources for each app that you are researching to ensure that you have a balanced view 

of the app. 

&#x20;

Make sure that the infographic is sized so that the text is readable. 

Also, make sure that the size of the PDF file does not exceed 10MB, since this document must be 

submitted through Turnitin. 

Planning and Design                          (Marks: 50)  

For this task you will need to fully design your app. The purpose of this task is to ensure you know 

exactly what you need to build and how you will build it before you start with the implementation 

of the prototype. 

&#x20; 

The design needs to link back to the research, since the purpose of the research is to inform the 

design. 

&#x20; 

You will need to present your design as a typed PDF document (1000 to 1500 words) with the 

following sections:  

• Introduction  

• A brief overview of the app, including a name for the app, an initial icon design, and a 

description of the innovative features that you are planning to include. 

• A detailed list of the requirements for the app. 

The requirements must include all the minimum requirements from this document, but 

you must elaborate on each of those requirements rather than just copying them. 

And remember to add your own features that you want to include, for example, 

gamification. The requirements must be detailed enough for someone else to be able to 

build your app by just reading this document!  

• User interface design, including a mockup for each screen, a description of the purpose of 

the screen, and a diagram showing how the user navigates between the various screens. 

• Project plan detailing deadlines and milestones for the project, in the format of a Gantt 

chart. Break down the tasks into smaller tasks than just “implement the prototype”. 

Include some time for testing and bug fixing. 

• Conclusion 

• References 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 7 of 26 

Part 2 — App Prototype Development              (Marks: 100) 

&#x20;

Learning Units 1 to 4  

At the end of this specific part, students should be able to:  

&#x20; 

• Apply layouts in an app. 

• Use the EditText, NumberFormat and SeekBar in an app. 

• Apply event handling in an app. 

• Create an activity. 

• Apply an intent in an application. 

 Reading and writing to RoomDB 

&#x20;

For this task you will need to build a fully working prototype. This prototype needs to include all 

the features listed in the instructions section of this document but based on your own design and 

user interface layout. 

&#x20;

This task involves developing a Budget Tracker App with a focus on functionality, data 

persistence, and a user-friendly interface. Below is the detailed breakdown of how to implement 

the requirements: 

• The user must be able to log in to the app using a username and password. 

• The user must be able to create categories that the expense and budget entries will belong 

to. 

• The user must be able to create an expense entry, specifying at least the date, start and  

end times, description, and category. 

• The user must be able to optionally add a photograph to each expense entry. 

• The user must be able to set a minimum monthly goal for money spent, as well as a 

maximum goal. 

• The user must be able to view the list of all the expense entries created during a user 

selectable period. If a photo was stored for an entry, the user must be able to access it 

from this list. 

• The user must be able to view the total amount of money spent on each category during a 

User-selectable period. 

• All data should be saved to a local SQLite, RoomDB or similar offline Android database 

platform. 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 8 of 26 

&#x20;

The demonstration video must effectively demonstrate the features of the app and be fully 

professional. The video must include a voice over explaining what you are showing. 

Remember to compress the video to make uploading it to Arc easier and faster.  

&#x20; 

The app must have a user-friendly and appropriate user interface that is able to handle invalid 

inputs made by the user without crashing. The app must be working with only minor bugs and 

errors. 

&#x20;

Version Control with GitHub: Initialise the repository with a README file. Commit and push your 

project files to the GitHub repository. Regularly commit and push your code as you make 

progress. 

&#x20; 

Conduct automated testing on the main functionality of your app. 

Make use of GitHub actions to run tests and build your code to make sure it will work on not just 

your computer. Use this guide that will assist in creating this:  

• https://github.com/marketplace/actions/automated-build-android-app-with-github-action  

\[Accessed on 05 November 2025]. 

• https://github.com/IMAD5112/Github-actions/blob/main/.github/workflows/build.yml  

\[Accessed on 05 November 2025]. 

Submission:  

For your submission, present the following:  

• The complete Kotlin source code for the Android app needs to be submitted on GitHub.  

No zip files are allowed. 

• Add comments to your code, and don’t forget to reference it. 

• Make use of logging to show your understanding of your code. 

• Your readme file for your app that is also on GitHub. 

• A video presentation showcasing all the app's features. 

Include a link to this video in the readme file. 

• The built apk for your app. 

&#x20; 

You can upload your video to YouTube, make it unlisted, and add that link to your readme file. 

You can also use any video recording software you like. 

Just make sure to include a voice-over to show your understanding. 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 9 of 26 

Part 3 — Final App Development              (Marks: 100) 

All learning units  

At the end of this specific part, students should be able to: 

• Apply event handling in an app. 

• Create an activity. 

• Integrate gamification into an app. 

&#x20; 

The final app needs to run on a mobile phone and not an emulator. 

This means that you need to plan well in advance to record the required video on a mobile phone 

if you don’t own an Android phone yourself. 

&#x20; 

Remember to implement your lecturer’s feedback on the prototype before adding the new 

features. Pay special attention to the feedback on the user interface. 

Marks will be awarded for that again in this part, so you now have the opportunity to improve on 

what you did before. 

&#x20;

For the final submission of the app, you need to include the following features that were not 

required for the prototype: 

 The user must be able to view a graph showing the amount spent per category over a user

selectable period. The graph must also display the minimum and maximum goals (final 

POE only). 

 The app must display in a visual format how well the user is doing with staying between 

their minimum and maximum spending goals over the past month (final POE only). 

 The app must include gamification elements such as rewards or badges for meeting budget 

goals or consistent expense logging (final POE only). 

&#x20;

In addition to these features, you must have:  

• Your own features as described in your design document. 

You must include at least two (2) of your own features. 

Document your two (2) features in a readme file so your lecturer knows what to look out 

for. 

• An app icon and final image assets. 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 10 of 26 

You must create a demonstration video that effectively demonstrates the features of the app 

running on a mobile phone, and it must be fully professional. The video must include a voice over 

explaining what features you are showing. 

Remember to compress the video to make uploading it to Arc easier and faster. 

&#x20;

Tip: OBS (Open Broadcaster Software) is free and open-source software that allows great 

flexibility for adding audio to a video recorded with a screen recorder on your phone!  

&#x20; 

Version Control with GitHub: Initialise the repository with a README file. Commit and push your 

project files to the GitHub repository. Regularly commit and push your code as you make 

progress. 

&#x20;

Conduct automated testing on the main functionality of your app. 

Make use of GitHub actions to run tests and build your code to make sure it will work on not just 

your computer. Use this guide that will assist in creating this:  

 https://github.com/marketplace/actions/automated-build-android-app-with-github-action 

\[Accessed on 05 November 2025]. 

 https://github.com/IMAD5112/Github-actions/blob/main/.github/workflows/build.yml 

\[Accessed on 05 November 2025]. 

&#x20;

Documentation:  

Prepare a comprehensive report detailing the purpose of the app, its design considerations and 

the utilisation of GitHub and GitHub Actions. Include all of this inside your readme file inside 

GitHub. Add images and make the readme file your own. 

&#x20;

Submission:  

For your submission, present the following:  

• The complete Kotlin source code for the Android app needs to be submitted on GitHub.  

No zip files are allowed. 

• Add comments to your code, and don’t forget to reference it. 

• Make use of logging to show your understanding of your code. 

• Your readme file for your app that is also on GitHub. 

• A Video presentation showcasing all the app's features.  

Include a link to this video in the readme file. 

25;26; 27                                                                      

2026 

• The built apk for your app. 

• A copy of your research and design documents as submitted in part 1. 

You can upload your video to YouTube, make it unlisted, and add that link to your readme file. 

You can also use any video recording software you like. 

Just make sure to include a voice-over to show your understanding. 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 11 of 26 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 12 of 26 

Appendix A - PoE Marking Rubrics                

MODULE NAME:  MODULE CODE:  

OPEN-SOURCE CODING (INTRODUCTION) OPSC6311/w 

&#x20;

STUDENT NAME:   

STUDENT NUMBER:   

&#x20;

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard Feedback 

&#x20; PART  1    

Research:  

Introduction  

&#x20; 

\[5 Marks]  

• No introduction 

included. 

• Introduction does 

not link to the rest 

of the document.  

• Acceptable and 

links to the rest of 

the document but 

does not explain 

the purpose of the 

research.  

• Acceptable and 

links to the rest of 

the document with 

some details about 

the purpose of the 

research.  

• An excellent 

introduction that 

explains the 

purpose of the 

research and the 

sections included in 

the document.  

&#x20; 

0 – 1 Marks 2 – 3 Marks 4 Marks 5 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 13 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard Feedback 

PART  1 

Research: App  

1 research  

&#x20; 

\[8 Marks]  

• Not included, or 

sections missing. 

• All sections are 

included but limited 

details are provided 

in each section.  

• All sections 

included, but more 

details could be 

added to most of 

the sections.  

• All sections 

included, but more 

details could be 

added to some of 

the sections.  

• Comprehensive 

discussion clearly 

differentiating 

between and 

strengths and 

weaknesses and 

motivating why 

features are 

considered 

innovative.  

&#x20;

0 – 2 Marks 3 – 5 Marks 6 Marks 7 – 8 Marks   

Research: App  

2 research  

&#x20; 

\[8 Marks]  

• Not included or 

sections missing. 

• All sections are 

included, but 

limited details are 

provided in each 

section.  

• All sections 

included, but more 

details could be 

added to most of 

the sections.  

• All sections 

included, but more 

details could be 

added to some of 

the sections.  

 Comprehensive 

discussion clearly 

differentiating 

between the 

strengths and 

weaknesses and 

motivating why 

features are 

considered 

innovative.  

&#x20;

0 – 2 Marks 3 – 5 Marks 6 Marks 7 – 8 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 14 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard Feedback 

PART  1 

Research: App  

3 research  

&#x20; 

\[8 Marks]  

• Not included, or 

sections missing.  

• All sections are 

included but limited 

details are provided 

in each section.  

• All sections 

included, but more 

details could be 

added to most of 

the sections.  

• All sections 

included, but more 

details could be 

added to some of 

the sections.  

• Comprehensive 

discussion clearly 

differentiating 

between the 

strengths and 

weaknesses and 

motivating why 

features are 

considered 

innovative.  

&#x20;

0 – 2 Marks 3 – 5 Marks 6 Marks 7 – 8 Marks   

Research:  

Comparison  

&#x20; 

\[10 Marks]  

• No comparison 

included or 

comparison not in a 

visual format.  

• Comparison in a 

visual format but 

only includes either 

differences or 

similarities.  

• Comparison in a 

visual format with a 

good number of 

similarities and 

differences, but 

presentation could 

be improved.  

• Comparison in a 

visual format with a 

good number of 

similarities and 

differences.  

• Comprehensive 

comparison that 

shows all the 

differences and 

similarities at a 

glance.  

&#x20;

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 15 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PART  1 

Research: List 

of features to 

include  

&#x20; 

\[6 Marks]  

• No list of features 

included. 

• A very short list 

included with no 

motivations.  

• A good list of 

features is included 

but with little or no 

motivations. 

• A good list of 

features is included 

with some 

motivations.  

• An excellent list of 

features with 

motivations included 

for why these 

features are 

desirable.  

&#x20;

0 – 2 Marks 3 – 4 Marks 5 Marks 6 Marks   

Research:  

Conclusion  

&#x20; 

\[5 Marks]  

• No conclusion 

included.  

• Conclusion does not 

link to the rest of the 

document.  

• Acceptable and links 

to the rest of the 

document.  

• Acceptable and links 

to the rest of the 

document. Link to 

the design is 

mentioned but not 

elaborated on.  

• An excellent 

conclusion that links 

to the document and 

to the design.  

&#x20;

0 – 1 Marks 2 – 3 Marks 4 Marks 5 Marks   

Research References: Subtract marks for incorrect referencing in the research document, according to the referencing rubric.  

Planning and  

Design: 

Introduction 

and 

conclusion  

&#x20; 

\[5 Marks]   

• No introduction or 

conclusion included. 

• Either introduction 

or conclusion is 

missing.  

• A good introduction 

and conclusion 

included that links to 

the rest of the 

document.  

• A good introduction 

and conclusion 

included that links to 

the rest of the 

document.  

• Mention is made of 

the research 

document.  

• An excellent 

introduction and 

conclusion that 

clearly links to the 

research document 

as well as the 

content of the design 

document.  

&#x20;

&#x20;0 – 1 Marks 2 – 3 Marks 4 Marks 5 Marks  

&#x20;

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 16 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PART  1 

Planning and  

Design: 

Overview of 

the app  

&#x20; 

\[10 Marks]  

• No overview 

included or no 

innovative features 

mentioned.  

• The overview needs 

more details.  

• A good overview is 

included with some 

innovative features.  

• A good overview is 

included with some 

innovative features 

and an attempt to 

link to the rest of the 

document.  

• An excellent 

overview that sets 

the stage for the rest 

of the document.  

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

Planning and  

Design:  

Detailed list of 

requirements  

&#x20; 

\[15 Marks]   

• No requirements 

included or required 

features are missing.  

• Only required 

features are included 

with some details, 

but no additional 

features from 

research mentioned.  

• Required features as 

well as the student’s 

own requirements 

included but needs 

more detail in 

places.  

• Required features as 

well as the student’s 

own requirements 

included with more 

detail needed only in 

a few places.  

• An excellently 

detailed list of 

features that 

describes all the 

features including 

the student’s own 

from research, in 

detail.  

&#x20; 

0 – 6 Marks 7 – 9 Marks 10 – 11 Marks 12 – 15 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 17 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PART  1 

Planning and 

Design: User 

interface 

design  

&#x20; 

\[15 Marks]   

• No design included 

or only very brief 

descriptions with no 

mockups. 

• Only mockups or 

only reasonably 

detailed descriptions 

included, not both. 

• Mockups and 

descriptions included 

but not diagram 

showing navigation.  

• Mockups and 

descriptions 

included, and 

navigation diagram 

included with some 

missing details.  

• Excellent mockups 

together with 

descriptions and a 

diagram explaining 

navigation. 

&#x20; 

0 – 6 Marks 7 – 9 Marks 10 – 11 Marks 12 – 15 Marks   

Planning and  

Design: Project  

Plan  

&#x20; 

\[5 Marks]   

• No project plan 

included. 

• Project plan included 

but is not logical. 

• Logical with some 

errors. 

• Logical with only 

minor errors. 

• Logical and fully 

detailed with no 

errors. 

&#x20; 

0 – 1 Marks 2 – 3 Marks 4 Marks 5 Marks  

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 18 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PART  2 

App runs in 

emulator  

&#x20; 

\[10 Marks]  

• App doesn’t run at 

all. 

• App runs but lots 

of crashes 

happen. 

• App runs with one 

or two errors or 

crashes. 

• App runs with 

very infrequent 

errors or crashes. 

• App runs without 

errors. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

Feature: Log in  

&#x20; 

\[10 Marks]  

• Feature not 

included. 

• Feature 

implemented but 

very buggy. 

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

Feature: 

Create 

categories 

and entries  

&#x20; 

\[10 Marks]  

• Feature not 

included. 

• Feature 

implemented but 

very buggy. 

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature 

excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 19 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PART  2 

Feature: Take 

and store a 

photo  

&#x20; 

\[10 Marks]  

• Feature not 

included. 

• Feature 

implemented but 

very buggy. 

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

Feature: Set 

minimum 

and 

maximum  

goals  

&#x20; 

\[10 Marks]  

• Feature not 

included. 

• Feature 

implemented but 

very buggy.  

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

Feature: 

View list of 

entries in a 

period  

&#x20; 

\[10 Marks]  

• Feature not 

included. 

• Feature 

implemented but 

very buggy. 

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 20 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PART  2 

Feature: 

View 

category 

totals in a 

period  

&#x20; 

\[10 Marks]  

• Feature not 

included. 

• Feature 

implemented but 

very buggy. 

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

User interface  

&#x20; 

\[20 Marks]   

&#x20;Not user-friendly, 

confused, and illogical. 

• Somewhat user  

friendly with lots of 

mistakes in the design.  

• Mostly user 

friendly with some 

mistakes in the 

design. 

• Somewhat 

consistent use of 

layout, fonts, and 

colours. 

• Mostly user

friendly with some 

attempt made at 

making the capture 

process easier for 

the user. 

• Mostly consistent 

use of layout, fonts, 

and colours. 

• Excellent and user

friendly design. 

• Completely 

consistent use of 

layout, fonts, and 

colours. 

&#x20; 

0 – 9 Marks 10 – 12 Marks 13 – 14 Marks 15 – 20 Marks   

&#x20; 

24;25;26                                      

2026 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Feedback 

PART  2 

Demonstration 

video  

\[10 Marks]  

• No demonstration 

video included.  

• Informal and 

unprepared, or not 

showing all the 

features, or no 

voice over 

included.  

• Not completely 

professional, but all 

features 

demonstrated. 

• Mostly 

professional with 

some issues, but all 

features 

demonstrated. 

Greatly exceeds the 

required standard 

• Fully professional 

video showing all 

the required 

features in detail.  

0 – 4 Marks 

5 Marks 

6 – 7 Marks 

8 – 10 Marks 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 21 of 26 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 22 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PORTFOLIO OF EVIDENCE (POE) 

App runs on 

mobile phone  

&#x20; 

\[10 Marks]  

• App doesn’t run at all.  

• App runs but lots of 

crashes happen.  

• App is only shown 

running in the 

emulator. 

• App runs with one 

or two errors or 

crashes.  

• App runs with very 

infrequent errors or 

crashes. 

• App runs without 

errors. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

Feature: Data 

capture and 

views from 

app working  

&#x20; 

\[10 Marks]  

• Feature not included.  

• Feature implemented 

but very buggy.  

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 23 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PORTFOLIO OF EVIDENCE (POE) 

Feature: Own 

feature 1 as 

described in 

the readme  

file  

&#x20; 

\[10 Marks]  

• No readme file 

provided. 

• Feature not included.  

• Feature implemented 

but very buggy.  

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

Feature: Own 

feature 2 as 

described in 

the readme  

file  

&#x20; 

\[10 Marks]  

• No readme file 

provided.  

• Feature not included.  

• Feature implemented 

but very buggy.  

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 24 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PORTFOLIO OF EVIDENCE (POE) 

Feature: Graph 

showing 

timelines and 

goals  

&#x20; 

\[10 Marks]  

• Feature not included.  

• Feature implemented 

but very buggy.  

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

Feature: Visual 

display of how 

the user is 

progressing in 

relation to the 

goals  

&#x20; 

\[10 Marks]  

• Feature not included.  

• Feature implemented 

but very buggy.  

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 25 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PORTFOLIO OF EVIDENCE (POE) 

Feature: 

Gamification is 

integrated into 

the application 

&#x20; 

\[10 Marks]  

• Feature not 

included.  

• Feature 

implemented but 

very buggy.  

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

User interface  

&#x20; 

\[20 Marks]   

• Not user-friendly, 

confused, and illogical.  

• Somewhat user  

friendly with lots of 

mistakes in the design.  

• Mostly user-friendly 

with some mistakes in 

the design. 

• Somewhat consistent 

use of layout, fonts, 

and colours.  

• Mostly user-friendly 

with some attempt 

made at making the 

capture process easier 

for the user. 

• Mostly consistent use 

of layout, fonts, and 

colours.  

• Excellent and user

friendly design.  

• Completely consistent 

use of layout, fonts, 

and colours. 

&#x20; 

0 – 9 Marks 10 – 12 Marks 13 – 14 Marks 15 – 20 Marks   

&#x20; 

24;25;26                                      

2026 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Feedback 

PORTFOLIO OF EVIDENCE (POE) 

Demonstration 

video  

\[10 Marks]  

• Not completely 

• No demonstration 

video included. 

• Informal and 

unprepared, or not 

showing all the 

features, or no voice 

over included.  

professional, but all 

features 

demonstrated.  

• Mostly professional 

with some issues, 

but all features 

demonstrated. 

Greatly exceeds the 

required standard 

• Fully professional 

video showing all 

the required 

features in detail. 

0 – 4 Marks 

5 Marks 

6 – 7 Marks 

8 – 10 Marks 

\[TOTAL MARKS:300] 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 26 of 26 

