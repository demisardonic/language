Requires: antlr-4.6-complete.jar [a link](http://www.antlr.org/download.html).  
  
Compile:   
    Windows: javac -cp antlr-4.6-complete.jar *.jar  
  
Usage:  
    cmd: java -cp antlr-4.6-complete.jar.; LanguageMain  
    powershell: java -cp 'antlr-4.6-complete.jar.;' LanguageMain  
  
Language Syntax:  
Variables:  
x = 0;
y = 2.5;
test = "Hello World!";
_one2three = false;
tempArray = [];
a = [3, 4, 5, true, 0.1, "temp"];
  
Arithmetic:  
a = n + m;  
b = n - m;  
etc. *,/,%  
  
Boolean operations:  
&&,||,!,==,!=  
  
Relational Operations:
>,>=,==,!=,<=,<  
  
Function Definition:  
func name() do  
	\t
end  