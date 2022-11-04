Unit 1

Explaining concepts




Explain what is meant by a variable with respect to programming languages.

A variable is a named place used in a program to store data as the program is executed.
Data (a value) is stored in the variable so that it can be accessed at a later point
by using the name of the variable. The variable can store different values at different
times depending on what is put in to it. However, if something new is stored the previous
value is lost. In languages like Java, variables have a type associated with them. 
It determines what kind of data (eg numbers or Strings) can be stored in the variable. 

Examples: 

int a; // a holds integers     
String b; //b holds String

a=5;
b="London"



Definitions


Compiler:

The method used to translate the program which is now in the form
of a source code into machine language, therefore storing the code into 
another file known as the object code.


Compiling a program:

The process of compiling a program is in simple terms
how a program is converted into a language the text editor
can simply understand, and then store into another file
in order for the program to successfully execute.

Executing a program:

The process of executing a program is as simple as
the program literary being run after being compiled in
the text editor.

Value:

A value is in simple words data stored in the variable,
in order for it to be assessed at a later stage by using
the name of the variable.

Declaring a variable:

The process of declaring a variable is whereby the data
used in the variable is merely declared i.e. whether
it be a number in which case the variable would start
with 'int'; or in other cases a string being used
suggesting text is utilised and stored instead.

Initialising a variable:

The process of initialising a variable is in two cases:
in relation to instance variables and declarations of local
variables.

However, local variables are manually initialised and
instance methods are automatically initialised.

In addition, even if instance variables's declarations contain
no initialisers. In particular integers and doubles are
initialised to zero, while characters are initialised to the
character. American Standard Code for Information Interchange
code is zero and boolean variables are initialised to false.

Assignment:

The process of assignment is when the line containing
the variable has after it an equals sign '=', and an
expression.

Example:

For example, after the assignment statement

Petrol = 38; // Petrol contains the value 38.


Input method:

An input method is the procedure of declaring
a variable in the program to allow the user to input
data in a box which pops up.

Example:

For example, 
String name=JOptionPane.showInputDialog("How old are you?");
String response="10";
JOptionPane.showMessageDialog(null,response)

Output method:

An output method is the procedure where the program
implicates whatever was originally programmed to 
display in the text editor displays, bearing in mind
the program is given an instruction by the user.

Example:

For example,
System.out.println("Bonjour, how are you Mr Tj");

Algorithm:

An algorithm is specific commands to follow in a step
by step order.

Example:

For example,
System.exit(0); //commands the program to return back to the operating system.

Keyword:

A keyword is sequences of letters that appear to be legal
identifiers but are not, because they are reserved by the
language for special uses.

Example:

For example,
int 
class
return
var
operator
false
true
null


Program:

A program is a set of directions that tells the computer exactly what to do.
Hence, it is the medium used to communicate with the computer.

Method:

A method is a function with the name main which represents the main computation
of an application; thus it's what is first executed when the application is run.

Example:

For example,

public static void main(String[]args){
    TrickMouse morte;
    
    morte = new TrickMouse();
    morte.hitWall();
    
}

Class:

A class is what is used to initialise the instance variables and are invoked
automatically whenever an object of the class is created.

Example:

For example,

class name{
    //declarations
    
    //constructor declarations
    
    //method definitions
}
