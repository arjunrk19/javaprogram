This program has been written keeping in mind my limited view of both Java programming language and Computer Science 
core concepts such as Data Structures. The errors in the program are not intentional, but speaks of my lesser knowledge in Java.

The Architecture of the Program:
 - The program works by obtaining the required information from the user through the command prompt.
 - The commands entered by the user is then split into its command portion and its "URL" portion.
 - This is then checked using a if-else if conditional loop.
 - The storeurl command causes the program to store the url value given after the command.
 - The URL is taken and converted into its Hash value.
 - This Hash value along with the URL is stored in a HashMap as key-value pairs.
 - This HashMap makes it easier for the user to retrieve data from the program.
 - In the get command, the hash of the stored URL is returned by using the URL as a key.
 - In the count command, the total iterations taken by the program is counted and returned.
 - In the list command,  the entire Hashmap is converted into a JSON Object.
 - This JSON Object is then returned in JSON format.
 - The exit command causes the program to terminate execution.


Working Structure of Program:

1. storeurl google.com
2. google.com -> BAEA954B95731C68AE6E45BD1E252EB4560CDC45
3. {"google.com" : BAEA954B95731C68AE6E45BD1E252EB4560CDC45}  This is a HashMap. HashMap then retrieved using the key-value relationship for get command
5. count google.com : returns the itertative value, which depends on the program use.
6. list : prints the entire HashMap by converting it into JSON Object. This JSON Object is then returned for the user.
8. exit : exits the program
