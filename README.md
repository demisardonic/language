# Language
#### Antlr4 parsed scripting language in java. Created for ISU Computer Science 319.  
  
Requires: antlr-4.6-complete.jar [www.antlr.org](http://www.antlr.org/download.html).  
  
Compile:   
> Windows: javac -cp antlr-4.6-complete.jar *.java   
  
Usage:  
>**cmd**: java -cp antlr-4.6-complete.jar.; LanguageMain  
>**powershell**: java -cp 'antlr-4.6-complete.jar.;' LanguageMain  
>**provided jar**: java -jar ComS319Portfolio3.jar  
  
>Run program in terminal or command prompt. Enter path to source file to excecute the main function of that file.


###### Language Syntax:  
##### Variables: 
``` 
x = 0;
y = 2.5;
test = "Hello World!";
_one2three = false;
tempArray = [];
a = [3, 4, 5, true, 0.1, "temp"];
```
##### Arithmetic Operations:
`+,-,*,/,%`

##### Boolean operations:
`&&,||,!,==,!=`
  
##### Relational Operations:
`>,>=,==,!=,<=,<`  
  
##### Function Definition:  
```
func main() do  
    return 0;
end 

func test(n m) do
	return n + m;
end
``` 
##### Loops:
```
for i=0; i < 10; i++ do
    loop body
end

while i<10 do
    loop body
end
```
##### Builtin Functions:
```
print x;
length(list);
floot(value);
```

##### Import Lib Files:
`import "filepath";`

##### Comments:
`#this comment is ignored in source file`

[Merge Sort](examples/mergesort.319)  
[Fibonacci](examples/fibonacci.319)
