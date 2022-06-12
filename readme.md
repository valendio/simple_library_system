
<!DOCTYPE html>
<html>
<body bgcolor="DBF9FC">

<h1>USER GUIDE</h1>
<p>Guide to run simple library system</p>

>>Student 
    >username = std <p>
    >password = 123 </p>

>>Libraryan
>username = lib <p>
>password = 123

>Main menu is
>>0. load data. <p>
>>1. Save and quit.<p>
>>2. Show book list.<p>
>>3. Add book to library.<p>
>>4. Borrow Book.<p>
>>5. Return book.<p>

>>Menu <p>
>a. load data
load data = databook
databook is file that user input save
you can load data from file that you saved before (menu 1)<p>
>b. Save and quit<p>
With this menu you can save the file that you add (menu 3) to lokal database (databook) and after save the program will automatically stop<p>
>c. Show book list<p>
Show book list is menu that can show all book that you saved before (menu 1) but before you can show the book list you must load the data first (databook)<p>
>d. Add book to library<p>
This menu can add book to database that you create before (databook) or you can create new database with menu 2 (menu 2)<p>
>e. Borrow book<p>
Borrow book menu that you can get data from database
if your status in userStatus is true you can borrow the book, but if your status is false you can't borrow the book<p>
>f. Return book<p>
with this menu you can make your status in userStatus to true<p>

>>The program flow
1.0. -you login as student or lib<p>
2.1. -if your login succesful the program will show your info<p>
2.2. -if your login is not succesful the program will automaticaly stop<p>
3.1. -The program will show the menu<p>
4.0. -Load data menu<p>
4.0.1. -User do input name file that they save before<p>
4.0.2. -If file exist user can view data with menu 2<p>
4.2. -the data will open in console<p>
4.4. -User can borrow the book and your status will false<p>
4.5. -User return the book and your status will true<p>

>>You can also add and save book that you input to database
4.3. - You input ISBN, Title, Author, and Price<p>
4.1. - Save the data that you input to database that you create before or you can create new database<p>

</body>
</html>
